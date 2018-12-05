/*
 * Copyright 2018 Andrius Baruckis www.baruckis.com | mycryptocoins.baruckis.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.baruckis.mycryptocoins.data

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Entity object for Room database.
 */
@Entity(tableName = "cryptocurrencies")
data class Cryptocurrency(@PrimaryKey
                          val id: Int,
                          val name: String,
                          val rank: Short,
                          var amount: Double?,
                          val symbol: String,
                          val currencyFiat: String,
                          val priceFiat: Double,
                          var amountFiat: Double?,
                          val pricePercentChange1h: Double,
                          val pricePercentChange7d: Double,
                          val pricePercentChange24h: Double,
                          var amountFiatChange24h: Double?)