# MS Auth [![Java CI with Maven](https://github.com/linkticTest/ms-auth/actions/workflows/maven.yml/badge.svg)](https://github.com/linkticTest/ms-auth/actions/workflows/maven.yml)

This is the Catalog microservice built with Java Maven

## Technologies

* `cdk`  
* `java`  
* `maven`  
* `docker` through CDK
 

## Development Requirements

- NodeJS 20.x
- Npm
- git
- JDK
- MVEN

- For these commands, an AWS account needs to be configured beforehand using the `aws configure` command in the console.

- To run these lambdas locally, SAML CLI is required. It handles creating the Docker container and running it directly: [SAM CLI Installation Guide](https://docs.aws.amazon.com/serverless-application-model/latest/developerguide/install-sam-cli.html)

- To run these lambdas locally, CDK CLI is required. It  define cloud infrastructure in code and provisioning it through AWS CloudFormation.: [CDK Cli](https://docs.aws.amazon.com/cdk/v2/guide/cli.html)

## How to install the lambda locally:

`mvn clean package` - build the solution
`cd infra; cdk synth -q` - synthetize the solution

## How to run the lambda locally:

Once installed and the lambda is previously configured, you can execute the lambda.

`sam local invoke -t ./cdk.out/CatalogStack.template.json JavaAuth` 

## CI / CD

For CI/CD flow, AWS CDK was used to build infrastructure from the CloudFormation template. The CDK file can be found at the following path:

`infra/src/cdk/Stack.java` 

For CD flow, GitHub Actions were utilized. The pipelines are pre-configured in this repository targeting the master branch:

`.github/workflows/maven.yml` 

