package io.elevenlabs.readerapp.ui.components;

import io.elevenlabs.domain.model.MediaItemState;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import q2.y2;
import r1.i2;
import r1.k2;
import r1.p2;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u000f\u0010\u0005\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/domain/model/MediaItemState;", "mediaItemState", "Lsn/z;", "PlayerQueueActiveRow", "(Lio/elevenlabs/domain/model/MediaItemState;Lu2/m;I)V", "Preview_PlayerQueueActiveRow", "(Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class PlayerQueueRowKt {
    public static final void PlayerQueueActiveRow(MediaItemState mediaItemState, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        h4.f fVar;
        int i13;
        mediaItemState.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1180886237);
        if ((i10 & 6) == 0) {
            if (qVar.h(mediaItemState)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i10 | i13;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            i3.t e10 = p2.e(qVar2, 1.0f);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i14 = EchoTheme.$stable;
            i3.t e11 = ib.i.e(echoTheme, qVar, i14, e10);
            r1.u0 u0Var = r1.j.f29228a;
            r1.h y10 = ib.i.y(echoTheme, qVar, i14);
            i3.k kVar = i3.d.f13005z0;
            k2 a10 = i2.a(y10, kVar, qVar, 48);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(e11, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar2 = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar2);
            } else {
                qVar.k0();
            }
            h4.e eVar = h4.g.f11907f;
            u2.r.J(eVar, a10, qVar);
            h4.e eVar2 = h4.g.f11906e;
            u2.r.J(eVar2, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar3 = h4.g.f11908g;
            u2.r.y(qVar, valueOf, eVar3);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar);
            h4.e eVar4 = h4.g.f11905d;
            u2.r.J(eVar4, c5, qVar);
            ReadSmallRowKt.m1092ReadSmallRowAvatarDzVHIIc(mediaItemState.getCoverUrl(), t2.u.P, mediaItemState.getReadSource(), mediaItemState.getOriginalFileType(), qVar, 0, 2);
            i3.t e12 = p2.e(qVar2, 1.0f);
            r1.x a11 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c10 = i3.a.c(e12, qVar);
            qVar.b0();
            if (qVar.S) {
                fVar = fVar2;
                qVar.k(fVar);
            } else {
                fVar = fVar2;
                qVar.k0();
            }
            u2.r.J(eVar, a11, qVar);
            u2.r.J(eVar2, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c10, qVar);
            k2 a12 = i2.a(r1.j.g(echoTheme.getSpacings(qVar, i14).getX1()), kVar, qVar, 48);
            int hashCode3 = Long.hashCode(qVar.T);
            c3.o l10 = qVar.l();
            i3.t c11 = i3.a.c(qVar2, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar, a12, qVar);
            u2.r.J(eVar2, l10, qVar);
            defpackage.f.u(hashCode3, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c11, qVar);
            y2.a(kd.a.M(R.drawable.volume_full, qVar, 0), null, p2.o(qVar2, 16), echoTheme.getColors(qVar, i14).getIcon().getInactive(qVar, EchoThemeColors.Icon.$stable), qVar, u3.c.$stable | 432, 0);
            String R = kj.c.R(qVar, io.elevenlabs.readerapp.R.string.player_queue_listening_now_title);
            EchoThemeTypography typography = echoTheme.getTypography(qVar, i14);
            int i15 = EchoThemeTypography.$stable;
            s4.y0 smRegular400 = typography.getSmRegular400(qVar, i15);
            EchoThemeColors.Text text = echoTheme.getColors(qVar, i14).getText();
            int i16 = EchoThemeColors.Text.$stable;
            i12 = 1;
            j7.d(R, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, s4.y0.a(smRegular400, text.getSecondary(qVar, i16), 0L, null, null, null, 0L, 0, 0L, null, null, 16777214), qVar, 0, 24960, 110590);
            qVar.p(true);
            j7.d(mediaItemState.getTitle(), null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, s4.y0.a(echoTheme.getTypography(qVar, i14).getBaseRegular500(qVar, i15), ib.i.v(i14, i16, echoTheme, qVar, qVar), 0L, null, null, null, 0L, 0, 0L, null, null, 16777214), qVar, 0, 24960, 110590);
            qVar = qVar;
            qVar.p(true);
            qVar.p(true);
        } else {
            i12 = 1;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new em.a(mediaItemState, i10, i12);
        }
    }

    public static final sn.z PlayerQueueActiveRow$lambda$1(MediaItemState mediaItemState, int i10, u2.m mVar, int i11) {
        PlayerQueueActiveRow(mediaItemState, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_PlayerQueueActiveRow(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(473302764);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            i3.t h10 = l1.n.h(i3.q.f13017a, EchoTheme.INSTANCE.getColors(qVar, EchoTheme.$stable).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable), p3.h0.f26395b);
            f4.f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(h10, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(h4.g.f11907f, d10, qVar);
            u2.r.J(h4.g.f11906e, l4, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c5, qVar);
            PlayerQueueActiveRow(new MediaItemState("1", "The Origins of Efficiency", "Author", null, null, null), qVar, 0);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new q(i10, 16);
        }
    }

    public static final sn.z Preview_PlayerQueueActiveRow$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_PlayerQueueActiveRow(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
