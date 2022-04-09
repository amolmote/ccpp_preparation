

import java.util.*;


class PrintingAllCountries{

	public static void printingCountries(String[] getCountryInfo){
		
		int i=1;
		for(String getInfo : getCountryInfo){
			
			Locale getCountry=new Locale("",getInfo);
			
			System.out.println("sr no :- "+(i++)+" country code is :- "+getCountry.getCountry()+" name of country is:- "+getCountry.getDisplayCountry());
			
		}
	}
	public static void main(String[] args){
		
		String[] getCountryInfo=Locale.getISOCountries();
		
		printingCountries(getCountryInfo);
		
	}
}
/*
sr no :- 1 country code is :- AD name of country is:- Andorra
sr no :- 2 country code is :- AE name of country is:- United Arab Emirates
sr no :- 3 country code is :- AF name of country is:- Afghanistan
sr no :- 4 country code is :- AG name of country is:- Antigua and Barbuda
sr no :- 5 country code is :- AI name of country is:- Anguilla
sr no :- 6 country code is :- AL name of country is:- Albania
sr no :- 7 country code is :- AM name of country is:- Armenia
sr no :- 8 country code is :- AN name of country is:- Netherlands Antilles
sr no :- 9 country code is :- AO name of country is:- Angola
sr no :- 10 country code is :- AQ name of country is:- Antarctica
sr no :- 11 country code is :- AR name of country is:- Argentina
sr no :- 12 country code is :- AS name of country is:- American Samoa
sr no :- 13 country code is :- AT name of country is:- Austria
sr no :- 14 country code is :- AU name of country is:- Australia
sr no :- 15 country code is :- AW name of country is:- Aruba
sr no :- 16 country code is :- AX name of country is:- Åland Islands
sr no :- 17 country code is :- AZ name of country is:- Azerbaijan
sr no :- 18 country code is :- BA name of country is:- Bosnia and Herzegovina
sr no :- 19 country code is :- BB name of country is:- Barbados
sr no :- 20 country code is :- BD name of country is:- Bangladesh
sr no :- 21 country code is :- BE name of country is:- Belgium
sr no :- 22 country code is :- BF name of country is:- Burkina Faso
sr no :- 23 country code is :- BG name of country is:- Bulgaria
sr no :- 24 country code is :- BH name of country is:- Bahrain
sr no :- 25 country code is :- BI name of country is:- Burundi
sr no :- 26 country code is :- BJ name of country is:- Benin
sr no :- 27 country code is :- BL name of country is:- Saint Barthélemy
sr no :- 28 country code is :- BM name of country is:- Bermuda
sr no :- 29 country code is :- BN name of country is:- Brunei
sr no :- 30 country code is :- BO name of country is:- Bolivia
sr no :- 31 country code is :- BQ name of country is:- Bonaire, Sint Eustatius and Saba
sr no :- 32 country code is :- BR name of country is:- Brazil
sr no :- 33 country code is :- BS name of country is:- Bahamas
sr no :- 34 country code is :- BT name of country is:- Bhutan
sr no :- 35 country code is :- BV name of country is:- Bouvet Island
sr no :- 36 country code is :- BW name of country is:- Botswana
sr no :- 37 country code is :- BY name of country is:- Belarus
sr no :- 38 country code is :- BZ name of country is:- Belize
sr no :- 39 country code is :- CA name of country is:- Canada
sr no :- 40 country code is :- CC name of country is:- Cocos Islands
sr no :- 41 country code is :- CD name of country is:- The Democratic Republic Of Congo
sr no :- 42 country code is :- CF name of country is:- Central African Republic
sr no :- 43 country code is :- CG name of country is:- Congo
sr no :- 44 country code is :- CH name of country is:- Switzerland
sr no :- 45 country code is :- CI name of country is:- Côte d'Ivoire
sr no :- 46 country code is :- CK name of country is:- Cook Islands
sr no :- 47 country code is :- CL name of country is:- Chile
sr no :- 48 country code is :- CM name of country is:- Cameroon
sr no :- 49 country code is :- CN name of country is:- China
sr no :- 50 country code is :- CO name of country is:- Colombia
sr no :- 51 country code is :- CR name of country is:- Costa Rica
sr no :- 52 country code is :- CU name of country is:- Cuba
sr no :- 53 country code is :- CV name of country is:- Cape Verde
sr no :- 54 country code is :- CW name of country is:- Curaçao
sr no :- 55 country code is :- CX name of country is:- Christmas Island
sr no :- 56 country code is :- CY name of country is:- Cyprus
sr no :- 57 country code is :- CZ name of country is:- Czech Republic
sr no :- 58 country code is :- DE name of country is:- Germany
sr no :- 59 country code is :- DJ name of country is:- Djibouti
sr no :- 60 country code is :- DK name of country is:- Denmark
sr no :- 61 country code is :- DM name of country is:- Dominica
sr no :- 62 country code is :- DO name of country is:- Dominican Republic
sr no :- 63 country code is :- DZ name of country is:- Algeria
sr no :- 64 country code is :- EC name of country is:- Ecuador
sr no :- 65 country code is :- EE name of country is:- Estonia
sr no :- 66 country code is :- EG name of country is:- Egypt
sr no :- 67 country code is :- EH name of country is:- Western Sahara
sr no :- 68 country code is :- ER name of country is:- Eritrea
sr no :- 69 country code is :- ES name of country is:- Spain
sr no :- 70 country code is :- ET name of country is:- Ethiopia
sr no :- 71 country code is :- FI name of country is:- Finland
sr no :- 72 country code is :- FJ name of country is:- Fiji
sr no :- 73 country code is :- FK name of country is:- Falkland Islands
sr no :- 74 country code is :- FM name of country is:- Micronesia
sr no :- 75 country code is :- FO name of country is:- Faroe Islands
sr no :- 76 country code is :- FR name of country is:- France
sr no :- 77 country code is :- GA name of country is:- Gabon
sr no :- 78 country code is :- GB name of country is:- United Kingdom
sr no :- 79 country code is :- GD name of country is:- Grenada
sr no :- 80 country code is :- GE name of country is:- Georgia
sr no :- 81 country code is :- GF name of country is:- French Guiana
sr no :- 82 country code is :- GG name of country is:- Guernsey
sr no :- 83 country code is :- GH name of country is:- Ghana
sr no :- 84 country code is :- GI name of country is:- Gibraltar
sr no :- 85 country code is :- GL name of country is:- Greenland
sr no :- 86 country code is :- GM name of country is:- Gambia
sr no :- 87 country code is :- GN name of country is:- Guinea
sr no :- 88 country code is :- GP name of country is:- Guadeloupe
sr no :- 89 country code is :- GQ name of country is:- Equatorial Guinea
sr no :- 90 country code is :- GR name of country is:- Greece
sr no :- 91 country code is :- GS name of country is:- South Georgia And The South Sandwich Islands
sr no :- 92 country code is :- GT name of country is:- Guatemala
sr no :- 93 country code is :- GU name of country is:- Guam
sr no :- 94 country code is :- GW name of country is:- Guinea-Bissau
sr no :- 95 country code is :- GY name of country is:- Guyana
sr no :- 96 country code is :- HK name of country is:- Hong Kong
sr no :- 97 country code is :- HM name of country is:- Heard Island And McDonald Islands
sr no :- 98 country code is :- HN name of country is:- Honduras
sr no :- 99 country code is :- HR name of country is:- Croatia
sr no :- 100 country code is :- HT name of country is:- Haiti
sr no :- 101 country code is :- HU name of country is:- Hungary
sr no :- 102 country code is :- ID name of country is:- Indonesia
sr no :- 103 country code is :- IE name of country is:- Ireland
sr no :- 104 country code is :- IL name of country is:- Israel
sr no :- 105 country code is :- IM name of country is:- Isle Of Man
sr no :- 106 country code is :- IN name of country is:- India
sr no :- 107 country code is :- IO name of country is:- British Indian Ocean Territory
sr no :- 108 country code is :- IQ name of country is:- Iraq
sr no :- 109 country code is :- IR name of country is:- Iran
sr no :- 110 country code is :- IS name of country is:- Iceland
sr no :- 111 country code is :- IT name of country is:- Italy
sr no :- 112 country code is :- JE name of country is:- Jersey
sr no :- 113 country code is :- JM name of country is:- Jamaica
sr no :- 114 country code is :- JO name of country is:- Jordan
sr no :- 115 country code is :- JP name of country is:- Japan
sr no :- 116 country code is :- KE name of country is:- Kenya
sr no :- 117 country code is :- KG name of country is:- Kyrgyzstan
sr no :- 118 country code is :- KH name of country is:- Cambodia
sr no :- 119 country code is :- KI name of country is:- Kiribati
sr no :- 120 country code is :- KM name of country is:- Comoros
sr no :- 121 country code is :- KN name of country is:- Saint Kitts And Nevis
sr no :- 122 country code is :- KP name of country is:- North Korea
sr no :- 123 country code is :- KR name of country is:- South Korea
sr no :- 124 country code is :- KW name of country is:- Kuwait
sr no :- 125 country code is :- KY name of country is:- Cayman Islands
sr no :- 126 country code is :- KZ name of country is:- Kazakhstan
sr no :- 127 country code is :- LA name of country is:- Laos
sr no :- 128 country code is :- LB name of country is:- Lebanon
sr no :- 129 country code is :- LC name of country is:- Saint Lucia
sr no :- 130 country code is :- LI name of country is:- Liechtenstein
sr no :- 131 country code is :- LK name of country is:- Sri Lanka
sr no :- 132 country code is :- LR name of country is:- Liberia
sr no :- 133 country code is :- LS name of country is:- Lesotho
sr no :- 134 country code is :- LT name of country is:- Lithuania
sr no :- 135 country code is :- LU name of country is:- Luxembourg
sr no :- 136 country code is :- LV name of country is:- Latvia
sr no :- 137 country code is :- LY name of country is:- Libya
sr no :- 138 country code is :- MA name of country is:- Morocco
sr no :- 139 country code is :- MC name of country is:- Monaco
sr no :- 140 country code is :- MD name of country is:- Moldova
sr no :- 141 country code is :- ME name of country is:- Montenegro
sr no :- 142 country code is :- MF name of country is:- Saint Martin
sr no :- 143 country code is :- MG name of country is:- Madagascar
sr no :- 144 country code is :- MH name of country is:- Marshall Islands
sr no :- 145 country code is :- MK name of country is:- Macedonia
sr no :- 146 country code is :- ML name of country is:- Mali
sr no :- 147 country code is :- MM name of country is:- Myanmar
sr no :- 148 country code is :- MN name of country is:- Mongolia
sr no :- 149 country code is :- MO name of country is:- Macao
sr no :- 150 country code is :- MP name of country is:- Northern Mariana Islands
sr no :- 151 country code is :- MQ name of country is:- Martinique
sr no :- 152 country code is :- MR name of country is:- Mauritania
sr no :- 153 country code is :- MS name of country is:- Montserrat
sr no :- 154 country code is :- MT name of country is:- Malta
sr no :- 155 country code is :- MU name of country is:- Mauritius
sr no :- 156 country code is :- MV name of country is:- Maldives
sr no :- 157 country code is :- MW name of country is:- Malawi
sr no :- 158 country code is :- MX name of country is:- Mexico
sr no :- 159 country code is :- MY name of country is:- Malaysia
sr no :- 160 country code is :- MZ name of country is:- Mozambique
sr no :- 161 country code is :- NA name of country is:- Namibia
sr no :- 162 country code is :- NC name of country is:- New Caledonia
sr no :- 163 country code is :- NE name of country is:- Niger
sr no :- 164 country code is :- NF name of country is:- Norfolk Island
sr no :- 165 country code is :- NG name of country is:- Nigeria
sr no :- 166 country code is :- NI name of country is:- Nicaragua
sr no :- 167 country code is :- NL name of country is:- Netherlands
sr no :- 168 country code is :- NO name of country is:- Norway
sr no :- 169 country code is :- NP name of country is:- Nepal
sr no :- 170 country code is :- NR name of country is:- Nauru
sr no :- 171 country code is :- NU name of country is:- Niue
sr no :- 172 country code is :- NZ name of country is:- New Zealand
sr no :- 173 country code is :- OM name of country is:- Oman
sr no :- 174 country code is :- PA name of country is:- Panama
sr no :- 175 country code is :- PE name of country is:- Peru
sr no :- 176 country code is :- PF name of country is:- French Polynesia
sr no :- 177 country code is :- PG name of country is:- Papua New Guinea
sr no :- 178 country code is :- PH name of country is:- Philippines
sr no :- 179 country code is :- PK name of country is:- Pakistan
sr no :- 180 country code is :- PL name of country is:- Poland
sr no :- 181 country code is :- PM name of country is:- Saint Pierre And Miquelon
sr no :- 182 country code is :- PN name of country is:- Pitcairn
sr no :- 183 country code is :- PR name of country is:- Puerto Rico
sr no :- 184 country code is :- PS name of country is:- Palestine
sr no :- 185 country code is :- PT name of country is:- Portugal
sr no :- 186 country code is :- PW name of country is:- Palau
sr no :- 187 country code is :- PY name of country is:- Paraguay
sr no :- 188 country code is :- QA name of country is:- Qatar
sr no :- 189 country code is :- RE name of country is:- Reunion
sr no :- 190 country code is :- RO name of country is:- Romania
sr no :- 191 country code is :- RS name of country is:- Serbia
sr no :- 192 country code is :- RU name of country is:- Russia
sr no :- 193 country code is :- RW name of country is:- Rwanda
sr no :- 194 country code is :- SA name of country is:- Saudi Arabia
sr no :- 195 country code is :- SB name of country is:- Solomon Islands
sr no :- 196 country code is :- SC name of country is:- Seychelles
sr no :- 197 country code is :- SD name of country is:- Sudan
sr no :- 198 country code is :- SE name of country is:- Sweden
sr no :- 199 country code is :- SG name of country is:- Singapore
sr no :- 200 country code is :- SH name of country is:- Saint Helena
sr no :- 201 country code is :- SI name of country is:- Slovenia
sr no :- 202 country code is :- SJ name of country is:- Svalbard And Jan Mayen
sr no :- 203 country code is :- SK name of country is:- Slovakia
sr no :- 204 country code is :- SL name of country is:- Sierra Leone
sr no :- 205 country code is :- SM name of country is:- San Marino
sr no :- 206 country code is :- SN name of country is:- Senegal
sr no :- 207 country code is :- SO name of country is:- Somalia
sr no :- 208 country code is :- SR name of country is:- Suriname
sr no :- 209 country code is :- SS name of country is:- South Sudan
sr no :- 210 country code is :- ST name of country is:- Sao Tome And Principe
sr no :- 211 country code is :- SV name of country is:- El Salvador
sr no :- 212 country code is :- SX name of country is:- Sint Maarten (Dutch part)
sr no :- 213 country code is :- SY name of country is:- Syria
sr no :- 214 country code is :- SZ name of country is:- Swaziland
sr no :- 215 country code is :- TC name of country is:- Turks And Caicos Islands
sr no :- 216 country code is :- TD name of country is:- Chad
sr no :- 217 country code is :- TF name of country is:- French Southern Territories
sr no :- 218 country code is :- TG name of country is:- Togo
sr no :- 219 country code is :- TH name of country is:- Thailand
sr no :- 220 country code is :- TJ name of country is:- Tajikistan
sr no :- 221 country code is :- TK name of country is:- Tokelau
sr no :- 222 country code is :- TL name of country is:- Timor-Leste
sr no :- 223 country code is :- TM name of country is:- Turkmenistan
sr no :- 224 country code is :- TN name of country is:- Tunisia
sr no :- 225 country code is :- TO name of country is:- Tonga
sr no :- 226 country code is :- TR name of country is:- Turkey
sr no :- 227 country code is :- TT name of country is:- Trinidad and Tobago
sr no :- 228 country code is :- TV name of country is:- Tuvalu
sr no :- 229 country code is :- TW name of country is:- Taiwan
sr no :- 230 country code is :- TZ name of country is:- Tanzania
sr no :- 231 country code is :- UA name of country is:- Ukraine
sr no :- 232 country code is :- UG name of country is:- Uganda
sr no :- 233 country code is :- UM name of country is:- United States Minor Outlying Islands
sr no :- 234 country code is :- US name of country is:- United States
sr no :- 235 country code is :- UY name of country is:- Uruguay
sr no :- 236 country code is :- UZ name of country is:- Uzbekistan
sr no :- 237 country code is :- VA name of country is:- Vatican
sr no :- 238 country code is :- VC name of country is:- Saint Vincent And The Grenadines
sr no :- 239 country code is :- VE name of country is:- Venezuela
sr no :- 240 country code is :- VG name of country is:- British Virgin Islands
sr no :- 241 country code is :- VI name of country is:- U.S. Virgin Islands
sr no :- 242 country code is :- VN name of country is:- Vietnam
sr no :- 243 country code is :- VU name of country is:- Vanuatu
sr no :- 244 country code is :- WF name of country is:- Wallis And Futuna
sr no :- 245 country code is :- WS name of country is:- Samoa
sr no :- 246 country code is :- YE name of country is:- Yemen
sr no :- 247 country code is :- YT name of country is:- Mayotte
sr no :- 248 country code is :- ZA name of country is:- South Africa
sr no :- 249 country code is :- ZM name of country is:- Zambia
sr no :- 250 country code is :- ZW name of country is:- Zimbabwe
*/