package io.elevenlabs;

import android.gov.nist.javax.sip.header.ims.AuthorizationHeaderIms;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import rd.c1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\bQ\b\u0086\u0081\u0002\u0018\u0000 S2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001SB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bR¨\u0006T"}, d2 = {"Lio/elevenlabs/Language;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "AF", "AR", "AS", "AZ", "BE", "BG", "BN", "BS", "CA", "CEB", "CS", "CY", "DA", "DE", "EL", "EN", "ES", "ET", "FA", "FI", "FR", "GA", "GL", "GU", "HA", "HE", "HI", "HR", "HU", "HY", "ID", "IS", "IT", "JA", "JV", "KA", "KK", "KN", "KO", "KY", "LB", "LN", "LT", "LV", "MK", "ML", "MR", "MS", "NE", "NL", "NO", "NY", "PA", "PL", "PS", "PT", "PT_BR", "RO", "RU", "SD", "SK", "SL", "SO", "SR", "SV", "SW", "TA", "TE", "TH", "TL", "TR", "UK", "UR", "VI", "ZH", "Companion", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class Language {
    private static final /* synthetic */ zn.a $ENTRIES;
    private static final /* synthetic */ Language[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String code;
    public static final Language AF = new Language("AF", 0, "af");
    public static final Language AR = new Language("AR", 1, "ar");
    public static final Language AS = new Language("AS", 2, "as");
    public static final Language AZ = new Language("AZ", 3, "az");
    public static final Language BE = new Language("BE", 4, "be");
    public static final Language BG = new Language("BG", 5, "bg");
    public static final Language BN = new Language("BN", 6, "bn");
    public static final Language BS = new Language("BS", 7, "bs");
    public static final Language CA = new Language("CA", 8, "ca");
    public static final Language CEB = new Language("CEB", 9, "ceb");
    public static final Language CS = new Language("CS", 10, "cs");
    public static final Language CY = new Language("CY", 11, "cy");
    public static final Language DA = new Language("DA", 12, "da");
    public static final Language DE = new Language("DE", 13, "de");
    public static final Language EL = new Language("EL", 14, "el");
    public static final Language EN = new Language("EN", 15, "en");
    public static final Language ES = new Language("ES", 16, "es");
    public static final Language ET = new Language("ET", 17, "et");
    public static final Language FA = new Language("FA", 18, "fa");
    public static final Language FI = new Language("FI", 19, "fi");
    public static final Language FR = new Language("FR", 20, "fr");
    public static final Language GA = new Language("GA", 21, "ga");
    public static final Language GL = new Language("GL", 22, "gl");
    public static final Language GU = new Language("GU", 23, "gu");
    public static final Language HA = new Language("HA", 24, "ha");
    public static final Language HE = new Language("HE", 25, "he");
    public static final Language HI = new Language("HI", 26, "hi");
    public static final Language HR = new Language("HR", 27, "hr");
    public static final Language HU = new Language("HU", 28, "hu");
    public static final Language HY = new Language("HY", 29, "hy");
    public static final Language ID = new Language("ID", 30, "id");
    public static final Language IS = new Language("IS", 31, "is");
    public static final Language IT = new Language("IT", 32, "it");
    public static final Language JA = new Language("JA", 33, "ja");
    public static final Language JV = new Language("JV", 34, "jv");
    public static final Language KA = new Language("KA", 35, "ka");
    public static final Language KK = new Language("KK", 36, "kk");
    public static final Language KN = new Language("KN", 37, "kn");
    public static final Language KO = new Language("KO", 38, "ko");
    public static final Language KY = new Language("KY", 39, "ky");
    public static final Language LB = new Language("LB", 40, "lb");
    public static final Language LN = new Language("LN", 41, "ln");
    public static final Language LT = new Language("LT", 42, "lt");
    public static final Language LV = new Language("LV", 43, "lv");
    public static final Language MK = new Language("MK", 44, "mk");
    public static final Language ML = new Language("ML", 45, "ml");
    public static final Language MR = new Language("MR", 46, "mr");
    public static final Language MS = new Language("MS", 47, "ms");
    public static final Language NE = new Language("NE", 48, "ne");
    public static final Language NL = new Language("NL", 49, "nl");
    public static final Language NO = new Language("NO", 50, AuthorizationHeaderIms.NO);
    public static final Language NY = new Language("NY", 51, "ny");
    public static final Language PA = new Language("PA", 52, "pa");
    public static final Language PL = new Language("PL", 53, "pl");
    public static final Language PS = new Language("PS", 54, "ps");
    public static final Language PT = new Language("PT", 55, "pt");
    public static final Language PT_BR = new Language("PT_BR", 56, "pt-br");
    public static final Language RO = new Language("RO", 57, "ro");
    public static final Language RU = new Language("RU", 58, "ru");
    public static final Language SD = new Language("SD", 59, "sd");
    public static final Language SK = new Language("SK", 60, "sk");
    public static final Language SL = new Language("SL", 61, "sl");
    public static final Language SO = new Language("SO", 62, "so");
    public static final Language SR = new Language("SR", 63, "sr");
    public static final Language SV = new Language("SV", 64, "sv");
    public static final Language SW = new Language("SW", 65, "sw");
    public static final Language TA = new Language("TA", 66, "ta");
    public static final Language TE = new Language("TE", 67, "te");
    public static final Language TH = new Language("TH", 68, "th");
    public static final Language TL = new Language("TL", 69, "tl");
    public static final Language TR = new Language("TR", 70, "tr");
    public static final Language UK = new Language("UK", 71, "uk");
    public static final Language UR = new Language("UR", 72, "ur");
    public static final Language VI = new Language("VI", 73, "vi");
    public static final Language ZH = new Language("ZH", 74, "zh");

    private static final /* synthetic */ Language[] $values() {
        return new Language[]{AF, AR, AS, AZ, BE, BG, BN, BS, CA, CEB, CS, CY, DA, DE, EL, EN, ES, ET, FA, FI, FR, GA, GL, GU, HA, HE, HI, HR, HU, HY, ID, IS, IT, JA, JV, KA, KK, KN, KO, KY, LB, LN, LT, LV, MK, ML, MR, MS, NE, NL, NO, NY, PA, PL, PS, PT, PT_BR, RO, RU, SD, SK, SL, SO, SR, SV, SW, TA, TE, TH, TL, TR, UK, UR, VI, ZH};
    }

    static {
        Language[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c1.q($values);
        INSTANCE = new Companion(null);
    }

    private Language(String str, int i10, String str2) {
        this.code = str2;
    }

    public static zn.a getEntries() {
        return $ENTRIES;
    }

    public static Language valueOf(String str) {
        return (Language) Enum.valueOf(Language.class, str);
    }

    public static Language[] values() {
        return (Language[]) $VALUES.clone();
    }

    public final String getCode() {
        return this.code;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lio/elevenlabs/Language$Companion;", "", "<init>", "()V", "fromCode", "Lio/elevenlabs/Language;", "code", "", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final Language fromCode(String code) {
            Object obj;
            code.getClass();
            Iterator<E> it = Language.getEntries().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (m.c(((Language) obj).getCode(), code)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            return (Language) obj;
        }

        private Companion() {
        }
    }
}
