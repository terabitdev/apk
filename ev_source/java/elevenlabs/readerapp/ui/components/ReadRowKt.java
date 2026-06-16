package io.elevenlabs.readerapp.ui.components;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.parser.TokenNames;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.messaging.Constants;
import io.elevenlabs.domain.model.ListeningProgress;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.formatter.MinutesFormatterKt;
import io.elevenlabs.readerapp.ui.formatter.NumberFormatterKt;
import io.elevenlabs.readerapp.ui.formatter.WordCountToLengthFormatterKt;
import io.elevenlabs.ui.components.ReadItemCoverKt;
import io.elevenlabs.ui.components.UnreadIndicatorKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeShapes;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.elevenlabs.ui.extensions.BoxShadow;
import io.elevenlabs.ui.extensions.BoxShadowKt;
import io.elevenlabs.ui.extensions.CoilExtensionsKt;
import io.elevenlabs.ui.extensions.ComposeExtensionsKt;
import io.elevenlabs.ui.theme.ReaderColors;
import io.livekit.android.rpc.RpcError;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import q2.y2;
import r1.i2;
import r1.k2;
import r1.m1;
import r1.p2;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a+\u0010\u0015\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u008d\u0001\u0010$\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u000b2\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b$\u0010%\u001a\u001b\u0010(\u001a\u00020\u000b*\u00020\u001c2\u0006\u0010'\u001a\u00020&H\u0007¢\u0006\u0004\b(\u0010)\u001a5\u0010*\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001eH\u0007¢\u0006\u0004\b*\u0010+\u001a3\u0010/\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u000b2\b\u0010-\u001a\u0004\u0018\u00010\u000b2\b\u0010.\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b/\u00100\u001a;\u00103\u001a\u00020\u00032\b\u0010-\u001a\u0004\u0018\u00010\u000b2\b\u0010.\u001a\u0004\u0018\u00010\u000f2\u0016\b\u0002\u00102\u001a\u0010\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H\u0003¢\u0006\u0004\b3\u00104\"\u0014\u00106\u001a\u0002058\u0002X\u0082T¢\u0006\u0006\n\u0004\b6\u00107\"\u0014\u00108\u001a\u0002058\u0002X\u0082T¢\u0006\u0006\n\u0004\b8\u00107\"\u0014\u00109\u001a\u0002058\u0002X\u0082T¢\u0006\u0006\n\u0004\b9\u00107¨\u0006=²\u0006\u000e\u0010;\u001a\u00020:8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010<\u001a\u0004\u0018\u0001018\n@\nX\u008a\u008e\u0002"}, d2 = {"Li3/t;", "modifier", "Lkotlin/Function0;", "Lsn/z;", "image", "Lkotlin/Function1;", "Lr1/y;", FirebaseAnalytics.Param.CONTENT, "endContent", "ReadRowContainer", "(Li3/t;Lho/p;Lho/q;Lho/p;Lu2/m;II)V", "", ParameterNames.TEXT, "ReadRowPrimaryText", "(Ljava/lang/String;Lu2/m;I)V", "", "maxLines", "Lp3/x;", "color", "ReadRowSecondaryText-FNF3uiM", "(Ljava/lang/String;IJLu2/m;II)V", "ReadRowSecondaryText", "title", "subtitle", "description", "", "Lio/elevenlabs/readerapp/ui/components/CaptionItem;", "captionItems", "Lio/elevenlabs/domain/model/ListeningProgress;", "progress", "", "markedUnread", "isCompleted", "isAvailableOffline", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "badge", "ReadRow", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Li3/t;Ljava/util/List;Lio/elevenlabs/domain/model/ListeningProgress;ZZZLjava/lang/String;Lho/p;Lho/p;Lu2/m;III)V", "", "value", "formatDuration", "(Lio/elevenlabs/domain/model/ListeningProgress;DLu2/m;I)Ljava/lang/String;", "ReadStatusRow", "(Lio/elevenlabs/domain/model/ListeningProgress;Ljava/util/List;ZZLu2/m;I)V", "displayAsABookCover", "thumbnailImageUrl", "fallbackImageRes", "ReadCover", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lu2/m;I)V", "Lo3/e;", "onImageSize", "ReadCoverContent", "(Ljava/lang/String;Ljava/lang/Integer;Lho/l;Lu2/m;II)V", "", "COVER_WIDTH_FRACTION", TokenNames.F, "COVER_HEIGHT_FRACTION", "COVER_CORNER_RADIUS_FRACTION", "Lh5/l;", "size", "imageSize", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ReadRowKt {
    private static final float COVER_CORNER_RADIUS_FRACTION = 0.04f;
    private static final float COVER_HEIGHT_FRACTION = 0.77f;
    private static final float COVER_WIDTH_FRACTION = 0.52f;

    public static final void ReadCover(boolean z6, String str, String str2, Integer num, u2.m mVar, int i10) {
        int i11;
        boolean z10;
        String str3;
        boolean z11;
        i3.t c5;
        int i12;
        int i13;
        int i14;
        int i15;
        str.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1601027363);
        if ((i10 & 6) == 0) {
            if (qVar.g(z6)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i11 = i15 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.f(str)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i11 |= i14;
        }
        if ((i10 & 384) == 0) {
            if (qVar.f(str2)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i11 |= i13;
        }
        if ((i10 & 3072) == 0) {
            if (qVar.f(num)) {
                i12 = 2048;
            } else {
                i12 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i12;
        }
        if ((i11 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (qVar.O(i11 & 1, z10)) {
            if (z6) {
                qVar.X(-594131834);
                Object L = qVar.L();
                u2.e eVar = u2.l.f33918a;
                if (L == eVar) {
                    L = u2.r.A(new h5.l(0L));
                    qVar.h0(L);
                }
                u2.z0 z0Var = (u2.z0) L;
                float rememberPxToDp = ComposeExtensionsKt.rememberPxToDp((int) (ReadCover$lambda$1(z0Var) >> 32), (u2.m) qVar, 0);
                if ((i11 & 896) == 256) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                Object L2 = qVar.L();
                if (z11 || L2 == eVar) {
                    L2 = u2.r.A(null);
                    qVar.h0(L2);
                }
                u2.z0 z0Var2 = (u2.z0) L2;
                boolean f10 = qVar.f(ReadCover$lambda$4(z0Var2));
                Object L3 = qVar.L();
                if (f10 || L3 == eVar) {
                    L3 = Boolean.valueOf(CoverAspectRatioKt.m1084isCoverSquarishiaC8Vc4(ReadCover$lambda$4(z0Var2)));
                    qVar.h0(L3);
                }
                boolean booleanValue = ((Boolean) L3).booleanValue();
                i3.q qVar2 = i3.q.f13017a;
                if (booleanValue) {
                    c5 = p2.d(qVar2, COVER_HEIGHT_FRACTION);
                } else {
                    c5 = p2.c(p2.e(qVar2, COVER_WIDTH_FRACTION), COVER_HEIGHT_FRACTION);
                }
                Object L4 = qVar.L();
                if (L4 == eVar) {
                    L4 = new a2.y(z0Var, 10);
                    qVar.h0(L4);
                }
                float f11 = rememberPxToDp * 0.05f;
                float f12 = -rememberPxToDp;
                str3 = str;
                ReadItemCoverKt.ReadItemCover(m3.h.c(BoxShadowKt.boxShadow$default(f4.i0.q(qVar2, (ho.l) L4).then(c5), new BoxShadow[]{new BoxShadow(p3.h0.c(1493172224), f11, f12 * 0.03f, (Float.floatToRawIntBits(r7) << 32) | (Float.floatToRawIntBits(0.08f * rememberPxToDp) & 4294967295L), false, 16, null), new BoxShadow(p3.h0.c(1056964608), rememberPxToDp * 0.03f, 0, (Float.floatToRawIntBits(r7) << 32) | (Float.floatToRawIntBits(0.01f * rememberPxToDp) & 4294967295L), false, 16, null), new BoxShadow(p3.h0.c(855638016), f11, f12 * 0.02f, (Float.floatToRawIntBits(r7) << 32) | (Float.floatToRawIntBits(rememberPxToDp * 0.02f) & 4294967295L), false, 16, null)}, null, false, 6, null), z1.h.b(rememberPxToDp * COVER_CORNER_RADIUS_FRACTION)), str3, c3.k.d(-1099797503, true, new a2.q0(str2, num, z0Var2, 3), qVar), qVar, (i11 & 112) | 384);
                qVar.p(false);
            } else {
                str3 = str;
                qVar.X(-592339879);
                ReadCoverContent(str2, num, null, qVar, (i11 >> 6) & 126, 4);
                qVar.p(false);
            }
        } else {
            str3 = str;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new id.k(z6, str3, str2, num, i10);
        }
    }

    private static final long ReadCover$lambda$1(u2.z0 z0Var) {
        return ((h5.l) z0Var.getValue()).f12092a;
    }

    private static final void ReadCover$lambda$2(u2.z0 z0Var, long j4) {
        z0Var.setValue(new h5.l(j4));
    }

    private static final o3.e ReadCover$lambda$4(u2.z0 z0Var) {
        return (o3.e) z0Var.getValue();
    }

    public static final sn.z ReadCover$lambda$7$0(u2.z0 z0Var, h5.l lVar) {
        ReadCover$lambda$2(z0Var, lVar.f12092a);
        return sn.z.f31622a;
    }

    public static final sn.z ReadCover$lambda$8(String str, Integer num, u2.z0 z0Var, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            boolean f10 = qVar.f(z0Var);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new a2.y(z0Var, 11);
                qVar.h0(L);
            }
            ReadCoverContent(str, num, (ho.l) L, qVar, 0, 0);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ReadCover$lambda$8$0$0(u2.z0 z0Var, o3.e eVar) {
        z0Var.setValue(eVar);
        return sn.z.f31622a;
    }

    public static final sn.z ReadCover$lambda$9(boolean z6, String str, String str2, Integer num, int i10, u2.m mVar, int i11) {
        ReadCover(z6, str, str2, num, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void ReadCoverContent(String str, Integer num, ho.l lVar, u2.m mVar, int i10, int i11) {
        int i12;
        ho.l lVar2;
        int i13;
        boolean z6;
        ho.l lVar3;
        r1 r10;
        boolean z10;
        int i14;
        int i15;
        f4.p pVar = f4.q.f8839b;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-476305008);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.f(num)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        int i16 = i11 & 4;
        if (i16 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            lVar2 = lVar;
            if (qVar.h(lVar2)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            if ((i12 & 147) == 146) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar.O(i12 & 1, z6)) {
                if (i16 != 0) {
                    lVar3 = null;
                } else {
                    lVar3 = lVar2;
                }
                i3.q qVar2 = i3.q.f13017a;
                if (str != null) {
                    qVar.X(969642905);
                    ad.i a10 = CoilExtensionsKt.coverData(new ad.h((Context) qVar.j(AndroidCompositionLocals_androidKt.f2291b)), str).a();
                    if ((i12 & 896) == 256) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    Object L = qVar.L();
                    if (z10 || L == u2.l.f33918a) {
                        L = new g3.m(lVar3, 2);
                        qVar.h0(L);
                    }
                    l1.n.c(qc.m.j(a10, (ho.l) L, pVar, qVar), null, p2.d(qVar2, 1.0f), null, pVar, t2.u.P, null, qVar, 25008, 104);
                    r1.p.a(l1.n.j(1, p3.h0.c(167772160), p2.d(qVar2, 1.0f), EchoTheme.INSTANCE.getShapes(qVar, EchoTheme.$stable).getMd(qVar, EchoThemeShapes.$stable)), qVar, 0);
                    qVar.p(false);
                } else if (num != null) {
                    qVar.X(970549221);
                    l1.n.c(kd.a.M(num.intValue(), qVar, (i12 >> 3) & 14), null, p2.d(qVar2, 1.0f), null, pVar, t2.u.P, null, qVar, u3.c.$stable | 25008, 104);
                    qVar.p(false);
                } else {
                    qVar.X(970752178);
                    qVar.p(false);
                }
            } else {
                qVar.R();
                lVar3 = lVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new fm.f(str, num, lVar3, i10, i11, 15, false);
                return;
            }
            return;
        }
        lVar2 = lVar;
        if ((i12 & 147) == 146) {
        }
        if (!qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z ReadCoverContent$lambda$0$0(ho.l lVar, qc.g gVar) {
        gVar.getClass();
        if (gVar instanceof qc.f) {
            long mo938getIntrinsicSizeNHjbRc = ((qc.f) gVar).f28209a.mo938getIntrinsicSizeNHjbRc();
            if (Float.intBitsToFloat((int) (mo938getIntrinsicSizeNHjbRc >> 32)) > t2.u.P && Float.intBitsToFloat((int) (4294967295L & mo938getIntrinsicSizeNHjbRc)) > t2.u.P && lVar != null) {
                lVar.invoke(new o3.e(mo938getIntrinsicSizeNHjbRc));
            }
        }
        return sn.z.f31622a;
    }

    public static final sn.z ReadCoverContent$lambda$1(String str, Integer num, ho.l lVar, int i10, int i11, u2.m mVar, int i12) {
        ReadCoverContent(str, num, lVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ReadRow(final String str, final String str2, final String str3, i3.t tVar, List<CaptionItem> list, final ListeningProgress listeningProgress, final boolean z6, final boolean z10, final boolean z11, final String str4, ho.p pVar, final ho.p pVar2, u2.m mVar, final int i10, final int i11, final int i12) {
        int i13;
        String str5;
        String str6;
        i3.t tVar2;
        int i14;
        int i15;
        List<CaptionItem> list2;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z12;
        i3.t tVar3;
        final List<CaptionItem> list3;
        final ho.p pVar3;
        r1 r10;
        final List<CaptionItem> list4;
        final ho.p pVar4;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        str.getClass();
        listeningProgress.getClass();
        str4.getClass();
        pVar2.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-532512430);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i29 = 4;
            } else {
                i29 = 2;
            }
            i13 = i29 | i10;
        } else {
            i13 = i10;
        }
        if ((i10 & 48) == 0) {
            str5 = str2;
            if (qVar.f(str5)) {
                i28 = 32;
            } else {
                i28 = 16;
            }
            i13 |= i28;
        } else {
            str5 = str2;
        }
        if ((i10 & 384) == 0) {
            str6 = str3;
            if (qVar.f(str6)) {
                i27 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i27 = 128;
            }
            i13 |= i27;
        } else {
            str6 = str3;
        }
        int i30 = i12 & 8;
        if (i30 != 0) {
            i13 |= 3072;
        } else if ((i10 & 3072) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i14 = 2048;
            } else {
                i14 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i13 |= i14;
            i15 = i12 & 16;
            if (i15 == 0) {
                i13 |= 24576;
            } else if ((i10 & 24576) == 0) {
                list2 = list;
                if (qVar.h(list2)) {
                    i16 = 16384;
                } else {
                    i16 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i13 |= i16;
                if ((i10 & 196608) == 0) {
                    if (qVar.h(listeningProgress)) {
                        i26 = 131072;
                    } else {
                        i26 = 65536;
                    }
                    i13 |= i26;
                }
                if ((i10 & 1572864) == 0) {
                    if (qVar.g(z6)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i13 |= i25;
                }
                if ((i10 & 12582912) == 0) {
                    if (qVar.g(z10)) {
                        i24 = 8388608;
                    } else {
                        i24 = 4194304;
                    }
                    i13 |= i24;
                }
                if ((i10 & 100663296) == 0) {
                    if (qVar.g(z11)) {
                        i23 = 67108864;
                    } else {
                        i23 = 33554432;
                    }
                    i13 |= i23;
                }
                if ((i10 & 805306368) == 0) {
                    if (qVar.f(str4)) {
                        i22 = 536870912;
                    } else {
                        i22 = 268435456;
                    }
                    i13 |= i22;
                }
                i17 = i12 & UserMetadata.MAX_ATTRIBUTE_SIZE;
                if (i17 != 0) {
                    i19 = i11 | 6;
                    i18 = i17;
                } else if ((i11 & 6) == 0) {
                    i18 = i17;
                    if (qVar.h(pVar)) {
                        i20 = 4;
                    } else {
                        i20 = 2;
                    }
                    i19 = i11 | i20;
                } else {
                    i18 = i17;
                    i19 = i11;
                }
                if ((i11 & 48) == 0) {
                    if (qVar.h(pVar2)) {
                        i21 = 32;
                    } else {
                        i21 = 16;
                    }
                    i19 |= i21;
                }
                int i31 = i19;
                if ((i13 & 306783379) != 306783378 && (i31 & 19) == 18) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (qVar.O(i13 & 1, z12)) {
                    if (i30 != 0) {
                        tVar3 = i3.q.f13017a;
                    } else {
                        tVar3 = tVar2;
                    }
                    if (i15 != 0) {
                        list4 = tn.t.f33547a;
                    } else {
                        list4 = list2;
                    }
                    if (i18 != 0) {
                        pVar4 = null;
                    } else {
                        pVar4 = pVar;
                    }
                    final String str7 = str5;
                    final String str8 = str6;
                    ReadRowContainer(tVar3, pVar2, c3.k.d(-36536394, true, new ho.q() { // from class: io.elevenlabs.readerapp.ui.components.l0
                        @Override // ho.q
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            sn.z ReadRow$lambda$0;
                            int intValue = ((Integer) obj3).intValue();
                            ReadRow$lambda$0 = ReadRowKt.ReadRow$lambda$0(ho.p.this, str7, str, str4, str8, listeningProgress, list4, z10, z11, (r1.y) obj, (u2.m) obj2, intValue);
                            return ReadRow$lambda$0;
                        }
                    }, qVar), c3.k.d(321894629, true, new m0(z6, 0), qVar), qVar, (i31 & 112) | ((i13 >> 9) & 14) | 3456, 0);
                    pVar3 = pVar4;
                    list3 = list4;
                } else {
                    qVar.R();
                    tVar3 = tVar2;
                    list3 = list2;
                    pVar3 = pVar;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    final i3.t tVar4 = tVar3;
                    r10.f34012d = new ho.p() { // from class: io.elevenlabs.readerapp.ui.components.n0
                        @Override // ho.p
                        public final Object invoke(Object obj, Object obj2) {
                            sn.z ReadRow$lambda$2;
                            int intValue = ((Integer) obj2).intValue();
                            ReadRow$lambda$2 = ReadRowKt.ReadRow$lambda$2(str, str2, str3, tVar4, list3, listeningProgress, z6, z10, z11, str4, pVar3, pVar2, i10, i11, i12, (u2.m) obj, intValue);
                            return ReadRow$lambda$2;
                        }
                    };
                    return;
                }
                return;
            }
            list2 = list;
            if ((i10 & 196608) == 0) {
            }
            if ((i10 & 1572864) == 0) {
            }
            if ((i10 & 12582912) == 0) {
            }
            if ((i10 & 100663296) == 0) {
            }
            if ((i10 & 805306368) == 0) {
            }
            i17 = i12 & UserMetadata.MAX_ATTRIBUTE_SIZE;
            if (i17 != 0) {
            }
            if ((i11 & 48) == 0) {
            }
            int i312 = i19;
            if ((i13 & 306783379) != 306783378) {
            }
            z12 = true;
            if (qVar.O(i13 & 1, z12)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        tVar2 = tVar;
        i15 = i12 & 16;
        if (i15 == 0) {
        }
        list2 = list;
        if ((i10 & 196608) == 0) {
        }
        if ((i10 & 1572864) == 0) {
        }
        if ((i10 & 12582912) == 0) {
        }
        if ((i10 & 100663296) == 0) {
        }
        if ((i10 & 805306368) == 0) {
        }
        i17 = i12 & UserMetadata.MAX_ATTRIBUTE_SIZE;
        if (i17 != 0) {
        }
        if ((i11 & 48) == 0) {
        }
        int i3122 = i19;
        if ((i13 & 306783379) != 306783378) {
        }
        z12 = true;
        if (qVar.O(i13 & 1, z12)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final sn.z ReadRow$lambda$0(ho.p pVar, String str, String str2, String str3, String str4, ListeningProgress listeningProgress, List list, boolean z6, boolean z10, r1.y yVar, u2.m mVar, int i10) {
        boolean z11;
        yVar.getClass();
        if ((i10 & 17) != 16) {
            z11 = true;
        } else {
            z11 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z11)) {
            i3.q qVar2 = i3.q.f13017a;
            if (pVar != null) {
                qVar.X(-1828951525);
                pVar.invoke(qVar, 0);
                r1.d.g(p2.f(qVar2, EchoTheme.INSTANCE.getSpacings(qVar, EchoTheme.$stable).getX1()), qVar);
                qVar.p(false);
            } else {
                qVar.X(-1828842932);
                qVar.p(false);
            }
            if (str != null && !wq.n.m0(str)) {
                qVar.X(-1828790759);
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                int i11 = EchoTheme.$stable;
                m1090ReadRowSecondaryTextFNF3uiM(str, 0, echoTheme.getColors(qVar, i11).getText().getSecondary(qVar, EchoThemeColors.Text.$stable), qVar, 0, 2);
                r1.d.g(p2.f(qVar2, echoTheme.getSpacings(qVar, i11).getX1()), qVar);
                qVar.p(false);
            } else {
                qVar.X(-1828557236);
                qVar.p(false);
            }
            ReadRowPrimaryText(str2, qVar, 0);
            if (!wq.n.m0(str3)) {
                qVar.X(-1828464825);
                EchoTheme echoTheme2 = EchoTheme.INSTANCE;
                int i12 = EchoTheme.$stable;
                r1.d.g(p2.f(qVar2, echoTheme2.getSpacings(qVar, i12).getX1()), qVar);
                j7.d(str3, null, echoTheme2.getColors(qVar, i12).getText().getCriticalPrimary(qVar, EchoThemeColors.Text.$stable), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme2.getTypography(qVar, i12).getSmRegular400(qVar, EchoThemeTypography.$stable), qVar, 0, 0, 131066);
                qVar.p(false);
            } else {
                qVar.X(-1828159940);
                if (str4 != null && !wq.n.m0(str4)) {
                    qVar.X(-1828120384);
                    r1.d.g(p2.f(qVar2, EchoTheme.INSTANCE.getSpacings(qVar, EchoTheme.$stable).getX1()), qVar);
                    m1090ReadRowSecondaryTextFNF3uiM(str4, 2, 0L, qVar, 48, 4);
                    qVar.p(false);
                } else {
                    qVar.X(-1827955092);
                    qVar.p(false);
                }
                r1.d.g(p2.f(qVar2, EchoTheme.INSTANCE.getSpacings(qVar, EchoTheme.$stable).getX1()), qVar);
                ReadStatusRow(listeningProgress, list, z6, z10, qVar, 0);
                qVar.p(false);
            }
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ReadRow$lambda$1(boolean z6, u2.m mVar, int i10) {
        boolean z10;
        if ((i10 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z10)) {
            if (z6) {
                qVar.X(-1099046164);
                UnreadIndicatorKt.UnreadIndicator(qVar, 0);
                qVar.p(false);
            } else {
                qVar.X(-1098999075);
                qVar.p(false);
            }
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ReadRow$lambda$2(String str, String str2, String str3, i3.t tVar, List list, ListeningProgress listeningProgress, boolean z6, boolean z10, boolean z11, String str4, ho.p pVar, ho.p pVar2, int i10, int i11, int i12, u2.m mVar, int i13) {
        ReadRow(str, str2, str3, tVar, list, listeningProgress, z6, z10, z11, str4, pVar, pVar2, mVar, u2.r.M(i10 | 1), u2.r.M(i11), i12);
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ReadRowContainer(i3.t tVar, ho.p pVar, ho.q qVar, ho.p pVar2, u2.m mVar, int i10, int i11) {
        i3.t tVar2;
        int i12;
        int i13;
        ho.p pVar3;
        int i14;
        boolean z6;
        i3.t tVar3;
        ho.p pVar4;
        r1 r10;
        ho.p pVar5;
        int i15;
        int i16;
        pVar.getClass();
        qVar.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(2107682945);
        int i17 = i11 & 1;
        if (i17 != 0) {
            i12 = i10 | 6;
            tVar2 = tVar;
        } else if ((i10 & 6) == 0) {
            tVar2 = tVar;
            if (qVar2.f(tVar2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            tVar2 = tVar;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(pVar)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i12 |= i16;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.h(qVar)) {
                i15 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        int i18 = i11 & 8;
        if (i18 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            pVar3 = pVar2;
            if (qVar2.h(pVar3)) {
                i14 = 2048;
            } else {
                i14 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i14;
            if ((i12 & 1171) == 1170) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar2.O(i12 & 1, z6)) {
                i3.q qVar3 = i3.q.f13017a;
                if (i17 != 0) {
                    tVar2 = qVar3;
                }
                if (i18 != 0) {
                    pVar5 = ComposableSingletons$ReadRowKt.INSTANCE.getLambda$1614798037$app_productionRelease();
                } else {
                    pVar5 = pVar3;
                }
                i3.t e10 = p2.e(tVar2, 1.0f);
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                int i19 = EchoTheme.$stable;
                i3.t F = r1.d.F(e10, echoTheme.getSpacings(qVar2, i19).getX5(), echoTheme.getSpacings(qVar2, i19).getX4());
                k2 a10 = i2.a(r1.j.f29228a, i3.d.f13005z0, qVar2, 48);
                int hashCode = Long.hashCode(qVar2.T);
                c3.o l4 = qVar2.l();
                i3.t c5 = i3.a.c(F, qVar2);
                h4.h.f11920i.getClass();
                h4.f fVar = h4.g.f11903b;
                qVar2.b0();
                if (qVar2.S) {
                    qVar2.k(fVar);
                } else {
                    qVar2.k0();
                }
                h4.e eVar = h4.g.f11907f;
                u2.r.J(eVar, a10, qVar2);
                h4.e eVar2 = h4.g.f11906e;
                u2.r.J(eVar2, l4, qVar2);
                Integer valueOf = Integer.valueOf(hashCode);
                h4.e eVar3 = h4.g.f11908g;
                u2.r.y(qVar2, valueOf, eVar3);
                h4.d dVar = h4.g.f11909h;
                u2.r.F(dVar, qVar2);
                i3.t tVar4 = tVar2;
                h4.e eVar4 = h4.g.f11905d;
                u2.r.J(eVar4, c5, qVar2);
                int i20 = i12 >> 3;
                pVar.invoke(qVar2, Integer.valueOf(i20 & 14));
                r1.d.g(p2.s(qVar3, echoTheme.getSpacings(qVar2, i19).getX3()), qVar2);
                if (1.0f <= 0.0d) {
                    s1.a.a("invalid weight; must be greater than zero");
                }
                m1 m1Var = new m1(1.0f, true);
                r1.x a11 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar2, 0);
                ho.p pVar6 = pVar5;
                int hashCode2 = Long.hashCode(qVar2.T);
                c3.o l7 = qVar2.l();
                i3.t c10 = i3.a.c(m1Var, qVar2);
                qVar2.b0();
                if (qVar2.S) {
                    qVar2.k(fVar);
                } else {
                    qVar2.k0();
                }
                u2.r.J(eVar, a11, qVar2);
                u2.r.J(eVar2, l7, qVar2);
                defpackage.f.u(hashCode2, qVar2, eVar3, qVar2, dVar);
                u2.r.J(eVar4, c10, qVar2);
                qVar.invoke(r1.z.f29398a, qVar2, Integer.valueOf((i20 & 112) | 6));
                qVar2.p(true);
                j0.c.q((i12 >> 9) & 14, pVar6, qVar2, true);
                pVar4 = pVar6;
                tVar3 = tVar4;
            } else {
                qVar2.R();
                tVar3 = tVar2;
                pVar4 = pVar3;
            }
            r10 = qVar2.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.core.l(tVar3, pVar, qVar, pVar4, i10, i11, 1);
                return;
            }
            return;
        }
        pVar3 = pVar2;
        if ((i12 & 1171) == 1170) {
        }
        if (!qVar2.O(i12 & 1, z6)) {
        }
        r10 = qVar2.r();
        if (r10 == null) {
        }
    }

    public static final sn.z ReadRowContainer$lambda$1(i3.t tVar, ho.p pVar, ho.q qVar, ho.p pVar2, int i10, int i11, u2.m mVar, int i12) {
        ReadRowContainer(tVar, pVar, qVar, pVar2, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void ReadRowPrimaryText(String str, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        u2.q qVar;
        int i12;
        str.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(365413203);
        if ((i10 & 6) == 0) {
            if (qVar2.f(str)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i10 | i12;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar2.O(i11 & 1, z6)) {
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i13 = EchoTheme.$stable;
            qVar = qVar2;
            j7.d(str, null, echoTheme.getColors(qVar2, i13).getText().getPrimary(qVar2, EchoThemeColors.Text.$stable), 0L, null, 0L, null, 0L, 2, false, 2, 0, null, echoTheme.getTypography(qVar2, i13).getBaseRegular500(qVar2, EchoThemeTypography.$stable), qVar, i11 & 14, 24960, 110586);
        } else {
            qVar = qVar2;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new q0(str, i10, 0);
        }
    }

    public static final sn.z ReadRowPrimaryText$lambda$0(String str, int i10, u2.m mVar, int i11) {
        ReadRowPrimaryText(str, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0055  */
    /* renamed from: ReadRowSecondaryText-FNF3uiM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1090ReadRowSecondaryTextFNF3uiM(final String str, int i10, long j4, u2.m mVar, final int i11, final int i12) {
        int i13;
        int i14;
        int i15;
        long j10;
        boolean z6;
        u2.q qVar;
        final int i16;
        final long j11;
        r1 r10;
        long j12;
        int i17;
        int i18;
        int i19;
        str.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(1799019403);
        if ((i11 & 6) == 0) {
            if (qVar2.f(str)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i13 = i19 | i11;
        } else {
            i13 = i11;
        }
        int i20 = i12 & 2;
        if (i20 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i14 = i10;
            if (qVar2.d(i14)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i13 |= i15;
            if ((i11 & 384) != 0) {
                if ((i12 & 4) == 0) {
                    j10 = j4;
                    if (qVar2.e(j10)) {
                        i18 = RpcError.MAX_MESSAGE_BYTES;
                        i13 |= i18;
                    }
                } else {
                    j10 = j4;
                }
                i18 = 128;
                i13 |= i18;
            } else {
                j10 = j4;
            }
            int i21 = 1;
            if ((i13 & 147) == 146) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar2.O(i13 & 1, z6)) {
                qVar2.T();
                if ((i11 & 1) != 0 && !qVar2.y()) {
                    qVar2.R();
                    if ((i12 & 4) != 0) {
                        i13 &= -897;
                    }
                    i17 = i14;
                    j12 = j10;
                } else {
                    if (i20 == 0) {
                        i21 = i14;
                    }
                    if ((i12 & 4) != 0) {
                        i13 &= -897;
                        j12 = EchoTheme.INSTANCE.getColors(qVar2, EchoTheme.$stable).getText().getTertiary(qVar2, EchoThemeColors.Text.$stable);
                    } else {
                        j12 = j10;
                    }
                    i17 = i21;
                }
                qVar2.q();
                qVar = qVar2;
                j7.d(str, null, j12, 0L, null, 0L, null, 0L, 2, false, i17, 0, null, EchoTheme.INSTANCE.getTypography(qVar2, EchoTheme.$stable).getSmRegular400(qVar2, EchoThemeTypography.$stable), qVar, i13 & 910, ((i13 << 9) & 57344) | 384, 110586);
                j11 = j12;
                i16 = i17;
            } else {
                qVar = qVar2;
                qVar.R();
                i16 = i14;
                j11 = j10;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new ho.p() { // from class: io.elevenlabs.readerapp.ui.components.p0
                    @Override // ho.p
                    public final Object invoke(Object obj, Object obj2) {
                        sn.z ReadRowSecondaryText_FNF3uiM$lambda$0;
                        int intValue = ((Integer) obj2).intValue();
                        ReadRowSecondaryText_FNF3uiM$lambda$0 = ReadRowKt.ReadRowSecondaryText_FNF3uiM$lambda$0(str, i16, j11, i11, i12, (u2.m) obj, intValue);
                        return ReadRowSecondaryText_FNF3uiM$lambda$0;
                    }
                };
                return;
            }
            return;
        }
        i14 = i10;
        if ((i11 & 384) != 0) {
        }
        int i212 = 1;
        if ((i13 & 147) == 146) {
        }
        if (!qVar2.O(i13 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z ReadRowSecondaryText_FNF3uiM$lambda$0(String str, int i10, long j4, int i11, int i12, u2.m mVar, int i13) {
        m1090ReadRowSecondaryTextFNF3uiM(str, i10, j4, mVar, u2.r.M(i11 | 1), i12);
        return sn.z.f31622a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v18 */
    public static final void ReadStatusRow(ListeningProgress listeningProgress, List<CaptionItem> list, boolean z6, boolean z10, u2.m mVar, int i10) {
        int i11;
        List<CaptionItem> list2;
        boolean z11;
        u2.q qVar;
        String formatDuration;
        String str;
        i3.q qVar2;
        ?? r22;
        u2.q qVar3;
        String str2;
        i3.q qVar4;
        ?? r23;
        u2.q qVar5;
        boolean z12;
        char c5;
        i3.k kVar;
        boolean z13;
        long j4;
        int i12;
        int i13;
        int i14;
        int i15;
        i3.k kVar2 = i3.d.f13005z0;
        listeningProgress.getClass();
        list.getClass();
        u2.q qVar6 = (u2.q) mVar;
        qVar6.Z(-210631019);
        if ((i10 & 6) == 0) {
            if (qVar6.h(listeningProgress)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i11 = i15 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            list2 = list;
            if (qVar6.h(list2)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i11 |= i14;
        } else {
            list2 = list;
        }
        if ((i10 & 384) == 0) {
            if (qVar6.g(z6)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i11 |= i13;
        }
        if ((i10 & 3072) == 0) {
            if (qVar6.g(z10)) {
                i12 = 2048;
            } else {
                i12 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i12;
        }
        if ((i11 & 1171) != 1170) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (qVar6.O(i11 & 1, z11)) {
            if (listeningProgress.getCurrentUnits() == 0.0d || listeningProgress.isAtEnd()) {
                qVar6.X(38772617);
                formatDuration = formatDuration(listeningProgress, listeningProgress.getTotalUnits(), qVar6, i11 & 14);
                qVar6.p(false);
            } else {
                qVar6.X(38864718);
                formatDuration = defpackage.f.B(NumberFormatterKt.formatInteger(listeningProgress.getProgressPercent(), (u2.m) qVar6, 0), Separators.PERCENT) + " • " + kj.c.Q(R.string.common_time_left, new Object[]{formatDuration(listeningProgress, listeningProgress.getRemainingUnits(), qVar6, i11 & 14)}, qVar6);
                qVar6.p(false);
            }
            char c10 = '0';
            k2 a10 = i2.a(r1.j.f29228a, kVar2, qVar6, 48);
            int hashCode = Long.hashCode(qVar6.T);
            c3.o l4 = qVar6.l();
            i3.q qVar7 = i3.q.f13017a;
            i3.t c11 = i3.a.c(qVar7, qVar6);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar6.b0();
            if (qVar6.S) {
                qVar6.k(fVar);
            } else {
                qVar6.k0();
            }
            u2.r.J(h4.g.f11907f, a10, qVar6);
            u2.r.J(h4.g.f11906e, l4, qVar6);
            u2.r.y(qVar6, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar6);
            u2.r.J(h4.g.f11905d, c11, qVar6);
            if (!list2.isEmpty()) {
                qVar6.X(884794487);
                qVar6.X(1552563060);
                int i16 = 0;
                u2.q qVar8 = qVar6;
                for (Object obj : list2) {
                    int i17 = i16 + 1;
                    if (i16 >= 0) {
                        CaptionItem captionItem = (CaptionItem) obj;
                        if (i16 > 0) {
                            qVar8.X(-1320472164);
                            EchoTheme echoTheme = EchoTheme.INSTANCE;
                            int i18 = EchoTheme.$stable;
                            u2.q qVar9 = qVar8;
                            str2 = formatDuration;
                            r23 = 0;
                            qVar4 = qVar7;
                            j7.d(" • ", null, echoTheme.getColors(qVar8, i18).getText().getTertiary(qVar8, EchoThemeColors.Text.$stable), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar8, i18).getSmRegular400(qVar8, EchoThemeTypography.$stable), qVar9, 6, 0, 131066);
                            u2.q qVar10 = qVar9;
                            qVar10.p(false);
                            qVar5 = qVar10;
                        } else {
                            str2 = formatDuration;
                            qVar4 = qVar7;
                            r23 = 0;
                            qVar8.X(-1320265952);
                            qVar8.p(false);
                            qVar5 = qVar8;
                        }
                        k2 a11 = i2.a(r1.j.f29228a, kVar2, qVar5, 48);
                        int hashCode2 = Long.hashCode(qVar5.T);
                        c3.o l7 = qVar5.l();
                        i3.t c12 = i3.a.c(qVar4, qVar5);
                        h4.h.f11920i.getClass();
                        h4.f fVar2 = h4.g.f11903b;
                        qVar5.b0();
                        if (qVar5.S) {
                            qVar5.k(fVar2);
                        } else {
                            qVar5.k0();
                        }
                        u2.r.J(h4.g.f11907f, a11, qVar5);
                        u2.r.J(h4.g.f11906e, l7, qVar5);
                        u2.r.y(qVar5, Integer.valueOf(hashCode2), h4.g.f11908g);
                        u2.r.F(h4.g.f11909h, qVar5);
                        u2.r.J(h4.g.f11905d, c12, qVar5);
                        if (captionItem.getIconRes() != null) {
                            qVar5.X(1086383812);
                            u3.c M = kd.a.M(captionItem.getIconRes().intValue(), qVar5, r23);
                            p3.x m1028getIconTintQN2ZGVo = captionItem.m1028getIconTintQN2ZGVo();
                            if (m1028getIconTintQN2ZGVo == null) {
                                qVar5.X(-1073327226);
                                j4 = EchoTheme.INSTANCE.getColors(qVar5, EchoTheme.$stable).getText().getTertiary(qVar5, EchoThemeColors.Text.$stable);
                                qVar5.p(r23);
                            } else {
                                qVar5.X(-1073328435);
                                qVar5.p(r23);
                                j4 = m1028getIconTintQN2ZGVo.f26440a;
                            }
                            z12 = true;
                            c5 = 14;
                            y2.a(M, null, p2.o(r1.d.E(qVar4, 1), 14), j4, qVar5, u3.c.$stable | 432, 0);
                            if (!wq.n.m0(captionItem.getText())) {
                                qVar5.X(1086824229);
                                r1.d.g(p2.s(qVar4, 3), qVar5);
                                qVar5.p(r23);
                            } else {
                                qVar5.X(1086915524);
                                qVar5.p(r23);
                            }
                            qVar5.p(r23);
                        } else {
                            z12 = true;
                            c5 = 14;
                            qVar5.X(1086937348);
                            qVar5.p(r23);
                        }
                        if (!wq.n.m0(captionItem.getText())) {
                            qVar5.X(1087019436);
                            String text = captionItem.getText();
                            EchoTheme echoTheme2 = EchoTheme.INSTANCE;
                            int i19 = EchoTheme.$stable;
                            u2.m mVar2 = qVar5;
                            kVar = kVar2;
                            z13 = z12;
                            j7.d(text, null, echoTheme2.getColors(qVar5, i19).getText().getTertiary(qVar5, EchoThemeColors.Text.$stable), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme2.getTypography(qVar5, i19).getSmRegular400(qVar5, EchoThemeTypography.$stable), mVar2, 0, 0, 131066);
                            qVar5 = mVar2;
                            qVar5.p(r23);
                        } else {
                            kVar = kVar2;
                            z13 = z12;
                            qVar5.X(1087248836);
                            qVar5.p(r23);
                        }
                        qVar5.p(z13);
                        c10 = '0';
                        formatDuration = str2;
                        qVar7 = qVar4;
                        i16 = i17;
                        kVar2 = kVar;
                        qVar8 = qVar5;
                    } else {
                        ig.f.U();
                        throw null;
                    }
                }
                str = formatDuration;
                qVar2 = qVar7;
                r22 = 0;
                qVar8.p(false);
                EchoTheme echoTheme3 = EchoTheme.INSTANCE;
                int i20 = EchoTheme.$stable;
                u2.q qVar11 = qVar8;
                j7.d(" • ", null, echoTheme3.getColors(qVar8, i20).getText().getTertiary(qVar8, EchoThemeColors.Text.$stable), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme3.getTypography(qVar8, i20).getSmRegular400(qVar8, EchoThemeTypography.$stable), qVar11, 6, 0, 131066);
                u2.q qVar12 = qVar11;
                qVar12.p(false);
                qVar3 = qVar12;
            } else {
                str = formatDuration;
                qVar2 = qVar7;
                r22 = 0;
                qVar6.X(886287881);
                qVar6.p(false);
                qVar3 = qVar6;
            }
            EchoTheme echoTheme4 = EchoTheme.INSTANCE;
            int i21 = EchoTheme.$stable;
            u2.q qVar13 = qVar3;
            j7.d(str, null, echoTheme4.getColors(qVar3, i21).getText().getTertiary(qVar3, EchoThemeColors.Text.$stable), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, echoTheme4.getTypography(qVar3, i21).getSmRegular400(qVar3, EchoThemeTypography.$stable), qVar13, 0, 24960, 110586);
            u2.q qVar14 = qVar13;
            if (!z6 && !listeningProgress.isAtEnd() && !z10) {
                qVar14.X(887204489);
                qVar14.p(r22);
            } else {
                qVar14.X(886608669);
                r1.d.g(p2.s(qVar2, echoTheme4.getSpacings(qVar14, i21).getX1()), qVar14);
                if (!z6 && !listeningProgress.isAtEnd()) {
                    qVar14.X(886931689);
                    qVar14.p(r22);
                } else {
                    qVar14.X(886716425);
                    y2.a(kd.a.M(io.elevenlabs.ui.R.drawable.circle_check, qVar14, r22), null, null, ReaderColors.INSTANCE.m2394getGreen5000d7_KjU(), qVar14, u3.c.$stable | 48, 4);
                    qVar14.p(r22);
                }
                if (z10) {
                    qVar14.X(886976422);
                    y2.a(kd.a.M(io.elevenlabs.ui.R.drawable.circle_download, qVar14, r22), null, null, ReaderColors.INSTANCE.m2394getGreen5000d7_KjU(), qVar14, u3.c.$stable | 48, 4);
                    qVar14.p(r22);
                } else {
                    qVar14.X(887194569);
                    qVar14.p(r22);
                }
                qVar14.p(r22);
            }
            qVar14.p(true);
            qVar = qVar14;
        } else {
            qVar6.R();
            qVar = qVar6;
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new o0(listeningProgress, list, z6, z10, i10);
        }
    }

    public static final sn.z ReadStatusRow$lambda$1(ListeningProgress listeningProgress, List list, boolean z6, boolean z10, int i10, u2.m mVar, int i11) {
        ReadStatusRow(listeningProgress, list, z6, z10, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final String formatDuration(ListeningProgress listeningProgress, double d10, u2.m mVar, int i10) {
        listeningProgress.getClass();
        if (listeningProgress.isAudioOnly()) {
            u2.q qVar = (u2.q) mVar;
            qVar.X(944995213);
            String formatSecondsAsDuration = MinutesFormatterKt.formatSecondsAsDuration(d10, qVar, (i10 >> 3) & 14);
            qVar.p(false);
            return formatSecondsAsDuration;
        }
        u2.q qVar2 = (u2.q) mVar;
        qVar2.X(945048068);
        String charCountToTextDuration = WordCountToLengthFormatterKt.charCountToTextDuration((long) d10, qVar2, 0);
        qVar2.p(false);
        return charCountToTextDuration;
    }
}
