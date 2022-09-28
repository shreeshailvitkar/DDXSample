package com.XMLtoTSVConverter.mavenproject;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

/**
 * Hello world!
 *
 */
public class App 
{
	//StringBuilder out = new StringBuilder();
	//public static final CSVFormat;
	
	static ArrayList<String> header = new ArrayList<String>(Arrays.asList("#Head", "ProfileVersion", "MessageId", "MessageCreatedDateTime",
			 "FileNumber", "NumberOfFiles", "UsageStartDate", "UsageEndDate",
			  "SenderPartyId", "SenderName", "ServiceDescription",
			 "RecipientPartyId", "RecipientName", "RepresentedRepertoire"));

	static ArrayList<String> headerSY = new ArrayList<String>(Arrays.asList("#SY06.02", "SummaryRecordId", "DistributionChannel",
			 "DistributionChannelDPID", "CommercialModel", "UseType", "Territory",
			"ServiceDescription", "Usages", "Subscribers", "Currency",
			"NumberOfReleases", "NetRevenue", "IndirectNetRevenue",
			"PreviewAvailable", "ExchangRateBaseCurrency", "ExchangeRate",
			"ViewerHours"));
	
	static ArrayList<String> headerRE = new ArrayList<String>(Arrays.asList("#RE03.02", "BlockId", "ReleaseReference", "DSPReleaseId",
    		"ProprietaryReleaseId", "ICPN", "Title", "SubTitle", 
    		"SeriesTitle", "SeasonNumber", "DisplayArtistName", 
    		"DisplayArtistPartyId", "ReleaseType", "DataProviderName",
    		"VideoCategory", "EpisodeNumber", "UserChannelName"));
	
	
	
	static ArrayList<String> headerAS = new ArrayList<String>(Arrays.asList("#AS03.02", "BlockId", "ResourceReference", "DspResourceId",
    		"ISAN", "EIDR", "ProprietaryId", "VideoType", "Title",
    		"SubTitle", "OriginalTitle", "SeasonNumber", "EpisodeNumber",
    		"Genre", "Duration", "ProducerName", "ProducerPartyId",
    		"DirectorName", "DirectorPartyId", "ActorName", "ActorPartyId",
    		"LanguageLocalizationType", "HasCaptioning", "HasAudioDescription",
    		"LanguageOfPerformance", "LanguageOfDubbing", "DateOfProductionOrRelease",
    		"CountryOfProduction", "OriginalBroadcastDateTime",
    		"ProductionCompanyName", "ProductionCompanyPartyId",
    		"CueSheetDataProviderName", "rn" ));
    
	static ArrayList<String> headerSU = new ArrayList<String>(Arrays.asList("#SU04.02", "BlockId", "SummaryRecordId", "SalesTranscactionId",
    		"TransactedRelease", "TransactedResource", "IsDRMEnforced",
    		"VideoDefinitionType", "CodingType", "BitRate",
    		"OriginalBroadcastChannel", "OriginalBroadcastDateTime",
    		"IsRoyaltyBearing", "SalesUpgrade", "Usages", "Returns",
    		"DurationUsed", "PriceConsumerPaidExcSalesTax", "PromotionalActivity",
    		"OfferStartDate", "OfferEndDate", "OfferURL",
    		"OriginalBroadcastDateTime", "UseType"));
   
    
	static ArrayList<String> headerFoot = new ArrayList<String>(Arrays.asList("#FOOT", "NumberOfLinesInFile", "NumberOfLinesInReport",
    		"NumberOfSummaryRecords", "NumberOfBlocksInFile",
    		"NumberOfBlocksInReport"));
    
	static List<ArrayList<String>> headerList = new ArrayList<ArrayList<String>>();
	
    
	static {
		headerList.add(header);
		headerList.add(headerRE);
		headerList.add(headerSU);
		headerList.add(headerAS);
		headerList.add(headerSY);
		headerList.add(headerFoot);
	}	
		
	
	


   
			
	public static void main( String[] args )
    {
		final CSVFormat csvFormat = CSVFormat.Builder.create().setDelimiter("\t").build();


    	try ( CSVPrinter printer = new CSVPrinter(new FileWriter("data.tsv"), CSVFormat.TDF))
		{
    		System.out.print("hello");
    		
    		for (ArrayList<String> s : headerList) {
    			printer.printRecord(s);
    			//printer.println();
    			}
    		
    		
    	}catch (IOException ex) {
    		ex.printStackTrace();
    	}
    	
    }
}

