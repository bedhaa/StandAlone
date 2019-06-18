import { check, sleep } from "k6";
import { Rate, Counter } from "k6/metrics";
import http from "k6/http";

export let options = {
  stages: [
    { duration: "5m", target: 10 },
  ]
};

let errorRate = new Rate("API errors"); 

function xx(length) {
   var result           = '';
   var characters       = 'abcdefghijklmnopqrstuvwxyz0123456789';
   var charactersLength = characters.length;
   for ( var i = 0; i < length; i++ ) {
      result += characters.charAt(Math.floor(Math.random() * charactersLength));
   }
   return result;
}

function yy(length) {
   var result           = '';
   var characters       = 'abcdefghijklmnopqrstuvwxyz ';
   var charactersLength = characters.length;
   for ( var i = 0; i < length; i++ ) {
      result += characters.charAt(Math.floor(Math.random() * charactersLength));
   }
   return result;
}

function zz(length) {
   var result           = '';
   var characters       = '0123456789';
   var charactersLength = characters.length;
   for ( var i = 0; i < length; i++ ) {
      result += characters.charAt(Math.floor(Math.random() * charactersLength));
   }
   return result;
}

var token = "eyJhbGciOiJIUzI1NiJ9.eyJpZGVudGlmaWVyIjoxNTA5LCJleHBpcnlfZGF0ZSI6IjIwMTktMDktMTggMTc6MTc6MDIgKzA4MDAifQ.uMFAUDAxaabkOzkldy_gW4hwMxzVQBAkQSi5SFVUqnU";

let authenticate = function(){
  var params =  { headers: { "Content-Type": "application/json", "TeleCtg-Product": "healthcare", "TeleCtg-Platform": "android", "TeleCtg-App-Version": "1", 
  "Authorization": "Bearer "+token} };
  let authUserRes = http.post('https://staging.telectg.co.id/api/v1/register', JSON.stringify({role: "doctor", username: "dr.bomb "+xx(5), email: xx(5)+"@mailinator.com", 
  phone: "0896"+zz(8), full_name: "dr.bomb "+xx(5), password: "qwerty", user_type: "doctor", healthcare_id: "1816", activated: "true" }), params);

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