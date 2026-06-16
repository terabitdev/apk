package io.elevenlabs.readerapp.ui.screens.authenticated.series;

import a2.i3;
import android.gov.nist.javax.sip.parser.TokenNames;
import c3.o;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import f4.e1;
import f4.f1;
import f4.g1;
import f4.h1;
import f4.s1;
import h4.g;
import h5.h;
import ho.p;
import i3.t;
import io.elevenlabs.readerapp.ui.components.explore.BookCoverSize;
import io.elevenlabs.readerapp.ui.components.explore.ExploreBookCoverKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.assistant.r;
import io.elevenlabs.ui.echo.EchoTheme;
import io.livekit.android.rpc.RpcError;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p3.h0;
import p3.i0;
import p3.x;
import p3.y0;
import p4.b0;
import r1.p2;
import sn.z;
import t2.u;
import u2.l;
import u2.m;
import u2.q;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a)\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a9\u0010\u000e\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0010\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0012\u0010\u0011\u001a\u000f\u0010\u0013\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0013\u0010\u0011\"\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001a\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019\"\u0014\u0010\u001b\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019\"\u0014\u0010\u001c\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019\"\u0014\u0010\u001d\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019\"\u0014\u0010\u001e\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019\"\u0014\u0010\u001f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019\"\u0014\u0010 \u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019\"\u0014\u0010!\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019¨\u0006\""}, d2 = {"", "", "coverImageUrls", "Li3/t;", "modifier", "Lsn/z;", "StackedBookCovers", "(Ljava/util/List;Li3/t;Lu2/m;II)V", "imageUrl", "", "scale", "xOffset", "yOffset", "z", "Cover", "(Ljava/lang/String;FFFFLu2/m;I)V", "Preview_StackedBookCovers_1", "(Lu2/m;I)V", "Preview_StackedBookCovers_3", "Preview_StackedBookCovers_5", "Lio/elevenlabs/readerapp/ui/components/explore/BookCoverSize;", "CoverSize", "Lio/elevenlabs/readerapp/ui/components/explore/BookCoverSize;", "Lh5/f;", "CoverWidth", TokenNames.F, "VISIBLE_HEIGHT_FRACTION", "CENTER_WIDTH_DP", "LAYER_SCALE_STEP", "CenterScale", "InnerScale", "OuterScale", "LayerVerticalOffset", "LayerPeekWidth", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class StackedBookCoversKt {
    private static final float CENTER_WIDTH_DP = 160.0f;
    private static final float CenterScale;
    private static final BookCoverSize CoverSize;
    private static final float CoverWidth;
    private static final float InnerScale;
    private static final float LAYER_SCALE_STEP = 0.16666667f;
    private static final float LayerPeekWidth;
    private static final float LayerVerticalOffset;
    private static final float OuterScale;
    private static final float VISIBLE_HEIGHT_FRACTION = 0.7f;

    static {
        BookCoverSize bookCoverSize = BookCoverSize.Large;
        CoverSize = bookCoverSize;
        float b10 = h.b(bookCoverSize.getSize());
        CoverWidth = b10;
        float f10 = CENTER_WIDTH_DP / b10;
        CenterScale = f10;
        InnerScale = 0.8333333f * f10;
        OuterScale = f10 * 0.6666666f;
        LayerVerticalOffset = 20;
        LayerPeekWidth = 32;
    }

    private static final void Cover(final String str, final float f10, final float f11, final float f12, final float f13, m mVar, final int i10) {
        String str2;
        int i11;
        boolean z6;
        q qVar;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        q qVar2 = (q) mVar;
        qVar2.Z(434870946);
        if ((i10 & 6) == 0) {
            str2 = str;
            if (qVar2.f(str2)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i11 = i16 | i10;
        } else {
            str2 = str;
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.c(f10)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i11 |= i15;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.c(f11)) {
                i14 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i14 = 128;
            }
            i11 |= i14;
        }
        if ((i10 & 3072) == 0) {
            if (qVar2.c(f12)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i13;
        }
        if ((i10 & 24576) == 0) {
            if (qVar2.c(f13)) {
                i12 = 16384;
            } else {
                i12 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i11 |= i12;
        }
        boolean z10 = false;
        if ((i11 & 9363) != 9362) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar2.O(i11 & 1, z6)) {
            BookCoverSize bookCoverSize = CoverSize;
            long j4 = x.f26437l;
            t A = r1.d.A(i3.a.d(i3.q.f13017a, f13), f11, f12);
            if ((i11 & 112) == 32) {
                z10 = true;
            }
            Object L = qVar2.L();
            if (z10 || L == l.f33918a) {
                L = new r(f10, 3);
                qVar2.h0(L);
            }
            qVar = qVar2;
            ExploreBookCoverKt.m1163ExploreBookCoverB29P9lA(str2, bookCoverSize, h0.r(A, (ho.l) L), u.P, false, false, j4, j4, null, null, null, false, null, null, false, null, qVar, (i11 & 14) | 14155824, 0, 65336);
        } else {
            qVar = qVar2;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.series.f
                @Override // ho.p
                public final Object invoke(Object obj, Object obj2) {
                    z Cover$lambda$1;
                    int intValue = ((Integer) obj2).intValue();
                    Cover$lambda$1 = StackedBookCoversKt.Cover$lambda$1(str, f10, f11, f12, f13, i10, (m) obj, intValue);
                    return Cover$lambda$1;
                }
            };
        }
    }

    public static final z Cover$lambda$0$0(float f10, i0 i0Var) {
        i0Var.getClass();
        y0 y0Var = (y0) i0Var;
        y0Var.r(f10);
        y0Var.s(f10);
        y0Var.z(h0.j(0.5f, 1.0f));
        return z.f31622a;
    }

    public static final z Cover$lambda$1(String str, float f10, float f11, float f12, float f13, int i10, m mVar, int i11) {
        Cover(str, f10, f11, f12, f13, mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_StackedBookCovers_1(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1466501821);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$StackedBookCoversKt.INSTANCE.getLambda$872696233$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.u(i10, 25);
        }
    }

    public static final z Preview_StackedBookCovers_1$lambda$0(int i10, m mVar, int i11) {
        Preview_StackedBookCovers_1(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_StackedBookCovers_3(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1944956485);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$StackedBookCoversKt.INSTANCE.m1742getLambda$10812757$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.u(i10, 24);
        }
    }

    public static final z Preview_StackedBookCovers_3$lambda$0(int i10, m mVar, int i11) {
        Preview_StackedBookCovers_3(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_StackedBookCovers_5(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1061447495);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$StackedBookCoversKt.INSTANCE.m1745getLambda$894321747$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.u(i10, 26);
        }
    }

    public static final z Preview_StackedBookCovers_5$lambda$0(int i10, m mVar, int i11) {
        Preview_StackedBookCovers_5(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void StackedBookCovers(List<String> list, t tVar, m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        boolean z6;
        t tVar3;
        r1 r10;
        t tVar4;
        float f10;
        int i14;
        list.getClass();
        q qVar = (q) mVar;
        qVar.Z(-93529481);
        if ((i10 & 6) == 0) {
            if (qVar.h(list)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i10 | i14;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            if ((i12 & 19) == 18) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar.O(i12 & 1, z6)) {
                if (i15 != 0) {
                    tVar4 = i3.q.f13017a;
                } else {
                    tVar4 = tVar2;
                }
                float f11 = CoverWidth;
                float f12 = InnerScale;
                float f13 = (f11 * f12) / 2.0f;
                float f14 = OuterScale;
                float f15 = LayerPeekWidth;
                float f16 = 80.0f + f15;
                float f17 = f15 + f16;
                float f18 = f16 - f13;
                float f19 = f17 - ((f11 * f14) / 2.0f);
                float f20 = 2;
                float f21 = f17 * f20;
                Object L = qVar.L();
                u2.e eVar = l.f33918a;
                if (L == eVar) {
                    L = new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections.d(9);
                    qVar.h0(L);
                }
                t d10 = m3.h.d(p2.s(p4.q.b(tVar4, (ho.l) L), f21));
                Object L2 = qVar.L();
                if (L2 == eVar) {
                    L2 = new io.elevenlabs.readerapp.ui.screens.authenticated.agent.components.f(18);
                    qVar.h0(L2);
                }
                t m10 = f4.i0.m((ho.q) L2, d10);
                f1 d11 = r1.p.d(i3.d.f13001e, false);
                int hashCode = Long.hashCode(qVar.T);
                o l4 = qVar.l();
                t c5 = i3.a.c(m10, qVar);
                h4.h.f11920i.getClass();
                h4.f fVar = g.f11903b;
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                u2.r.J(g.f11907f, d11, qVar);
                u2.r.J(g.f11906e, l4, qVar);
                u2.r.y(qVar, Integer.valueOf(hashCode), g.f11908g);
                u2.r.F(g.f11909h, qVar);
                u2.r.J(g.f11905d, c5, qVar);
                String str = (String) tn.o.z0(4, list);
                if (str == null) {
                    qVar.X(1585590593);
                    qVar.p(false);
                } else {
                    qVar.X(1585590594);
                    Cover(str, f14, -f19, (-LayerVerticalOffset) * f20, u.P, qVar, 24624);
                    qVar.p(false);
                }
                String str2 = (String) tn.o.z0(3, list);
                if (str2 == null) {
                    qVar.X(1585865346);
                    qVar.p(false);
                } else {
                    qVar.X(1585865347);
                    Cover(str2, f14, f19, (-LayerVerticalOffset) * f20, 1.0f, qVar, 24624);
                    qVar.p(false);
                }
                String str3 = (String) tn.o.z0(2, list);
                if (str3 == null) {
                    qVar.X(1586139045);
                    qVar.p(false);
                    f10 = f12;
                } else {
                    qVar.X(1586139046);
                    f10 = f12;
                    Cover(str3, f10, -f18, -LayerVerticalOffset, 2.0f, qVar, 24624);
                    qVar.p(false);
                }
                String str4 = (String) tn.o.z0(1, list);
                if (str4 == null) {
                    qVar.X(1586409830);
                    qVar.p(false);
                } else {
                    qVar.X(1586409831);
                    Cover(str4, f10, f18, -LayerVerticalOffset, 3.0f, qVar, 24624);
                    qVar.p(false);
                }
                String str5 = (String) tn.o.z0(0, list);
                if (str5 == null) {
                    qVar.X(1586675562);
                    qVar.p(false);
                } else {
                    qVar.X(1586675563);
                    Cover(str5, CenterScale, u.P, u.P, 4.0f, qVar, 28080);
                    qVar.p(false);
                }
                qVar.p(true);
                tVar3 = tVar4;
            } else {
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new e(list, tVar3, i10, i11, 0);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i12 & 19) == 18) {
        }
        if (!qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z StackedBookCovers$lambda$0$0(b0 b0Var) {
        b0Var.getClass();
        return z.f31622a;
    }

    public static final g1 StackedBookCovers$lambda$1$0(h1 h1Var, e1 e1Var, h5.a aVar) {
        h1Var.getClass();
        e1Var.getClass();
        s1 V = e1Var.V(h5.a.a(aVar.f12077a, 0, 0, 0, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, 7));
        return h1Var.Z(V.f8868a, jo.a.y(V.f8869b * 0.7f), tn.u.f33548a, new i3(V, 1));
    }

    public static final z StackedBookCovers$lambda$1$0$0(s1 s1Var, f4.r1 r1Var) {
        r1Var.getClass();
        r1Var.k(s1Var, 0, 0, u.P);
        return z.f31622a;
    }

    public static final z StackedBookCovers$lambda$3(List list, t tVar, int i10, int i11, m mVar, int i12) {
        StackedBookCovers(list, tVar, mVar, u2.r.M(i10 | 1), i11);
        return z.f31622a;
    }
}
