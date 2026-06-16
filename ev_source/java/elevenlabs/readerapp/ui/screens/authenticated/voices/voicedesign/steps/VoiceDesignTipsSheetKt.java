package io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps;

import android.gov.nist.javax.sip.header.ParameterNames;
import c3.o;
import f4.f1;
import i3.t;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.ui.components.scaffolds.BottomSheetScaffoldKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import p3.h0;
import p4.b0;
import p4.y;
import q2.e5;
import q2.j7;
import r1.p;
import r1.u0;
import r1.v0;
import sn.z;
import t2.u;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a;\u0010\f\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\nH\u0003¢\u0006\u0004\b\f\u0010\r\u001a/\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u000f\u0010\u0014\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0014\u0010\u0015\"\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\"\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017\"\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017\"\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017¨\u0006\u001b"}, d2 = {"Lkotlin/Function0;", "Lsn/z;", "onDismiss", "VoiceDesignTipsSheet", "(Lho/a;Lu2/m;I)V", "", "title", "", "", "traits", "Lkotlin/Function1;", "onTraitClick", "TraitSection", "(Ljava/lang/String;Ljava/util/List;Lho/l;Lu2/m;I)V", ParameterNames.TEXT, "onClick", "Li3/t;", "modifier", "TraitChip", "(Ljava/lang/String;Lho/a;Li3/t;Lu2/m;II)V", "Preview_VoiceDesignTipsSheet", "(Lu2/m;I)V", "genderTraits", "Ljava/util/List;", "ageTraits", "accentTraits", "toneTraits", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class VoiceDesignTipsSheetKt {
    private static final List<Integer> genderTraits = ig.f.I(Integer.valueOf(R.string.voice_design_trait_male), Integer.valueOf(R.string.voice_design_trait_female), Integer.valueOf(R.string.voice_design_trait_neutral));
    private static final List<Integer> ageTraits = ig.f.I(Integer.valueOf(R.string.voice_design_trait_young), Integer.valueOf(R.string.voice_design_trait_middle_age), Integer.valueOf(R.string.voice_design_trait_old));
    private static final List<Integer> accentTraits = ig.f.I(Integer.valueOf(R.string.voice_design_trait_american), Integer.valueOf(R.string.voice_design_trait_british), Integer.valueOf(R.string.voice_design_trait_australian), Integer.valueOf(R.string.voice_design_trait_irish), Integer.valueOf(R.string.voice_design_trait_indian), Integer.valueOf(R.string.voice_design_trait_canadian), Integer.valueOf(R.string.voice_design_trait_south_african));
    private static final List<Integer> toneTraits = ig.f.I(Integer.valueOf(R.string.voice_design_trait_clear), Integer.valueOf(R.string.voice_design_trait_smooth), Integer.valueOf(R.string.voice_design_trait_sharp), Integer.valueOf(R.string.voice_design_trait_soft));

    public static final void Preview_VoiceDesignTipsSheet(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-533605024);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$VoiceDesignTipsSheetKt.INSTANCE.getLambda$1105934662$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.voices.j(i10, 14);
        }
    }

    public static final z Preview_VoiceDesignTipsSheet$lambda$0(int i10, m mVar, int i11) {
        Preview_VoiceDesignTipsSheet(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void TraitChip(String str, ho.a aVar, t tVar, m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        boolean z6;
        q qVar;
        t tVar3;
        r1 r10;
        t tVar4;
        boolean z10;
        int i14;
        int i15;
        q qVar2 = (q) mVar;
        qVar2.Z(-2127292514);
        if ((i10 & 6) == 0) {
            if (qVar2.f(str)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(aVar)) {
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
            if (qVar2.f(tVar2)) {
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
            if (!qVar2.O(i12 & 1, z6)) {
                if (i16 != 0) {
                    tVar4 = i3.q.f13017a;
                } else {
                    tVar4 = tVar2;
                }
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                int i17 = EchoTheme.$stable;
                t h10 = n.h(m3.h.c(tVar4, z1.h.b(echoTheme.getRadii(qVar2, i17).getFull())), echoTheme.getColors(qVar2, i17).getFill().getDenary(qVar2, EchoThemeColors.Fill.$stable), h0.f26395b);
                Object L = qVar2.L();
                u2.e eVar = u2.l.f33918a;
                if (L == eVar) {
                    L = j0.c.o(qVar2);
                }
                t F = r1.d.F(n.n(h10, (p1.l) L, e5.b(u.P, 7, 0L, false), false, new p4.k(0), aVar, 12), ElevenLabsTheme.INSTANCE.getSpacings(qVar2, ElevenLabsTheme.$stable).m2355getX3D9Ej5fM(), 6);
                int i18 = i12 & 14;
                if (i18 == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Object L2 = qVar2.L();
                if (z10 || L2 == eVar) {
                    L2 = new f(str, 5);
                    qVar2.h0(L2);
                }
                t c5 = p4.q.c(F, false, (ho.l) L2);
                f1 d10 = p.d(i3.d.f12997a, false);
                int hashCode = Long.hashCode(qVar2.T);
                o l4 = qVar2.l();
                t c10 = i3.a.c(c5, qVar2);
                h4.h.f11920i.getClass();
                h4.f fVar = h4.g.f11903b;
                qVar2.b0();
                if (qVar2.S) {
                    qVar2.k(fVar);
                } else {
                    qVar2.k0();
                }
                r.J(h4.g.f11907f, d10, qVar2);
                r.J(h4.g.f11906e, l4, qVar2);
                r.y(qVar2, Integer.valueOf(hashCode), h4.g.f11908g);
                r.F(h4.g.f11909h, qVar2);
                r.J(h4.g.f11905d, c10, qVar2);
                j7.d(str, null, echoTheme.getColors(qVar2, i17).getText().getPrimary(qVar2, EchoThemeColors.Text.$stable), 0L, null, 0L, null, 0L, 0, false, 1, 0, null, echoTheme.getTypography(qVar2, i17).getBaseRegular500(qVar2, EchoThemeTypography.$stable), qVar2, i18, 24576, 114682);
                qVar = qVar2;
                qVar.p(true);
                tVar3 = tVar4;
            } else {
                qVar = qVar2;
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new im.a(i10, str, aVar, tVar3, i11, 3);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i12 & 147) == 146) {
        }
        if (!qVar2.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z TraitChip$lambda$1$0(String str, b0 b0Var) {
        b0Var.getClass();
        y.d(str, b0Var);
        y.i(b0Var, 0);
        return z.f31622a;
    }

    public static final z TraitChip$lambda$3(String str, ho.a aVar, t tVar, int i10, int i11, m mVar, int i12) {
        TraitChip(str, aVar, tVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void TraitSection(String str, List<Integer> list, ho.l lVar, m mVar, int i10) {
        int i11;
        boolean z6;
        String str2;
        List<Integer> list2;
        ho.l lVar2;
        q qVar;
        int i12;
        int i13;
        int i14;
        q qVar2 = (q) mVar;
        qVar2.Z(-521083049);
        if ((i10 & 6) == 0) {
            if (qVar2.f(str)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(list)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.h(lVar)) {
                i12 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 147) != 146) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar2.O(i11 & 1, z6)) {
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i15 = EchoTheme.$stable;
            qVar = qVar2;
            j7.d(str, null, echoTheme.getColors(qVar2, i15).getText().getPrimary(qVar2, EchoThemeColors.Text.$stable), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar2, i15).getBaseCompact500(qVar2, EchoThemeTypography.$stable), qVar, i11 & 14, 0, 131066);
            str2 = str;
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i16 = ElevenLabsTheme.$stable;
            ib.i.A(elevenLabsTheme, qVar, i16, i3.q.f13017a, qVar);
            u0 u0Var = r1.j.f29228a;
            list2 = list;
            lVar2 = lVar;
            r1.d.b(null, r1.j.g(elevenLabsTheme.getSpacings(qVar, i16).m2356getX4D9Ej5fM()), r1.j.g(elevenLabsTheme.getSpacings(qVar, i16).m2356getX4D9Ej5fM()), null, 0, 0, c3.k.d(1898651538, true, new l(list2, 0, lVar2), qVar), qVar, 1572864, 57);
        } else {
            str2 = str;
            list2 = list;
            lVar2 = lVar;
            qVar = qVar2;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.account.explore.f(str2, list2, lVar2, i10);
        }
    }

    public static final z TraitSection$lambda$0(List list, ho.l lVar, v0 v0Var, m mVar, int i10) {
        boolean z6;
        v0Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String R = kj.c.R(qVar, ((Number) it.next()).intValue());
                boolean f10 = qVar.f(lVar) | qVar.f(R);
                Object L = qVar.L();
                if (f10 || L == u2.l.f33918a) {
                    L = new fm.a(6, lVar, R);
                    qVar.h0(L);
                }
                TraitChip(R, (ho.a) L, null, qVar, 0, 4);
            }
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z TraitSection$lambda$0$0$0$0(ho.l lVar, String str) {
        lVar.invoke(str);
        return z.f31622a;
    }

    public static final z TraitSection$lambda$1(String str, List list, ho.l lVar, int i10, m mVar, int i11) {
        TraitSection(str, list, lVar, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void VoiceDesignTipsSheet(ho.a aVar, m mVar, int i10) {
        int i11;
        boolean z6;
        ho.a aVar2;
        int i12;
        aVar.getClass();
        q qVar = (q) mVar;
        qVar.Z(-1957679671);
        if ((i10 & 6) == 0) {
            if (qVar.h(aVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            ComposableSingletons$VoiceDesignTipsSheetKt composableSingletons$VoiceDesignTipsSheetKt = ComposableSingletons$VoiceDesignTipsSheetKt.INSTANCE;
            aVar2 = aVar;
            BottomSheetScaffoldKt.EchoBottomSheetScaffold(true, aVar2, null, false, null, composableSingletons$VoiceDesignTipsSheetKt.m1766getLambda$1086828725$app_productionRelease(), composableSingletons$VoiceDesignTipsSheetKt.getLambda$121509084$app_productionRelease(), qVar, ((i11 << 3) & 112) | 1769478, 28);
        } else {
            aVar2 = aVar;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new hm.b(aVar2, i10, 13);
        }
    }

    public static final z VoiceDesignTipsSheet$lambda$0(ho.a aVar, int i10, m mVar, int i11) {
        VoiceDesignTipsSheet(aVar, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final /* synthetic */ void access$TraitSection(String str, List list, ho.l lVar, m mVar, int i10) {
        TraitSection(str, list, lVar, mVar, i10);
    }

    public static final /* synthetic */ List access$getAccentTraits$p() {
        return accentTraits;
    }

    public static final /* synthetic */ List access$getAgeTraits$p() {
        return ageTraits;
    }

    public static final /* synthetic */ List access$getGenderTraits$p() {
        return genderTraits;
    }

    public static final /* synthetic */ List access$getToneTraits$p() {
        return toneTraits;
    }
}
