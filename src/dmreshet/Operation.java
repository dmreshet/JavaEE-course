package dmreshet;

public class Operation{
    public static void main(String[] agrs){
//        String[] content = str.split("\n");
//        String[] newContent = str2.split("\n");
//        String[] sqlQueries = sql.split("\n");
//        List<String> list = Arrays.asList(content);
//        Map<String, String> map = new HashMap<>();
//        int j=0;
//        for (int i=0; i<newContent.length; i++){
//            if (!list.contains(newContent[i].trim())){
//                System.out.println(sqlQueries[i]);
//                j++;
//            }
//        }
//        System.out.println(j);

    }
    static String sql = "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('SYSenableLoyaltyProgramBoo','STRING',to_timestamp('01.01.70 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),'T',null);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('BFtestBillsDir','STRING',to_timestamp('01.01.70 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),'/u01/netcracker/rbm/rbmq0092/infinys_root/export/BF/TestBills',null);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('BFexceptionalBillsDir','STRING',to_timestamp('01.01.70 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),'/u01/netcracker/rbm/rbmq0092/infinys_root/export/BF/TestBills',null);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('RTFtemplateDir','STRING',to_timestamp('28.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),'/u01/netcracker/rbm/rbmq0092/infinys_root/RB/sample/templates',null);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('RTFtableFile','STRING',to_timestamp('28.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),'/u01/netcracker/rbm/rbmq0092/infinys_root/RB/sample/templates/table_def',null);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('BGdateFormat','STRING',to_timestamp('01.01.70 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),'%Y%m%d',null);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('BGeventTotalGreaterPrecisionBoo','STRING',to_timestamp('01.01.70 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),'F',null);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('BGfreeEventMessage','STRING',to_timestamp('01.01.70 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),'Free',null);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('BGnullBudgetCentreName','STRING',to_timestamp('01.01.70 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),'NULLBUDGETCENTRE',null);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('BGseparateReratingRevenueBoo','STRING',to_timestamp('01.01.70 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),'F',null);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('BGinfoCurrencyOutput','STRING',to_timestamp('01.01.70 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),'INVOICE',null);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('BGeventSummary','STRING',to_timestamp('01.01.70 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),'BILLDATA',null);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('BGtimeFormat','STRING',to_timestamp('01.01.70 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),'%H%M%S',null);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('SYSinstanceUALabel','STRING',to_timestamp('01.01.10 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),'rbmq0092',null);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('SYSlogFileRootDir','STRING',to_timestamp('21.10.10 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),'/u01/netcracker/rbm/rbmq0092/infinys_root/LOGS/eventlog',null);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('CDPmanagedFileCreationTimeLimit','INTEGER',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),null,24);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('CDPmanagedFileSize','INTEGER',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),null,2000);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('CEUlockDiscountBucketsBoo','STRING',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),'F',null);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('COLLconfigurationOnBoo','STRING',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),'F',null);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('EAGbatchSize','INTEGER',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),null,100000);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('ETLmanagedFileCreationTimeLimit','INTEGER',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),null,24);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('ETLmanagedFileFieldDelimiter','STRING',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),',',null);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('ETLmanagedFileSize','INTEGER',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),null,2000);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('ETLmanagedFileSubType','INTEGER',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),null,null);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('ETLmanagedFileType','INTEGER',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),null,null);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('GAMIFcacheSize','INTEGER',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),null,1000);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('LCAMmaxBatchSize','INTEGER',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),null,1000);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('LCAPmanagedFileSize','INTEGER',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),null,2000);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('LCXMbackendDatabaseServiceName','STRING',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),null,null);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('OCLcacheSyncSuspensionSleepSeconds','INTEGER',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),null,10);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('OCLcacheSyncSuspensionTimeoutSeconds','INTEGER',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),null,600);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('OCLignoreOELCprocessStatusSeconds','INTEGER',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),null,300);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('OCLsubscriptionPointCheckSleepSeconds','INTEGER',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),null,10);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('OCLsubscriptionPointTimeoutSeconds','INTEGER',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),null,600);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('ODRSTadjustmentTypeId','INTEGER',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),null,0);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('ODRSTbonusReasonId','INTEGER',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),null,0);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('OELcheckInactiveCachesSeconds','INTEGER',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),null,86400);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('OELconvertBackPluginPath','STRING',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),null,null);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('OELignoreOCLprocessStatusSeconds','INTEGER',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),null,5400);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('OELlatencyThresholdCacheSyncSeconds','INTEGER',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),null,60);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('OELlatencyThresholdCachePropagationSeconds','INTEGER',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),null,30);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('OELlatencyThresholdToBackendSeconds','INTEGER',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),null,600);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('OELpollCDSstatusSleepSeconds','INTEGER',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),null,600);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('OELsuspendedCheckSeconds','INTEGER',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),null,10);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('OELswitchConnectionIdleSeconds','INTEGER',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),null,60);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('OELswitchDomainGroupSeconds','INTEGER',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),null,10);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('OELswitchDomainGroupEnvelopeSize','INTEGER',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),null,100);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('RATEdiscountPriorityTieBreakStrategy','INTEGER',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),null,1);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('RATEqueueBoo','STRING',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),'F',null);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('RDPmanagedFileCreationTimeLimit','INTEGER',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),null,24);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('RDPmanagedFileSize','INTEGER',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),null,2000);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('RTDPduplicateCheckAuthorisationBoo','STRING',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),'F',null);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('RTDPmodificationDays','INTEGER',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),null,0);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('RTDPnumberOfDupTables','INTEGER',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),null,0);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('SYSaccountInquiryNum','INTEGER',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),null,0);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('SYSallowTicketBoo','STRING',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),'F',null);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('SYSbillOfferImageMaxKBSize','INTEGER',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),null,null);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('SYScollectionsAcctChangesTimeLimit','INTEGER',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),null,8);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('SYScollectionsInUseBoo','STRING',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),'F',null);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('SYScollectionsManagedFileType','INTEGER',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),null,null);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('SYScollectionsSendAttrLevel','INTEGER',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),null,3);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('SYSdaysToKeepPeriodicAttributes','INTEGER',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),null,3);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('SYSinterimEventSourcesFileType','INTEGER',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),null,null);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('SYSlateFeeScheduleResetDays','INTEGER',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),null,366);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('SYSoutboundMessageDestination','STRING',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),'N',null);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('SYSoutboundMessageQueueExpirationMinutes','INTEGER',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),null,2880);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('SYSoutboundMessageQueueDataVersion','INTEGER',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),null,1);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('SYSretainBilledEventCostBoo','STRING',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),'F',null);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('SYStemplateSchemaFile','STRING',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),null,null);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('TMoldImageDir','STRING',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),null,null);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('TMoldLibraryPath','STRING',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),null,null);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('USTderiveInvTaxTotsFromSummAggregationsBoo','STRING',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),'T',null);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('USTrecordExtraPrecisionForTaxAmtBoo','STRING',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),'T',null);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('USTreplaceAllLocsWithOverrideBoo','STRING',to_timestamp('17.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),'T',null);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('SYSautoCustomerNumberingBoo','STRING',to_timestamp('28.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),'F',null);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('SYSautoAccountNumberingBoo','STRING',to_timestamp('28.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),'F',null);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('SYSaccountNumNumericDigits','INTEGER',to_timestamp('28.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),null,3);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('SYSrealTimeBillTimeout','INTEGER',to_timestamp('28.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),null,20000);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('SYSrealTimeBillCancelTimeout','INTEGER',to_timestamp('28.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),null,20000);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('SYSlogFileRootDir','STRING',to_timestamp('28.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),'/u01/netcracker/rbm/rbmq0092/infinys_root/logs/',null);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('SYSlogFileClientRootDir','STRING',to_timestamp('28.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),'/u01/netcracker/rbm/rbmq0092/infinys_root/client/',null);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('SYSmanagedFileRootDir','STRING',to_timestamp('28.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),'/u01/netcracker/rbm/rbmq0092/infinys_root/RB/mf',null);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('SYStransactionTidemark','STRING',to_timestamp('28.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),'NOMINAL',null);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('SYScreditAdjustmentTidemark','STRING',to_timestamp('28.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),'NOMINAL',null);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('SYSdebitAdjustmentTidemark','STRING',to_timestamp('28.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),'NOMINAL',null);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('SYSinvoiceNumSeparatorCharacter','STRING',to_timestamp('28.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),'-',null);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('SYSinvoiceNumNumericDigits','INTEGER',to_timestamp('28.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),null,3);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('OCRcheckDigitType','INTEGER',to_timestamp('28.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),null,0);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('OCRpluginPath','STRING',to_timestamp('28.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),'/u01/netcracker/rbm/rbmq0092/infinys_root/RB/lib/OCRplugin.so',null);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('SYStaxationModel','STRING',to_timestamp('01.01.70 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),'VAT/GST',null);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('SYSmarketSegments','STRING',to_timestamp('11.02.15 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),'Automatic',null);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('SYSautoApplyDepositBoo','STRING',to_timestamp('28.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),'T',null);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('SYSapplyDepositToOldestBillBoo','STRING',to_timestamp('28.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),'F',null);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('TMimageDir','STRING',to_timestamp('28.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),'/u01/netcracker/rbm/rbmq0092/infinys_root/RB/bin',null);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('TMsystemMonitorPort','INTEGER',to_timestamp('28.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),null,7022);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('TMchildProcessPort','INTEGER',to_timestamp('28.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),null,7023);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('TMhostMachineName','STRING',to_timestamp('28.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),'qarbm009.netcracker.com',null);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('TMnumStatusMessages','INTEGER',to_timestamp('28.11.14 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),null,20);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('BFproductionBillsDir','STRING',to_timestamp('01.01.70 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),'/u01/netcracker/rbm/rbmq0092/infinys_root/export/BF/TestBills',null);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('BFdunningLettersDir','STRING',to_timestamp('01.01.70 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),'/u01/netcracker/rbm/rbmq0092/infinys_root/export/BF/TestBills',null);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('BFstatementsDir','STRING',to_timestamp('01.01.70 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),'/u01/netcracker/rbm/rbmq0092/infinys_root/export/BF/TestBills',null);\n" +
            "Insert into \"table_export\" (NAME,TYPE,START_DTM,STRING_VALUE,INTEGER_VALUE) values ('BFsubdocumentsDir','STRING',to_timestamp('01.01.70 00:00:00,000000000','DD.MM.RR HH24:MI:SS,FF'),'/u01/netcracker/rbm/rbmq0092/infinys_root/export/BF/TestBills',null);";
    static String str2 = "SYSenableLoyaltyProgramBoo\n" +
            "            BFtestBillsDir\n" +
            "            BFexceptionalBillsDir\n" +
            "            RTFtemplateDir\n" +
            "            RTFtableFile\n" +
            "            BGdateFormat\n" +
            "            BGeventTotalGreaterPrecisionBoo\n" +
            "            BGfreeEventMessage\n" +
            "            BGnullBudgetCentreName\n" +
            "            BGseparateReratingRevenueBoo\n" +
            "            BGinfoCurrencyOutput\n" +
            "            BGeventSummary\n" +
            "            BGtimeFormat\n" +
            "            SYSinstanceUALabel\n" +
            "            SYSlogFileRootDir\n" +
            "            CDPmanagedFileCreationTimeLimit\n" +
            "            CDPmanagedFileSize\n" +
            "            CEUlockDiscountBucketsBoo\n" +
            "            COLLconfigurationOnBoo\n" +
            "            EAGbatchSize\n" +
            "            ETLmanagedFileCreationTimeLimit\n" +
            "            ETLmanagedFileFieldDelimiter\n" +
            "            ETLmanagedFileSize\n" +
            "            ETLmanagedFileSubType\n" +
            "            ETLmanagedFileType\n" +
            "            GAMIFcacheSize\n" +
            "            LCAMmaxBatchSize\n" +
            "            LCAPmanagedFileSize\n" +
            "            LCXMbackendDatabaseServiceName\n" +
            "            OCLcacheSyncSuspensionSleepSeconds\n" +
            "            OCLcacheSyncSuspensionTimeoutSeconds\n" +
            "            OCLignoreOELCprocessStatusSeconds\n" +
            "            OCLsubscriptionPointCheckSleepSeconds\n" +
            "            OCLsubscriptionPointTimeoutSeconds\n" +
            "            ODRSTadjustmentTypeId\n" +
            "            ODRSTbonusReasonId\n" +
            "            OELcheckInactiveCachesSeconds\n" +
            "            OELconvertBackPluginPath\n" +
            "            OELignoreOCLprocessStatusSeconds\n" +
            "            OELlatencyThresholdCacheSyncSeconds\n" +
            "            OELlatencyThresholdCachePropagationSeconds\n" +
            "            OELlatencyThresholdToBackendSeconds\n" +
            "            OELpollCDSstatusSleepSeconds\n" +
            "            OELsuspendedCheckSeconds\n" +
            "            OELswitchConnectionIdleSeconds\n" +
            "            OELswitchDomainGroupSeconds\n" +
            "            OELswitchDomainGroupEnvelopeSize\n" +
            "            RATEdiscountPriorityTieBreakStrategy\n" +
            "            RATEqueueBoo\n" +
            "            RDPmanagedFileCreationTimeLimit\n" +
            "            RDPmanagedFileSize\n" +
            "            RTDPduplicateCheckAuthorisationBoo\n" +
            "            RTDPmodificationDays\n" +
            "            RTDPnumberOfDupTables\n" +
            "            SYSaccountInquiryNum\n" +
            "            SYSallowTicketBoo\n" +
            "            SYSbillOfferImageMaxKBSize\n" +
            "            SYScollectionsAcctChangesTimeLimit\n" +
            "            SYScollectionsInUseBoo\n" +
            "            SYScollectionsManagedFileType\n" +
            "            SYScollectionsSendAttrLevel\n" +
            "            SYSdaysToKeepPeriodicAttributes\n" +
            "            SYSinterimEventSourcesFileType\n" +
            "            SYSlateFeeScheduleResetDays\n" +
            "            SYSoutboundMessageDestination\n" +
            "            SYSoutboundMessageQueueExpirationMinutes\n" +
            "            SYSoutboundMessageQueueDataVersion\n" +
            "            SYSretainBilledEventCostBoo\n" +
            "            SYStemplateSchemaFile\n" +
            "            TMoldImageDir\n" +
            "            TMoldLibraryPath\n" +
            "            USTderiveInvTaxTotsFromSummAggregationsBoo\n" +
            "            USTrecordExtraPrecisionForTaxAmtBoo\n" +
            "            USTreplaceAllLocsWithOverrideBoo\n" +
            "            SYSautoCustomerNumberingBoo\n" +
            "            SYSautoAccountNumberingBoo\n" +
            "            SYSaccountNumNumericDigits\n" +
            "            SYSrealTimeBillTimeout\n" +
            "            SYSrealTimeBillCancelTimeout\n" +
            "            SYSlogFileRootDir\n" +
            "            SYSlogFileClientRootDir\n" +
            "            SYSmanagedFileRootDir\n" +
            "            SYStransactionTidemark\n" +
            "            SYScreditAdjustmentTidemark\n" +
            "            SYSdebitAdjustmentTidemark\n" +
            "            SYSinvoiceNumSeparatorCharacter\n" +
            "            SYSinvoiceNumNumericDigits\n" +
            "            OCRcheckDigitType\n" +
            "            OCRpluginPath\n" +
            "            SYStaxationModel\n" +
            "            SYSmarketSegments\n" +
            "            SYSautoApplyDepositBoo\n" +
            "            SYSapplyDepositToOldestBillBoo\n" +
            "            TMimageDir\n" +
            "            TMsystemMonitorPort\n" +
            "            TMchildProcessPort\n" +
            "            TMhostMachineName\n" +
            "            TMnumStatusMessages\n" +
            "            BFproductionBillsDir\n" +
            "            BFdunningLettersDir\n" +
            "            BFstatementsDir\n" +
            "            BFsubdocumentsDir";


