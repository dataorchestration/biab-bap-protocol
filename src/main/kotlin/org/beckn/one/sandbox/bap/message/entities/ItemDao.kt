package org.beckn.one.sandbox.bap.message.entities

import com.fasterxml.jackson.annotation.JsonProperty
import org.beckn.protocol.schemas.Default

data class ItemDao @Default constructor(
  val id: String? = null,
  val parentItemId: String? = null,
  val descriptor: DescriptorDao? = null,
  val price: PriceDao? = null,
  val categoryId: String? = null,
  val locationId: String? = null,
  val time: TimeDao? = null,
  val matched: Boolean? = null,
  val related: Boolean? = null,
  val recommended: Boolean? = null,
  val rateable: Boolean? = null,
  val tags: Map<String, String>? = null,

  @param:JsonProperty("./ondc-returnable")
  val ondcReturnable: Boolean? = null,
  @param:JsonProperty("./ondc-seller_pickup_return")
  val ondcSellerPickupReturn: Boolean? = null,
  @param:JsonProperty("./ondc-return_window")
  val ondcReturnWindow: String? = null,
  @param:JsonProperty("./ondc-cancellable")
  val ondcCancellable: Boolean? = null,
  @param:JsonProperty("./ondc-time_to_ship")
  val ondcTimeToShip: String? = null,
  @param:JsonProperty("./ondc-available_on_cod")
  val ondcAvailableOnCod: String? = null,

  @param:JsonProperty("./ondc-statutory_reqs_packaged_commodities")
  val ondcStatutoryReqsPackagedCommodities: StatutoryReqsPackagedCommodities? = null,
  @param:JsonProperty("./ondc-statutory_reqs_prepackaged_food")
  val ondcStatutoryReqsPrepackagedFood: StatutoryReqsPrepackagedFood? = null,
)


data class StatutoryReqsPackagedCommodities  @Default constructor(
  val manufacturerOrPackerName: String? = null,
  val manufacturerOrPackerAddress: String? = null,
  val commonOrGenericNameOfCommodity: String? = null,
  val multipleProductsNameNumberOrQty: String? = null,
  val netQuantityOrMeasureOfCommodityInPkg: String? = null,
  val monthYearOfManufacturePackingImport: String? = null,
  val importedProductCountryOfOrigin: String? = null,
  val contactDetailsConsumerCare: String? = null,
)


data class StatutoryReqsPrepackagedFood  @Default constructor(
  val ingredients_info: String? = null,
  val nutritional_info: String? = null,
  val additives_info: String? = null,
  val manufacturerOrPackerName: String? = null,
  val manufacturerOrPackerAddress: String? = null,
  val brandOwnerName: String? = null,
  val brandOwnerAddress: String? = null,
  val brandOwnerFssaiLogo: String? = null,
  val brand_ownerFssaiLicenseNo: String? = null,
  val otherFssaiLicenseNo: String? = null,
  val netQuantity: String? = null,
  val importerName: String? = null,
  val importerAddress: String? = null,
  val importerFssaiLogo: String? = null,
  val importerFssaiLicenseNo: String? = null,
  val importedProductCountryOfOrigin: String? = null,
  val otherImporterName: String? = null,
  val otherImporterAddress: String? = null,
  val otherPremises: String? = null,
  val otherImporterCountryOfOrigin: String? = null,
  val contactDetailsConsumerCare: String? = null,
)