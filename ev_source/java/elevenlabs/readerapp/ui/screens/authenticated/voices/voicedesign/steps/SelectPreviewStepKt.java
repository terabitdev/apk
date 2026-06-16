package io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps;

import android.gov.nist.javax.sip.parser.TokenNames;
import c3.o;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.revenuecat.purchases.ui.revenuecatui.components.SensibleDefaults;
import f4.f1;
import i3.t;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.components.d0;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.VoiceDesignContract;
import io.elevenlabs.ui.components.EchoButtonKt;
import io.elevenlabs.ui.components.EchoButtonSize;
import io.elevenlabs.ui.components.EchoButtonVariant;
import io.elevenlabs.ui.components.EchoIconButtonKt;
import io.elevenlabs.ui.components.InteractionsKt;
import io.elevenlabs.ui.components.VoiceCircleKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import java.util.List;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import p3.h0;
import p4.b0;
import p4.y;
import q2.j7;
import r1.i2;
import r1.k2;
import r1.m1;
import r1.p;
import r1.p2;
import r1.u0;
import r1.w;
import r1.x;
import sn.z;
import t2.u;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\u001a5\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\b\u0010\t\u001a7\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a)\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u000f\u0010\u0017\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001b\"\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$State;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lkotlin/Function1;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$Event;", "Lsn/z;", "onEvent", "Li3/t;", "modifier", "SelectPreviewStep", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$State;Lho/l;Li3/t;Lu2/m;II)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$PreviewItem;", "preview", "", "isPlaying", "Lkotlin/Function0;", "onTogglePlayback", "PreviewPage", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/voicedesign/VoiceDesignContract$PreviewItem;ZLho/a;Li3/t;Lu2/m;II)V", "", "pageCount", "currentPage", "PageIndicator", "(IILi3/t;Lu2/m;II)V", "Preview_SelectPreviewStep", "(Lu2/m;I)V", "Lh5/f;", "VoiceCircleSize", TokenNames.F, "PageIndicatorDotSize", "", "MockPreviews", "Ljava/util/List;", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class SelectPreviewStepKt {
    private static final float VoiceCircleSize = SensibleDefaults.X_OFFSET;
    private static final float PageIndicatorDotSize = 8;
    private static final List<VoiceDesignContract.PreviewItem> MockPreviews = ig.f.I(new VoiceDesignContract.PreviewItem("preview_voice_1", "Voice 1", "", Double.valueOf(5.0d)), new VoiceDesignContract.PreviewItem("preview_voice_2", "Voice 2", "", Double.valueOf(4.5d)), new VoiceDesignContract.PreviewItem("preview_voice_3", "Voice 3", "", Double.valueOf(6.0d)));

    private static final void PageIndicator(final int i10, final int i11, t tVar, m mVar, final int i12, final int i13) {
        int i14;
        int i15;
        boolean z6;
        final t tVar2;
        boolean z10;
        long quaternary;
        int i16;
        int i17;
        q qVar = (q) mVar;
        qVar.Z(1081182788);
        if ((i12 & 6) == 0) {
            if (qVar.d(i10)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i14 = i17 | i12;
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            if (qVar.d(i11)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i14 |= i16;
        }
        int i18 = i13 & 4;
        if (i18 != 0) {
            i14 |= 384;
        } else if ((i12 & 384) == 0) {
            if (qVar.f(tVar)) {
                i15 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i15 = 128;
            }
            i14 |= i15;
        }
        if ((i14 & 147) != 146) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i14 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            if (i18 != 0) {
                tVar2 = qVar2;
            } else {
                tVar2 = tVar;
            }
            String Q = kj.c.Q(R.string.voice_design_page_indicator_a11y, new Object[]{Integer.valueOf(i11 + 1), Integer.valueOf(i10)}, qVar);
            boolean f10 = qVar.f(Q);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new f(Q, 3);
                qVar.h0(L);
            }
            t c5 = p4.q.c(tVar2, false, (ho.l) L);
            u0 u0Var = r1.j.f29228a;
            k2 a10 = i2.a(ib.i.n(ElevenLabsTheme.INSTANCE, qVar, ElevenLabsTheme.$stable), i3.d.f13005z0, qVar, 48);
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
            qVar.X(-508716821);
            for (int i19 = 0; i19 < i10; i19++) {
                if (i19 == i11) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                t c11 = m3.h.c(p2.o(qVar2, PageIndicatorDotSize), z1.h.f39128a);
                if (z10) {
                    qVar.X(634204213);
                    quaternary = EchoTheme.INSTANCE.getColors(qVar, EchoTheme.$stable).getText().getPrimary(qVar, EchoThemeColors.Text.$stable);
                    qVar.p(false);
                } else {
                    qVar.X(634294578);
                    quaternary = EchoTheme.INSTANCE.getColors(qVar, EchoTheme.$stable).getText().getQuaternary(qVar, EchoThemeColors.Text.$stable);
                    qVar.p(false);
                }
                p.a(n.h(c11, quaternary, h0.f26395b), qVar, 0);
            }
            qVar.p(false);
            qVar.p(true);
        } else {
            qVar.R();
            tVar2 = tVar;
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps.j
                @Override // ho.p
                public final Object invoke(Object obj, Object obj2) {
                    z PageIndicator$lambda$2;
                    int intValue = ((Integer) obj2).intValue();
                    PageIndicator$lambda$2 = SelectPreviewStepKt.PageIndicator$lambda$2(i10, i11, tVar2, i12, i13, (m) obj, intValue);
                    return PageIndicator$lambda$2;
                }
            };
        }
    }

    public static final z PageIndicator$lambda$0$0(String str, b0 b0Var) {
        b0Var.getClass();
        y.d(str, b0Var);
        return z.f31622a;
    }

    public static final z PageIndicator$lambda$2(int i10, int i11, t tVar, int i12, int i13, m mVar, int i14) {
        PageIndicator(i10, i11, tVar, mVar, r.M(i12 | 1), i13);
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void PreviewPage(VoiceDesignContract.PreviewItem previewItem, boolean z6, ho.a aVar, t tVar, m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        boolean z10;
        t tVar3;
        r1 r10;
        t tVar4;
        String Q;
        int i14;
        String R;
        int i15;
        int i16;
        int i17;
        q qVar = (q) mVar;
        qVar.Z(-1992987956);
        if ((i10 & 6) == 0) {
            if (qVar.f(previewItem)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i12 = i17 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.g(z6)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i12 |= i16;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(aVar)) {
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
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i13;
            if ((i12 & 1171) == 1170) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!qVar.O(i12 & 1, z10)) {
                i3.q qVar2 = i3.q.f13017a;
                if (i18 != 0) {
                    tVar4 = qVar2;
                } else {
                    tVar4 = tVar2;
                }
                Object L = qVar.L();
                u2.e eVar = u2.l.f33918a;
                if (L == eVar) {
                    L = j0.c.o(qVar);
                }
                p1.l lVar = (p1.l) L;
                if (z6) {
                    qVar.X(523949377);
                    Q = kj.c.Q(R.string.voice_design_stop_preview_for, new Object[]{previewItem.getLabel()}, qVar);
                    qVar.p(false);
                } else {
                    qVar.X(524039649);
                    Q = kj.c.Q(R.string.voice_design_play_preview_for, new Object[]{previewItem.getLabel()}, qVar);
                    qVar.p(false);
                }
                t e10 = p2.e(tVar4, 1.0f);
                x a10 = w.a(r1.j.f29230c, i3.d.C0, qVar, 48);
                int hashCode = Long.hashCode(qVar.T);
                o l4 = qVar.l();
                t c5 = i3.a.c(e10, qVar);
                h4.h.f11920i.getClass();
                h4.f fVar = h4.g.f11903b;
                qVar.b0();
                int i19 = i12;
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                h4.e eVar2 = h4.g.f11907f;
                r.J(eVar2, a10, qVar);
                h4.e eVar3 = h4.g.f11906e;
                r.J(eVar3, l4, qVar);
                Integer valueOf = Integer.valueOf(hashCode);
                h4.e eVar4 = h4.g.f11908g;
                r.y(qVar, valueOf, eVar4);
                h4.d dVar = h4.g.f11909h;
                r.F(dVar, qVar);
                h4.e eVar5 = h4.g.f11905d;
                r.J(eVar5, c5, qVar);
                t tVar5 = tVar4;
                t n2 = n.n(InteractionsKt.bounceOnPress$default(p2.o(qVar2, VoiceCircleSize), lVar, 0.9f, u.P, 4, null), lVar, null, false, new p4.k(0), aVar, 12);
                boolean f10 = qVar.f(Q);
                Object L2 = qVar.L();
                if (f10 || L2 == eVar) {
                    L2 = new f(Q, 4);
                    qVar.h0(L2);
                }
                t c10 = p4.q.c(n2, false, (ho.l) L2);
                f1 d10 = p.d(i3.d.f12997a, false);
                int hashCode2 = Long.hashCode(qVar.T);
                o l7 = qVar.l();
                t c11 = i3.a.c(c10, qVar);
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                r.J(eVar2, d10, qVar);
                r.J(eVar3, l7, qVar);
                defpackage.f.u(hashCode2, qVar, eVar4, qVar, dVar);
                r.J(eVar5, c11, qVar);
                VoiceCircleKt.VoiceCircle(true, previewItem.getGeneratedVoiceId(), p2.d(qVar2, 1.0f), false, z6, qVar, ((i19 << 9) & 57344) | 390, 8);
                if (z6) {
                    i14 = io.elevenlabs.ui.R.drawable.ic_pause;
                } else {
                    i14 = io.elevenlabs.ui.R.drawable.ic_play;
                }
                if (z6) {
                    qVar.X(1639290624);
                    R = kj.c.R(qVar, R.string.voice_design_stop_preview);
                    qVar.p(false);
                } else {
                    qVar.X(1639385856);
                    R = kj.c.R(qVar, R.string.voice_design_play_preview);
                    qVar.p(false);
                }
                EchoIconButtonKt.EchoIconButton(i14, aVar, r1.t.f29349a.b(qVar2, i3.d.f13003x0), R, EchoButtonVariant.Primary, EchoButtonSize.Medium, false, false, false, qVar, ((i19 >> 3) & 112) | 221184, 448);
                qVar.p(true);
                r1.d.g(p2.f(qVar2, ElevenLabsTheme.INSTANCE.getSpacings(qVar, ElevenLabsTheme.$stable).m2355getX3D9Ej5fM()), qVar);
                String label = previewItem.getLabel();
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                int i20 = EchoTheme.$stable;
                j7.d(label, null, echoTheme.getColors(qVar, i20).getText().getPrimary(qVar, EchoThemeColors.Text.$stable), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, i20).getSmCompact500(qVar, EchoThemeTypography.$stable), qVar, 0, 0, 131066);
                qVar.p(true);
                tVar3 = tVar5;
            } else {
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new d0(previewItem, z6, aVar, tVar3, i10, i11);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i12 & 1171) == 1170) {
        }
        if (!qVar.O(i12 & 1, z10)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z PreviewPage$lambda$1$0$0(String str, b0 b0Var) {
        b0Var.getClass();
        y.d(str, b0Var);
        y.i(b0Var, 0);
        return z.f31622a;
    }

    public static final z PreviewPage$lambda$2(VoiceDesignContract.PreviewItem previewItem, boolean z6, ho.a aVar, t tVar, int i10, int i11, m mVar, int i12) {
        PreviewPage(previewItem, z6, aVar, tVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void Preview_SelectPreviewStep(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(9922518);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$SelectPreviewStepKt.INSTANCE.m1765getLambda$225759172$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.voices.j(i10, 13);
        }
    }

    public static final z Preview_SelectPreviewStep$lambda$0(int i10, m mVar, int i11) {
        Preview_SelectPreviewStep(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SelectPreviewStep(VoiceDesignContract.State state, ho.l lVar, t tVar, m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        boolean z6;
        ho.l lVar2;
        t tVar3;
        r1 r10;
        t tVar4;
        List<VoiceDesignContract.PreviewItem> list;
        i3.q qVar;
        t tVar5;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        ho.l lVar3;
        int i14;
        int i15;
        state.getClass();
        lVar.getClass();
        q qVar2 = (q) mVar;
        qVar2.Z(-1666436248);
        if ((i10 & 6) == 0) {
            if (qVar2.h(state)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(lVar)) {
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
                i3.q qVar3 = i3.q.f13017a;
                if (i16 != 0) {
                    tVar4 = qVar3;
                } else {
                    tVar4 = tVar2;
                }
                List<VoiceDesignContract.PreviewItem> generatedPreviews = state.getGeneratedPreviews();
                t d10 = p2.d(tVar4, 1.0f);
                i3.j jVar = i3.d.C0;
                r1.e eVar = r1.j.f29230c;
                x a10 = w.a(eVar, jVar, qVar2, 48);
                int hashCode = Long.hashCode(qVar2.T);
                o l4 = qVar2.l();
                t c5 = i3.a.c(d10, qVar2);
                h4.h.f11920i.getClass();
                h4.f fVar = h4.g.f11903b;
                qVar2.b0();
                if (qVar2.S) {
                    qVar2.k(fVar);
                } else {
                    qVar2.k0();
                }
                h4.e eVar2 = h4.g.f11907f;
                r.J(eVar2, a10, qVar2);
                h4.e eVar3 = h4.g.f11906e;
                r.J(eVar3, l4, qVar2);
                Integer valueOf = Integer.valueOf(hashCode);
                h4.e eVar4 = h4.g.f11908g;
                r.y(qVar2, valueOf, eVar4);
                h4.d dVar = h4.g.f11909h;
                r.F(dVar, qVar2);
                int i17 = i12;
                h4.e eVar5 = h4.g.f11905d;
                r.J(eVar5, c5, qVar2);
                t tVar6 = tVar4;
                if (1.0f <= 0.0d) {
                    s1.a.a("invalid weight; must be greater than zero");
                }
                t e10 = p2.e(new m1(1.0f, true), 1.0f);
                f1 d11 = p.d(i3.d.f13001e, false);
                int hashCode2 = Long.hashCode(qVar2.T);
                o l7 = qVar2.l();
                t c10 = i3.a.c(e10, qVar2);
                qVar2.b0();
                if (qVar2.S) {
                    qVar2.k(fVar);
                } else {
                    qVar2.k0();
                }
                r.J(eVar2, d11, qVar2);
                r.J(eVar3, l7, qVar2);
                defpackage.f.u(hashCode2, qVar2, eVar4, qVar2, dVar);
                r.J(eVar5, c10, qVar2);
                boolean isEmpty = generatedPreviews.isEmpty();
                u2.e eVar6 = u2.l.f33918a;
                if (!isEmpty) {
                    qVar2.X(1912100583);
                    x a11 = w.a(eVar, jVar, qVar2, 48);
                    int hashCode3 = Long.hashCode(qVar2.T);
                    o l10 = qVar2.l();
                    t c11 = i3.a.c(qVar3, qVar2);
                    qVar2.b0();
                    if (qVar2.S) {
                        qVar2.k(fVar);
                    } else {
                        qVar2.k0();
                    }
                    r.J(eVar2, a11, qVar2);
                    r.J(eVar3, l10, qVar2);
                    defpackage.f.u(hashCode3, qVar2, eVar4, qVar2, dVar);
                    r.J(eVar5, c11, qVar2);
                    int selectedPreviewIndex = state.getSelectedPreviewIndex();
                    boolean h10 = qVar2.h(generatedPreviews);
                    Object L = qVar2.L();
                    if (h10 || L == eVar6) {
                        L = new k(generatedPreviews, 1);
                        qVar2.h0(L);
                    }
                    w1.c b10 = w1.h0.b(selectedPreviewIndex, (ho.a) L, qVar2, 0, 2);
                    boolean f10 = qVar2.f(b10);
                    if ((i17 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean h11 = f10 | z13 | qVar2.h(generatedPreviews);
                    Object L2 = qVar2.L();
                    if (!h11 && L2 != eVar6) {
                        lVar3 = lVar;
                    } else {
                        lVar3 = lVar;
                        L2 = new SelectPreviewStepKt$SelectPreviewStep$1$1$1$1$1(b10, lVar3, generatedPreviews, null);
                        qVar2.h0(L2);
                    }
                    r.f((ho.p) L2, b10, qVar2);
                    tVar5 = tVar6;
                    list = generatedPreviews;
                    lVar2 = lVar3;
                    z10 = true;
                    qVar = qVar3;
                    gg.b.d(b10, p2.e(qVar3, 1.0f), null, null, 0, u.P, null, null, false, null, null, null, c3.k.d(-908433802, true, new io.elevenlabs.readerapp.core.h(generatedPreviews, state, lVar3, 15), qVar2), qVar2, 48, 24576, 16380);
                    qVar2 = qVar2;
                    ib.i.C(ElevenLabsTheme.INSTANCE, qVar2, ElevenLabsTheme.$stable, qVar, qVar2);
                    PageIndicator(list.size(), state.getSelectedPreviewIndex(), null, qVar2, 0, 4);
                    qVar2.p(true);
                    z11 = false;
                    qVar2.p(false);
                } else {
                    lVar2 = lVar;
                    list = generatedPreviews;
                    qVar = qVar3;
                    tVar5 = tVar6;
                    z10 = true;
                    z11 = false;
                    qVar2.X(1914183070);
                    qVar2.p(false);
                }
                qVar2.p(z10);
                String R = kj.c.R(qVar2, R.string.voice_design_select_voice);
                if ((i17 & 112) == 32) {
                    z12 = z10;
                } else {
                    z12 = z11;
                }
                Object L3 = qVar2.L();
                if (z12 || L3 == eVar6) {
                    L3 = new h(lVar2, 1);
                    qVar2.h0(L3);
                }
                t e11 = p2.e(qVar, 1.0f);
                ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                int i18 = ElevenLabsTheme.$stable;
                q qVar4 = qVar2;
                EchoButtonKt.m1835EchoButton562pCRU(R, (ho.a) L3, r1.d.F(e11, elevenLabsTheme.getSpacings(qVar2, i18).m2357getX5D9Ej5fM(), elevenLabsTheme.getSpacings(qVar2, i18).m2356getX4D9Ej5fM()), EchoButtonVariant.Primary, EchoButtonSize.Large, null, !list.isEmpty(), false, null, false, false, qVar4, 27648, 0, 1952);
                qVar2 = qVar4;
                qVar2.p(z10);
                tVar3 = tVar5;
            } else {
                lVar2 = lVar;
                qVar2.R();
                tVar3 = tVar2;
            }
            r10 = qVar2.r();
            if (r10 == null) {
                r10.f34012d = new i(state, lVar2, tVar3, i10, i11, 1);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i12 & 147) == 146) {
        }
        if (!qVar2.O(i12 & 1, z6)) {
        }
        r10 = qVar2.r();
        if (r10 == null) {
        }
    }

    public static final z SelectPreviewStep$lambda$0$0$0$2(List list, VoiceDesignContract.State state, ho.l lVar, w1.w wVar, int i10, m mVar, int i11) {
        wVar.getClass();
        VoiceDesignContract.PreviewItem previewItem = (VoiceDesignContract.PreviewItem) list.get(i10);
        boolean c5 = kotlin.jvm.internal.m.c(state.getPlayingPreviewId(), previewItem.getGeneratedVoiceId());
        q qVar = (q) mVar;
        boolean g10 = qVar.g(c5) | qVar.f(lVar) | qVar.f(previewItem);
        Object L = qVar.L();
        if (g10 || L == u2.l.f33918a) {
            L = new g(c5, lVar, previewItem, 2);
            qVar.h0(L);
        }
        PreviewPage(previewItem, c5, (ho.a) L, null, qVar, 0, 8);
        return z.f31622a;
    }

    public static final z SelectPreviewStep$lambda$0$0$0$2$0$0(boolean z6, ho.l lVar, VoiceDesignContract.PreviewItem previewItem) {
        if (z6) {
            lVar.invoke(VoiceDesignContract.Event.StopPreview.INSTANCE);
        } else {
            lVar.invoke(new VoiceDesignContract.Event.PlayPreview(previewItem.getGeneratedVoiceId()));
        }
        return z.f31622a;
    }

    public static final z SelectPreviewStep$lambda$0$1$0(ho.l lVar) {
        lVar.invoke(VoiceDesignContract.Event.SelectPreview.INSTANCE);
        return z.f31622a;
    }

    public static final z SelectPreviewStep$lambda$1(VoiceDesignContract.State state, ho.l lVar, t tVar, int i10, int i11, m mVar, int i12) {
        SelectPreviewStep(state, lVar, tVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final /* synthetic */ List access$getMockPreviews$p() {
        return MockPreviews;
    }
}
