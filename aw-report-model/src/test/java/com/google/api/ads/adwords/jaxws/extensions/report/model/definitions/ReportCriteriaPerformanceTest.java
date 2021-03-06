// Copyright 2013 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.adwords.jaxws.extensions.report.model.definitions;

import com.google.api.ads.adwords.jaxws.extensions.report.model.entities.ReportCriteriaPerformance;
import com.google.api.ads.adwords.lib.jaxb.v201309.ReportDefinitionReportType;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Tests the Campaign Performance report definition.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:aw-report-model-test-beans.xml")
public class ReportCriteriaPerformanceTest extends
AbstractReportDefinitionTest<ReportCriteriaPerformance> {

  /**
   * C'tor
   */
  public ReportCriteriaPerformanceTest() {

    super(ReportCriteriaPerformance.class,
        ReportDefinitionReportType.CRITERIA_PERFORMANCE_REPORT,
        "src/test/resources/csv/criteria.csv");
  }

  /**
   * @see com.google.api.ads.adwords.jaxws.extensions.report.model.definitions.
   * AbstractReportDefinitionTest#testFirstEntry(
   * com.google.api.ads.adwords.jaxws.extensions.report.model.entities.Report)
   */
  @Override
  protected void testFirstEntry(ReportCriteriaPerformance first) {

    //Assert.assertEquals(1252422563L, first.getAccountId().longValue());
    //TODO
  }

  /**
   * @see com.google.api.ads.adwords.jaxws.extensions.report.model.definitions.
   * AbstractReportDefinitionTest#testLastEntry(
   * com.google.api.ads.adwords.jaxws.extensions.report.model.entities.Report)
   */
  @Override
  protected void testLastEntry(ReportCriteriaPerformance last) {
    //Assert.assertEquals(1252422563L, last.getAccountId().longValue());
    //TODO
  }

  /**
   * @see com.google.api.ads.adwords.jaxws.extensions.report.model.definitions.
   * AbstractReportDefinitionTest#retrieveCsvEntries()
   */
  @Override
  protected int retrieveCsvEntries() {
    return 10;
  }

  /**
   * @see com.google.api.ads.adwords.jaxws.extensions.report.model.definitions.
   * AbstractReportDefinitionTest#retrievePropertiesToBeSelected()
   */
  @Override
  protected String[] retrievePropertiesToBeSelected() {

    return new String[] { "AccountTimeZoneId",
        "AdGroupId",
        "AdGroupName",
        "AdGroupStatus",
        "AdvertiserExperimentSegmentationBin",
        "ApprovalStatus",
        "BidModifier",
        "CampaignId",
        "CampaignName",
        "CampaignStatus",
        "ClickSignificance",
        "ConversionCategoryName",
        "ConversionManyPerClickSignificance",
        "ConversionRate",
        "ConversionRateManyPerClick",
        "ConversionRateManyPerClickSignificance",
        "ConversionRateSignificance",
        "ConversionSignificance",
        "ConversionsManyPerClick",
        "ConversionTypeName",
        "ConversionValue",
        "CostPerConversion",
        "CostPerConversionManyPerClick",
        "CostPerConversionManyPerClickSignificance",
        "CostPerConversionSignificance",
        "CostSignificance",
        "CpcBidSource",
        "CpcSignificance",
        "CpmSignificance",
        "Criteria",
        "CriteriaDestinationUrl",
        "CriteriaType",
        "CtrSignificance",
        "CustomerDescriptiveName",
        "DayOfWeek",
        "DisplayName",
        "FirstPageCpc",
        "Id",
        "ImpressionSignificance",
        "IsNegative",
        "MaxCpc",
        "MaxCpm",
        "MonthOfYear",
        "Parameter",
        "PercentCpa",
        "PositionSignificance",
        "PrimaryCompanyName",
        "PrimaryUserLogin",
        "QualityScore",
        "Quarter",
        "Slot",
        "Status",
        "TopOfPageCpc",
        "ValuePerConv",
        "ValuePerConversion",
        "ValuePerConversionManyPerClick",
        "ValuePerConvManyPerClick",
        "TotalConvValue",
        "ViewThroughConversions",
        "ViewThroughConversionsSignificance",
        "Week",
        "Year",
        "ExternalCustomerId",
        "Date",
        "Month",
        "AccountDescriptiveName",
        "Cost",
        "Clicks",
        "Impressions",
        "Conversions",
        "Ctr",
        "AverageCpm",
        "AverageCpc",
        "AveragePosition",
        "AccountCurrencyCode",
        "Device",
        "ClickType",
        "AdNetworkType1",
    "AdNetworkType2" };
  }
}