    static String str = "BFdunningLettersDir\n" +
            "BFexceptionalBillsDir\n" +
            "BFproductionBillsDir\n" +
            "BFstatementsDir\n" +
            "BFsubdocumentsDir\n" +
            "BFtestBillsDir\n" +
            "BGdateFormat\n" +
            "BGeventSummary\n" +
            "BGeventTotalGreaterPrecisionBoo\n" +
            "BGfreeEventMessage\n" +
            "BGinfoCurrencyOutput\n" +
            "BGnullBudgetCentreName\n" +
            "BGseparateReratingRevenueBoo\n" +
            "BGtimeFormat\n" +
            "CDPmanagedFileCreationTimeLimit\n" +
            "CDPmanagedFileSize\n" +
            "CEUlockDiscountBucketsBoo\n" +
            "COLLconfigurationOnBoo\n" +
            "EAGbatchSize\n" +
            "ETLmanagedFileCreationTimeLimit\n" +
            "ETLmanagedFileFieldDelimiter\n" +
            "ETLmanagedFileSize\n" +
            "ETLmanagedFileSubType\n" +
            "ETLmanagedFileType\n" +
            "GAMIFcacheSize\n" +
            "LCAMmaxBatchSize\n" +
            "LCAPmanagedFileSize\n" +
            "LCXMbackendDatabaseServiceName\n" +
            "OCLcacheSyncSuspensionSleepSeconds\n" +
            "OCLcacheSyncSuspensionTimeoutSeconds\n" +
            "OCLignoreOELCprocessStatusSeconds\n" +
            "OCLsubscriptionPointCheckSleepSeconds\n" +
            "OCLsubscriptionPointTimeoutSeconds\n" +
            "OCRcheckDigitType\n" +
            "OCRpluginPath\n" +
            "ODRSTadjustmentTypeId\n" +
            "ODRSTbonusReasonId\n" +
            "OELcheckInactiveCachesSeconds\n" +
            "OELconvertBackPluginPath\n" +
            "OELignoreOCLprocessStatusSeconds\n" +
            "OELlatencyThresholdCachePropagationSeconds\n" +
            "OELlatencyThresholdCacheSyncSeconds\n" +
            "OELlatencyThresholdToBackendSeconds\n" +
            "OELpollCDSstatusSleepSeconds\n" +
            "OELsuspendedCheckSeconds\n" +
            "OELswitchConnectionIdleSeconds\n" +
            "OELswitchDomainGroupEnvelopeSize\n" +
            "OELswitchDomainGroupSeconds\n" +
            "RATEdiscountPriorityTieBreakStrategy\n" +
            "RATEqueueBoo\n" +
            "RDPmanagedFileCreationTimeLimit\n" +
            "RDPmanagedFileSize\n" +
            "RTDPduplicateCheckAuthorisationBoo\n" +
            "RTDPmodificationDays\n" +
            "RTDPnumberOfDupTables\n" +
            "RTFtableFile\n" +
            "RTFtemplateDir\n" +
            "SYSaccountInquiryNum\n" +
            "SYSaccountNumNumericDigits\n" +
            "SYSallowTicketBoo\n" +
            "SYSapplyDepositToOldestBillBoo\n" +
            "SYSautoAccountNumberingBoo\n" +
            "SYSautoApplyDepositBoo\n" +
            "SYSautoCustomerNumberingBoo\n" +
            "SYSautoSubsNumberingBoo\n" +
            "SYSbillOfferImageMaxKBSize\n" +
            "SYScollectionsAcctChangesTimeLimit\n" +
            "SYScollectionsInUseBoo\n" +
            "SYScollectionsManagedFileType\n" +
            "SYScollectionsSendAttrLevel\n" +
            "SYSconfigureSuspensionChargesBoo\n" +
            "SYScreditAdjustmentTidemark\n" +
            "SYSdateOverride\n" +
            "SYSdaysToKeepPeriodicAttributes\n" +
            "SYSdebitAdjustmentTidemark\n" +
            "SYSinstanceUALabel\n" +
            "SYSinterimEventSourcesFileType\n" +
            "SYSinvoiceNumNumericDigits\n" +
            "SYSinvoiceNumSeparatorCharacter\n" +
            "SYSlateFeeScheduleResetDays\n" +
            "SYSlogFileClientRootDir\n" +
            "SYSlogFileRootDir\n" +
            "SYSlogFileRootDir\n" +
            "SYSmanagedFileRootDir\n" +
            "SYSmarketSegments\n" +
            "SYSoutboundMessageDestination\n" +
            "SYSoutboundMessageQueueDataVersion\n" +
            "SYSoutboundMessageQueueExpirationMinutes\n" +
            "SYSrealTimeBillCancelTimeout\n" +
            "SYSrealTimeBillTimeout\n" +
            "SYSretainBilledEventCostBoo\n" +
            "SYSsubsNumChecksumBoo\n" +
            "SYSsubsNumNumericDigits\n" +
            "SYStaxationModel\n" +
            "SYStemplateSchemaFile\n" +
            "SYStransactionTidemark\n" +
            "TMchildProcessPort\n" +
            "TMchildProcessPort\n" +
            "TMhostMachineName\n" +
            "TMhostMachineName\n" +
            "TMimageDir\n" +
            "TMimageDir\n" +
            "TMnumStatusMessages\n" +
            "TMnumStatusMessages\n" +
            "TMoldImageDir\n" +
            "TMoldLibraryPath\n" +
            "TMsystemMonitorPort\n" +
            "TMsystemMonitorPort\n" +
            "USTderiveInvTaxTotsFromSummAggregationsBoo\n" +
            "USTrecordExtraPrecisionForTaxAmtBoo\n" +
            "USTreplaceAllLocsWithOverrideBoo";
}

