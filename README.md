# grafana-logged-user

Uses SimpleJson datasource to display current logged user as a template variable

- must enable on defaults.ini

[dataproxy]

logging = true

send_user_header = true
...

The final url from the sample will be: http://localhost:8007/grafana-logged-user/api/user 

![Variable](https://github.com/rlklaser/grafana-logged-user/blob/master/2019-11-28%2015_36_26-.png)
