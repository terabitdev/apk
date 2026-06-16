package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.messaging.Constants;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.animations.AnimatedVisibilityContainersKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.d5;
import q2.j7;
import q2.y2;
import r1.i2;
import r1.k2;
import r1.p2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001aU\u0010\n\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u001e\u0010\t\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0004\u0012\u00020\u00050\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001aM\u0010\u0015\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u000e\u001a\u00020\r2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\b\u0001\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001d\u0010\u0017\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u000f\u0010\u0019\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u000f\u0010\u001b\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u001b\u0010\u001a¨\u0006\u001c"}, d2 = {"", "seekUndoVisible", "centerHighlightedContentVisible", "assistantButtonVisible", "Lkotlin/Function0;", "Lsn/z;", "onClickAssistant", "Lkotlin/Function1;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/PlayerViewModel;", "action", "PlayerFloatingBottomControls", "(ZZZLho/a;Lho/l;Lu2/m;I)V", "onClick", "", "iconResId", Constants.ScionAnalytics.PARAM_LABEL, "accessibilityLabel", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/ShapeType;", "shapeType", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/ColorVariant;", "colorVariant", "PlayerFloatingBottomButton", "(Lho/a;ILjava/lang/Integer;ILio/elevenlabs/readerapp/ui/screens/authenticated/player/ShapeType;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/ColorVariant;Lu2/m;I)V", "AssistantFloatingButton", "(Lho/a;Lu2/m;I)V", "Preview_PlayerFloatingBottomButton", "(Lu2/m;I)V", "Preview_PlayerFloatingBottomControls", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class PlayerFloatingBottomControlsKt {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ShapeType.values().length];
            try {
                iArr[ShapeType.Full.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShapeType.RoundedCorners.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ColorVariant.values().length];
            try {
                iArr2[ColorVariant.Background.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ColorVariant.Inverted.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private static final void AssistantFloatingButton(ho.a aVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        ho.a aVar2;
        u2.q qVar;
        int i12;
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-537269642);
        if ((i10 & 6) == 0) {
            if (qVar2.h(aVar)) {
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
        if (qVar2.O(i11 & 1, z6)) {
            i3.t o6 = p2.o(i3.q.f13017a, 52);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i13 = EchoTheme.$stable;
            aVar2 = aVar;
            d5.g(aVar2, o6, false, d5.q(echoTheme.getColors(qVar2, i13).getFill().getPrimary(qVar2, EchoThemeColors.Fill.$stable), echoTheme.getColors(qVar2, i13).getText().getOnFillPrimary(qVar2, EchoThemeColors.Text.$stable), 0L, 0L, qVar2, 12), null, ComposableSingletons$PlayerFloatingBottomControlsKt.INSTANCE.getLambda$1660688148$app_productionRelease(), qVar2, (i11 & 14) | 1572912, 52);
            qVar = qVar2;
        } else {
            aVar2 = aVar;
            qVar = qVar2;
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new hm.b(aVar2, i10, 8);
        }
    }

    public static final sn.z AssistantFloatingButton$lambda$0(ho.a aVar, int i10, u2.m mVar, int i11) {
        AssistantFloatingButton(aVar, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    private static final void PlayerFloatingBottomButton(final ho.a aVar, final int i10, final Integer num, final int i11, final ShapeType shapeType, final ColorVariant colorVariant, u2.m mVar, final int i12) {
        int i13;
        boolean z6;
        p3.b1 full;
        i3.t j4;
        long m2104getFloatingButtonBg0d7_KjU;
        boolean z10;
        long m2105getFloatingButtonIcon0d7_KjU;
        boolean z11;
        long m2106getFloatingButtonText0d7_KjU;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1493675570);
        if ((i12 & 6) == 0) {
            if (qVar.h(aVar)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i13 = i19 | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            if (qVar.d(i10)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i13 |= i18;
        }
        if ((i12 & 384) == 0) {
            if (qVar.f(num)) {
                i17 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i17 = 128;
            }
            i13 |= i17;
        }
        if ((i12 & 3072) == 0) {
            if (qVar.d(i11)) {
                i16 = 2048;
            } else {
                i16 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i13 |= i16;
        }
        if ((i12 & 24576) == 0) {
            if (qVar.d(shapeType.ordinal())) {
                i15 = 16384;
            } else {
                i15 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i13 |= i15;
        }
        if ((196608 & i12) == 0) {
            if (qVar.d(colorVariant.ordinal())) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            i13 |= i14;
        }
        if ((74899 & i13) != 74898) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i13 & 1, z6)) {
            int i20 = WhenMappings.$EnumSwitchMapping$0[shapeType.ordinal()];
            if (i20 != 1) {
                if (i20 == 2) {
                    qVar.X(903157684);
                    full = ElevenLabsTheme.INSTANCE.getShapes(qVar, ElevenLabsTheme.$stable).getMx();
                    qVar.p(false);
                } else {
                    throw com.google.android.gms.internal.play_billing.b.h(903153598, qVar, false);
                }
            } else {
                qVar.X(903155638);
                full = ElevenLabsTheme.INSTANCE.getShapes(qVar, ElevenLabsTheme.$stable).getFull();
                qVar.p(false);
            }
            String R = kj.c.R(qVar, i11);
            i3.k kVar = i3.d.f13005z0;
            qVar.X(903164067);
            int[] iArr = WhenMappings.$EnumSwitchMapping$1;
            int i21 = iArr[colorVariant.ordinal()];
            i3.q qVar2 = i3.q.f13017a;
            if (i21 != 1) {
                if (i21 == 2) {
                    qVar.X(170258625);
                    qVar.p(false);
                    j4 = qVar2;
                } else {
                    throw com.google.android.gms.internal.play_billing.b.h(-687255558, qVar, false);
                }
            } else {
                qVar.X(169976866);
                j4 = l1.n.j(1, ElevenLabsTheme.INSTANCE.getColor(qVar, ElevenLabsTheme.$stable).getDivider().m2058getLightLine0d7_KjU(), qVar2, full);
                qVar.p(false);
            }
            qVar.p(false);
            i3.t c5 = m3.h.c(j4, full);
            boolean f10 = qVar.f(R);
            Object L = qVar.L();
            Object obj = u2.l.f33918a;
            if (f10 || L == obj) {
                L = new y1(R, 8);
                qVar.h0(L);
            }
            i3.t c10 = p4.q.c(c5, true, (ho.l) L);
            Object L2 = qVar.L();
            if (L2 == obj) {
                L2 = j0.c.o(qVar);
            }
            i3.t p10 = l1.n.p(c10, false, null, null, (p1.l) L2, aVar, 7);
            int i22 = iArr[colorVariant.ordinal()];
            if (i22 != 1) {
                if (i22 == 2) {
                    qVar.X(903196586);
                    m2104getFloatingButtonBg0d7_KjU = ElevenLabsTheme.INSTANCE.getColor(qVar, ElevenLabsTheme.$stable).getPlayer().m2107getInvertedFloatingButtonBg0d7_KjU();
                    qVar.p(false);
                } else {
                    throw com.google.android.gms.internal.play_billing.b.h(903190745, qVar, false);
                }
            } else {
                qVar.X(903193666);
                m2104getFloatingButtonBg0d7_KjU = ElevenLabsTheme.INSTANCE.getColor(qVar, ElevenLabsTheme.$stable).getPlayer().m2104getFloatingButtonBg0d7_KjU();
                qVar.p(false);
            }
            i3.t h10 = l1.n.h(p10, m2104getFloatingButtonBg0d7_KjU, p3.h0.f26395b);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i23 = ElevenLabsTheme.$stable;
            i3.t F = r1.d.F(h10, elevenLabsTheme.getSpacings(qVar, i23).m2356getX4D9Ej5fM(), elevenLabsTheme.getSpacings(qVar, i23).m2353getX2D9Ej5fM());
            k2 a10 = i2.a(r1.j.f29228a, kVar, qVar, 48);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c11 = i3.a.c(F, qVar);
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
            u2.r.J(h4.g.f11905d, c11, qVar);
            i3.t o6 = p2.o(qVar2, 16);
            u3.c M = kd.a.M(i10, qVar, (i13 >> 3) & 14);
            int i24 = iArr[colorVariant.ordinal()];
            if (i24 != 1) {
                if (i24 == 2) {
                    qVar.X(-980253616);
                    m2105getFloatingButtonIcon0d7_KjU = elevenLabsTheme.getColor(qVar, i23).getPlayer().m2108getInvertedFloatingButtonIcon0d7_KjU();
                    z10 = false;
                    qVar.p(false);
                } else {
                    throw com.google.android.gms.internal.play_billing.b.h(-980259275, qVar, false);
                }
            } else {
                z10 = false;
                qVar.X(-980256472);
                m2105getFloatingButtonIcon0d7_KjU = elevenLabsTheme.getColor(qVar, i23).getPlayer().m2105getFloatingButtonIcon0d7_KjU();
                qVar.p(false);
            }
            y2.a(M, null, o6, m2105getFloatingButtonIcon0d7_KjU, qVar, u3.c.$stable | 432, 0);
            if (num != null) {
                qVar.X(-322942935);
                String R2 = kj.c.R(qVar, num.intValue());
                s4.y0 bodySmall500 = elevenLabsTheme.getTypo(qVar, i23).getBodySmall500();
                int i25 = iArr[colorVariant.ordinal()];
                if (i25 != 1) {
                    if (i25 == 2) {
                        qVar.X(-980238928);
                        m2106getFloatingButtonText0d7_KjU = elevenLabsTheme.getColor(qVar, i23).getPlayer().m2109getInvertedFloatingButtonText0d7_KjU();
                        z11 = false;
                        qVar.p(false);
                    } else {
                        throw com.google.android.gms.internal.play_billing.b.h(-980244831, qVar, false);
                    }
                } else {
                    z11 = false;
                    qVar.X(-980241912);
                    m2106getFloatingButtonText0d7_KjU = elevenLabsTheme.getColor(qVar, i23).getPlayer().m2106getFloatingButtonText0d7_KjU();
                    qVar.p(false);
                }
                j7.d(R2, r1.d.I(qVar2, elevenLabsTheme.getSpacings(qVar, i23).m2353getX2D9Ej5fM(), t2.u.P, t2.u.P, t2.u.P, 14), m2106getFloatingButtonText0d7_KjU, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, bodySmall500, qVar, 0, 24960, 110584);
                qVar = qVar;
                qVar.p(z11);
            } else {
                qVar.X(-322407348);
                qVar.p(false);
            }
            qVar.p(true);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.p
                @Override // ho.p
                public final Object invoke(Object obj2, Object obj3) {
                    sn.z PlayerFloatingBottomButton$lambda$4;
                    int intValue = ((Integer) obj3).intValue();
                    PlayerFloatingBottomButton$lambda$4 = PlayerFloatingBottomControlsKt.PlayerFloatingBottomButton$lambda$4(ho.a.this, i10, num, i11, shapeType, colorVariant, i12, (u2.m) obj2, intValue);
                    return PlayerFloatingBottomButton$lambda$4;
                }
            };
        }
    }

    public static final sn.z PlayerFloatingBottomButton$lambda$1$0(String str, p4.b0 b0Var) {
        b0Var.getClass();
        p4.y.i(b0Var, 0);
        p4.y.d(str, b0Var);
        return sn.z.f31622a;
    }

    public static final sn.z PlayerFloatingBottomButton$lambda$4(ho.a aVar, int i10, Integer num, int i11, ShapeType shapeType, ColorVariant colorVariant, int i12, u2.m mVar, int i13) {
        PlayerFloatingBottomButton(aVar, i10, num, i11, shapeType, colorVariant, mVar, u2.r.M(i12 | 1));
        return sn.z.f31622a;
    }

    public static final void PlayerFloatingBottomControls(final boolean z6, final boolean z10, final boolean z11, ho.a aVar, final ho.l lVar, u2.m mVar, final int i10) {
        int i11;
        boolean z12;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        final ho.a aVar2 = aVar;
        aVar2.getClass();
        lVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1978272901);
        if ((i10 & 6) == 0) {
            if (qVar.g(z6)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i11 = i16 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.g(z10)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i11 |= i15;
        }
        if ((i10 & 384) == 0) {
            if (qVar.g(z11)) {
                i14 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i14 = 128;
            }
            i11 |= i14;
        }
        if ((i10 & 3072) == 0) {
            if (qVar.h(aVar2)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i13;
        }
        if ((i10 & 24576) == 0) {
            if (qVar.h(lVar)) {
                i12 = 16384;
            } else {
                i12 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i11 |= i12;
        }
        if ((i11 & 9363) != 9362) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (qVar.O(i11 & 1, z12)) {
            i3.q qVar2 = i3.q.f13017a;
            i3.t e10 = p2.e(qVar2, 1.0f);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i17 = ElevenLabsTheme.$stable;
            i3.t I = r1.d.I(e10, elevenLabsTheme.getSpacings(qVar, i17).m2357getX5D9Ej5fM(), t2.u.P, elevenLabsTheme.getSpacings(qVar, i17).m2357getX5D9Ej5fM(), elevenLabsTheme.getSpacings(qVar, i17).m2353getX2D9Ej5fM(), 2);
            i3.l lVar2 = i3.d.f12997a;
            f4.f1 d10 = r1.p.d(lVar2, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(I, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            h4.e eVar = h4.g.f11907f;
            u2.r.J(eVar, d10, qVar);
            h4.e eVar2 = h4.g.f11906e;
            u2.r.J(eVar2, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar3 = h4.g.f11908g;
            u2.r.y(qVar, valueOf, eVar3);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar);
            h4.e eVar4 = h4.g.f11905d;
            u2.r.J(eVar4, c5, qVar);
            i3.l lVar3 = i3.d.f13001e;
            r1.t tVar = r1.t.f29349a;
            i3.t b10 = tVar.b(qVar2, lVar3);
            int i18 = i11;
            f4.f1 d11 = r1.p.d(lVar2, false);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c10 = i3.a.c(b10, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar, d11, qVar);
            u2.r.J(eVar2, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c10, qVar);
            AnimatedVisibilityContainersKt.AnimatedSlideBottomVisibility(z6, c3.k.d(1218715866, true, new n(lVar, 0), qVar), qVar, (i18 & 14) | 48);
            qVar.p(true);
            i3.t b11 = tVar.b(qVar2, i3.d.f13002f);
            r1.u0 u0Var = r1.j.f29228a;
            r1.x a10 = r1.w.a(ib.i.m(EchoTheme.INSTANCE, qVar, EchoTheme.$stable), i3.d.C0, qVar, 48);
            int hashCode3 = Long.hashCode(qVar.T);
            c3.o l10 = qVar.l();
            i3.t c11 = i3.a.c(b11, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar, a10, qVar);
            u2.r.J(eVar2, l10, qVar);
            defpackage.f.u(hashCode3, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c11, qVar);
            AnimatedVisibilityContainersKt.AnimatedSlideBottomVisibility(z10, c3.k.d(-816830038, true, new n(lVar, 1), qVar), qVar, ((i18 >> 3) & 14) | 48);
            if (z11) {
                qVar.X(-796237114);
                aVar2 = aVar;
                AssistantFloatingButton(aVar2, qVar, (i18 >> 9) & 14);
                qVar.p(false);
            } else {
                aVar2 = aVar;
                qVar.X(-796157351);
                qVar.p(false);
            }
            qVar.p(true);
            qVar.p(true);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.o
                @Override // ho.p
                public final Object invoke(Object obj, Object obj2) {
                    sn.z PlayerFloatingBottomControls$lambda$1;
                    int intValue = ((Integer) obj2).intValue();
                    PlayerFloatingBottomControls$lambda$1 = PlayerFloatingBottomControlsKt.PlayerFloatingBottomControls$lambda$1(z6, z10, z11, aVar2, lVar, i10, (u2.m) obj, intValue);
                    return PlayerFloatingBottomControls$lambda$1;
                }
            };
        }
    }

    public static final sn.z PlayerFloatingBottomControls$lambda$0$0$0(ho.l lVar, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            int i11 = R.drawable.undo_seek;
            int i12 = io.elevenlabs.readerapp.R.string.player_undo_seek;
            int i13 = io.elevenlabs.readerapp.R.string.accessibility_go_back;
            ShapeType shapeType = ShapeType.RoundedCorners;
            ColorVariant colorVariant = ColorVariant.Background;
            boolean f10 = qVar.f(lVar);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new l(lVar, 1);
                qVar.h0(L);
            }
            PlayerFloatingBottomButton((ho.a) L, i11, Integer.valueOf(i12), i13, shapeType, colorVariant, qVar, 221184);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z PlayerFloatingBottomControls$lambda$0$0$0$0$0(ho.l lVar) {
        lVar.invoke(new m(1));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerFloatingBottomControls$lambda$0$0$0$0$0$0(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.undoSeek();
        return sn.z.f31622a;
    }

    public static final sn.z PlayerFloatingBottomControls$lambda$0$1$0(ho.l lVar, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            int i11 = R.drawable.center_position_2;
            int i12 = io.elevenlabs.readerapp.R.string.player_accessibility_center_highlighted_content;
            ShapeType shapeType = ShapeType.Full;
            ColorVariant colorVariant = ColorVariant.Inverted;
            boolean f10 = qVar.f(lVar);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new l(lVar, 0);
                qVar.h0(L);
            }
            PlayerFloatingBottomButton((ho.a) L, i11, null, i12, shapeType, colorVariant, qVar, 221568);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z PlayerFloatingBottomControls$lambda$0$1$0$0$0(ho.l lVar) {
        lVar.invoke(new m(2));
        return sn.z.f31622a;
    }

    public static final sn.z PlayerFloatingBottomControls$lambda$0$1$0$0$0$0(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.onCenterHighlightClick();
        return sn.z.f31622a;
    }

    public static final sn.z PlayerFloatingBottomControls$lambda$1(boolean z6, boolean z10, boolean z11, ho.a aVar, ho.l lVar, int i10, u2.m mVar, int i11) {
        PlayerFloatingBottomControls(z6, z10, z11, aVar, lVar, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_PlayerFloatingBottomButton(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-86509955);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            r1.x a10 = r1.w.a(r1.j.g(8), i3.d.B0, qVar, 6);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(i3.q.f13017a, qVar);
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
            int i11 = R.drawable.undo_seek;
            int i12 = io.elevenlabs.readerapp.R.string.player_undo_seek;
            int i13 = io.elevenlabs.readerapp.R.string.accessibility_go_back;
            ShapeType shapeType = ShapeType.RoundedCorners;
            ColorVariant colorVariant = ColorVariant.Background;
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new i(6);
                qVar.h0(L);
            }
            PlayerFloatingBottomButton((ho.a) L, i11, Integer.valueOf(i12), i13, shapeType, colorVariant, qVar, 221190);
            int i14 = R.drawable.center_position_2;
            int i15 = io.elevenlabs.readerapp.R.string.accessibility_go_back;
            ShapeType shapeType2 = ShapeType.Full;
            ColorVariant colorVariant2 = ColorVariant.Inverted;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new i(7);
                qVar.h0(L2);
            }
            PlayerFloatingBottomButton((ho.a) L2, i14, null, i15, shapeType2, colorVariant2, qVar, 221574);
            qVar.p(true);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.library.a0(i10, 10);
        }
    }

    public static final sn.z Preview_PlayerFloatingBottomButton$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_PlayerFloatingBottomButton(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_PlayerFloatingBottomControls(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-480093127);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new i(8);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new m(0);
                qVar.h0(L2);
            }
            PlayerFloatingBottomControls(true, true, true, aVar, (ho.l) L2, qVar, 28086);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.library.a0(i10, 11);
        }
    }

    public static final sn.z Preview_PlayerFloatingBottomControls$lambda$1$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_PlayerFloatingBottomControls$lambda$2(int i10, u2.m mVar, int i11) {
        Preview_PlayerFloatingBottomControls(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
