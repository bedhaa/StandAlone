import { check, sleep } from "k6";
import { Rate, Counter } from "k6/metrics";
import http from "k6/http";

export let options = {
  stages: [
    { duration: "4s", target: 1 },
  ]
};

let errorRate = new Rate("API errors"); 

function makeid(length) {
   var result           = '';
   var characters       = 'abcdefghijklmnopqrstuvwxyz0123456789';
   var charactersLength = characters.length;
   for ( var i = 0; i < length; i++ ) {
      result += characters.charAt(Math.floor(Math.random() * charactersLength));
   }
   return result;
}

function makeName(length) {
   var result           = '';
   var characters       = 'abcdefghijklmnopqrstuvwxyz ';
   var charactersLength = characters.length;
   for ( var i = 0; i < length; i++ ) {
      result += characters.charAt(Math.floor(Math.random() * charactersLength));
   }
   return result;
}

var token = "eyJhbGciOiJIUzI1NiJ9.eyJpZGVudGlmaWVyIjoxNTA5LCJleHBpcnlfZGF0ZSI6IjIwMTktMDktMTggMTE6MTc6NDEgKzA4MDAifQ.lfov9GrCcZMNQwy6Jf07nCwyrbTaLnfsuTMdP5sloqA";

let authenticate = function(){
  var params =  { headers: { "Content-Type": "application/json", "TeleCtg-Product": "doctor", "TeleCtg-Platform": "android", "TeleCtg-App-Version": "1", "Authorization": "Bearer "+token} };
  let authUserRes = http.post('https://staging.telectg.co.id/api/v1/patients', JSON.stringify({id_card: makeid(5), full_name: "Cux "+makeName(7), date_of_birth: '2011-05-29'}), params);

  if (!check(authUserRes, { "pasien berhasil dibuat": (r) => r.status === 201})) 
{
    errorRate.add(1);
}
  return authUserRes.json();
};

export default function() {
  let x = authenticate();
  console.log(JSON.stringify(x));
  sleep(1); // user usually waits 1 second after this flow
}