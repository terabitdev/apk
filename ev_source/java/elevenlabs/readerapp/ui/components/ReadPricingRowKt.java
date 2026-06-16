package io.elevenlabs.readerapp.ui.components;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.domain.model.ExplorePricingType;
import io.elevenlabs.domain.model.MoneyPrice;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.formatter.MoneyPriceFormatterKt;
import io.elevenlabs.ui.components.UltraBadgeKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import r1.i2;
import r1.k2;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\u001a\u0087\u0001\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a1\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u000f\u0010\u001c\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u000f\u0010\u001e\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u001e\u0010\u001d\u001a\u000f\u0010\u001f\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u001f\u0010\u001d\u001a\u000f\u0010 \u001a\u00020\u0014H\u0007¢\u0006\u0004\b \u0010\u001d\u001a\u000f\u0010!\u001a\u00020\u0014H\u0007¢\u0006\u0004\b!\u0010\u001d\u001a\u000f\u0010\"\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\"\u0010\u001d\u001a\u000f\u0010#\u001a\u00020\u0014H\u0007¢\u0006\u0004\b#\u0010\u001d\u001a\u000f\u0010$\u001a\u00020\u0014H\u0007¢\u0006\u0004\b$\u0010\u001d\u001a\u000f\u0010%\u001a\u00020\u0014H\u0007¢\u0006\u0004\b%\u0010\u001d\u001a\u000f\u0010&\u001a\u00020\u0014H\u0007¢\u0006\u0004\b&\u0010\u001d\u001a\u000f\u0010'\u001a\u00020\u0014H\u0007¢\u0006\u0004\b'\u0010\u001d\u001a\u000f\u0010(\u001a\u00020\u0014H\u0007¢\u0006\u0004\b(\u0010\u001d¨\u0006)"}, d2 = {"Lio/elevenlabs/domain/model/ExplorePricingType;", "pricingType", "Lio/elevenlabs/domain/model/MoneyPrice;", "localizedPrice", "", "isLoadingPrice", "", "fallbackFormattedPrice", "canBePurchasedIndividually", "Li3/t;", "modifier", "isFreeUser", "fallbackCurrency", "zeroPriceFormatted", "Lio/elevenlabs/readerapp/ui/components/ReadPricingUltraRowStyle;", "ultraRowStyle", "Ls4/y0;", "textStyle", "Lp3/x;", "textColor", "Lsn/z;", "ReadPricingRow-KNANIv4", "(Lio/elevenlabs/domain/model/ExplorePricingType;Lio/elevenlabs/domain/model/MoneyPrice;ZLjava/lang/String;ZLi3/t;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/readerapp/ui/components/ReadPricingUltraRowStyle;Ls4/y0;JLu2/m;III)V", "ReadPricingRow", ParameterNames.TEXT, "PriceText-cf5BqRc", "(Ljava/lang/String;Ls4/y0;JLi3/t;Lu2/m;II)V", "PriceText", "Preview_ReadPricingRow_free", "(Lu2/m;I)V", "Preview_ReadPricingRow_paid", "Preview_ReadPricingRow_paid_loading", "Preview_ReadPricingRow_ultra_included", "Preview_ReadPricingRow_ultra_purchasable_store_loading", "Preview_ReadPricingRow_ultra_purchasable_full", "Preview_ReadPricingRow_ultra_purchasable_compact", "Preview_ReadPricingRow_ultra_purchasable_fallback_price", "Preview_ReadPricingRow_paid_aed", "Preview_ReadPricingRow_ultra_purchasable_aed_full", "Preview_ReadPricingRow_ultra_purchasable_aed_compact", "Preview_ReadPricingRow_ultra_purchasable_included", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ReadPricingRowKt {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ReadPricingUltraRowStyle.values().length];
            try {
                iArr[ReadPricingUltraRowStyle.Compact.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadPricingUltraRowStyle.Full.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ExplorePricingType.values().length];
            try {
                iArr2[ExplorePricingType.Free.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ExplorePricingType.Paid.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ExplorePricingType.Ultra.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final void Preview_ReadPricingRow_free(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-734317671);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            m1089ReadPricingRowKNANIv4(ExplorePricingType.Free, null, false, null, false, null, Boolean.TRUE, null, null, null, null, 0L, qVar, 1600950, 0, 4000);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new i0(i10, 5);
        }
    }

    public static final sn.z Preview_ReadPricingRow_free$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ReadPricingRow_free(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ReadPricingRow_paid(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1318241479);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            m1089ReadPricingRowKNANIv4(ExplorePricingType.Paid, new MoneyPrice(999L, "USD"), false, "$9.99", true, null, Boolean.TRUE, null, null, null, null, 0L, qVar, 1600902, 0, 4000);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new i0(i10, 2);
        }
    }

    public static final sn.z Preview_ReadPricingRow_paid$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ReadPricingRow_paid(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ReadPricingRow_paid_aed(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1994332648);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            m1089ReadPricingRowKNANIv4(ExplorePricingType.Paid, new MoneyPrice(5499L, "AED"), false, "AED 54.99", true, null, Boolean.TRUE, null, null, null, null, 0L, qVar, 1600902, 0, 4000);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new q(i10, 25);
        }
    }

    public static final sn.z Preview_ReadPricingRow_paid_aed$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ReadPricingRow_paid_aed(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ReadPricingRow_paid_loading(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1749667996);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            m1089ReadPricingRowKNANIv4(ExplorePricingType.Paid, null, true, "$9.99", true, null, Boolean.TRUE, null, null, null, null, 0L, qVar, 1600950, 0, 4000);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new q(i10, 29);
        }
    }

    public static final sn.z Preview_ReadPricingRow_paid_loading$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ReadPricingRow_paid_loading(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ReadPricingRow_ultra_included(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1098188618);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            m1089ReadPricingRowKNANIv4(ExplorePricingType.Ultra, null, false, null, false, null, Boolean.TRUE, null, null, null, null, 0L, qVar, 1600950, 0, 4000);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new q(i10, 27);
        }
    }

    public static final sn.z Preview_ReadPricingRow_ultra_included$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ReadPricingRow_ultra_included(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ReadPricingRow_ultra_purchasable_aed_compact(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1635156907);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            m1089ReadPricingRowKNANIv4(ExplorePricingType.Ultra, new MoneyPrice(5499L, "AED"), false, "AED 54.99", true, null, Boolean.TRUE, null, "AED 0.00", ReadPricingUltraRowStyle.Compact, null, 0L, qVar, 907570566, 0, 3232);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new q(i10, 24);
        }
    }

    public static final sn.z Preview_ReadPricingRow_ultra_purchasable_aed_compact$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ReadPricingRow_ultra_purchasable_aed_compact(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ReadPricingRow_ultra_purchasable_aed_full(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-159915005);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            m1089ReadPricingRowKNANIv4(ExplorePricingType.Ultra, new MoneyPrice(5499L, "AED"), false, "AED 54.99", true, null, Boolean.TRUE, null, "AED 0.00", ReadPricingUltraRowStyle.Full, null, 0L, qVar, 907570566, 0, 3232);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new q(i10, 26);
        }
    }

    public static final sn.z Preview_ReadPricingRow_ultra_purchasable_aed_full$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ReadPricingRow_ultra_purchasable_aed_full(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ReadPricingRow_ultra_purchasable_compact(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(240654582);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            m1089ReadPricingRowKNANIv4(ExplorePricingType.Ultra, new MoneyPrice(1499L, "EUR"), false, "$14.99", true, null, Boolean.TRUE, null, "€0.00", ReadPricingUltraRowStyle.Compact, null, 0L, qVar, 907570566, 0, 3232);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new i0(i10, 0);
        }
    }

    public static final sn.z Preview_ReadPricingRow_ultra_purchasable_compact$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ReadPricingRow_ultra_purchasable_compact(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ReadPricingRow_ultra_purchasable_fallback_price(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1567232443);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            m1089ReadPricingRowKNANIv4(ExplorePricingType.Ultra, null, false, "$14.99", true, null, Boolean.TRUE, null, null, ReadPricingUltraRowStyle.Compact, null, 0L, qVar, 806907318, 0, 3488);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new i0(i10, 1);
        }
    }

    public static final sn.z Preview_ReadPricingRow_ultra_purchasable_fallback_price$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ReadPricingRow_ultra_purchasable_fallback_price(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ReadPricingRow_ultra_purchasable_full(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-362122494);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            m1089ReadPricingRowKNANIv4(ExplorePricingType.Ultra, new MoneyPrice(1499L, "EUR"), false, "$14.99", true, null, Boolean.TRUE, null, "€0.00", ReadPricingUltraRowStyle.Full, null, 0L, qVar, 907570566, 0, 3232);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new i0(i10, 4);
        }
    }

    public static final sn.z Preview_ReadPricingRow_ultra_purchasable_full$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ReadPricingRow_ultra_purchasable_full(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ReadPricingRow_ultra_purchasable_included(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(758424117);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            m1089ReadPricingRowKNANIv4(ExplorePricingType.Ultra, new MoneyPrice(1499L, "EUR"), false, "$14.99", true, null, Boolean.FALSE, null, "€0.00", ReadPricingUltraRowStyle.Compact, null, 0L, qVar, 907570566, 0, 3232);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new i0(i10, 3);
        }
    }

    public static final sn.z Preview_ReadPricingRow_ultra_purchasable_included$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ReadPricingRow_ultra_purchasable_included(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ReadPricingRow_ultra_purchasable_store_loading(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-808025893);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            m1089ReadPricingRowKNANIv4(ExplorePricingType.Ultra, null, true, "$14.99", true, null, Boolean.TRUE, null, null, null, null, 0L, qVar, 1600950, 0, 4000);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new q(i10, 28);
        }
    }

    public static final sn.z Preview_ReadPricingRow_ultra_purchasable_store_loading$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ReadPricingRow_ultra_purchasable_store_loading(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006a  */
    /* renamed from: PriceText-cf5BqRc */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m1088PriceTextcf5BqRc(String str, s4.y0 y0Var, long j4, i3.t tVar, u2.m mVar, int i10, int i11) {
        String str2;
        int i12;
        s4.y0 y0Var2;
        i3.t tVar2;
        int i13;
        boolean z6;
        u2.q qVar;
        r1 r10;
        i3.t tVar3;
        int i14;
        int i15;
        int i16;
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-60342288);
        if ((i10 & 6) == 0) {
            str2 = str;
            if (qVar2.f(str2)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i10;
        } else {
            str2 = str;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            y0Var2 = y0Var;
            if (qVar2.f(y0Var2)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        } else {
            y0Var2 = y0Var;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.e(j4)) {
                i14 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        int i17 = i11 & 8;
        if (i17 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            tVar2 = tVar;
            if (qVar2.f(tVar2)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i13;
            if ((i12 & 1171) == 1170) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar2.O(i12 & 1, z6)) {
                if (i17 != 0) {
                    tVar3 = i3.q.f13017a;
                } else {
                    tVar3 = tVar2;
                }
                qVar = qVar2;
                j7.d(str2, tVar3, j4, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, y0Var2, qVar, (i12 & 14) | ((i12 >> 6) & 112) | (i12 & 896), ((i12 << 18) & 29360128) | 24960, 110584);
                tVar2 = tVar3;
            } else {
                qVar = qVar2;
                qVar.R();
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new k0(str, y0Var, j4, tVar2, i10, i11);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i12 & 1171) == 1170) {
        }
        if (!qVar2.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z PriceText_cf5BqRc$lambda$0(String str, s4.y0 y0Var, long j4, i3.t tVar, int i10, int i11, u2.m mVar, int i12) {
        m1088PriceTextcf5BqRc(str, y0Var, j4, tVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0164  */
    /* renamed from: ReadPricingRow-KNANIv4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1089ReadPricingRowKNANIv4(final ExplorePricingType explorePricingType, final MoneyPrice moneyPrice, final boolean z6, final String str, final boolean z10, i3.t tVar, Boolean bool, String str2, String str3, ReadPricingUltraRowStyle readPricingUltraRowStyle, s4.y0 y0Var, long j4, u2.m mVar, final int i10, final int i11, final int i12) {
        int i13;
        String str4;
        i3.t tVar2;
        int i14;
        int i15;
        Boolean bool2;
        int i16;
        int i17;
        String str5;
        int i18;
        int i19;
        String str6;
        int i20;
        int i21;
        int ordinal;
        int i22;
        int i23;
        int i24;
        int i25;
        boolean z11;
        u2.q qVar;
        final ReadPricingUltraRowStyle readPricingUltraRowStyle2;
        final s4.y0 y0Var2;
        final String str7;
        final i3.t tVar3;
        final long j10;
        final String str8;
        final Boolean bool3;
        r1 r10;
        i3.t tVar4;
        ReadPricingUltraRowStyle readPricingUltraRowStyle3;
        s4.y0 y0Var3;
        long j11;
        s4.y0 y0Var4;
        Boolean bool4;
        String str9;
        i3.t tVar5;
        long j12;
        boolean z12;
        boolean z13;
        boolean z14;
        String str10;
        String str11;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        explorePricingType.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-67318719);
        if ((i10 & 6) == 0) {
            if (qVar2.d(explorePricingType.ordinal())) {
                i32 = 4;
            } else {
                i32 = 2;
            }
            i13 = i32 | i10;
        } else {
            i13 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(moneyPrice)) {
                i31 = 32;
            } else {
                i31 = 16;
            }
            i13 |= i31;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.g(z6)) {
                i30 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i30 = 128;
            }
            i13 |= i30;
        }
        if ((i10 & 3072) == 0) {
            str4 = str;
            if (qVar2.f(str4)) {
                i29 = 2048;
            } else {
                i29 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i13 |= i29;
        } else {
            str4 = str;
        }
        if ((i10 & 24576) == 0) {
            if (qVar2.g(z10)) {
                i28 = 16384;
            } else {
                i28 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i13 |= i28;
        }
        int i33 = i12 & 32;
        if (i33 != 0) {
            i13 |= 196608;
        } else if ((196608 & i10) == 0) {
            tVar2 = tVar;
            if (qVar2.f(tVar2)) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            i13 |= i14;
            i15 = i12 & 64;
            if (i15 == 0) {
                i13 |= 1572864;
            } else if ((1572864 & i10) == 0) {
                bool2 = bool;
                if (qVar2.f(bool2)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i13 |= i16;
                i17 = i12 & 128;
                if (i17 != 0) {
                    i13 |= 12582912;
                    str5 = str2;
                } else {
                    str5 = str2;
                    if ((i10 & 12582912) == 0) {
                        if (qVar2.f(str5)) {
                            i18 = 8388608;
                        } else {
                            i18 = 4194304;
                        }
                        i13 |= i18;
                    }
                }
                i19 = i12 & RpcError.MAX_MESSAGE_BYTES;
                if (i19 != 0) {
                    i13 |= 100663296;
                    str6 = str3;
                } else {
                    str6 = str3;
                    if ((i10 & 100663296) == 0) {
                        if (qVar2.f(str6)) {
                            i20 = 67108864;
                        } else {
                            i20 = 33554432;
                        }
                        i13 |= i20;
                    }
                }
                i21 = i12 & 512;
                if (i21 != 0) {
                    i13 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (readPricingUltraRowStyle == null) {
                        ordinal = -1;
                    } else {
                        ordinal = readPricingUltraRowStyle.ordinal();
                    }
                    i22 = i21;
                    if (qVar2.d(ordinal)) {
                        i23 = 536870912;
                    } else {
                        i23 = 268435456;
                    }
                    i13 |= i23;
                    if ((i11 & 6) != 0) {
                        if ((i12 & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0 && qVar2.f(y0Var)) {
                            i27 = 4;
                            i24 = i11 | i27;
                        }
                        i27 = 2;
                        i24 = i11 | i27;
                    } else {
                        i24 = i11;
                    }
                    if ((i11 & 48) == 0) {
                        if ((i12 & 2048) == 0 && qVar2.e(j4)) {
                            i26 = 32;
                            i24 |= i26;
                        }
                        i26 = 16;
                        i24 |= i26;
                    }
                    i25 = i13;
                    if ((i13 & 306783379) != 306783378 && (i24 & 19) == 18) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (!qVar2.O(i25 & 1, z11)) {
                        qVar2.T();
                        if ((i10 & 1) != 0 && !qVar2.y()) {
                            qVar2.R();
                            if ((i12 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                i24 &= -15;
                            }
                            if ((i12 & 2048) != 0) {
                                i24 &= -113;
                            }
                            readPricingUltraRowStyle2 = readPricingUltraRowStyle;
                            y0Var4 = y0Var;
                            tVar4 = tVar2;
                            bool4 = bool2;
                            j11 = j4;
                        } else {
                            if (i33 != 0) {
                                tVar4 = i3.q.f13017a;
                            } else {
                                tVar4 = tVar2;
                            }
                            if (i15 != 0) {
                                bool2 = null;
                            }
                            if (i17 != 0) {
                                str5 = null;
                            }
                            if (i19 != 0) {
                                str6 = null;
                            }
                            if (i22 != 0) {
                                readPricingUltraRowStyle3 = ReadPricingUltraRowStyle.Full;
                            } else {
                                readPricingUltraRowStyle3 = readPricingUltraRowStyle;
                            }
                            if ((i12 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                y0Var3 = EchoTheme.INSTANCE.getTypography(qVar2, EchoTheme.$stable).getSmRegular400(qVar2, EchoThemeTypography.$stable);
                                i24 &= -15;
                            } else {
                                y0Var3 = y0Var;
                            }
                            if ((i12 & 2048) != 0) {
                                j11 = EchoTheme.INSTANCE.getColors(qVar2, EchoTheme.$stable).getText().getTertiary(qVar2, EchoThemeColors.Text.$stable);
                                i24 &= -113;
                            } else {
                                j11 = j4;
                            }
                            y0Var4 = y0Var3;
                            readPricingUltraRowStyle2 = readPricingUltraRowStyle3;
                            bool4 = bool2;
                        }
                        qVar2.q();
                        if (moneyPrice == null || (str9 = MoneyPriceFormatterKt.format(moneyPrice)) == null) {
                            if (!z6) {
                                str9 = str4;
                            } else {
                                str9 = null;
                            }
                        }
                        if (!z10) {
                            str9 = null;
                        }
                        int i34 = WhenMappings.$EnumSwitchMapping$1[explorePricingType.ordinal()];
                        if (i34 != 1) {
                            if (i34 != 2) {
                                if (i34 == 3) {
                                    qVar2.X(259034956);
                                    r1.u0 u0Var = r1.j.f29228a;
                                    k2 a10 = i2.a(r1.j.g(EchoTheme.INSTANCE.getSpacings(qVar2, EchoTheme.$stable).getX1_5()), i3.d.f13005z0, qVar2, 48);
                                    int hashCode = Long.hashCode(qVar2.T);
                                    c3.o l4 = qVar2.l();
                                    i3.t c5 = i3.a.c(tVar4, qVar2);
                                    h4.h.f11920i.getClass();
                                    h4.f fVar = h4.g.f11903b;
                                    qVar2.b0();
                                    tVar5 = tVar4;
                                    if (qVar2.S) {
                                        qVar2.k(fVar);
                                    } else {
                                        qVar2.k0();
                                    }
                                    u2.r.J(h4.g.f11907f, a10, qVar2);
                                    u2.r.J(h4.g.f11906e, l4, qVar2);
                                    u2.r.y(qVar2, Integer.valueOf(hashCode), h4.g.f11908g);
                                    u2.r.F(h4.g.f11909h, qVar2);
                                    u2.r.J(h4.g.f11905d, c5, qVar2);
                                    if (z10 && !kotlin.jvm.internal.m.c(bool4, Boolean.FALSE)) {
                                        qVar2.X(-22775400);
                                        if (str9 == null) {
                                            qVar2.X(414907983);
                                            str9 = kj.c.R(qVar2, R.string.explore_book_paid);
                                            z14 = false;
                                        } else {
                                            z14 = false;
                                            qVar2.X(414907487);
                                        }
                                        qVar2.p(z14);
                                        if (moneyPrice == null || (str10 = moneyPrice.getCurrency()) == null) {
                                            str10 = str5;
                                        }
                                        if (str6 == null) {
                                            if (str10 != null) {
                                                str11 = MoneyPriceFormatterKt.formatPrice(t2.u.P, str10);
                                            } else {
                                                str11 = null;
                                            }
                                            if (str11 == null) {
                                                str11 = MoneyPriceFormatterKt.formatPrice(t2.u.P, null);
                                            }
                                        } else {
                                            str11 = str6;
                                        }
                                        int i35 = WhenMappings.$EnumSwitchMapping$0[readPricingUltraRowStyle2.ordinal()];
                                        if (i35 != 1) {
                                            if (i35 == 2) {
                                                qVar2.X(414923047);
                                                str11 = kj.c.Q(R.string.zero_price_with_ultra, new Object[]{str11}, qVar2);
                                                qVar2.p(false);
                                            } else {
                                                throw com.google.android.gms.internal.play_billing.b.h(414918601, qVar2, false);
                                            }
                                        } else {
                                            qVar2.X(414920848);
                                            qVar2.p(false);
                                        }
                                        int i36 = i24 << 3;
                                        int i37 = i36 & 896;
                                        int i38 = i36 & 1008;
                                        long j13 = j11;
                                        s4.y0 y0Var5 = y0Var4;
                                        m1088PriceTextcf5BqRc(str9, y0Var5, j13, null, qVar2, i38, 8);
                                        j12 = j13;
                                        j7.d("•", null, j12, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, y0Var4, qVar2, i37 | 6, (i24 << 21) & 29360128, 131066);
                                        qVar = qVar2;
                                        z12 = true;
                                        z13 = false;
                                        UltraBadgeKt.UltraBadge(null, qVar, 0, 1);
                                        m1088PriceTextcf5BqRc(str11, y0Var5, j13, null, qVar, i38, 8);
                                        qVar.p(false);
                                    } else {
                                        qVar = qVar2;
                                        j12 = j11;
                                        z12 = true;
                                        z13 = false;
                                        qVar.X(-21834054);
                                        UltraBadgeKt.UltraBadge(null, qVar, 0, 1);
                                        m1088PriceTextcf5BqRc(kj.c.R(qVar, R.string.explore_book_included_in_ultra), y0Var4, j12, null, qVar, (i24 << 3) & 1008, 8);
                                        qVar.p(false);
                                    }
                                    qVar.p(z12);
                                    qVar.p(z13);
                                } else {
                                    throw com.google.android.gms.internal.play_billing.b.h(-268754781, qVar2, false);
                                }
                            } else {
                                tVar5 = tVar4;
                                j12 = j11;
                                qVar = qVar2;
                                qVar.X(-268747733);
                                if (str9 == null) {
                                    qVar.X(-268746421);
                                    str9 = kj.c.R(qVar, R.string.explore_book_paid);
                                } else {
                                    qVar.X(-268746917);
                                }
                                qVar.p(false);
                                m1088PriceTextcf5BqRc(str9, y0Var4, j12, tVar5, qVar, ((i24 << 3) & 1008) | ((i25 >> 6) & 7168), 0);
                                qVar.p(false);
                            }
                        } else {
                            tVar5 = tVar4;
                            j12 = j11;
                            qVar = qVar2;
                            qVar.X(-268754885);
                            m1088PriceTextcf5BqRc(kj.c.R(qVar, R.string.explore_book_free), y0Var4, j12, tVar5, qVar, ((i24 << 3) & 1008) | ((i25 >> 6) & 7168), 0);
                            qVar.p(false);
                        }
                        str7 = str5;
                        j10 = j12;
                        y0Var2 = y0Var4;
                        str8 = str6;
                        bool3 = bool4;
                        tVar3 = tVar5;
                    } else {
                        qVar = qVar2;
                        qVar.R();
                        readPricingUltraRowStyle2 = readPricingUltraRowStyle;
                        y0Var2 = y0Var;
                        str7 = str5;
                        tVar3 = tVar2;
                        j10 = j4;
                        str8 = str6;
                        bool3 = bool2;
                    }
                    r10 = qVar.r();
                    if (r10 == null) {
                        r10.f34012d = new ho.p() { // from class: io.elevenlabs.readerapp.ui.components.j0
                            @Override // ho.p
                            public final Object invoke(Object obj, Object obj2) {
                                sn.z ReadPricingRow_KNANIv4$lambda$2;
                                int intValue = ((Integer) obj2).intValue();
                                ReadPricingRow_KNANIv4$lambda$2 = ReadPricingRowKt.ReadPricingRow_KNANIv4$lambda$2(ExplorePricingType.this, moneyPrice, z6, str, z10, tVar3, bool3, str7, str8, readPricingUltraRowStyle2, y0Var2, j10, i10, i11, i12, (u2.m) obj, intValue);
                                return ReadPricingRow_KNANIv4$lambda$2;
                            }
                        };
                        return;
                    }
                    return;
                }
                i22 = i21;
                if ((i11 & 6) != 0) {
                }
                if ((i11 & 48) == 0) {
                }
                i25 = i13;
                if ((i13 & 306783379) != 306783378) {
                }
                z11 = true;
                if (!qVar2.O(i25 & 1, z11)) {
                }
                r10 = qVar.r();
                if (r10 == null) {
                }
            }
            bool2 = bool;
            i17 = i12 & 128;
            if (i17 != 0) {
            }
            i19 = i12 & RpcError.MAX_MESSAGE_BYTES;
            if (i19 != 0) {
            }
            i21 = i12 & 512;
            if (i21 != 0) {
            }
            i22 = i21;
            if ((i11 & 6) != 0) {
            }
            if ((i11 & 48) == 0) {
            }
            i25 = i13;
            if ((i13 & 306783379) != 306783378) {
            }
            z11 = true;
            if (!qVar2.O(i25 & 1, z11)) {
            }
            r10 = qVar.r();
            if (r10 == null) {
            }
        }
        tVar2 = tVar;
        i15 = i12 & 64;
        if (i15 == 0) {
        }
        bool2 = bool;
        i17 = i12 & 128;
        if (i17 != 0) {
        }
        i19 = i12 & RpcError.MAX_MESSAGE_BYTES;
        if (i19 != 0) {
        }
        i21 = i12 & 512;
        if (i21 != 0) {
        }
        i22 = i21;
        if ((i11 & 6) != 0) {
        }
        if ((i11 & 48) == 0) {
        }
        i25 = i13;
        if ((i13 & 306783379) != 306783378) {
        }
        z11 = true;
        if (!qVar2.O(i25 & 1, z11)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z ReadPricingRow_KNANIv4$lambda$2(ExplorePricingType explorePricingType, MoneyPrice moneyPrice, boolean z6, String str, boolean z10, i3.t tVar, Boolean bool, String str2, String str3, ReadPricingUltraRowStyle readPricingUltraRowStyle, s4.y0 y0Var, long j4, int i10, int i11, int i12, u2.m mVar, int i13) {
        m1089ReadPricingRowKNANIv4(explorePricingType, moneyPrice, z6, str, z10, tVar, bool, str2, str3, readPricingUltraRowStyle, y0Var, j4, mVar, u2.r.M(i10 | 1), u2.r.M(i11), i12);
        return sn.z.f31622a;
    }
}
