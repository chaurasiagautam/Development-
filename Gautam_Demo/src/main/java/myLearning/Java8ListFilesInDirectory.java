package main.java.myLearning;

import sun.misc.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Java8ListFilesInDirectory {
    public static void main(String[] args) throws IOException
    {
        Java8ListFilesInDirectory java8ListFilesInDirectory = new Java8ListFilesInDirectory();
       /* Stream<Path> files = Files.list(Paths.get("C:\\Code\\On-Prem\\GOEP_JBoss_Online"));

        files.forEach(System.out::println);

        files.close();*/
/*
        test(errorMsg);

//        readFileAsString("words.txt");
        String data = file1.toString();
        System.out.println(data);*/
        InputStream file1 = java8ListFilesInDirectory.getClass().getClassLoader().getResourceAsStream("exception.text");
        System.out.println(file1.toString());
//        testSumit();
    }

    private static void test(String errorMsg){

        Matcher matcher = Pattern.compile(":[\\s]*([\\w-.:\\s'\\*\\\"#{}\\[\\]]*)"
                + ",[\\s]*Line[\\s]*:[\\s]*([0-9]*),[\\s]*Column[\\s]*:[\\s]*([0-9]*)")
                .matcher(errorMsg);


        while (matcher.find()) {
            System.out.println(matcher.group(1).contains("\n"));
            String test = matcher.group(1).replaceAll("\n", "");
            System.out.println("Test********** "+test);
            System.out.println("Message "+matcher.group(1).contains("\n"));
            System.out.println("Line "+matcher.group(2));
            System.out.println("Column "+matcher.group(3));
        }
    }

    private static void testExcep(){
        try{
            int i = 10/0;
        } catch (Exception exp){

        }

    }

    private static void testSumit(){
        String message = "N/A";
        String line = "N/A";
        String column = "N/A";

        String testString ="Validation failed for: com.sun.org.apache.xerces.internal.jaxp.validation.XMLSchema@550bda9d\r\n" +
                "[tc-okhttp-stream-1686934746] STDOUT: errors: [\r\n" +
                "[tc-okhttp-stream-1686934746] STDOUT:org.xml.sax.SAXParseException: cvc-pattern-valid: Value '100001930013 ' "
                + "is not facet-valid with respect to pattern '[0-9]*' for type '#AnonType_customerIdBillingCustomerType'.,"
                + " Line : 62, Column : 44\r\n" +
                "[tc-okhttp-stream-711112124] STDOUT: org.xml.sax.SAXParseException: "
                + "cvc-type.3.1.3: The value '100001930013 ' of element 'customerId' is not valid.,"
                + " Line : 62, Column : 44";

        Matcher matcher = Pattern.compile("STDOUT:[\\s]*([\\w-.:\\s'\\*\\\\\"#{}\\[\\]]*),[\\s]*Line[\\s]*:[\\s]*([0-9]*),[\\s]*Column[\\s]*:[\\s]*([0-9]*)")
                .matcher(testString);

        while (matcher.find()) {
            message = matcher.group(1);
            line = matcher.group(2);
            column = matcher.group(3);

        }

        System.out.println("output is " +  " message = " + message
                + " line " + line + "column " + column);

    }




    public static String errorMsg= "org.xml.sax.SAXParseException: cvc-elt.1: Cannot find the declaration of element 'x:businessTransaction'.\", line=\"2\", column=\"135\", xsdName=\"com/hm/integration/i216/contracts/in/wms/v1.7/orderStatus.xsd\", errorFile=\"I216_XP07_MX_00000001_000_20200615103451.xml\"\n" +
            "\n" +
            "org.apache.camel.processor.validation.SchemaValidationException: Validation failed for: com.sun.org.apache.xerces.internal.jaxp.validation.XMLSchema@180ff888\n" +
            "\n" +
            "errors: [\n" +
            "\n" +
            "org.xml.sax.SAXParseException: cvc-elt.1: Cannot find the declaration of element 'x:businessTransaction'., Line : 2, Column : 135\n" +
            "\n" +
            "]. Exchange[ID-integration-i216-xp07-55bcc88f8b-8b6fz-1592909304989-0-2]\n" +
            "\n" +
            "\tat org.apache.camel.processor.validation.DefaultValidationErrorHandler.handleErrors(DefaultValidationErrorHandler.java:76)\n" +
            "\n" +
            "\tat org.apache.camel.processor.validation.ValidatingProcessor.doProcess(ValidatingProcessor.java:164)\n" +
            "\n" +
            "\tat org.apache.camel.processor.validation.ValidatingProcessor.process(ValidatingProcessor.java:89)\n" +
            "\n" +
            "\tat org.apache.camel.component.validator.ValidatorProducer.process(ValidatorProducer.java:37)\n" +
            "\n" +
            "\tat org.apache.camel.processor.SendProcessor.process(SendProcessor.java:148)\n" +
            "\n" +
            "\tat org.apache.camel.management.InstrumentationProcessor.process(InstrumentationProcessor.java:76)\n" +
            "\n" +
            "\tat org.apache.camel.processor.RedeliveryErrorHandler.process(RedeliveryErrorHandler.java:548)\n" +
            "\n" +
            "\tat org.apache.camel.processor.CamelInternalProcessor.process(CamelInternalProcessor.java:201)\n" +
            "\n" +
            "\tat org.apache.camel.processor.Pipeline.process(Pipeline.java:138)\n" +
            "\n" +
            "\tat org.apache.camel.processor.Pipeline.process(Pipeline.java:101)\n" +
            "\n" +
            "\tat org.apache.camel.processor.ChoiceProcessor.process(ChoiceProcessor.java:117)\n" +
            "\n" +
            "\tat org.apache.camel.management.InstrumentationProcessor.process(InstrumentationProcessor.java:76)\n" +
            "\n" +
            "\tat org.apache.camel.processor.RedeliveryErrorHandler.process(RedeliveryErrorHandler.java:548)\n" +
            "\n" +
            "\tat org.apache.camel.processor.CamelInternalProcessor.process(CamelInternalProcessor.java:201)\n" +
            "\n" +
            "\tat org.apache.camel.processor.Pipeline.process(Pipeline.java:138)\n" +
            "\n" +
            "\tat org.apache.camel.processor.Pipeline.process(Pipeline.java:101)\n" +
            "\n" +
            "\tat org.apache.camel.processor.CamelInternalProcessor.process(CamelInternalProcessor.java:201)\n" +
            "\n" +
            "\tat org.apache.camel.component.direct.DirectBlockingProducer.process(DirectBlockingProducer.java:53)\n" +
            "\n" +
            "\tat org.apache.camel.processor.SendProcessor.process(SendProcessor.java:148)\n" +
            "\n" +
            "\tat org.apache.camel.management.InstrumentationProcessor.process(InstrumentationProcessor.java:76)\n" +
            "\n" +
            "\tat org.apache.camel.processor.RedeliveryErrorHandler.process(RedeliveryErrorHandler.java:548)\n" +
            "\n" +
            "\tat org.apache.camel.processor.CamelInternalProcessor.process(CamelInternalProcessor.java:201)\n" +
            "\n" +
            "\tat org.apache.camel.processor.CamelInternalProcessor.process(CamelInternalProcessor.java:201)\n" +
            "\n" +
            "\tat org.apache.camel.component.file.GenericFileConsumer.processExchange(GenericFileConsumer.java:452)\n" +
            "\n" +
            "\tat org.apache.camel.component.file.GenericFileConsumer.processBatch(GenericFileConsumer.java:219)\n" +
            "\n" +
            "\tat org.apache.camel.component.file.GenericFileConsumer.poll(GenericFileConsumer.java:183)\n" +
            "\n" +
            "\tat org.apache.camel.impl.ScheduledPollConsumer.doRun(ScheduledPollConsumer.java:174)\n" +
            "\n" +
            "\tat org.apache.camel.impl.ScheduledPollConsumer.run(ScheduledPollConsumer.java:101)\n" +
            "\n" +
            "\tat java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)\n" +
            "\n" +
            "\tat java.util.concurrent.FutureTask.runAndReset(FutureTask.java:308)\n" +
            "\n" +
            "\tat java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.access$301(ScheduledThreadPoolExecutor.java:180)\n" +
            "\n" +
            "\tat java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:294)\n" +
            "\n" +
            "\tat java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)\n" +
            "\n" +
            "\tat java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)\n" +
            "\n" +
            "\tat java.lang.Thread.run(Thread.java:748)" ;
}
