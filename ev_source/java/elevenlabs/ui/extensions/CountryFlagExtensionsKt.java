package io.elevenlabs.ui.extensions;

import android.gov.nist.javax.sdp.fields.SDPKeywords;
import android.gov.nist.javax.sip.header.ims.AuthorizationHeaderIms;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Locale;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0003"}, d2 = {"getFlagEmoji", "", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class CountryFlagExtensionsKt {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
    
        if (r3.equals("ta") == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0141, code lost:
    
        if (r3.equals("hi") == false) goto L129;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String getFlagEmoji(String str) {
        str.getClass();
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        int hashCode = lowerCase.hashCode();
        String str2 = SDPKeywords.IN;
        switch (hashCode) {
            case 3121:
                if (lowerCase.equals("ar")) {
                    str2 = "AE";
                    break;
                }
                str2 = "";
                break;
            case 3141:
                if (lowerCase.equals("bg")) {
                    str2 = "BG";
                    break;
                }
                str2 = "";
                break;
            case 3184:
                if (lowerCase.equals("cs")) {
                    str2 = "CZ";
                    break;
                }
                str2 = "";
                break;
            case 3197:
                if (lowerCase.equals("da")) {
                    str2 = "DK";
                    break;
                }
                str2 = "";
                break;
            case 3201:
                if (lowerCase.equals("de")) {
                    str2 = "DE";
                    break;
                }
                str2 = "";
                break;
            case 3239:
                if (lowerCase.equals("el")) {
                    str2 = "GR";
                    break;
                }
                str2 = "";
                break;
            case 3241:
                if (lowerCase.equals("en")) {
                    str2 = "US";
                    break;
                }
                str2 = "";
                break;
            case 3246:
                if (lowerCase.equals("es")) {
                    str2 = "ES";
                    break;
                }
                str2 = "";
                break;
            case 3267:
                if (lowerCase.equals("fi")) {
                    str2 = "FI";
                    break;
                }
                str2 = "";
                break;
            case 3276:
                if (lowerCase.equals("fr")) {
                    str2 = "FR";
                    break;
                }
                str2 = "";
                break;
            case 3329:
                break;
            case 3338:
                if (lowerCase.equals("hr")) {
                    str2 = "HR";
                    break;
                }
                str2 = "";
                break;
            case 3341:
                if (lowerCase.equals("hu")) {
                    str2 = "HU";
                    break;
                }
                str2 = "";
                break;
            case 3355:
                if (lowerCase.equals("id")) {
                    str2 = "ID";
                    break;
                }
                str2 = "";
                break;
            case 3371:
                if (lowerCase.equals("it")) {
                    str2 = "IT";
                    break;
                }
                str2 = "";
                break;
            case 3383:
                if (lowerCase.equals("ja")) {
                    str2 = "JP";
                    break;
                }
                str2 = "";
                break;
            case 3428:
                if (lowerCase.equals("ko")) {
                    str2 = "KR";
                    break;
                }
                str2 = "";
                break;
            case 3494:
                if (lowerCase.equals("ms")) {
                    str2 = "MY";
                    break;
                }
                str2 = "";
                break;
            case 3518:
                if (lowerCase.equals("nl")) {
                    str2 = "NL";
                    break;
                }
                str2 = "";
                break;
            case 3521:
                if (lowerCase.equals(AuthorizationHeaderIms.NO)) {
                    str2 = "NO";
                    break;
                }
                str2 = "";
                break;
            case 3580:
                if (lowerCase.equals("pl")) {
                    str2 = "PL";
                    break;
                }
                str2 = "";
                break;
            case 3588:
                if (lowerCase.equals("pt")) {
                    str2 = "PT";
                    break;
                }
                str2 = "";
                break;
            case 3645:
                if (lowerCase.equals("ro")) {
                    str2 = "RO";
                    break;
                }
                str2 = "";
                break;
            case 3651:
                if (lowerCase.equals("ru")) {
                    str2 = "RU";
                    break;
                }
                str2 = "";
                break;
            case 3672:
                if (lowerCase.equals("sk")) {
                    str2 = "SK";
                    break;
                }
                str2 = "";
                break;
            case 3683:
                if (lowerCase.equals("sv")) {
                    str2 = "SE";
                    break;
                }
                str2 = "";
                break;
            case 3693:
                break;
            case 3710:
                if (lowerCase.equals("tr")) {
                    str2 = "TR";
                    break;
                }
                str2 = "";
                break;
            case 3734:
                if (lowerCase.equals("uk")) {
                    str2 = "UA";
                    break;
                }
                str2 = "";
                break;
            case 3763:
                if (lowerCase.equals("vi")) {
                    str2 = "VN";
                    break;
                }
                str2 = "";
                break;
            case 3886:
                if (lowerCase.equals("zh")) {
                    str2 = "CN";
                    break;
                }
                str2 = "";
                break;
            case 101385:
                if (lowerCase.equals("fil")) {
                    str2 = "PH";
                    break;
                }
                str2 = "";
                break;
            default:
                str2 = "";
                break;
        }
        if (str2.length() != 2) {
            return "";
        }
        int charAt = str2.charAt(0) - 3675;
        int charAt2 = str2.charAt(1) - 3675;
        char[] chars = Character.toChars(charAt);
        chars.getClass();
        String str3 = new String(chars);
        char[] chars2 = Character.toChars(charAt2);
        chars2.getClass();
        return str3.concat(new String(chars2));
    }
}
