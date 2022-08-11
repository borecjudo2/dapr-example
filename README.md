# dapr-example
The example of DAPR ([Presentation](dapr.pptx))

## Init Dapr
[Getting started with Dapr](https://docs.dapr.io/getting-started/)

## Start the greeting service with the Dapr sidecar 
Command to run the greeting service with the Dapr sidecar:

`dapr run --app-id greeting --app-port 3001 --dapr-http-port 4001 -- java -jar demo-greeting/target/demo-greeting-0.0.1-SNAPSHOT.jar`
