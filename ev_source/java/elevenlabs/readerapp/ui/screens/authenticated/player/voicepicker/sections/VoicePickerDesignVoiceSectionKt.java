package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections;

import c3.o;
import f4.f1;
import h4.f;
import h4.g;
import h4.h;
import i3.k;
import i3.t;
import ib.i;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.e;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerContract;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.UltraBadgeKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.elevenlabs.ui.theme.ElevenLabsThemeKt;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import p3.h0;
import p4.b0;
import p4.y;
import q2.j7;
import q2.y2;
import r1.i2;
import r1.j;
import r1.k2;
import r1.p;
import r1.p2;
import r1.w;
import r1.x;
import sn.z;
import u2.l;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a9\u0010\b\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lt1/t;", "", "sectionTitle", "actionTitle", "actionSubtitle", "Lkotlin/Function0;", "Lsn/z;", "onNavigateToVoiceDesign", "voicePickerDesignVoiceSection", "(Lt1/t;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lho/a;)V", "title", "subtitle", "onClick", "VoiceDesignRow", "(Ljava/lang/String;Ljava/lang/String;Lho/a;Lu2/m;I)V", "Preview_VoiceDesignRow", "(Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class VoicePickerDesignVoiceSectionKt {
    public static final void Preview_VoiceDesignRow(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1364797724);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$VoicePickerDesignVoiceSectionKt.INSTANCE.m1615getLambda$990004686$app_productionRelease(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new e(i10, 23);
        }
    }

    public static final z Preview_VoiceDesignRow$lambda$0(int i10, m mVar, int i11) {
        Preview_VoiceDesignRow(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void VoiceDesignRow(String str, String str2, ho.a aVar, m mVar, int i10) {
        int i11;
        ho.a aVar2;
        boolean z6;
        int i12;
        int i13;
        int i14;
        str.getClass();
        str2.getClass();
        aVar.getClass();
        q qVar = (q) mVar;
        qVar.Z(-541765333);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.f(str2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            aVar2 = aVar;
            if (qVar.h(aVar2)) {
                i12 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        } else {
            aVar2 = aVar;
        }
        if ((i11 & 147) != 146) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            t p10 = n.p(p2.e(qVar2, 1.0f), false, null, null, null, aVar2, 15);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i15 = ElevenLabsTheme.$stable;
            t F = r1.d.F(p10, elevenLabsTheme.getSpacings(qVar, i15).m2357getX5D9Ej5fM(), elevenLabsTheme.getSpacings(qVar, i15).m2356getX4D9Ej5fM());
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.d(28);
                qVar.h0(L);
            }
            t c5 = p4.q.c(F, true, (ho.l) L);
            k kVar = i3.d.f13005z0;
            k2 a10 = i2.a(j.f29228a, kVar, qVar, 48);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c10 = i3.a.c(c5, qVar);
            h.f11920i.getClass();
            f fVar = g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            h4.e eVar = g.f11907f;
            r.J(eVar, a10, qVar);
            h4.e eVar2 = g.f11906e;
            r.J(eVar2, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar3 = g.f11908g;
            r.y(qVar, valueOf, eVar3);
            h4.d dVar = g.f11909h;
            r.F(dVar, qVar);
            int i16 = i11;
            h4.e eVar4 = g.f11905d;
            r.J(eVar4, c10, qVar);
            t h10 = n.h(m3.h.c(p2.o(qVar2, 48), z1.h.f39128a), defpackage.f.b(elevenLabsTheme, qVar, i15), h0.f26395b);
            f1 d10 = p.d(i3.d.f13001e, false);
            int hashCode2 = Long.hashCode(qVar.T);
            o l7 = qVar.l();
            t c11 = i3.a.c(h10, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(eVar, d10, qVar);
            r.J(eVar2, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
            r.J(eVar4, c11, qVar);
            y2.a(kd.a.M(R.drawable.plus, qVar, 0), null, p2.o(qVar2, 20), i.d(elevenLabsTheme, qVar, i15), qVar, u3.c.$stable | 432, 0);
            qVar.p(true);
            r1.d.g(p2.s(qVar2, elevenLabsTheme.getSpacings(qVar, i15).m2355getX3D9Ej5fM()), qVar);
            x a11 = w.a(j.f29230c, i3.d.B0, qVar, 0);
            int hashCode3 = Long.hashCode(qVar.T);
            o l10 = qVar.l();
            t c12 = i3.a.c(qVar2, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(eVar, a11, qVar);
            r.J(eVar2, l10, qVar);
            defpackage.f.u(hashCode3, qVar, eVar3, qVar, dVar);
            r.J(eVar4, c12, qVar);
            k2 a12 = i2.a(j.g(EchoTheme.INSTANCE.getRadii(qVar, EchoTheme.$stable).getLg()), kVar, qVar, 48);
            int hashCode4 = Long.hashCode(qVar.T);
            o l11 = qVar.l();
            t c13 = i3.a.c(qVar2, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(eVar, a12, qVar);
            r.J(eVar2, l11, qVar);
            defpackage.f.u(hashCode4, qVar, eVar3, qVar, dVar);
            r.J(eVar4, c13, qVar);
            j7.d(str, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, elevenLabsTheme.getTypo(qVar, i15).getBodyMedium600(), qVar, i16 & 14, 24960, 110590);
            UltraBadgeKt.UltraBadge(null, qVar, 0, 1);
            qVar.p(true);
            r1.d.g(p2.f(qVar2, elevenLabsTheme.getSpacings(qVar, i15).m2350getX1D9Ej5fM()), qVar);
            j7.d(str2, null, i.w(elevenLabsTheme, qVar, i15), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, elevenLabsTheme.getTypo(qVar, i15).getBodySmall500(), qVar, (i16 >> 3) & 14, 24960, 110586);
            qVar = qVar;
            qVar.p(true);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new a(str, str2, aVar, i10, 0);
        }
    }

    public static final z VoiceDesignRow$lambda$0$0(b0 b0Var) {
        b0Var.getClass();
        y.i(b0Var, 0);
        return z.f31622a;
    }

    public static final z VoiceDesignRow$lambda$2(String str, String str2, ho.a aVar, int i10, m mVar, int i11) {
        VoiceDesignRow(str, str2, aVar, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void voicePickerDesignVoiceSection(t1.t tVar, String str, String str2, String str3, ho.a aVar) {
        tVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        aVar.getClass();
        VoicePickerExploreSectionTitleKt.voicePickerExploreSectionTitle(tVar, "design_voice", new id.b(str, 3, (byte) 0));
        ((t1.i) tVar).t(VoicePickerContract.ViewType.VOICE_DESIGN_ROW, VoicePickerContract.ViewType.VOICE_DESIGN_ROW, new c3.j(new fm.o(str2, (Object) str3, (Object) aVar, 18), true, 1030146288));
    }

    public static final String voicePickerDesignVoiceSection$lambda$0(String str, m mVar, int i10) {
        q qVar = (q) mVar;
        qVar.X(703291056);
        qVar.p(false);
        return str;
    }

    public static final z voicePickerDesignVoiceSection$lambda$1(String str, String str2, ho.a aVar, t1.b bVar, m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            VoiceDesignRow(str, str2, aVar, qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }
}
