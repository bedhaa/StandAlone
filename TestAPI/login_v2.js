import { check, sleep } from "k6";
import { Rate } from "k6/metrics";
import http from "k6/http";

// See https://docs.k6.io/docs/options for other options
export let options = {
  // simulate rampup of traffic from 1 to 200 users over 5 minutes.
  stages: [
    { duration: "3s", target: 1 },
  ]
};

//let baseUrl = 'https://staging.sehati.co/api';

// let's collect all errors in one metric
let errorRate = new Rate("API errors");

let authenticate = function(identifier, password){
  var params =  { headers: { "Content-Type": "application/json", "Accept-Version": "v2" } }
  let authUserRes = http.post('https://staging.sehati.co/api/login', JSON.stringify({app: 'midwife', identifier: identifier, password: password}), params);
  // console.log(authUserRes.body);
  // check if the authentication was successful, or increase error metric
  if (!check(authUserRes, { "login successful": (r) => r.status === 201})) {
    errorRate.add(1);
  }

  return authUserRes.json();
};

let getUser = function(user_id, token){
  let userRes = http.get(`${baseUrl}/anything/${user_id}`, {}, {
    headers: {
      Authorization: `Token ${token}`
    }
  });

  if (!check(userRes, { "user retrieval successful": (r) => r.status === 200})) {
    errorRate.add(1);
  }

  return userRes.json();
};

export default function() {
  let authToken = authenticate('+6282113161774', 'qwerty');
  // let user = getUser(2, authToken);
  // console.log(JSON.stringify(authToken, undefined, 4));

  sleep(1); // user usually waits 1 second after this flow
}
