<?xml version="1.0" encoding="UTF-8"?>

<#-- DAOs -->
<#assign db = templateService.getPersistenceStrategy()>
<#assign studyDao = db.studyDAO>
<#assign csiDao = db.countrySpecificInformationDAO> 

<!-- DDIInstance --> 
<DDIInstance
	xmlns="ddi:instance:3_2"
	xmlns:a="ddi:archive:3_2"
	xmlns:c="ddi:conceptualcomponent:3_2"
	xmlns:cm="ddi:comparative:3_2"
	xmlns:d="ddi:datacollection:3_2"
	xmlns:dc="http://purl.org/dc/elements/1.1/"
	xmlns:dce="ddi:dcelements:3_2"
	xmlns:dct="http://purl.org/dc/terms/"
	xmlns:ds="ddi:dataset:3_2"
	xmlns:g="ddi:group:3_2"
	xmlns:l="ddi:logicalproduct:3_2"
	xmlns:m1="ddi:physicaldataproduct/ncube/normal:3_2"
	xmlns:m2="ddi:physicaldataproduct/ncube/tabular:3_2"
	xmlns:m3="ddi:physicaldataproduct/ncube/inline:3_2"
	xmlns:o="ddi:organizations:3_2"
	xmlns:pd="ddi:physicaldataproduct:3_2"
	xmlns:pi="ddi:physicalinstance:3_2"
	xmlns:pr="ddi:profile:3_2"
	xmlns:r="ddi:reusable:3_2"
	xmlns:s="ddi:studyunit:3_2"
	xmlns:xhtml="http://www.w3.org/1999/xhtml"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="ddi:instance:3_2 http://www.ddialliance.org/Specification/DDI-Lifecycle/3.2/XMLSchema/instance.xsd">

	<!-- URN (DDIInstance) --> 
	<r:URN>urn:ddi:de.gesis:DDIInstance_${studyGroup.id}:0.1</r:URN> <!-- ToDo -->
	
	<!-- series -->
	<g:Group time="T2">
	
		<!-- URN (series) -->
	    <r:URN>${studyGroup.getURN()}</r:URN>
		
		<!-- notes (series) -->
		<#if studyGroup.note??><#if studyGroup.note != ''>
		<r:Note>
			<r:NoteSubject>notes (series)</r:NoteSubject>
			<r:Relationship>
				<r:RelatedToReference>
					<r:URN>${studyGroup.getURN()}</r:URN>
					<r:TypeOfObject>Group</r:TypeOfObject>
				</r:RelatedToReference>
			</r:Relationship>
			<r:NoteContent>
				<r:Content>${studyGroup.note?html}</r:Content>
			</r:NoteContent>
		</r:Note>
		</#if></#if>
		
		<!-- anonymization (series) -->
		<#if studyGroup.anonymization??><#if studyGroup.anonymization != ''>
		<r:Note>
			<r:NoteSubject>anonymization (series)</r:NoteSubject>
			<r:Relationship>
				<r:RelatedToReference>
					<r:URN>urn:ddi:de.gesis:Archive_${studyGroup.id}:0.1</r:URN><!-- ToDo -->
					<r:TypeOfObject>Archive</r:TypeOfObject>
				</r:RelatedToReference>
			</r:Relationship>
			<r:NoteContent>
				<r:Content>${studyGroup.anonymization?html}</r:Content>
			</r:NoteContent>
		</r:Note>
		</#if></#if>
		
		<!-- comparability over time (series) -->
		<#if studyGroup.comparabilityOverTime??><#if studyGroup.comparabilityOverTime != ''>
		<r:Note>
			<r:NoteSubject>comparability over time (series)</r:NoteSubject>
			<r:Relationship>
				<r:RelatedToReference>
					<r:URN>${studyGroup.getURN()}</r:URN>
					<r:TypeOfObject>Group</r:TypeOfObject>
				</r:RelatedToReference>
			</r:Relationship>
			<r:NoteContent>
				<r:Content>${studyGroup.comparabilityOverTime?html}</r:Content>
			</r:NoteContent>
		</r:Note>
		</#if></#if>
		
		<!-- comparability over space (series) -->
		<#if studyGroup.comparabilityOverSpace??><#if studyGroup.comparabilityOverSpace != ''>
		<r:Note>
			<r:NoteSubject>comparability over space (series)</r:NoteSubject>
			<r:Relationship>
				<r:RelatedToReference>
					<r:URN>${studyGroup.getURN()}</r:URN>
					<r:TypeOfObject>Group</r:TypeOfObject>
				</r:RelatedToReference>
			</r:Relationship>
			<r:NoteContent>
				<r:Content>${studyGroup.comparabilityOverSpace?html}</r:Content>
			</r:NoteContent>
		</r:Note>
		</#if></#if>
		
		<r:Citation>
		
			<!-- release year (series) -->
			<#if studyGroup.dataVersionReleaseYear??><#if studyGroup.dataVersionReleaseYear != ''>
			<r:PublicationDate>
				<r:SimpleDate>${studyGroup.dataVersionReleaseYear?html}</r:SimpleDate>
			</r:PublicationDate>
			</#if></#if>
			
			<!-- organization (series) -->
			<#if studyGroup.organization??><#if studyGroup.organization != ''>
			<dc:contributor>${studyGroup.organization?html}</dc:contributor>
			</#if></#if>
			
			<!-- version number (series) -->
			<#if studyGroup.dataVersionVersionNumber??><#if studyGroup.dataVersionVersionNumber != ''>
			<dct:hasVersion>${studyGroup.dataVersionVersionNumber?html}</dct:hasVersion>
			</#if></#if>
			
			<!-- data publisher (series) -->
			<#list studyGroup.publisher as publisher>
			<#if publisher??><#if publisher.prefLabel??><#if publisher.prefLabel.en??><#if publisher.prefLabel.en != ''>
			<dc:publisher>${publisher.prefLabel.en?html}</dc:publisher>
			</#if></#if></#if></#if>
			</#list>
			
			<!-- citation (series) -->
			<#if studyGroup.citation??><#if studyGroup.citation != ''>
			<dc:description>${studyGroup.citation?html}</dc:description>
			</#if></#if>
			
		</r:Citation>
		
		<!-- abstract (series) -->
		<#if studyGroup.abstract??><#if studyGroup.abstract != ''>
		<r:Abstract>
			<r:Content>${studyGroup.abstract?html}</r:Content>
		</r:Abstract>
		</#if></#if>
		
		<!-- legal basis (series) -->
		<#if studyGroup.legalBasis??><#if studyGroup.legalBasis != ''>
		<r:AuthorizationSource>
			<r:LegalMandate>${studyGroup.legalBasis?html}</r:LegalMandate>
		</r:AuthorizationSource>
		</#if></#if>
		
		<!-- universe (series) -->
		<#list studyGroup.universe as universe>
		<#if universe??>
		<r:UniverseReference>
			<r:URN>urn:ddi:de.gesis:${universe.getId()}:0.1</r:URN>
			<r:TypeOfObject>Universe</r:TypeOfObject>
		</r:UniverseReference>
		</#if>
		</#list>
		
		<r:SeriesStatement>
		
			<!-- title (series) -->
			<#if studyGroup.prefLabel??><#if studyGroup.prefLabel.en??><#if studyGroup.prefLabel.en != ''>
			<r:SeriesName>
				<r:String>${studyGroup.prefLabel.en?html}</r:String>
			</r:SeriesName>
			</#if></#if></#if>

			<!-- subtitle (series) -->
			<#if studyGroup.subtitle??><#if studyGroup.subtitle.en??><#if studyGroup.subtitle.en != ''>
			<r:SeriesDescription>
				<r:Content>${studyGroup.subtitle.en?html}</r:Content>
			</r:SeriesDescription>
			</#if></#if></#if>
			
		</r:SeriesStatement>
		
		<#if studyGroup.subject?? && studyGroup.spacial??>
		<r:Coverage>
		
			<!-- keywords (series) -->
			<#if studyGroup.subject?? && (studyGroup.subject?size > 0) && studyGroup.subject[0].narrower??>
			<r:TopicalCoverage>
			
				<r:URN>urn:ddi:de.gesis:TopicalCoverage_${studyGroup.id}:0.1</r:URN> <!-- ToDo -->
			
				<#list studyGroup.subject[0].narrower as concept>
					<#if concept.definition?? && concept.definition.en?? && concept.definition.en != ''>
					<r:Subject>${concept.definition.en?html}</r:Subject>
					</#if>
					<#list concept.narrower as childConcept>
						<#if childConcept.definition?? && childConcept.definition.en?? && childConcept.definition.en != '' && childConcept.definition.en != concept.definition.en>
						<r:Subject>${childConcept.definition.en?html}</r:Subject>
						</#if>
					</#list>
				</#list>

			</r:TopicalCoverage>
			</#if>
			
			<!-- geographical coverage (series) -->
			<#if studyGroup.spacial?? && (studyGroup.spacial?size > 0)>
			<r:SpatialCoverage>
			
				<r:URN>urn:ddi:de.gesis:SpatialCoverage_${studyGroup.id}:0.1</r:URN> <!-- ToDo -->
				
				<#list studyGroup.spacial as location>
				<#if location.label?? && location.label != ''>
				<r:Description>
					<r:Content>${location.label?html}</r:Content>
				</r:Description>
				</#if>
				</#list>
				
			</r:SpatialCoverage>
			</#if>
		
		</r:Coverage>
		</#if>
		
		<!-- thematic classification (series) [reference] -->
		<#if studyGroup.conceptScheme?? && studyGroup.conceptScheme.hasTopConcept??>
		<c:ConceptualComponent>
			<r:URN>urn:ddi:de.gesis:ConceptualComponent_${studyGroup.id}:0.1</r:URN> <!-- ToDo -->
			
			<r:ConceptSchemeReference>
				<r:URN>urn:ddi:de.gesis:ConceptScheme_ThematicClassification_${studyGroup.id}:0.1</r:URN> <!-- ToDo -->
				<r:TypeOfObject>ConceptScheme</r:TypeOfObject>
			</r:ConceptSchemeReference>
			
		</c:ConceptualComponent>
		</#if>
		
		<#if studyGroup.sampling?? || studyGroup.sampling??>
		<d:DataCollection>
			<r:URN>urn:ddi:de.gesis:DataCollection_${studyGroup.id}:0.1</r:URN>
			
			<!-- data collection (series) -->
			<#if studyGroup.dataCollection??>
			<r:Description>
				<r:Content>${studyGroup.dataCollection?html}</r:Content>
			</r:Description>
			</#if>
			
			<#if studyGroup.sampling??>
			<d:Methodology>
				<r:URN>urn:ddi:de.gesis:DataCollection_Methodology_${studyGroup.id}:0.1</r:URN>
				
				<!-- sampling (series) -->
				<d:SamplingProcedure>
					<r:URN>urn:ddi:de.gesis:DataCollection_Methodology_SamplingProcedure_${studyGroup.id}:0.1</r:URN>
					<r:Description>
						<r:Content>${studyGroup.sampling?html}</r:Content>
					</r:Description>
				</d:SamplingProcedure>
				
			</d:Methodology>
			</#if>
			
		</d:DataCollection>
		</#if>
		
		<a:Archive>
			<r:URN>urn:ddi:de.gesis:Archive_${studyGroup.id}:0.1</r:URN> <!-- ToDo -->
			
			<#if studyGroup.dataAccessCondition??>
			<a:ArchiveSpecific>
				<a:Item>
					<a:Access>
						<r:URN>urn:ddi:de.gesis:Archive_ArchiveSpecific_Item_Access_${studyGroup.id}:0.1</r:URN>
						
						<!-- access form (series) -->
						<#if studyGroup.dataAccessCondition.accessForm??>
						<a:AccessPermission>
						    <a:Statement>
								<r:String>${studyGroup.dataAccessCondition.accessForm?html}</r:String>
							</a:Statement>
						</a:AccessPermission>
						</#if>
						
						<!-- access conditions (series) -->
						<#if studyGroup.dataAccessCondition.accessConditions??>
						<a:AccessConditions>
							<r:Content>${studyGroup.dataAccessCondition.accessConditions?html}</r:Content>
						</a:AccessConditions>
						</#if>
						
						<!-- access contact [reference] -->
						<#if studyGroup.dataAccessCondition.accessContact??>
						<a:ContactOrganizationReference>
							<r:URN>urn:ddi:de.gesis:AccessContact_${studyGroup.id}:0.1</r:URN>
							<r:TypeOfObject>Organization</r:TypeOfObject>
						</a:ContactOrganizationReference>
						</#if>
						
					</a:Access>
				</a:Item>
			</a:ArchiveSpecific>
			</#if>
			
		</a:Archive>
		
		<#-- for each study of series -->
		<#if studyGroup.studies?? && (studyGroup.studies?size > 0)>
		<#list studyGroup.studies as study>		
       	<!-- study (multiple countries) -->
       	<#-- @geography -->
        <#-- Indicates how all members of the sub-group are related along the dimension of geography. -->
        <#-- "G4" Different geography each survey -->
        <g:SubGroup geography="G4">
            <#if studyGroup.prefLabel?? && studyGroup.prefLabel.en?? && study.prefLabel?? && study.prefLabel.en??>
            <r:URN>urn:ddi:de.gesis:study_${studyGroup.prefLabel.en?html}-${study.prefLabel.en?html}:0.1</r:URN>
            </#if>
            
            <#if study.prefLabel?? && study.prefLabel.en??>
            <!-- temporal coverage (study) -->
            <r:Coverage> 
				<r:TemporalCoverage>
					<r:URN>urn:ddi:de.gesis:TemporalCoverage_${study.id}:0.1</r:URN>
					<r:ReferenceDate>
					<r:SimpleDate>${study.prefLabel.en}</r:SimpleDate>
				</r:ReferenceDate>
				</r:TemporalCoverage>
			</r:Coverage>
			</#if>
			
			<d:DataCollection> <!-- ToDo -->
				<r:URN>urn:ddi:de.gesis:DataCollection_${study.id}:0.1</r:URN>
				
				<!-- questionnaire (study [reference] --> <!-- ToDo -->
				<r:InstrumentSchemeReference>
					<r:URN>urn:ddi:de.gesis:Questionnaire_${study.id}:0.1</r:URN>
					<r:TypeOfObject>InstrumentScheme</r:TypeOfObject>
				</r:InstrumentSchemeReference>
				
			</d:DataCollection>
			
			<!-- data set [reference] --> <!-- ToDo -->
			<r:LogicalProductReference>
				<r:URN>urn:ddi:de.gesis:UUID:0.1</r:URN>
				<r:TypeOfObject>LogicalProduct</r:TypeOfObject>
			</r:LogicalProductReference>
            
            <!-- study (all countries) -->
            <s:StudyUnit>
                <#if studyGroup.prefLabel?? && studyGroup.prefLabel.en?? && study.prefLabel?? && study.prefLabel.en??>
     		    <r:URN>urn:ddi:de.gesis:study_${studyGroup.prefLabel.en?html}-${study.prefLabel.en?html}_ALL:0.1</r:URN> 
     		    </#if>
                
                <#if studyGroup.prefLabel?? && studyGroup.prefLabel.en?? && ( studyGroup.prefLabel.en?length > 0 ) &&
                     study.prefLabel?? && study.prefLabel.en?? && ( study.prefLabel.en?length > 0 ) &&
                     study.note?? && ( study.note?length > 0 )>
                <!-- notes (study) -->
				<r:Note>
					<r:Relationship>
						<r:RelatedToReference>
							<r:URN>urn:ddi:de.gesis:study_${studyGroup.prefLabel.en?html}-${study.prefLabel.en?html}:0.1</r:URN>
							<r:TypeOfObject>StudyUnit</r:TypeOfObject>
						</r:RelatedToReference>
					</r:Relationship>
					<r:NoteContent>
						<r:Content>${study.note?html}</r:Content>
					</r:NoteContent>
				</r:Note>
				</#if>
				
                <#if study.temporal[0].prefLabel.en??>
                <!-- time period covered (study) -->
				<r:Note>
					<r:NoteSubject>time period covered (study)</r:NoteSubject>
					<r:Relationship>
						<r:RelatedToReference>
							<r:URN>urn:ddi:de.gesis:TimePeriodCovered_${study.id}:0.1</r:URN>
							<r:TypeOfObject>TemporalCoverage</r:TypeOfObject>
						</r:RelatedToReference>
					</r:Relationship>
					<r:NoteContent>
						<r:Content>${study.temporal[0].prefLabel.en?html}</r:Content>
					</r:NoteContent>
				</r:Note>
				</#if>
				
				<#if ( studyGroup.prefLabel?? && studyGroup.prefLabel.en?? && study.prefLabel?? && study.prefLabel.en?? ) 
				     || 
				     ( study.subtitle?? && study.subtitle.en?? && ( study.subtitle.en?length > 0 ) ) 
				     || 
				     ( study.citation?? && ( study.citation?length > 0 ) ) > 
				<r:Citation> 
				
				    <#if study.prefLabel?? && study.prefLabel.en??>
					<!-- title (study) -->
					<r:Title>
						<r:String>${studyGroup.prefLabel.en?html} ${study.prefLabel.en?html}</r:String>
					</r:Title>
					</#if>
					
					<#if study.subtitle?? && study.subtitle.en?? && ( study.subtitle.en?length > 0 )>
					<!-- subtitle (study) -->
					<r:SubTitle>
						<r:String>${study.subtitle.en?html}</r:String>
					</r:SubTitle>
					</#if>
					
					<#if study.citation?? && ( study.citation?length > 0 )>
					<!-- citation (study) -->
					<dc:description>${study.citation?html}</dc:description>
					</#if>
					
				</r:Citation>
				</#if>
				
				<#if study.abstract?? && study.abstract.en?? && ( study.abstract.en?length > 0 )>
				<!-- abstract (study) -->
				<r:Abstract>
					<r:Content>${study.abstract.en?html}</r:Content>
				</r:Abstract>
				</#if>
				
				<#if study.temporal[0].prefLabel.en?? || 
				     ( study.subject?? && (study.subject?size > 0) && study.subject[0].narrower?? ) ||
				     ( study.spacial?? && (study.spacial?size > 0) )
				>
				<r:Coverage>
		
		            <!-- keywords (study) -->
					<#if study.subject?? && (study.subject?size > 0) && study.subject[0].narrower??>
         			<r:TopicalCoverage>
         				<r:URN>urn:ddi:de.gesis:TopicalCoverage_${study.id}:0.1</r:URN>
         			
         				<#list study.subject[0].narrower as concept>
         					<#if concept.definition?? && concept.definition.en?? && concept.definition.en != ''>
         					<r:Subject>${concept.definition.en?html}</r:Subject>
         					</#if>
         					<#list concept.narrower as childConcept>
         						<#if childConcept.definition?? && childConcept.definition.en?? && childConcept.definition.en != '' && childConcept.definition.en != concept.definition.en>
         						<r:Subject>${childConcept.definition.en?html}</r:Subject>
         						</#if>
         					</#list>
         				</#list>
         
         			</r:TopicalCoverage>
         			</#if>
					
					<#if study.spacial?? && (study.spacial?size > 0)>
					<!-- geographical coverage (study) -->
					<r:SpatialCoverage>
						<r:URN>urn:ddi:de.gesis:GeographicalCoverage_${study.id}:0.1</r:URN>
						<#list study.spacial as country>
               	   	    <r:Description>
               	   	        <r:Content>${country.label?html}</r:Content>
               	   	    </r:Description>
               	   	    </#list>
					</r:SpatialCoverage>
               		</#if>
					
					<#if study.temporal[0].prefLabel.en??>
					<!-- time period covered (study) -->
					<r:TemporalCoverage>
						<r:URN>urn:ddi:de.gesis:TimePeriodCovered_${study.id}:0.1</r:URN>
					</r:TemporalCoverage>
					</#if>
					
				</r:Coverage>
				</#if>
				
            </s:StudyUnit>
            <#-- country-specific information (study) -->
            <#assign countries = studyDao.getCountriesByStudy( study )>
            <#list countries as country>
                <#if country?? && country.code?? && ( country.code?length > 0 )>
            
            <!-- study (country) -->
			<s:StudyUnit>
                    <#if studyGroup.prefLabel?? && studyGroup.prefLabel.en?? && study.prefLabel?? && study.prefLabel.en??>
				<r:URN>urn:ddi:de.gesis:study_${studyGroup.prefLabel.en?html}-${study.prefLabel.en?html}_${country.code}:0.1</r:URN>
				    </#if>
				    <#-- get country specific information (study) -->
				    <#if csiDao.getByCountryAndStudy( country, study )??>
                    <#assign csi = csiDao.getByCountryAndStudy( country, study )>
                    
                <!-- available data (study and country) --> <!-- ToDo -->
				<r:Note>
					<r:Relationship>
						<r:RelatedToReference>
							<r:URN>urn:ddi:de.gesis:UUID:0.1</r:URN>
							<r:TypeOfObject>StudyUnit</r:TypeOfObject>
						</r:RelatedToReference>
					</r:Relationship>
					<r:ProprietaryInfo>
						<r:ProprietaryProperty>
							<r:AttributeKey>availableDataCross-sectional</r:AttributeKey>
							<r:AttributeValue>Yes</r:AttributeValue>
						</r:ProprietaryProperty>
						<r:ProprietaryProperty>
							<r:AttributeKey>availableDataLongitudinal</r:AttributeKey>
							<r:AttributeValue>No</r:AttributeValue>
						</r:ProprietaryProperty>
					</r:ProprietaryInfo>
				</r:Note>
				
				<!-- number of rotational groups (study and country) --> <!-- ToDo -->
				<r:Note>
					<r:NoteSubject>number of rotational groups</r:NoteSubject>
					<r:Relationship>
						<r:RelatedToReference>
							<r:URN>urn:ddi:de.gesis:UUID:0.1</r:URN>
							<r:TypeOfObject>StudyUnit</r:TypeOfObject>
						</r:RelatedToReference>
					</r:Relationship>
					<r:NoteContent>
						<r:Content>4</r:Content>
					</r:NoteContent>
				</r:Note>
				
				<!-- notes (study and country) -->
				<#if csi.note?? && ( csi.note?length > 0 )>
				<r:Note>
					<r:NoteSubject>notes</r:NoteSubject>
					<r:Relationship>
						<r:RelatedToReference>
						    <#if studyGroup.prefLabel?? && studyGroup.prefLabel.en?? && study.prefLabel?? && study.prefLabel.en??>
							<r:URN>urn:ddi:de.gesis:study_${studyGroup.prefLabel.en?html}-${study.prefLabel.en?html}_${country.code}:0.1</r:URN>
							</#if>
							<r:TypeOfObject>StudyUnit</r:TypeOfObject>
						</r:RelatedToReference>
					</r:Relationship>
					<r:NoteContent>
						<r:Content>${csi.note?html}</r:Content>
					</r:NoteContent>
				</r:Note>
				</#if>
                    <#--
                    ${country.code}
                    ${csi.citation!"no citation"}
                    ${csi.unitsOfObservation!"no observation"}
                    -->
                    </#if>
			</s:StudyUnit>	
			 </#if>     
            </#list> 
            
        </g:SubGroup>	
        
		</#list>
		</#if>
		
	</g:Group>
	
	<!-- organizations (series) -->
	<g:ResourcePackage>
		<r:URN>urn:ddi:de.gesis:ResourcePackage_Organizations_${studyGroup.id}:0.1</r:URN>

		<a:OrganizationScheme>
			<r:URN>urn:ddi:de.gesis:ResourcePackage_Organizations_OrganizationScheme_${studyGroup.id}:0.1</r:URN>
			
			<!-- access contact (series) -->
			<#if studyGroup.dataAccessCondition?? && studyGroup.dataAccessCondition.accessContact??>
			<a:Organization>
				<r:URN>urn:ddi:de.gesis:AccessContact_${studyGroup.id}:0.1</r:URN> 
				<a:ContactInformation>
					<a:Email>
						<r:InternetEmail>${studyGroup.dataAccessCondition.accessContact?html}</r:InternetEmail>
					</a:Email>
				</a:ContactInformation>
			</a:Organization>
			</#if>
			
		</a:OrganizationScheme>
		
	</g:ResourcePackage>
	
	<!-- thematic classification for specific series --> <!-- ToDo -->
	<#-- 1 RP for each series -->
	<#if studyGroup.conceptScheme?? && studyGroup.conceptScheme.hasTopConcept??>
	<g:ResourcePackage>
		<r:URN>urn:ddi:de.gesis:ResourcePackage_ThematicClassification_${studyGroup.id}:0.1</r:URN> <!-- ToDo -->

		<!-- all levels of thematic classification -->
		<#-- 1 ConceptScheme representing all levels of thematic classification for specific series -->
		<c:ConceptScheme>
			<r:URN>urn:ddi:de.gesis:ConceptScheme_ThematicClassification_${studyGroup.id}:0.1</r:URN> <!-- ToDo -->
			<#-- iterate over all top level concepts of ConceptScheme of series -->
			<@iterate_concepts concepts=studyGroup.conceptScheme.hasTopConcept level=1 />
			<#-- recursive macro to iterate over all concepts -->
			<#macro iterate_concepts concepts level>
				<#-- for each concept -->
				<#list concepts as concept>
					<#-- current concept is level concept -->
					<#if concept.narrower?? && (concept.narrower?size > 0) >
					
					<!-- level ${level} -->
					<#-- 1 ConceptGroup for each level concept -->
					<c:ConceptGroup>
						<r:URN>urn:ddi:de.gesis:${concept.id}:0.1</r:URN>
						<c:TypeOfConceptGroup>level ${level}</c:TypeOfConceptGroup>
						
						<!-- short label -->
						<r:Label>
							<r:Content>${concept.notation?html?trim}</r:Content>
						</r:Label>
						
						<!-- definition -->
						<r:Description>
							<r:Content>${concept.notation?html?trim}</r:Content>
						</r:Description>
						<#-- references to child concept levels -->
						<#-- if child concept level contains child concept levels, the child concept level is represented as ConceptGroup -->
						<#-- if child concept level contains leaf concepts, the child concept level is represented as ConceptScheme -->
						<#-- for each child concept of current level concept -->
						<#list concept.narrower as childConcept> 
							<#-- child concept level contains child concept level -->
							<#if childConcept.narrower?? && (childConcept.narrower?size > 0) >  
							
						<!-- level ${level+1} [reference] -->
						<c:ConceptGroupReference>
							<r:URN>urn:ddi:de.gesis:${childConcept.id}:0.1</r:URN>
								<#-- current child concept level contains child concept level ? -->
								<#if childConcept.narrower?? && (childConcept.narrower?size > 0) >
									<#assign leaf=true>
								<#else>
									<#assign leaf=false>
								</#if>
								<#-- current child concept level contains child concept level -->
								<#if leaf>
							<r:TypeOfObject>ConceptGroup</r:TypeOfObject>
								<#-- current child concept level contains no child concept level (only leaf concepts) -->
								<#else>
							<r:TypeOfObject>ConceptScheme</r:TypeOfObject>
								</#if>
						</c:ConceptGroupReference>
							</#if>
						</#list>
					</c:ConceptGroup>
					<#-- iterate over all child concepts of current concept level -->
					<@iterate_concepts concepts=concept.narrower level=level+1 />
					</#if>
				</#list>
			</#macro>
		</c:ConceptScheme>
		
		<#-- concept levels (containing leaf concepts) -->
		<#-- 1 ConceptScheme for each concept level containing leaf concepts -->
			<#-- iterate over all top level concepts of ConceptScheme of series -->
			<@conceptSchemes_LeafConcepts concepts=studyGroup.conceptScheme.hasTopConcept /> 
			<#-- iterate over all concepts -->
			<#macro conceptSchemes_LeafConcepts concepts>
				<#-- for each concept -->
				<#list concepts as concept>
					<#-- current concept is level concept -->
					<#if concept.narrower?? && (concept.narrower?size > 0) > 
						<#-- current level concept contains further level concept ? -->
						<#list concept.narrower as childConcept> 
							<#if childConcept.narrower?? && (childConcept.narrower?size > 0) >
								<#assign leaf=true>
							<#else>
								<#assign leaf=false>
							</#if>
						</#list>
						<#-- current level concept contains further level concept -->
						<#if leaf> 
							<#-- iterate over all child level concepts of current level concept -->
							<@conceptSchemes_LeafConcepts concepts=concept.narrower />
						<#-- current level concept contains no further level concepts (only leaf concepts) -->
						<#else> 
						
		<!-- concept level (containing leaf concepts) -->				
		<c:ConceptScheme>
			<r:URN>urn:ddi:de.gesis:${concept.id}:0.1</r:URN>
								<#-- for each leaf concept of current level concept -->
								<#list concept.narrower as childConcept> 
								
			<!-- concept -->
			<c:Concept> 
				<r:URN>urn:ddi:de.gesis:${childConcept.id}:0.1</r:URN>
				<r:Label>
					<r:Content>${childConcept.notation?html?trim}</r:Content>
				</r:Label>
			</c:Concept>
								</#list>
		</c:ConceptScheme>
						</#if>
					<#-- current concept is leaf concept -->	
					<#else> 
					
					</#if>
				</#list>
			</#macro>
		
	</g:ResourcePackage>
	</#if>
	
	<!-- universes -->
	<#-- 1 RP containing all universes -->
	<g:ResourcePackage>
	
		<r:URN>urn:ddi:de.gesis:Universes_ResourcePackage:0.1</r:URN> <!-- ToDo -->
		
		<c:UniverseScheme>
		
			<r:URN>urn:ddi:de.gesis:Universes_UniverseScheme:0.1</r:URN> <!-- ToDo -->
			
			<!-- universe (series) -->
			<#-- 1 universe for each series -->
			<#list studyGroup.universe as universe>
				<#if universe??>
			<c:Universe>
			
				<r:URN>urn:ddi:de.gesis:${universe.getId()}:0.1</r:URN>
				
					<#if universe.definition??><#if universe.definition.en??><#if universe.definition.en != ''>
				<r:Description>
					<r:Content>${universe.definition.en?html}</r:Content>
				</r:Description>
					</#if></#if></#if>
				
			</c:Universe>
				</#if>
			</#list>
			
		</c:UniverseScheme>
		
	</g:ResourcePackage>	
	
</DDIInstance> 