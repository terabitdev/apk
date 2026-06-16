package io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps;

import a2.v;
import android.gov.nist.javax.sdp.fields.SDPKeywords;
import c3.o;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import f4.f1;
import ho.p;
import i3.t;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.VoiceDesignContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.VoiceDesignPrompt;
import io.elevenlabs.ui.components.EchoButtonKt;
import io.elevenlabs.ui.components.EchoButtonSize;
import io.elevenlabs.ui.components.EchoButtonVariant;
import io.elevenlabs.ui.components.EchoIconButtonKt;
import io.elevenlabs.ui.components.VoiceCircleKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import java.util.List;
import kotlin.Metadata;
import l1.f2;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import p3.h0;
import p4.b0;
import p4.y;
import q2.e5;
import q2.j7;
import r1.d2;
import r1.i2;
import r1.k2;
import r1.m1;
import r1.p2;
import r1.w;
import r1.x;
import rd.c1;
import s4.y0;
import sn.z;
import t2.u;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\u001aC\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0002\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a/\u0010\u0010\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\b\b\u0002\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u000f\u0010\u0014\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u0014\u0010\u0013¨\u0006\u0017²\u0006\u000e\u0010\u0016\u001a\u00020\u00158\n@\nX\u008a\u008e\u0002"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$State;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignPrompt;", "prompts", "Lkotlin/Function1;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event;", "Lsn/z;", "onEvent", "Li3/t;", "modifier", "VoicePromptStep", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$State;Ljava/util/List;Lho/l;Li3/t;Lu2/m;II)V", SDPKeywords.PROMPT, "Lkotlin/Function0;", "onClick", "PromptPill", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignPrompt;Lho/a;Li3/t;Lu2/m;II)V", "Preview_VoicePromptStep_Empty", "(Lu2/m;I)V", "Preview_VoicePromptStep_WithText", "", "input", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class VoicePromptStepKt {
    public static final void Preview_VoicePromptStep_Empty(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1249514876);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$VoicePromptStepKt.INSTANCE.m1767getLambda$106352278$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.voices.j(i10, 16);
        }
    }

    public static final z Preview_VoicePromptStep_Empty$lambda$0(int i10, m mVar, int i11) {
        Preview_VoicePromptStep_Empty(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_VoicePromptStep_WithText(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-397491698);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$VoicePromptStepKt.INSTANCE.getLambda$763775336$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.voices.j(i10, 15);
        }
    }

    public static final z Preview_VoicePromptStep_WithText$lambda$0(int i10, m mVar, int i11) {
        Preview_VoicePromptStep_WithText(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PromptPill(VoiceDesignPrompt voiceDesignPrompt, ho.a aVar, t tVar, m mVar, int i10, int i11) {
        int i12;
        ho.a aVar2;
        t tVar2;
        int i13;
        boolean z6;
        t tVar3;
        r1 r10;
        int i14;
        int i15;
        q qVar = (q) mVar;
        qVar.Z(-1106968607);
        if ((i10 & 6) == 0) {
            if (qVar.f(voiceDesignPrompt)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            aVar2 = aVar;
            if (qVar.h(aVar2)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        } else {
            aVar2 = aVar;
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
                    tVar3 = qVar2;
                } else {
                    tVar3 = tVar2;
                }
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                int i17 = EchoTheme.$stable;
                z1.g b10 = z1.h.b(echoTheme.getRadii(qVar, i17).getFull());
                String R = kj.c.R(qVar, voiceDesignPrompt.getLabelResId());
                t h10 = n.h(m3.h.c(tVar3, b10), echoTheme.getColors(qVar, i17).getFill().getDenary(qVar, EchoThemeColors.Fill.$stable), h0.f26395b);
                Object L = qVar.L();
                u2.e eVar = u2.l.f33918a;
                if (L == eVar) {
                    L = j0.c.o(qVar);
                }
                t n2 = n.n(h10, (p1.l) L, e5.b(u.P, 7, 0L, false), false, new p4.k(0), aVar2, 12);
                ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                int i18 = ElevenLabsTheme.$stable;
                t F = r1.d.F(n2, elevenLabsTheme.getSpacings(qVar, i18).m2356getX4D9Ej5fM(), elevenLabsTheme.getSpacings(qVar, i18).m2355getX3D9Ej5fM());
                boolean f10 = qVar.f(R);
                Object L2 = qVar.L();
                if (f10 || L2 == eVar) {
                    L2 = new f(R, 6);
                    qVar.h0(L2);
                }
                t c5 = p4.q.c(F, true, (ho.l) L2);
                k2 a10 = i2.a(r1.j.f29232e, i3.d.f13005z0, qVar, 54);
                int hashCode = Long.hashCode(qVar.T);
                o l4 = qVar.l();
                t c10 = i3.a.c(c5, qVar);
                h4.h.f11920i.getClass();
                h4.f fVar = h4.g.f11903b;
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                r.J(h4.g.f11907f, a10, qVar);
                r.J(h4.g.f11906e, l4, qVar);
                r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
                r.F(h4.g.f11909h, qVar);
                r.J(h4.g.f11905d, c10, qVar);
                VoiceCircleKt.VoiceCircle(false, voiceDesignPrompt.getId(), p2.o(qVar2, 20), false, false, qVar, 390, 24);
                r1.d.g(p2.s(qVar2, elevenLabsTheme.getSpacings(qVar, i18).m2353getX2D9Ej5fM()), qVar);
                j7.d(R, null, echoTheme.getColors(qVar, i17).getText().getPrimary(qVar, EchoThemeColors.Text.$stable), 0L, null, 0L, null, 0L, 0, false, 1, 0, null, echoTheme.getTypography(qVar, i17).getBaseRegular500(qVar, EchoThemeTypography.$stable), qVar, 0, 24576, 114682);
                qVar = qVar;
                qVar.p(true);
            } else {
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.c(voiceDesignPrompt, aVar, tVar3, i10, i11, 26);
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

    public static final z PromptPill$lambda$1$0(String str, b0 b0Var) {
        b0Var.getClass();
        y.d(str, b0Var);
        y.i(b0Var, 0);
        return z.f31622a;
    }

    public static final z PromptPill$lambda$3(VoiceDesignPrompt voiceDesignPrompt, ho.a aVar, t tVar, int i10, int i11, m mVar, int i12) {
        PromptPill(voiceDesignPrompt, aVar, tVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void VoicePromptStep(VoiceDesignContract.State state, List<VoiceDesignPrompt> list, ho.l lVar, t tVar, m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        boolean z6;
        t tVar3;
        r1 r10;
        t tVar4;
        boolean z10;
        float f10;
        ElevenLabsTheme elevenLabsTheme;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i14;
        int i15;
        int i16;
        ho.l lVar2 = lVar;
        state.getClass();
        list.getClass();
        lVar2.getClass();
        q qVar = (q) mVar;
        qVar.Z(1393133560);
        if ((i10 & 6) == 0) {
            if (qVar.h(state)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(list)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(lVar2)) {
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
            if (qVar.f(tVar2)) {
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
            if (!qVar.O(i12 & 1, z6)) {
                i3.q qVar2 = i3.q.f13017a;
                if (i17 != 0) {
                    tVar4 = qVar2;
                } else {
                    tVar4 = tVar2;
                }
                t d10 = p2.d(tVar4, 1.0f);
                x a10 = w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
                int hashCode = Long.hashCode(qVar.T);
                o l4 = qVar.l();
                t c5 = i3.a.c(d10, qVar);
                h4.h.f11920i.getClass();
                h4.f fVar = h4.g.f11903b;
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                h4.e eVar = h4.g.f11907f;
                r.J(eVar, a10, qVar);
                h4.e eVar2 = h4.g.f11906e;
                r.J(eVar2, l4, qVar);
                Integer valueOf = Integer.valueOf(hashCode);
                h4.e eVar3 = h4.g.f11908g;
                r.y(qVar, valueOf, eVar3);
                h4.d dVar = h4.g.f11909h;
                r.F(dVar, qVar);
                h4.e eVar4 = h4.g.f11905d;
                r.J(eVar4, c5, qVar);
                Object L = qVar.L();
                u2.e eVar5 = u2.l.f33918a;
                if (L == eVar5) {
                    L = r.A(state.getVoiceDescription());
                    qVar.h0(L);
                }
                z0 z0Var = (z0) L;
                String voiceDescription = state.getVoiceDescription();
                boolean h10 = qVar.h(state);
                t tVar5 = tVar4;
                Object L2 = qVar.L();
                if (h10 || L2 == eVar5) {
                    L2 = new VoicePromptStepKt$VoicePromptStep$1$1$1(state, z0Var, null);
                    qVar.h0(L2);
                }
                r.f((p) L2, voiceDescription, qVar);
                double d11 = 1.0f;
                if (d11 <= 0.0d) {
                    s1.a.a("invalid weight; must be greater than zero");
                }
                t e10 = p2.e(new m1(1.0f, true), 1.0f);
                ElevenLabsTheme elevenLabsTheme2 = ElevenLabsTheme.INSTANCE;
                int i18 = ElevenLabsTheme.$stable;
                t F = r1.d.F(e10, elevenLabsTheme2.getSpacings(qVar, i18).m2357getX5D9Ej5fM(), elevenLabsTheme2.getSpacings(qVar, i18).m2356getX4D9Ej5fM());
                f1 d12 = r1.p.d(i3.d.f12997a, false);
                int hashCode2 = Long.hashCode(qVar.T);
                o l7 = qVar.l();
                t c10 = i3.a.c(F, qVar);
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                r.J(eVar, d12, qVar);
                r.J(eVar2, l7, qVar);
                defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
                r.J(eVar4, c10, qVar);
                f2 x10 = n.x(qVar);
                String R = kj.c.R(qVar, R.string.voice_design_input_a11y);
                String VoicePromptStep$lambda$0$1 = VoicePromptStep$lambda$0$1(z0Var);
                int i19 = i12 & 896;
                if (i19 == 256) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Object L3 = qVar.L();
                if (z10 || L3 == eVar5) {
                    L3 = new a2.h0(lVar2, z0Var, 5);
                    qVar.h0(L3);
                }
                ho.l lVar3 = (ho.l) L3;
                t y10 = n.y(p2.d(qVar2, 1.0f), x10, true, true);
                boolean f11 = qVar.f(R);
                Object L4 = qVar.L();
                if (f11 || L4 == eVar5) {
                    L4 = new f(R, 7);
                    qVar.h0(L4);
                }
                t c11 = p4.q.c(y10, false, (ho.l) L4);
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                int i20 = EchoTheme.$stable;
                v.a(VoicePromptStep$lambda$0$1, lVar3, c11, false, y0.a(echoTheme.getTypography(qVar, i20).getLgRegular400(qVar, EchoThemeTypography.$stable), echoTheme.getColors(qVar, i20).getText().getPrimary(qVar, EchoThemeColors.Text.$stable), 0L, null, null, null, 0L, 0, 0L, null, null, 16777214), null, null, false, 0, 0, null, null, null, null, c3.k.d(-1337577569, true, new b(z0Var, 1), qVar), qVar, 0, 196608, 32728);
                qVar.p(true);
                if (VoicePromptStep$lambda$0$1(z0Var).length() == 0) {
                    qVar.X(-192740134);
                    t e11 = p2.e(qVar2, 1.0f);
                    d2 d13 = r1.d.d(elevenLabsTheme2.getSpacings(qVar, i18).m2357getX5D9Ej5fM(), u.P, 2);
                    r1.h n2 = ib.i.n(elevenLabsTheme2, qVar, i18);
                    boolean h11 = qVar.h(list);
                    if (i19 == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z15 = h11 | z14;
                    Object L5 = qVar.L();
                    if (z15 || L5 == eVar5) {
                        L5 = new io.elevenlabs.readerapp.ui.components.explore.h(list, 2, lVar2);
                        qVar.h0(L5);
                    }
                    f10 = 0.0f;
                    elevenLabsTheme = elevenLabsTheme2;
                    c1.d(e11, null, d13, n2, null, null, false, null, (ho.l) L5, qVar, 6, 490);
                    z11 = false;
                    qVar.p(false);
                } else {
                    f10 = 0.0f;
                    elevenLabsTheme = elevenLabsTheme2;
                    z11 = false;
                    qVar.X(-192150080);
                    qVar.p(false);
                }
                ib.i.p(elevenLabsTheme, qVar, i18, qVar2, qVar);
                t I = r1.d.I(r1.d.G(p2.e(qVar2, 1.0f), elevenLabsTheme.getSpacings(qVar, i18).m2357getX5D9Ej5fM(), f10, 2), u.P, u.P, u.P, elevenLabsTheme.getSpacings(qVar, i18).m2356getX4D9Ej5fM(), 7);
                k2 a11 = i2.a(r1.j.f29228a, i3.d.f13005z0, qVar, 48);
                int hashCode3 = Long.hashCode(qVar.T);
                o l10 = qVar.l();
                t c12 = i3.a.c(I, qVar);
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
                boolean z16 = z11;
                int i21 = io.elevenlabs.ui.R.drawable.ic_circle_info;
                String R2 = kj.c.R(qVar, R.string.voice_design_tips_button_a11y);
                EchoButtonVariant echoButtonVariant = EchoButtonVariant.Secondary;
                EchoButtonSize echoButtonSize = EchoButtonSize.Medium;
                if (i19 == 256) {
                    z12 = true;
                } else {
                    z12 = z16;
                }
                Object L6 = qVar.L();
                if (z12 || L6 == eVar5) {
                    L6 = new h(lVar, 3);
                    qVar.h0(L6);
                }
                lVar2 = lVar;
                EchoIconButtonKt.EchoIconButton(i21, (ho.a) L6, null, R2, echoButtonVariant, echoButtonSize, false, false, false, qVar, 221184, 452);
                r1.d.g(p2.s(qVar2, elevenLabsTheme.getSpacings(qVar, i18).m2353getX2D9Ej5fM()), qVar);
                String R3 = kj.c.R(qVar, R.string.voice_design_generate_button);
                if (i19 == 256) {
                    z13 = true;
                } else {
                    z13 = z16;
                }
                Object L7 = qVar.L();
                if (z13 || L7 == eVar5) {
                    L7 = new h(lVar2, 2);
                    qVar.h0(L7);
                }
                ho.a aVar = (ho.a) L7;
                if (d11 <= 0.0d) {
                    s1.a.a("invalid weight; must be greater than zero");
                }
                EchoButtonKt.m1835EchoButton562pCRU(R3, aVar, new m1(1.0f, true), EchoButtonVariant.Primary, echoButtonSize, null, !state.isGenerating(), false, null, false, false, qVar, 27648, 0, 1952);
                qVar = qVar;
                qVar.p(true);
                qVar.p(true);
                tVar3 = tVar5;
            } else {
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.voices.f(state, list, lVar2, tVar3, i10, i11, 3);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i12 & 1171) == 1170) {
        }
        if (!qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final String VoicePromptStep$lambda$0$1(z0 z0Var) {
        return (String) z0Var.getValue();
    }

    public static final z VoicePromptStep$lambda$0$4$0$0(ho.l lVar, z0 z0Var, String str) {
        str.getClass();
        z0Var.setValue(str);
        lVar.invoke(new VoiceDesignContract.Event.UpdateDescription(str));
        return z.f31622a;
    }

    public static final z VoicePromptStep$lambda$0$4$1$0(String str, b0 b0Var) {
        b0Var.getClass();
        y.d(str, b0Var);
        return z.f31622a;
    }

    public static final z VoicePromptStep$lambda$0$4$2(z0 z0Var, p pVar, m mVar, int i10) {
        int i11;
        boolean z6;
        q qVar;
        int i12;
        pVar.getClass();
        if ((i10 & 6) == 0) {
            if (((q) mVar).h(pVar)) {
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
        q qVar2 = (q) mVar;
        if (qVar2.O(i11 & 1, z6)) {
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar2.T);
            o l4 = qVar2.l();
            t c5 = i3.a.c(i3.q.f13017a, qVar2);
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
            r.J(h4.g.f11905d, c5, qVar2);
            if (VoicePromptStep$lambda$0$1(z0Var).length() == 0) {
                qVar2.X(949158031);
                String R = kj.c.R(qVar2, R.string.voice_design_prompt_placeholder);
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                int i13 = EchoTheme.$stable;
                j7.d(R, null, echoTheme.getColors(qVar2, i13).getText().getPlaceholder(qVar2, EchoThemeColors.Text.$stable), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar2, i13).getLgRegular400(qVar2, EchoThemeTypography.$stable), qVar2, 0, 0, 131066);
                qVar = qVar2;
                qVar.p(false);
            } else {
                qVar = qVar2;
                qVar.X(949454825);
                qVar.p(false);
            }
            j0.c.q(i11 & 14, pVar, qVar, true);
        } else {
            qVar2.R();
        }
        return z.f31622a;
    }

    public static final z VoicePromptStep$lambda$0$5$0(final List list, final ho.l lVar, t1.t tVar) {
        tVar.getClass();
        final io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections.d dVar = new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections.d(15);
        final VoicePromptStepKt$VoicePromptStep$lambda$0$5$0$$inlined$items$default$1 voicePromptStepKt$VoicePromptStep$lambda$0$5$0$$inlined$items$default$1 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps.VoicePromptStepKt$VoicePromptStep$lambda$0$5$0$$inlined$items$default$1
            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((VoiceDesignPrompt) obj);
            }

            @Override // ho.l
            public final Void invoke(VoiceDesignPrompt voiceDesignPrompt) {
                return null;
            }
        };
        ((t1.i) tVar).u(list.size(), new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps.VoicePromptStepKt$VoicePromptStep$lambda$0$5$0$$inlined$items$default$2
            public final Object invoke(int i10) {
                return ho.l.this.invoke(list.get(i10));
            }

            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        }, new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps.VoicePromptStepKt$VoicePromptStep$lambda$0$5$0$$inlined$items$default$3
            public final Object invoke(int i10) {
                return ho.l.this.invoke(list.get(i10));
            }

            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        }, new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps.VoicePromptStepKt$VoicePromptStep$lambda$0$5$0$$inlined$items$default$4
            public final void invoke(t1.b bVar, int i10, m mVar, int i11) {
                int i12;
                boolean z6;
                int i13;
                int i14;
                if ((i11 & 6) == 0) {
                    if (((q) mVar).f(bVar)) {
                        i14 = 4;
                    } else {
                        i14 = 2;
                    }
                    i12 = i14 | i11;
                } else {
                    i12 = i11;
                }
                if ((i11 & 48) == 0) {
                    if (((q) mVar).d(i10)) {
                        i13 = 32;
                    } else {
                        i13 = 16;
                    }
                    i12 |= i13;
                }
                if ((i12 & 147) != 146) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                q qVar = (q) mVar;
                if (qVar.O(i12 & 1, z6)) {
                    final VoiceDesignPrompt voiceDesignPrompt = (VoiceDesignPrompt) list.get(i10);
                    qVar.X(713636146);
                    boolean f10 = qVar.f(lVar) | qVar.f(voiceDesignPrompt);
                    Object L = qVar.L();
                    if (f10 || L == u2.l.f33918a) {
                        final ho.l lVar2 = lVar;
                        L = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps.VoicePromptStepKt$VoicePromptStep$1$3$1$2$1$1
                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m1768invoke() {
                                ho.l.this.invoke(new VoiceDesignContract.Event.SelectPromptPill(voiceDesignPrompt));
                            }

                            @Override // ho.a
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m1768invoke();
                                return z.f31622a;
                            }
                        };
                        qVar.h0(L);
                    }
                    VoicePromptStepKt.PromptPill(voiceDesignPrompt, (ho.a) L, null, qVar, 0, 4);
                    qVar.p(false);
                    return;
                }
                qVar.R();
            }

            @Override // ho.r
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((t1.b) obj, ((Number) obj2).intValue(), (m) obj3, ((Number) obj4).intValue());
                return z.f31622a;
            }
        }, true, 802480018));
        return z.f31622a;
    }

    public static final Object VoicePromptStep$lambda$0$5$0$0(VoiceDesignPrompt voiceDesignPrompt) {
        voiceDesignPrompt.getClass();
        return voiceDesignPrompt.getId();
    }

    public static final z VoicePromptStep$lambda$0$6$0$0(ho.l lVar) {
        lVar.invoke(VoiceDesignContract.Event.ShowTips.INSTANCE);
        return z.f31622a;
    }

    public static final z VoicePromptStep$lambda$0$6$1$0(ho.l lVar) {
        lVar.invoke(VoiceDesignContract.Event.GenerateVoice.INSTANCE);
        return z.f31622a;
    }

    public static final z VoicePromptStep$lambda$1(VoiceDesignContract.State state, List list, ho.l lVar, t tVar, int i10, int i11, m mVar, int i12) {
        VoicePromptStep(state, list, lVar, tVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }
}
