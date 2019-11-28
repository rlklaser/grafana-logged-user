# grafana-logged-user

Uses SimpleJson datasource to display current logged user as a template variable

- must enable on defaults.ini

[dataproxy]

# This enables data proxy logging, default is false
logging = true
# If enabled and user is not anonymous, data proxy will add X-Grafana-User header with username into the request, default is false.
send_user_header = true


