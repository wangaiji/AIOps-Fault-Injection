package com.pcxg.fitools.utils;

public class HadoopInfo {
    public static String VALID_JARS =
            "guice-4.0.jar\n" +
                    "hadoop-mapreduce-client-core-3.2.1.jar\n" +
                    "jersey-guice-1.19.jar\n" +
                    "woodstox-core-5.0.3.jar\n" +
                    "protobuf-java-2.5.0.jar\n" +
//                    "jetty-http-9.3.24.v20180605.jar\n" +
                    "commons-configuration2-2.1.1.jar\n" +
                    "commons-logging-1.1.3.jar\n" +
                    "hadoop-auth-3.2.1.jar\n" +
                    "log4j-1.2.17.jar\n" +
                    "slf4j-api-1.7.25.jar\n" +
                    "hadoop-common-3.2.1.jar\n" +
                    "guava-27.0-jre.jar\n" +
                    "hadoop-yarn-common-3.2.1.jar\n" +
                    "jackson-core-2.9.8.jar\n" +
                    "hadoop-mapreduce-client-common-3.2.1.jar\n" +
//                    "jetty-server-9.3.24.v20180605.jar\n" +
                    "re2j-1.1.jar\n" +
                    "slf4j-log4j12-1.7.25.jar\n" +
                    "hadoop-mapreduce-client-jobclient-3.2.1.jar\n" +
                    "commons-cli-1.2.jar\n" +
                    "hadoop-yarn-server-web-proxy-3.2.1.jar\n" +
                    "commons-codec-1.11.jar\n" +
                    "jackson-mapper-asl-1.9.13.jar\n" +
                    "jersey-core-1.19.jar\n" +
                    "jersey-servlet-1.19.jar\n" +
                    "hadoop-mapreduce-client-app-3.2.1.jar\n" +
                    "guice-servlet-4.0.jar\n" +
                    "jaxb-impl-2.2.3-1.jar\n" +
//                    "jetty-servlet-9.3.24.v20180605.jar\n" +
//                    "jetty-webapp-9.3.24.v20180605.jar\n" +
                    "jsr311-api-1.1.1.jar\n" +
                    "commons-lang3-3.7.jar\n" +
                    "hadoop-mapreduce-client-shuffle-3.2.1.jar\n" +
                    "hadoop-yarn-server-resourcemanager-3.2.1.jar\n" +
                    "commons-io-2.5.jar";

