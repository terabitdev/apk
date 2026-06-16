package io.elevenlabs.readerapp.ui.components.homev3;

import c3.o;
import com.google.firebase.messaging.Constants;
import e5.k;
import fm.e;
import h4.f;
import h4.g;
import h4.h;
import ho.l;
import i3.a;
import i3.t;
import ib.i;
import io.elevenlabs.domain.model.EmptyStateSection;
import io.elevenlabs.ui.components.ButtonKt;
import io.elevenlabs.ui.components.ButtonSize;
import io.elevenlabs.ui.components.ButtonVariant;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.elevenlabs.ui.theme.ElevenLabsThemeKt;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import r1.d;
import r1.j;
import r1.p2;
import r1.w;
import r1.x;
import sn.z;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a5\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/model/EmptyStateSection;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lkotlin/Function1;", "", "Lsn/z;", "onNavigateToDeeplink", "Li3/t;", "modifier", "EmptyStateSectionV3", "(Lio/elevenlabs/domain/model/EmptyStateSection;Lho/l;Li3/t;Lu2/m;II)V", "Preview_EmptyStateSectionV3", "(Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class EmptyStateSectionKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EmptyStateSectionV3(EmptyStateSection emptyStateSection, l lVar, t tVar, m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        boolean z6;
        t tVar3;
        r1 r10;
        t tVar4;
        boolean z10;
        int i14;
        int i15;
        emptyStateSection.getClass();
        lVar.getClass();
        q qVar = (q) mVar;
        qVar.Z(1647537809);
        if ((i10 & 6) == 0) {
            if (qVar.h(emptyStateSection)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(lVar)) {
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
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
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
                i3.q qVar2 = i3.q.f13017a;
                if (i16 != 0) {
                    tVar4 = qVar2;
                } else {
                    tVar4 = tVar2;
                }
                t e10 = p2.e(tVar4, 1.0f);
                ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                int i17 = ElevenLabsTheme.$stable;
                t F = d.F(e10, elevenLabsTheme.getSpacings(qVar, i17).m2357getX5D9Ej5fM(), elevenLabsTheme.getSpacings(qVar, i17).m2360getX8D9Ej5fM());
                x a10 = w.a(j.f29232e, i3.d.C0, qVar, 54);
                int hashCode = Long.hashCode(qVar.T);
                o l4 = qVar.l();
                t c5 = a.c(F, qVar);
                h.f11920i.getClass();
                f fVar = g.f11903b;
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                r.J(g.f11907f, a10, qVar);
                r.J(g.f11906e, l4, qVar);
                r.y(qVar, Integer.valueOf(hashCode), g.f11908g);
                r.F(g.f11909h, qVar);
                r.J(g.f11905d, c5, qVar);
                t tVar5 = tVar4;
                int i18 = i12;
                j7.d(emptyStateSection.getTitle(), null, defpackage.f.b(elevenLabsTheme, qVar, i17), 0L, null, 0L, new k(3), 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i17).getBodySmall700(), qVar, 0, 0, 130042);
                d.g(p2.f(qVar2, elevenLabsTheme.getSpacings(qVar, i17).m2350getX1D9Ej5fM()), qVar);
                j7.d(emptyStateSection.getSubtitle(), null, i.w(elevenLabsTheme, qVar, i17), 0L, null, 0L, new k(3), 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i17).getBodySmall500(), qVar, 0, 0, 130042);
                qVar = qVar;
                String buttonText = emptyStateSection.getButtonText();
                String deeplink = emptyStateSection.getDeeplink();
                if (buttonText != null && deeplink != null) {
                    qVar.X(-1595576024);
                    d.g(p2.f(qVar2, elevenLabsTheme.getSpacings(qVar, i17).m2357getX5D9Ej5fM()), qVar);
                    if ((i18 & 112) == 32) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    boolean f10 = qVar.f(deeplink) | z10;
                    Object L = qVar.L();
                    if (f10 || L == u2.l.f33918a) {
                        L = new fm.a(1, lVar, deeplink);
                        qVar.h0(L);
                    }
                    ButtonKt.Button(buttonText, (ho.a) L, qVar2, ButtonSize.Medium, ButtonVariant.Fifthernary, null, null, false, false, false, qVar, 28032, 992);
                    qVar.p(false);
                } else {
                    qVar.X(-1595238713);
                    qVar.p(false);
                }
                qVar.p(true);
                tVar3 = tVar5;
            } else {
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new fm.f(emptyStateSection, lVar, tVar3, i10, i11, 0);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i12 & 147) == 146) {
        }
        if (!qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z EmptyStateSectionV3$lambda$0$0$0(l lVar, String str) {
        lVar.invoke(str);
        return z.f31622a;
    }

    public static final z EmptyStateSectionV3$lambda$1(EmptyStateSection emptyStateSection, l lVar, t tVar, int i10, int i11, m mVar, int i12) {
        EmptyStateSectionV3(emptyStateSection, lVar, tVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void Preview_EmptyStateSectionV3(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1598042093);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$EmptyStateSectionKt.INSTANCE.m1169getLambda$1362111555$app_productionRelease(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new e(i10, 1);
        }
    }

    public static final z Preview_EmptyStateSectionV3$lambda$0(int i10, m mVar, int i11) {
        Preview_EmptyStateSectionV3(mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}
