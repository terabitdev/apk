package io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps;

import a2.a2;
import android.gov.nist.javax.sip.parser.TokenNames;
import c3.o;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.revenuecat.purchases.ui.revenuecatui.components.SensibleDefaults;
import f4.f1;
import i3.t;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.VoiceDesignContract;
import io.elevenlabs.ui.components.EchoButtonKt;
import io.elevenlabs.ui.components.EchoButtonSize;
import io.elevenlabs.ui.components.EchoButtonVariant;
import io.elevenlabs.ui.components.EchoIconButtonKt;
import io.elevenlabs.ui.components.InputBorderlessKt;
import io.elevenlabs.ui.components.InteractionsKt;
import io.elevenlabs.ui.components.VoiceCircleKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import p4.b0;
import p4.y;
import r1.m1;
import r1.p;
import r1.p2;
import r1.w;
import r1.x;
import s4.y0;
import sn.z;
import t2.u;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\f\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\f\u0010\u000b\"\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$State;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lkotlin/Function1;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event;", "Lsn/z;", "onEvent", "Li3/t;", "modifier", "SaveVoiceStep", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$State;Lho/l;Li3/t;Lu2/m;II)V", "Preview_SaveVoiceStep_Empty", "(Lu2/m;I)V", "Preview_SaveVoiceStep_WithName", "Lh5/f;", "VoiceCircleSize", TokenNames.F, "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$PreviewItem;", "MockSelectedPreview", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$PreviewItem;", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class SaveVoiceStepKt {
    private static final float VoiceCircleSize = SensibleDefaults.X_OFFSET;
    private static final VoiceDesignContract.PreviewItem MockSelectedPreview = new VoiceDesignContract.PreviewItem("preview_voice_1", "Voice 1", "", Double.valueOf(5.0d));

    public static final void Preview_SaveVoiceStep_Empty(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1464741540);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$SaveVoiceStepKt.INSTANCE.m1763getLambda$1404774262$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.voices.j(i10, 11);
        }
    }

    public static final z Preview_SaveVoiceStep_Empty$lambda$0(int i10, m mVar, int i11) {
        Preview_SaveVoiceStep_Empty(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_SaveVoiceStep_WithName(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1557223598);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$SaveVoiceStepKt.INSTANCE.m1764getLambda$1453941496$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.voices.j(i10, 12);
        }
    }

    public static final z Preview_SaveVoiceStep_WithName$lambda$0(int i10, m mVar, int i11) {
        Preview_SaveVoiceStep_WithName(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SaveVoiceStep(VoiceDesignContract.State state, ho.l lVar, t tVar, m mVar, int i10, int i11) {
        VoiceDesignContract.State state2;
        int i12;
        t tVar2;
        int i13;
        boolean z6;
        t tVar3;
        q qVar;
        r1 r10;
        t tVar4;
        i3.q qVar2;
        ?? r02;
        boolean z10;
        q qVar3;
        boolean z11;
        ho.l lVar2;
        boolean z12;
        int i14;
        String R;
        boolean z13;
        p4.k kVar;
        int i15;
        int i16;
        boolean z14;
        String R2;
        boolean z15;
        int i17;
        int i18;
        state.getClass();
        lVar.getClass();
        q qVar4 = (q) mVar;
        qVar4.Z(588403208);
        if ((i10 & 6) == 0) {
            state2 = state;
            if (qVar4.h(state2)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i12 = i18 | i10;
        } else {
            state2 = state;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar4.h(lVar)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i12 |= i17;
        }
        int i19 = i11 & 4;
        if (i19 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            tVar2 = tVar;
            if (qVar4.f(tVar2)) {
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
            if (!qVar4.O(i12 & 1, z6)) {
                i3.q qVar5 = i3.q.f13017a;
                if (i19 != 0) {
                    tVar4 = qVar5;
                } else {
                    tVar4 = tVar2;
                }
                VoiceDesignContract.PreviewItem selectedPreview = state2.getSelectedPreview();
                t d10 = p2.d(tVar4, 1.0f);
                i3.j jVar = i3.d.C0;
                r1.e eVar = r1.j.f29230c;
                x a10 = w.a(eVar, jVar, qVar4, 48);
                int hashCode = Long.hashCode(qVar4.T);
                o l4 = qVar4.l();
                t c5 = i3.a.c(d10, qVar4);
                h4.h.f11920i.getClass();
                h4.f fVar = h4.g.f11903b;
                qVar4.b0();
                if (qVar4.S) {
                    qVar4.k(fVar);
                } else {
                    qVar4.k0();
                }
                h4.e eVar2 = h4.g.f11907f;
                r.J(eVar2, a10, qVar4);
                h4.e eVar3 = h4.g.f11906e;
                r.J(eVar3, l4, qVar4);
                Integer valueOf = Integer.valueOf(hashCode);
                h4.e eVar4 = h4.g.f11908g;
                r.y(qVar4, valueOf, eVar4);
                h4.d dVar = h4.g.f11909h;
                r.F(dVar, qVar4);
                h4.e eVar5 = h4.g.f11905d;
                r.J(eVar5, c5, qVar4);
                int i20 = i12;
                if (1.0f <= 0.0d) {
                    s1.a.a("invalid weight; must be greater than zero");
                }
                t e10 = p2.e(new m1(1.0f, true), 1.0f);
                f1 d11 = p.d(i3.d.f13001e, false);
                t tVar5 = tVar4;
                int hashCode2 = Long.hashCode(qVar4.T);
                o l7 = qVar4.l();
                t c10 = i3.a.c(e10, qVar4);
                qVar4.b0();
                if (qVar4.S) {
                    qVar4.k(fVar);
                } else {
                    qVar4.k0();
                }
                r.J(eVar2, d11, qVar4);
                r.J(eVar3, l7, qVar4);
                defpackage.f.u(hashCode2, qVar4, eVar4, qVar4, dVar);
                r.J(eVar5, c10, qVar4);
                t e11 = p2.e(qVar5, 1.0f);
                ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                int i21 = ElevenLabsTheme.$stable;
                t G = r1.d.G(e11, elevenLabsTheme.getSpacings(qVar4, i21).m2357getX5D9Ej5fM(), u.P, 2);
                x a11 = w.a(eVar, jVar, qVar4, 48);
                int hashCode3 = Long.hashCode(qVar4.T);
                o l10 = qVar4.l();
                t c11 = i3.a.c(G, qVar4);
                qVar4.b0();
                if (qVar4.S) {
                    qVar4.k(fVar);
                } else {
                    qVar4.k0();
                }
                r.J(eVar2, a11, qVar4);
                r.J(eVar3, l10, qVar4);
                defpackage.f.u(hashCode3, qVar4, eVar4, qVar4, dVar);
                r.J(eVar5, c11, qVar4);
                u2.e eVar6 = u2.l.f33918a;
                if (selectedPreview != null) {
                    qVar4.X(866641049);
                    boolean c12 = kotlin.jvm.internal.m.c(state.getPlayingPreviewId(), selectedPreview.getGeneratedVoiceId());
                    Object L = qVar4.L();
                    if (L == eVar6) {
                        L = j0.c.o(qVar4);
                    }
                    p1.l lVar3 = (p1.l) L;
                    if (c12) {
                        qVar4.X(866791771);
                        R = kj.c.R(qVar4, R.string.voice_design_stop_voice_preview_a11y);
                        i14 = 0;
                        qVar4.p(false);
                    } else {
                        i14 = 0;
                        qVar4.X(866905851);
                        R = kj.c.R(qVar4, R.string.voice_design_play_voice_preview_a11y);
                        qVar4.p(false);
                    }
                    t bounceOnPress$default = InteractionsKt.bounceOnPress$default(p2.o(qVar5, VoiceCircleSize), lVar3, 0.9f, u.P, 4, null);
                    p4.k kVar2 = new p4.k(i14);
                    boolean g10 = qVar4.g(c12);
                    int i22 = i20 & 112;
                    if (i22 == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean f10 = g10 | z13 | qVar4.f(selectedPreview);
                    Object L2 = qVar4.L();
                    if (!f10 && L2 != eVar6) {
                        kVar = kVar2;
                        i15 = i22;
                    } else {
                        kVar = kVar2;
                        i15 = i22;
                        L2 = new g(c12, lVar, selectedPreview, 0);
                        qVar4.h0(L2);
                    }
                    t n2 = n.n(bounceOnPress$default, lVar3, null, false, kVar, (ho.a) L2, 12);
                    boolean f11 = qVar4.f(R);
                    Object L3 = qVar4.L();
                    if (f11 || L3 == eVar6) {
                        L3 = new f(R, 1);
                        qVar4.h0(L3);
                    }
                    t c13 = p4.q.c(n2, false, (ho.l) L3);
                    f1 d12 = p.d(i3.d.f12997a, false);
                    int hashCode4 = Long.hashCode(qVar4.T);
                    o l11 = qVar4.l();
                    t c14 = i3.a.c(c13, qVar4);
                    qVar4.b0();
                    if (qVar4.S) {
                        qVar4.k(fVar);
                    } else {
                        qVar4.k0();
                    }
                    r.J(eVar2, d12, qVar4);
                    r.J(eVar3, l11, qVar4);
                    defpackage.f.u(hashCode4, qVar4, eVar4, qVar4, dVar);
                    r.J(eVar5, c14, qVar4);
                    int i23 = i15;
                    VoiceCircleKt.VoiceCircle(true, selectedPreview.getGeneratedVoiceId(), p2.d(qVar5, 1.0f), false, c12, qVar4, 390, 8);
                    if (c12) {
                        i16 = io.elevenlabs.ui.R.drawable.ic_pause;
                    } else {
                        i16 = io.elevenlabs.ui.R.drawable.ic_play;
                    }
                    if (c12) {
                        qVar4.X(-322647947);
                        R2 = kj.c.R(qVar4, R.string.voice_design_stop_preview);
                        z14 = false;
                        qVar4.p(false);
                    } else {
                        z14 = false;
                        qVar4.X(-322528907);
                        R2 = kj.c.R(qVar4, R.string.voice_design_play_preview);
                        qVar4.p(false);
                    }
                    String str = R2;
                    EchoButtonVariant echoButtonVariant = EchoButtonVariant.Primary;
                    EchoButtonSize echoButtonSize = EchoButtonSize.Medium;
                    t b10 = r1.t.f29349a.b(qVar5, i3.d.f13003x0);
                    boolean g11 = qVar4.g(c12);
                    if (i23 == 32) {
                        z15 = true;
                    } else {
                        z15 = z14;
                    }
                    boolean f12 = z15 | g11 | qVar4.f(selectedPreview);
                    Object L4 = qVar4.L();
                    if (f12 || L4 == eVar6) {
                        L4 = new g(c12, lVar, selectedPreview, 1);
                        qVar4.h0(L4);
                    }
                    qVar2 = qVar5;
                    boolean z16 = z14;
                    z10 = true;
                    EchoIconButtonKt.EchoIconButton(i16, (ho.a) L4, b10, str, echoButtonVariant, echoButtonSize, false, false, false, qVar4, 221184, 448);
                    q qVar6 = qVar4;
                    qVar6.p(true);
                    qVar6.p(z16);
                    r02 = z16;
                    qVar3 = qVar6;
                } else {
                    qVar2 = qVar5;
                    r02 = 0;
                    z10 = true;
                    qVar4.X(869423144);
                    qVar4.p(false);
                    qVar3 = qVar4;
                }
                r1.d.g(p2.f(qVar2, elevenLabsTheme.getSpacings(qVar3, i21).m2360getX8D9Ej5fM()), qVar3);
                String R3 = kj.c.R(qVar3, R.string.voice_design_name_input_a11y);
                String voiceName = state.getVoiceName();
                String R4 = kj.c.R(qVar3, R.string.voice_design_name_placeholder);
                a2 a2Var = new a2((int) r02, (int) r02, 126);
                y0 a12 = y0.a(elevenLabsTheme.getTypo(qVar3, i21).getBody(), defpackage.f.b(elevenLabsTheme, qVar3, i21), 0L, null, null, null, 0L, 3, 0L, null, null, 16744446);
                t e12 = p2.e(qVar2, 1.0f);
                boolean f13 = qVar3.f(R3);
                Object L5 = qVar3.L();
                if (f13 || L5 == eVar6) {
                    L5 = new f(R3, 2);
                    qVar3.h0(L5);
                }
                t c15 = p4.q.c(e12, r02, (ho.l) L5);
                int i24 = i20 & 112;
                if (i24 == 32) {
                    z11 = z10;
                } else {
                    z11 = r02;
                }
                Object L6 = qVar3.L();
                if (!z11 && L6 != eVar6) {
                    lVar2 = lVar;
                } else {
                    lVar2 = lVar;
                    L6 = new f(lVar2, 8);
                    qVar3.h0(L6);
                }
                q qVar7 = qVar3;
                i3.q qVar8 = qVar2;
                InputBorderlessKt.InputBorderless(voiceName, (ho.l) L6, c15, R4, a2Var, null, null, a12, false, true, qVar7, 805330944, 352);
                qVar7.p(z10);
                qVar7.p(z10);
                String R5 = kj.c.R(qVar7, R.string.voice_design_save_voice);
                if (i24 == 32) {
                    z12 = z10;
                } else {
                    z12 = false;
                }
                Object L7 = qVar7.L();
                if (z12 || L7 == eVar6) {
                    L7 = new h(lVar2, 0);
                    qVar7.h0(L7);
                }
                EchoButtonKt.m1835EchoButton562pCRU(R5, (ho.a) L7, r1.d.F(p2.e(qVar8, 1.0f), elevenLabsTheme.getSpacings(qVar7, i21).m2357getX5D9Ej5fM(), elevenLabsTheme.getSpacings(qVar7, i21).m2356getX4D9Ej5fM()), EchoButtonVariant.Primary, EchoButtonSize.Medium, null, state.isSaveButtonEnabled(), false, null, state.isSaving(), false, qVar7, 27648, 0, 1440);
                q qVar9 = qVar7;
                qVar9.p(z10);
                tVar3 = tVar5;
                qVar = qVar9;
            } else {
                qVar4.R();
                tVar3 = tVar2;
                qVar = qVar4;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new i(state, lVar, tVar3, i10, i11, 0);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i12 & 147) == 146) {
        }
        if (!qVar4.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z SaveVoiceStep$lambda$0$0$0$1$0(boolean z6, ho.l lVar, VoiceDesignContract.PreviewItem previewItem) {
        if (z6) {
            lVar.invoke(VoiceDesignContract.Event.StopPreview.INSTANCE);
        } else {
            lVar.invoke(new VoiceDesignContract.Event.PlayPreview(previewItem.getGeneratedVoiceId()));
        }
        return z.f31622a;
    }

    public static final z SaveVoiceStep$lambda$0$0$0$2$0(String str, b0 b0Var) {
        b0Var.getClass();
        y.d(str, b0Var);
        y.i(b0Var, 0);
        return z.f31622a;
    }

    public static final z SaveVoiceStep$lambda$0$0$0$3$0$0(boolean z6, ho.l lVar, VoiceDesignContract.PreviewItem previewItem) {
        if (z6) {
            lVar.invoke(VoiceDesignContract.Event.StopPreview.INSTANCE);
        } else {
            lVar.invoke(new VoiceDesignContract.Event.PlayPreview(previewItem.getGeneratedVoiceId()));
        }
        return z.f31622a;
    }

    public static final z SaveVoiceStep$lambda$0$0$0$4$0(String str, b0 b0Var) {
        b0Var.getClass();
        y.d(str, b0Var);
        return z.f31622a;
    }

    public static final z SaveVoiceStep$lambda$0$0$0$5$0(ho.l lVar, String str) {
        str.getClass();
        lVar.invoke(new VoiceDesignContract.Event.UpdateVoiceName(str));
        return z.f31622a;
    }

    public static final z SaveVoiceStep$lambda$0$1$0(ho.l lVar) {
        lVar.invoke(VoiceDesignContract.Event.SaveVoice.INSTANCE);
        return z.f31622a;
    }

    public static final z SaveVoiceStep$lambda$1(VoiceDesignContract.State state, ho.l lVar, t tVar, int i10, int i11, m mVar, int i12) {
        SaveVoiceStep(state, lVar, tVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final /* synthetic */ VoiceDesignContract.PreviewItem access$getMockSelectedPreview$p() {
        return MockSelectedPreview;
    }
}
