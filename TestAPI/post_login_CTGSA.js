import { check, sleep } from "k6";
import { Rate } from "k6/metrics";
import http from "k6/http";

export let options = {
  stages: [
    { duration: "3s", target: 1 },
  ]
};

let errorRate = new Rate("API errors"); 

//var token = "eyJhbGciOiJIUzI1NiJ9.eyJpZGVudGlmaWVyIjoxNTE1LCJleHBpcnlfZGF0ZSI6IjIwMTktMDktMTggMTE6NTQ6NDkgKzA4MDAifQ.iSazf5qfre5WAerjXy86yWueFPsfbAb7c3741Um23ys";

let authenticate = function(){
  var params =  { headers: { "Content-Type": "application/json", "TeleCtg-Product": "doctor", "TeleCtg-Platform": "android", "TeleCtg-App-Version": "1"} };
  let authUserRes = http.post('https://staging.telectg.co.id/api/v1/login', JSON.stringify({identifier: 'uus@gmail.com', password: '111111'}), params);

  if (!check(authUserRes, { "akun berhasil login": (r) => r.status === 201})) 
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