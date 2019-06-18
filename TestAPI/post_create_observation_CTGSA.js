import { check, sleep } from "k6";
import { Rate, Counter } from "k6/metrics";
import http from "k6/http";

export let options = {
  stages: [
    { duration: "3s", target: 1 },
  ]
};

let errorRate = new Rate("API errors"); 

var motherid = "8273"
var token = "eyJhbGciOiJIUzI1NiJ9.eyJpZGVudGlmaWVyIjoxNTA5LCJleHBpcnlfZGF0ZSI6IjIwMTktMDktMTggMTc6MTc6MDIgKzA4MDAifQ.uMFAUDAxaabkOzkldy_gW4hwMxzVQBAkQSi5SFVUqnU";

let authenticate = function(){
  var params =  { headers: { "Content-Type": "application/json", "TeleCtg-Product": "doctor", "TeleCtg-Platform": "android", "TeleCtg-App-Version": "1", 
  "Authorization": "Bearer "+token} };
  let authUserRes = http.post('https://staging.telectg.co.id/api/v1/observations/'+motherid, JSON.stringify({gravida: "1", para: "0", abortus: "0", gestational_age: "20" }), params);

  if (!check(authUserRes, { "observasi berhasil dibuat": (r) => r.status === 201})) 
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