    public static String JARS =
            "accessors-smart-1.2.jar\n" +
            "aliyun-java-sdk-core-3.4.0.jar\n" +
            "aliyun-java-sdk-ecs-4.2.0.jar\n" +
            "aliyun-java-sdk-ram-3.0.0.jar\n" +
            "aliyun-java-sdk-sts-3.0.0.jar\n" +
            "aliyun-sdk-oss-3.4.1.jar\n" +
            "animal-sniffer-annotations-1.17.jar\n" +
            "aopalliance-1.0.jar\n" +
            "asm-5.0.4.jar\n" +
            "audience-annotations-0.5.0.jar\n" +
            "avro-1.7.7.jar\n" +
            "aws-java-sdk-bundle-1.11.375.jar\n" +
            "azure-data-lake-store-sdk-2.2.9.jar\n" +
            "azure-keyvault-core-1.0.0.jar\n" +
            "azure-storage-7.0.0.jar\n" +
            "bcpkix-jdk15on-1.60.jar\n" +
            "bcprov-jdk15on-1.60.jar\n" +
            "checker-qual-2.5.2.jar\n" +
            "commons-beanutils-1.9.3.jar\n" +
            "commons-cli-1.2.jar\n" +
            "commons-codec-1.11.jar\n" +
            "commons-collections-3.2.2.jar\n" +
            "commons-compress-1.18.jar\n" +
            "commons-configuration2-2.1.1.jar\n" +
            "commons-csv-1.0.jar\n" +
            "commons-daemon-1.0.13.jar\n" +
            "commons-io-2.5.jar\n" +
            "commons-lang-2.6.jar\n" +
            "commons-lang3-3.7.jar\n" +
            "commons-logging-1.1.3.jar\n" +
            "commons-math3-3.1.1.jar\n" +
            "commons-net-3.6.jar\n" +
            "commons-text-1.4.jar\n" +
            "curator-client-2.13.0.jar\n" +
            "curator-framework-2.13.0.jar\n" +
            "curator-recipes-2.13.0.jar\n" +
            "dnsjava-2.1.7.jar\n" +
            "ehcache-3.3.1.jar\n" +
            "error_prone_annotations-2.2.0.jar\n" +
            "failureaccess-1.0.jar\n" +
            "fst-2.50.jar\n" +
            "geronimo-jcache_1.0_spec-1.0-alpha-1.jar\n" +
            "gson-2.2.4.jar\n" +
            "guava-27.0-jre.jar\n" +
            "guice-4.0.jar\n" +
            "guice-servlet-4.0.jar\n" +
            "hadoop-aliyun-3.2.1.jar\n" +
            "hadoop-annotations-3.2.1.jar\n" +
            "hadoop-archive-logs-3.2.1.jar\n" +
            "hadoop-archives-3.2.1.jar\n" +
            "hadoop-auth-3.2.1.jar\n" +
            "hadoop-aws-3.2.1.jar\n" +
            "hadoop-azure-3.2.1.jar\n" +
            "hadoop-azure-datalake-3.2.1.jar\n" +
            "hadoop-client-api-3.2.1.jar\n" +
            "hadoop-client-minicluster-3.2.1.jar\n" +
            "hadoop-client-runtime-3.2.1.jar\n" +
            "hadoop-common-3.2.1.jar\n" +
            "hadoop-datajoin-3.2.1.jar\n" +
            "hadoop-distcp-3.2.1.jar\n" +
            "hadoop-extras-3.2.1.jar\n" +
            "hadoop-fs2img-3.2.1.jar\n" +
            "hadoop-gridmix-3.2.1.jar\n" +
            "hadoop-hdfs-3.2.1.jar\n" +
            "hadoop-hdfs-client-3.2.1.jar\n" +
            "hadoop-hdfs-httpfs-3.2.1.jar\n" +
            "hadoop-hdfs-native-client-3.2.1.jar\n" +
            "hadoop-hdfs-nfs-3.2.1.jar\n" +
            "hadoop-hdfs-rbf-3.2.1.jar\n" +
            "hadoop-kafka-3.2.1.jar\n" +
            "hadoop-kms-3.2.1.jar\n" +
            "hadoop-mapreduce-client-app-3.2.1.jar\n" +
            "hadoop-mapreduce-client-common-3.2.1.jar\n" +
            "hadoop-mapreduce-client-core-3.2.1.jar\n" +
            "hadoop-mapreduce-client-hs-3.2.1.jar\n" +
            "hadoop-mapreduce-client-hs-plugins-3.2.1.jar\n" +
            "hadoop-mapreduce-client-jobclient-3.2.1.jar\n" +
            "hadoop-mapreduce-client-nativetask-3.2.1.jar\n" +
            "hadoop-mapreduce-client-shuffle-3.2.1.jar\n" +
            "hadoop-mapreduce-client-uploader-3.2.1.jar\n" +
            "hadoop-nfs-3.2.1.jar\n" +
            "hadoop-openstack-3.2.1.jar\n" +
            "hadoop-resourceestimator-3.2.1.jar\n" +
            "hadoop-rumen-3.2.1.jar\n" +
            "hadoop-sls-3.2.1.jar\n" +
            "hadoop-streaming-3.2.1.jar\n" +
            "hadoop-yarn-api-3.2.1.jar\n" +
            "hadoop-yarn-applications-distributedshell-3.2.1.jar\n" +
            "hadoop-yarn-applications-unmanaged-am-launcher-3.2.1.jar\n" +
            "hadoop-yarn-client-3.2.1.jar\n" +
            "hadoop-yarn-common-3.2.1.jar\n" +
            "hadoop-yarn-registry-3.2.1.jar\n" +
            "hadoop-yarn-server-applicationhistoryservice-3.2.1.jar\n" +
            "hadoop-yarn-server-common-3.2.1.jar\n" +
            "hadoop-yarn-server-nodemanager-3.2.1.jar\n" +
            "hadoop-yarn-server-resourcemanager-3.2.1.jar\n" +
            "hadoop-yarn-server-router-3.2.1.jar\n" +
            "hadoop-yarn-server-sharedcachemanager-3.2.1.jar\n" +
            "hadoop-yarn-server-timeline-pluginstorage-3.2.1.jar\n" +
            "hadoop-yarn-server-timelineservice-3.2.1.jar\n" +
            "hadoop-yarn-server-timelineservice-hbase-client-3.2.1.jar\n" +
            "hadoop-yarn-server-timelineservice-hbase-common-3.2.1.jar\n" +
            "hadoop-yarn-server-timelineservice-hbase-coprocessor-3.2.1.jar\n" +
            "hadoop-yarn-server-web-proxy-3.2.1.jar\n" +
            "hadoop-yarn-services-api-3.2.1.jar\n" +
            "hadoop-yarn-services-core-3.2.1.jar\n" +
            "hadoop-yarn-submarine-3.2.1.jar\n" +
            "hamcrest-core-1.3.jar\n" +
            "hbase-annotations-1.2.6.jar\n" +
            "hbase-client-1.2.6.jar\n" +
            "hbase-common-1.2.6.jar\n" +
            "hbase-protocol-1.2.6.jar\n" +
            "HikariCP-java7-2.4.12.jar\n" +
            "hsqldb-2.3.4.jar\n" +
            "htrace-core-3.1.0-incubating.jar\n" +
            "htrace-core4-4.1.0-incubating.jar\n" +
            "httpclient-4.5.6.jar\n" +
            "httpcore-4.4.10.jar\n" +
            "j2objc-annotations-1.1.jar\n" +
            "jackson-annotations-2.9.8.jar\n" +
            "jackson-core-2.9.8.jar\n" +
            "jackson-core-asl-1.9.13.jar\n" +
            "jackson-databind-2.9.8.jar\n" +
            "jackson-jaxrs-1.9.13.jar\n" +
            "jackson-jaxrs-base-2.9.8.jar\n" +
            "jackson-jaxrs-json-provider-2.9.8.jar\n" +
            "jackson-mapper-asl-1.9.13.jar\n" +
            "jackson-module-jaxb-annotations-2.9.8.jar\n" +
            "jackson-xc-1.9.13.jar\n" +
            "java-util-1.9.0.jar\n" +
            "javax.inject-1.jar\n" +
            "javax.servlet-api-3.1.0.jar\n" +
            "jaxb-api-2.2.11.jar\n" +
            "jaxb-impl-2.2.3-1.jar\n" +
            "jcip-annotations-1.0-1.jar\n" +
            "jcodings-1.0.13.jar\n" +
            "jdom-1.1.jar\n" +
            "jersey-client-1.19.jar\n" +
            "jersey-core-1.19.jar\n" +
            "jersey-guice-1.19.jar\n" +
            "jersey-json-1.19.jar\n" +
            "jersey-server-1.19.jar\n" +
            "jersey-servlet-1.19.jar\n" +
            "jettison-1.1.jar\n" +
            "jetty-http-9.3.24.v20180605.jar\n" +
            "jetty-io-9.3.24.v20180605.jar\n" +
            "jetty-security-9.3.24.v20180605.jar\n" +
            "jetty-server-9.3.24.v20180605.jar\n" +
            "jetty-servlet-9.3.24.v20180605.jar\n" +
            "jetty-util-9.3.24.v20180605.jar\n" +
            "jetty-util-ajax-9.3.24.v20180605.jar\n" +
            "jetty-webapp-9.3.24.v20180605.jar\n" +
            "jetty-xml-9.3.24.v20180605.jar\n" +
            "joni-2.1.2.jar\n" +
            "jsch-0.1.54.jar\n" +
            "json-io-2.5.1.jar\n" +
            "json-simple-1.1.1.jar\n" +
            "json-smart-2.3.jar\n" +
            "jsp-api-2.1.jar\n" +
            "jsr305-3.0.0.jar\n" +
            "jsr311-api-1.1.1.jar\n" +
            "jul-to-slf4j-1.7.25.jar\n" +
            "junit-4.11.jar\n" +
            "kafka-clients-0.8.2.1.jar\n" +
            "kerb-admin-1.0.1.jar\n" +
            "kerb-client-1.0.1.jar\n" +
            "kerb-common-1.0.1.jar\n" +
            "kerb-core-1.0.1.jar\n" +
            "kerb-crypto-1.0.1.jar\n" +
            "kerb-identity-1.0.1.jar\n" +
            "kerb-server-1.0.1.jar\n" +
            "kerb-simplekdc-1.0.1.jar\n" +
            "kerb-util-1.0.1.jar\n" +
            "kerby-asn1-1.0.1.jar\n" +
            "kerby-config-1.0.1.jar\n" +
            "kerby-pkix-1.0.1.jar\n" +
            "kerby-util-1.0.1.jar\n" +
            "kerby-xdr-1.0.1.jar\n" +
            "leveldbjni-all-1.8.jar\n" +
            "listenablefuture-9999.0-empty-to-avoid-conflict-with-guava.jar\n" +
            "log4j-1.2.17.jar\n" +
            "lz4-1.2.0.jar\n" +
            "metrics-core-2.2.0.jar\n" +
            "metrics-core-3.2.4.jar\n" +
            "mssql-jdbc-6.2.1.jre7.jar\n" +
            "netty-3.10.5.Final.jar\n" +
            "netty-all-4.0.52.Final.jar\n" +
            "nimbus-jose-jwt-4.41.1.jar\n" +
            "objenesis-1.0.jar\n" +
            "ojalgo-43.0.jar\n" +
            "okhttp-2.7.5.jar\n" +
            "okio-1.6.0.jar\n" +
            "paranamer-2.3.jar\n" +
            "protobuf-java-2.5.0.jar\n" +
            "re2j-1.1.jar\n" +
            "slf4j-api-1.7.25.jar\n" +
            "slf4j-log4j12-1.7.25.jar\n" +
            "snakeyaml-1.16.jar\n" +
            "snappy-java-1.0.5.jar\n" +
            "stax2-api-3.1.4.jar\n" +
            "swagger-annotations-1.5.4.jar\n" +
            "token-provider-1.0.1.jar\n" +
            "wildfly-openssl-1.0.7.Final.jar\n" +
            "woodstox-core-5.0.3.jar\n" +
            "zookeeper-3.4.13.jar";
}
