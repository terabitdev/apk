package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.messaging.Constants;
import io.elevenlabs.domain.model.Pronunciation;
import io.elevenlabs.domain.model.PronunciationPreviewState;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.components.PronunciationPreviewButtonKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.components.PronunciationPreviewButtonVariant;
import io.elevenlabs.ui.components.ButtonContainerKt;
import io.elevenlabs.ui.components.CloseButtonKt;
import io.elevenlabs.ui.components.DividerKt;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import io.elevenlabs.ui.components.scaffolds.BottomSheetScaffoldKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeShapes;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.elevenlabs.ui.theme.ReaderColors;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import q2.y2;
import r1.i2;
import r1.k2;
import r1.p2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aO\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a9\u0010\u0013\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\b2\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lio/elevenlabs/domain/model/Pronunciation;", "pronunciation", "Lio/elevenlabs/domain/model/PronunciationPreviewState;", "previewState", "Lkotlin/Function0;", "Lsn/z;", "onDismiss", "Lkotlin/Function1;", "", "onEdit", "onPlayPreview", "PronunciationExistsDialog", "(Lio/elevenlabs/domain/model/Pronunciation;Lio/elevenlabs/domain/model/PronunciationPreviewState;Lho/a;Lho/l;Lho/a;Lu2/m;I)V", Constants.ScionAnalytics.PARAM_LABEL, "", ParameterNames.ICON, "onClick", "Li3/t;", "modifier", "PronunciationExistsDialogItem", "(Ljava/lang/String;ILho/a;Li3/t;Lu2/m;II)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class PlayerPronunciationsKt {
    public static final void PronunciationExistsDialog(Pronunciation pronunciation, PronunciationPreviewState pronunciationPreviewState, ho.a aVar, ho.l lVar, ho.a aVar2, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        pronunciation.getClass();
        pronunciationPreviewState.getClass();
        aVar.getClass();
        lVar.getClass();
        aVar2.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-386232554);
        if ((i10 & 6) == 0) {
            if (qVar.h(pronunciation)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i11 = i16 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.d(pronunciationPreviewState.ordinal())) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i11 |= i15;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(aVar)) {
                i14 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i14 = 128;
            }
            i11 |= i14;
        }
        if ((i10 & 3072) == 0) {
            if (qVar.h(lVar)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i13;
        }
        if ((i10 & 24576) == 0) {
            if (qVar.h(aVar2)) {
                i12 = 16384;
            } else {
                i12 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i11 |= i12;
        }
        if ((i11 & 9363) != 9362) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            BottomSheetScaffoldKt.m1899BottomSheetScaffoldjb40ds(true, false, 0L, t2.u.P, aVar, false, (ho.r) c3.k.d(-610826168, true, new io.elevenlabs.readerapp.ui.screens.authenticated.t0(lVar, pronunciation, aVar, pronunciationPreviewState, aVar2), qVar), (u2.m) qVar, ((i11 << 6) & 57344) | 1572870, 46);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new c3.f(pronunciation, pronunciationPreviewState, aVar, lVar, aVar2, i10, 4);
        }
    }

    public static final sn.z PronunciationExistsDialog$lambda$0(ho.l lVar, Pronunciation pronunciation, ho.a aVar, PronunciationPreviewState pronunciationPreviewState, ho.a aVar2, r1.y yVar, BottomSheetControl bottomSheetControl, u2.m mVar, int i10) {
        float f10;
        h4.f fVar;
        yVar.getClass();
        bottomSheetControl.getClass();
        i3.q qVar = i3.q.f13017a;
        i3.t e10 = p2.e(qVar, 1.0f);
        EchoTheme echoTheme = EchoTheme.INSTANCE;
        int i11 = EchoTheme.$stable;
        i3.t I = r1.d.I(e10, t2.u.P, t2.u.P, t2.u.P, echoTheme.getSpacings(mVar, i11).getX6(), 7);
        r1.e eVar = r1.j.f29230c;
        i3.j jVar = i3.d.B0;
        r1.x a10 = r1.w.a(eVar, jVar, mVar, 0);
        u2.q qVar2 = (u2.q) mVar;
        int hashCode = Long.hashCode(qVar2.T);
        c3.o l4 = qVar2.l();
        i3.t c5 = i3.a.c(I, mVar);
        h4.h.f11920i.getClass();
        h4.f fVar2 = h4.g.f11903b;
        h4.f2 f2Var = qVar2.f33969a;
        qVar2.b0();
        if (qVar2.S) {
            qVar2.k(fVar2);
        } else {
            qVar2.k0();
        }
        h4.e eVar2 = h4.g.f11907f;
        u2.r.J(eVar2, a10, mVar);
        h4.e eVar3 = h4.g.f11906e;
        u2.r.J(eVar3, l4, mVar);
        Integer valueOf = Integer.valueOf(hashCode);
        h4.e eVar4 = h4.g.f11908g;
        u2.r.y(mVar, valueOf, eVar4);
        h4.d dVar = h4.g.f11909h;
        u2.r.F(dVar, mVar);
        h4.e eVar5 = h4.g.f11905d;
        u2.r.J(eVar5, c5, mVar);
        r1.d.g(p2.f(qVar, echoTheme.getSpacings(mVar, i11).getX3()), mVar);
        r1.p.a(l1.n.h(m3.h.c(p2.f(p2.s(new r1.x0(i3.d.C0), 40), 4), z1.h.b(999)), ReaderColors.INSTANCE.m2411getNeutral1000d7_KjU(), p3.h0.f26395b), mVar, 0);
        r1.d.g(p2.f(qVar, echoTheme.getSpacings(mVar, i11).getX4()), mVar);
        float x52 = echoTheme.getSpacings(mVar, i11).getX5();
        i3.t G = r1.d.G(p2.e(qVar, 1.0f), x52, t2.u.P, 2);
        r1.u0 u0Var = r1.j.f29228a;
        i3.k kVar = i3.d.f13004y0;
        k2 a11 = i2.a(u0Var, kVar, mVar, 0);
        int hashCode2 = Long.hashCode(qVar2.T);
        c3.o l7 = qVar2.l();
        i3.t c10 = i3.a.c(G, mVar);
        qVar2.b0();
        if (qVar2.S) {
            qVar2.k(fVar2);
        } else {
            qVar2.k0();
        }
        u2.r.J(eVar2, a11, mVar);
        u2.r.J(eVar3, l7, mVar);
        u2.r.y(mVar, Integer.valueOf(hashCode2), eVar4);
        u2.r.F(dVar, mVar);
        u2.r.J(eVar5, c10, mVar);
        if (1.0f <= 0.0d) {
            s1.a.a("invalid weight; must be greater than zero");
        }
        if (1.0f > Float.MAX_VALUE) {
            f10 = Float.MAX_VALUE;
        } else {
            f10 = 1.0f;
        }
        r1.m1 m1Var = new r1.m1(f10, true);
        r1.x a12 = r1.w.a(eVar, jVar, mVar, 0);
        int hashCode3 = Long.hashCode(qVar2.T);
        c3.o l10 = qVar2.l();
        i3.t c11 = i3.a.c(m1Var, mVar);
        qVar2.b0();
        if (qVar2.S) {
            qVar2.k(fVar2);
        } else {
            qVar2.k0();
        }
        u2.r.J(eVar2, a12, mVar);
        u2.r.J(eVar3, l10, mVar);
        u2.r.y(mVar, Integer.valueOf(hashCode3), eVar4);
        u2.r.F(dVar, mVar);
        u2.r.J(eVar5, c11, mVar);
        String R = kj.c.R(mVar, R.string.pronunciations_already_exists_dialog_title);
        EchoThemeTypography typography = echoTheme.getTypography(mVar, i11);
        int i12 = EchoThemeTypography.$stable;
        j7.d(R, p2.e(qVar, 1.0f), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, typography.getSmRegular600(mVar, i12), mVar, 48, 0, 131068);
        r1.d.g(p2.f(qVar, echoTheme.getSpacings(mVar, i11).getX2()), mVar);
        String R2 = kj.c.R(mVar, R.string.pronunciations_already_exists_dialog_message);
        s4.y0 smRegular500 = echoTheme.getTypography(mVar, i11).getSmRegular500(mVar, i12);
        EchoThemeColors.Text text = echoTheme.getColors(mVar, i11).getText();
        int i13 = EchoThemeColors.Text.$stable;
        j7.d(R2, p2.e(qVar, 1.0f), text.getTertiary(mVar, i13), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, smRegular500, mVar, 48, 0, 131064);
        qVar2.p(true);
        CloseButtonKt.CloseButton(aVar, mVar, 0);
        qVar2.p(true);
        r1.d.g(p2.f(qVar, echoTheme.getSpacings(mVar, i11).getX4()), mVar);
        DividerKt.m1828DividerLightiJQMabo(r1.d.G(qVar, x52, t2.u.P, 2), 0L, mVar, 0, 2);
        r1.d.g(p2.f(qVar, echoTheme.getSpacings(mVar, i11).getX4()), mVar);
        i3.t F = r1.d.F(l1.n.h(r1.d.G(p2.e(qVar, 1.0f), x52, t2.u.P, 2), ElevenLabsTheme.INSTANCE.getColor(mVar, ElevenLabsTheme.$stable).getBackground().m2005getSecondary0d7_KjU(), echoTheme.getShapes(mVar, i11).getXl(mVar, EchoThemeShapes.$stable)), echoTheme.getSpacings(mVar, i11).getX2(), echoTheme.getSpacings(mVar, i11).getX3());
        k2 a13 = i2.a(u0Var, kVar, mVar, 48);
        int hashCode4 = Long.hashCode(qVar2.T);
        c3.o l11 = qVar2.l();
        i3.t c12 = i3.a.c(F, mVar);
        qVar2.b0();
        if (qVar2.S) {
            fVar = fVar2;
            qVar2.k(fVar);
        } else {
            fVar = fVar2;
            qVar2.k0();
        }
        u2.r.J(eVar2, a13, mVar);
        u2.r.J(eVar3, l11, mVar);
        u2.r.y(mVar, Integer.valueOf(hashCode4), eVar4);
        u2.r.F(dVar, mVar);
        u2.r.J(eVar5, c12, mVar);
        PronunciationPreviewButtonKt.PronunciationPreviewButton(pronunciationPreviewState, PronunciationPreviewButtonVariant.ITEM, aVar2, null, false, mVar, 48, 24);
        r1.d.g(p2.s(qVar, echoTheme.getSpacings(mVar, i11).getX3()), mVar);
        float f11 = 1.0f;
        if (1.0f <= 0.0d) {
            s1.a.a("invalid weight; must be greater than zero");
        }
        if (1.0f > Float.MAX_VALUE) {
            f11 = Float.MAX_VALUE;
        }
        r1.m1 m1Var2 = new r1.m1(f11, true);
        r1.x a14 = r1.w.a(eVar, jVar, mVar, 0);
        int hashCode5 = Long.hashCode(qVar2.T);
        c3.o l12 = qVar2.l();
        i3.t c13 = i3.a.c(m1Var2, mVar);
        qVar2.b0();
        if (qVar2.S) {
            qVar2.k(fVar);
        } else {
            qVar2.k0();
        }
        u2.r.J(eVar2, a14, mVar);
        u2.r.J(eVar3, l12, mVar);
        u2.r.y(mVar, Integer.valueOf(hashCode5), eVar4);
        u2.r.F(dVar, mVar);
        u2.r.J(eVar5, c13, mVar);
        j7.d(pronunciation.getOriginalText(), null, ib.i.c(echoTheme, mVar, i11, mVar, i13), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(mVar, i11).getSmRegular500(mVar, i12), mVar, 0, 0, 131066);
        j7.d(pronunciation.getSpokenText(), null, echoTheme.getColors(mVar, i11).getText().getTertiary(mVar, i13), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(mVar, i11).getBaseRegular500(mVar, i12), mVar, 0, 0, 131066);
        qVar2.p(true);
        qVar2.p(true);
        r1.d.g(p2.f(qVar, echoTheme.getSpacings(mVar, i11).getX4()), mVar);
        String R3 = kj.c.R(mVar, R.string.pronunciations_list_screen_edit_pronunciation);
        int i14 = io.elevenlabs.ui.R.drawable.text_edit;
        boolean h10 = qVar2.h(bottomSheetControl) | qVar2.f(lVar) | qVar2.h(pronunciation);
        Object L = qVar2.L();
        u2.e eVar6 = u2.l.f33918a;
        if (h10 || L == eVar6) {
            L = new c3.b(bottomSheetControl, lVar, pronunciation, 18);
            qVar2.h0(L);
        }
        PronunciationExistsDialogItem(R3, i14, (ho.a) L, null, mVar, 0, 8);
        String R4 = kj.c.R(mVar, android.R.string.cancel);
        int i15 = io.elevenlabs.ui.R.drawable.close;
        boolean h11 = qVar2.h(bottomSheetControl);
        Object L2 = qVar2.L();
        if (h11 || L2 == eVar6) {
            L2 = new h(bottomSheetControl, 1);
            qVar2.h0(L2);
        }
        PronunciationExistsDialogItem(R4, i15, (ho.a) L2, null, mVar, 0, 8);
        qVar2.p(true);
        return sn.z.f31622a;
    }

    public static final sn.z PronunciationExistsDialog$lambda$0$0$2$0(BottomSheetControl bottomSheetControl, ho.l lVar, Pronunciation pronunciation) {
        bottomSheetControl.close();
        lVar.invoke(pronunciation.getId());
        return sn.z.f31622a;
    }

    public static final sn.z PronunciationExistsDialog$lambda$0$0$3$0(BottomSheetControl bottomSheetControl) {
        bottomSheetControl.close();
        return sn.z.f31622a;
    }

    public static final sn.z PronunciationExistsDialog$lambda$1(Pronunciation pronunciation, PronunciationPreviewState pronunciationPreviewState, ho.a aVar, ho.l lVar, ho.a aVar2, int i10, u2.m mVar, int i11) {
        PronunciationExistsDialog(pronunciation, pronunciationPreviewState, aVar, lVar, aVar2, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void PronunciationExistsDialogItem(final String str, final int i10, ho.a aVar, i3.t tVar, u2.m mVar, int i11, int i12) {
        int i13;
        i3.t tVar2;
        int i14;
        boolean z6;
        u2.r1 r10;
        final i3.t tVar3;
        int i15;
        int i16;
        int i17;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1576900576);
        if ((i11 & 6) == 0) {
            if (qVar.f(str)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i13 = i17 | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            if (qVar.d(i10)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i13 |= i16;
        }
        if ((i11 & 384) == 0) {
            if (qVar.h(aVar)) {
                i15 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i15 = 128;
            }
            i13 |= i15;
        }
        int i18 = i12 & 8;
        if (i18 != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i14 = 2048;
            } else {
                i14 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i13 |= i14;
            if ((i13 & 1171) == 1170) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar.O(i13 & 1, z6)) {
                if (i18 != 0) {
                    tVar3 = i3.q.f13017a;
                } else {
                    tVar3 = tVar2;
                }
                ButtonContainerKt.m1780ButtonContainer83mGB3Q(str, aVar, null, 0L, false, 0, null, false, null, c3.k.d(1980488132, true, new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.g0
                    @Override // ho.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        sn.z PronunciationExistsDialogItem$lambda$0;
                        int intValue = ((Integer) obj3).intValue();
                        PronunciationExistsDialogItem$lambda$0 = PlayerPronunciationsKt.PronunciationExistsDialogItem$lambda$0(i3.t.this, i10, str, (r1.s) obj, (u2.m) obj2, intValue);
                        return PronunciationExistsDialogItem$lambda$0;
                    }
                }, qVar), qVar, (i13 & 14) | 805306368 | ((i13 >> 3) & 112), 508);
                tVar2 = tVar3;
            } else {
                qVar.R();
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new h0(str, i10, aVar, tVar2, i11, i12);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i13 & 1171) == 1170) {
        }
        if (!qVar.O(i13 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z PronunciationExistsDialogItem$lambda$0(i3.t tVar, int i10, String str, r1.s sVar, u2.m mVar, int i11) {
        boolean z6;
        sVar.getClass();
        if ((i11 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i11 & 1, z6)) {
            i3.t e10 = p2.e(tVar, 1.0f);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i12 = EchoTheme.$stable;
            i3.t G = r1.d.G(e10, echoTheme.getSpacings(qVar, i12).getX5(), t2.u.P, 2);
            k2 a10 = i2.a(r1.j.f29228a, i3.d.f13005z0, qVar, 48);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(G, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(h4.g.f11907f, a10, qVar);
            u2.r.J(h4.g.f11906e, l4, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c5, qVar);
            float x32 = echoTheme.getSpacings(qVar, i12).getX3();
            i3.q qVar2 = i3.q.f13017a;
            y2.a(kd.a.M(i10, qVar, 0), null, p2.o(r1.d.G(qVar2, t2.u.P, x32, 1), 20), echoTheme.getColors(qVar, i12).getText().getTertiary(qVar, EchoThemeColors.Text.$stable), qVar, u3.c.$stable | 48, 0);
            r1.d.g(p2.s(qVar2, echoTheme.getSpacings(qVar, i12).getX4()), qVar);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            j7.d(str, new r1.m1(1.0f, true), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, echoTheme.getTypography(qVar, i12).getSmRegular500(qVar, EchoThemeTypography.$stable), qVar, 0, 24960, 110588);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z PronunciationExistsDialogItem$lambda$1(String str, int i10, ho.a aVar, i3.t tVar, int i11, int i12, u2.m mVar, int i13) {
        PronunciationExistsDialogItem(str, i10, aVar, tVar, mVar, u2.r.M(i11 | 1), i12);
        return sn.z.f31622a;
    }
}
