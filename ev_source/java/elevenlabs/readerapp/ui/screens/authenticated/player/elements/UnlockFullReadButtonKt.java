package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements;

import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.j1;
import io.elevenlabs.ui.components.ButtonOutlinedKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import q2.y2;
import r1.l2;
import r1.p2;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u000f\u0010\u0007\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/Function0;", "Lsn/z;", "onClick", "Li3/t;", "modifier", "UnlockFullReadButton", "(Lho/a;Li3/t;Lu2/m;II)V", "Preview_UnlockFullReadButton", "(Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class UnlockFullReadButtonKt {
    public static final void Preview_UnlockFullReadButton(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1985486276);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new c(8);
                qVar.h0(L);
            }
            UnlockFullReadButton((ho.a) L, null, qVar, 6, 2);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new j1(i10, 25);
        }
    }

    public static final sn.z Preview_UnlockFullReadButton$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_UnlockFullReadButton(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void UnlockFullReadButton(ho.a aVar, i3.t tVar, u2.m mVar, int i10, int i11) {
        int i12;
        int i13;
        boolean z6;
        i3.t tVar2;
        i3.t tVar3;
        int i14;
        aVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1605724026);
        if ((i10 & 6) == 0) {
            if (qVar.h(aVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i10;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (qVar.f(tVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i12 & 1, z6)) {
            if (i15 != 0) {
                tVar3 = i3.q.f13017a;
            } else {
                tVar3 = tVar;
            }
            String R = kj.c.R(qVar, R.string.read_page_play_bar_get_full_read);
            int i16 = i12 << 3;
            ButtonOutlinedKt.ButtonOutlined(R, aVar, tVar3, null, c3.k.d(-1434365843, true, new r(R, 1), qVar), qVar, (i16 & 112) | 24576 | (i16 & 896), 8);
            tVar2 = tVar3;
        } else {
            qVar.R();
            tVar2 = tVar;
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new im.b(aVar, tVar2, i10, i11, 3);
        }
    }

    public static final sn.z UnlockFullReadButton$lambda$0(String str, l2 l2Var, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        l2Var.getClass();
        if ((i10 & 6) == 0) {
            if (((u2.q) mVar).f(l2Var)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i10 | i12;
        } else {
            i11 = i10;
        }
        if ((i11 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i11 & 1, z6)) {
            u3.c M = kd.a.M(io.elevenlabs.ui.R.drawable.plus, qVar, 0);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i13 = ElevenLabsTheme.$stable;
            long b10 = defpackage.f.b(elevenLabsTheme, qVar, i13);
            i3.q qVar2 = i3.q.f13017a;
            y2.a(M, null, p2.f(qVar2, 22), b10, qVar, u3.c.$stable | 432, 0);
            r1.d.g(p2.s(qVar2, elevenLabsTheme.getSpacings(qVar, i13).m2353getX2D9Ej5fM()), qVar);
            j7.d(str, l2Var.b(qVar2, 1.0f, true), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, elevenLabsTheme.getTypo(qVar, i13).getSubtitleMedium700(), qVar, 0, 24960, 110588);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z UnlockFullReadButton$lambda$1(ho.a aVar, i3.t tVar, int i10, int i11, u2.m mVar, int i12) {
        UnlockFullReadButton(aVar, tVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }
}
