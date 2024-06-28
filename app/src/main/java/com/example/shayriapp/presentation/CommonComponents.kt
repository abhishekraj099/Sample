package com.hello.shayriapp.presentation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shayriapp.R
import com.example.shayriapp.ui.theme.primaryLight

import com.hello.shayriapp.model.ShayriModel


@Composable
fun MainToolbar(title: String, onClick: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Card(
            modifier = Modifier.size(45.dp)
                .clickable {
                    onClick.invoke()
                }
            ,
            colors = CardDefaults.cardColors(
                containerColor = primaryLight
            ),
            shape = RoundedCornerShape(100.dp)
        ) {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_back),
                    contentDescription = null,
                    tint = Color.White
                )
            }
        }

        Text(
            text = title, style = TextStyle(
                fontSize = 24.sp, fontWeight = FontWeight.Bold
            ), color = Color.White, modifier = Modifier.padding(start = 25.dp)
        )
    }
}

fun getList(): List<ShayriModel> {
    val shayriData = listOf(
        ShayriModel(
            "Hanuman Chalisa", listOf(
                """
                श्रीगुरु चरन सरोज रज, निज मनु मुकुरु सुधारि।
                बरनऊँ रघुबर बिमल जसु, जो दायकु फल चारि॥
                बुद्धिहीन तनु जानिके, सुमिरौं पवन-कुमार।
                बल बुधि विद्या देहु मोहिं, हरहु कलेस बिकार॥

                जय हनुमान ज्ञान गुन सागर।
                जय कपीस तिहुँ लोक उजागर॥

                रामदूत अतुलित बल धामा।
                अंजनि-पुत्र पवनसुत नामा॥

                महाबीर बिक्रम बजरंगी।
                कुमति निवार सुमति के संगी॥

                कंचन बरन बिराज सुबेसा।
                कानन कुण्डल कुंचित केसा॥

                हाथ बज्र औ ध्वजा बिराजे।
                काँधे मूँज जनेऊ साजे॥

                संकर सुवन केसरी नन्दन।
                तेज प्रताप महा जग बन्दन॥

                विद्यावान गुनी अति चातुर।
                राम काज करिबे को आतुर॥

                प्रभु चरित्र सुनिबे को रसिया।
                राम लखन सीता मन बसिया॥

                सूक्ष्म रूप धरि सियहिं दिखावा।
                बिकट रूप धरि लंक जरावा॥

                भीम रूप धरि असुर सँहारे।
                रामचन्द्र के काज सँवारे॥

                लाय सजीवन लखन जियाए।
                श्रीरघुबीर हरषि उर लाए॥

                रघुपति कीन्ही बहुत बड़ाई।
                तुम मम प्रिय भरतहि सम भाई॥

                सहस बदन तुम्हरो जस गावैं।
                अस कहि श्रीपति कण्ठ लगावैं॥

                सनकादिक ब्रह्मादि मुनीसा।
                नारद सारद सहित अहीसा॥

                जम कुबेर दिगपाल जहाँ ते।
                कवि कोबिद कहि सके कहाँ ते॥

                तुम उपकार सुग्रीवहिं कीन्हा।
                राम मिलाय राजपद दीन्हा॥

                तुम्हरो मंत्र विभीषन माना।
                लंकेश्वर भए सब जग जाना॥

                जुग सहस्र जोजन पर भानू।
                लील्यो ताहि मधुर फल जानू॥

                प्रभु मुद्रिका मेलि मुख माही।
                जलधि लांघि गये अचरज नाहीं॥

                दुर्गम काज जगत के जेते।
                सुगम अनुग्रह तुम्हरे तेते॥

                राम दुआरे तुम रखवारे।
                होत न आज्ञा बिनु पैसारे॥

                सब सुख लहै तुम्हारी सरना।
                तुम रक्षक काहू को डरना॥

                आपन तेज सम्हारो आपै।
                तीनों लोक हाँक तें काँपै॥

                भूत पिसाच निकट नहिं आवै।
                महाबीर जब नाम सुनावै॥

                नासै रोग हरै सब पीरा।
                जपत निरंतर हनुमत बीरा॥

                संकट तें हनुमान छुड़ावै।
                मन क्रम बचन ध्यान जो लावै॥

                सब पर राम तपस्वी राजा।
                तिनके काज सकल तुम साजा॥

                और मनोरथ जो कोई लावै।
                सोइ अमित जीवन फल पावै॥

                चारों जुग परताप तुम्हारा।
                है परसिद्ध जगत उजियारा॥

                साधु संत के तुम रखवारे।
                असुर निकंदन राम दुलारे॥

                अष्ट सिद्धि नौ निधि के दाता।
                अस बर दीन जानकी माता॥

                राम रसायन तुम्हरे पासा।
                सदा रहो रघुपति के दासा॥

                तुम्हरे भजन राम को पावै।
                जनम जनम के दुख बिसरावै॥

                अन्त काल रघुबर पुर जाई।
                जहाँ जन्म हरि-भक्त कहाई॥

                और देवता चित्त न धरई।
                हनुमत सेइ सर्ब सुख करई॥

                संकट कटै मिटै सब पीरा।
                जो सुमिरै हनुमत बलबीरा॥

                जय जय जय हनुमान गोसाईं।
                कृपा करहु गुरुदेव की नाईं॥

                जो शत बार पाठ कर कोई।
                छूटहि बंदि महासुख होई॥

                जो यह पढ़ै हनुमान चालीसा।
                होय सिद्धि साखी गौरीसा॥

                तुलसीदास सदा हरि चेरा।
                कीजै नाथ हृदय महँ डेरा॥

                पवनतनय संकट हरन, मंगल मूरति रूप।
                राम लखन सीता सहित, हृदय बसहु सुर भूप॥
                """.trimIndent()
            )
        ),
        ShayriModel(
            "Ramayana", listOf(
                """
                श्रीरामचरितमानस के बालकाण्ड से:
                श्रीगुरु चरन सरोज रज, निज मनु मुकुरु सुधारि।
                बरनऊँ रघुबर बिमल जसु, जो दायकु फल चारि॥
                बुद्धिहीन तनु जानिके, सुमिरौं पवन-कुमार।
                बल बुधि विद्या देहु मोहिं, हरहु कलेस बिकार॥
                
                नानापुराण निगमागम समम्तं, यद् रामायणे निगदितं क्वचिदन्यतोऽपि।
                स्वान्तः सुखाय तुलसी रघुनाथ गाथा, भाषानिबन्धमतिरुचिरमुपारराम॥
                
                रामायण के अयोध्याकाण्ड से:
                तपः स्वाध्याय निरतं, तपस्वी वाग्विदां वरम्।
                नारदं परिपप्रच्छ वाल्मीकिर्मुनिपुङ्गवम्॥
                """.trimIndent()
            )
        ),
        ShayriModel(
            "Bhagavad Gita", listOf(
                """
                ध्यायतो विषयान्पुंसः, सङ्गस्तेषूपजायते।
                सङ्गात्सञ्जायते कामः, कामात्क्रोधोऽभिजायते॥
                क्रोधाद्भवति सम्मोहः, सम्मोहात्स्मृतिविभ्रमः।
                स्मृतिभ्रंशाद् बुद्धिनाशो, बुद्धिनाशात्प्रणश्यति॥

                ब्रह्मार्पणं ब्रह्म हविः, ब्रह्माग्नौ ब्रह्मणा हुतम्।
                ब्रह्मैव तेन गन्तव्यं, ब्रह्मकर्मसमाधिना॥

                श्री भगवानुवाच:
                कर्मण्येवाधिकारस्ते, मा फलेषु कदाचन।
                मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्मणि॥
                """.trimIndent()
            )
        ),
        ShayriModel(
            "Bhagavata Purana", listOf(
                """
                जनमाद्यस्य यतोऽन्वयादितरतः, चार्थेष्वभिज्ञः स्वरत।
                तेने ब्रह्म हृदा य आदिकवये, मुह्यन्ति यत्सूरयः॥
                तेजोवारिमृदां यथा विनिमयो, यत्र त्रिसर्गोऽमृषा।
                धाम्ना स्वेन सदा निरस्तकुहकं, सत्यं परं धीमहि॥

                धर्मः प्रोज्झितकैतवोऽत्र परमो, निर्मत्सराणां सतां।
                वेद्यं वास्तवमत्र वस्तु शिवदं, तापत्रयोन्मूलनम्॥
                """.trimIndent()
            )
        ),
        ShayriModel(
            "Vedas", listOf(
                """
                अग्निमीळे पुरोहितं यज्ञस्य देवमृत्विजम्।
                होतारं रत्नधातमम्॥

                किशोरः सगणो वीरः, सर्वत्रान्वेषणं कविः।
                प्रसूतिं चाप विश्वान्यर्यो विष्वग्वी स्वर्षाट्॥

                इन्द्रं वर्धन्तो अप्तुरः, कृण्वन्तो विश्वमार्यम्।
                अविश्वासः सत्रासहा, सुवीरासो नृद्र्ष्टमः॥

                आपो हि ष्ठा मयोभुवस्ता न ऊर्जे दधातन।
                महेरणाय चक्षसे॥
                """.trimIndent()
            )
        )
    )
    return shayriData
}

