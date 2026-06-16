package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.messaging.Constants;
import com.google.protobuf.c6;
import f4.f1;
import h4.f2;
import io.elevenlabs.domain.model.BluetoothButton;
import io.elevenlabs.domain.model.BluetoothButtonAction;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.ButtonContainerKt;
import io.elevenlabs.ui.components.DividerKt;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import io.elevenlabs.ui.components.scaffolds.BottomSheetScaffoldKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeShapes;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.livekit.android.rpc.RpcError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import q2.y2;
import r1.i2;
import r1.k2;
import r1.m1;
import r1.p2;
import u2.r1;
import u2.s2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\u001aA\u0010\t\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a-\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0001¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u001a²\u0006\f\u0010\u0019\u001a\u00020\u00188\nX\u008a\u0084\u0002"}, d2 = {"Lio/elevenlabs/domain/model/BluetoothButton;", "button", "Lio/elevenlabs/domain/model/BluetoothButtonAction;", "currentAction", "Lkotlin/Function1;", "Lsn/z;", "onActionSelected", "Lkotlin/Function0;", "onDismiss", "BluetoothActionSelectorSheet", "(Lio/elevenlabs/domain/model/BluetoothButton;Lio/elevenlabs/domain/model/BluetoothButtonAction;Lho/l;Lho/a;Lu2/m;I)V", "", "getAvailableActionsForButton", "(Lio/elevenlabs/domain/model/BluetoothButton;)Ljava/util/List;", "action", "", "getActionLabel", "(Lio/elevenlabs/domain/model/BluetoothButtonAction;Lu2/m;I)Ljava/lang/String;", Constants.ScionAnalytics.PARAM_LABEL, "", "isSelected", "onSelect", "ActionItem", "(Ljava/lang/String;ZLho/a;Lu2/m;I)V", "", "alpha", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class BluetoothActionSelectorSheetKt {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[BluetoothButton.values().length];
            try {
                iArr[BluetoothButton.NEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BluetoothButton.PREVIOUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BluetoothButton.FORWARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BluetoothButton.BACK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BluetoothButtonAction.values().length];
            try {
                iArr2[BluetoothButtonAction.SKIP_FORWARD_15.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[BluetoothButtonAction.SKIP_FORWARD_30.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[BluetoothButtonAction.SKIP_FORWARD_60.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[BluetoothButtonAction.SKIP_BACKWARD_15.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[BluetoothButtonAction.SKIP_BACKWARD_30.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[BluetoothButtonAction.SKIP_BACKWARD_60.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[BluetoothButtonAction.NEXT_CHAPTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[BluetoothButtonAction.PREVIOUS_CHAPTER.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[BluetoothButtonAction.VOICE_CHAT.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[BluetoothButtonAction.BOOKMARK.ordinal()] = 10;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[BluetoothButtonAction.PLAY_PAUSE.ordinal()] = 11;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[BluetoothButtonAction.NOTHING.ordinal()] = 12;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final void ActionItem(String str, boolean z6, ho.a aVar, u2.m mVar, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        int i14;
        str.getClass();
        aVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-2132176455);
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
            if (qVar.g(z6)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(aVar)) {
                i12 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (qVar.O(i11 & 1, z10)) {
            ButtonContainerKt.m1780ButtonContainer83mGB3Q(str, aVar, null, 0L, false, 0, null, false, null, c3.k.d(-1884952491, true, new io.elevenlabs.readerapp.ui.screens.authenticated.assistant.a(1, str, z6), qVar), qVar, (i11 & 14) | 805306368 | ((i11 >> 3) & 112), 508);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.collections.e(str, z6, aVar, i10, 1);
        }
    }

    public static final sn.z ActionItem$lambda$0(boolean z6, String str, r1.s sVar, u2.m mVar, int i10) {
        boolean z10;
        float f10;
        sVar.getClass();
        if ((i10 & 17) != 16) {
            z10 = true;
        } else {
            z10 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z10)) {
            i3.q qVar2 = i3.q.f13017a;
            i3.t e10 = p2.e(qVar2, 1.0f);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i11 = EchoTheme.$stable;
            i3.t G = r1.d.G(e10, echoTheme.getSpacings(qVar, i11).getX5(), t2.u.P, 2);
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
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            i3.t I = r1.d.I(new m1(1.0f, true), t2.u.P, echoTheme.getSpacings(qVar, i11).getX3(), echoTheme.getSpacings(qVar, i11).getX4(), echoTheme.getSpacings(qVar, i11).getX3(), 1);
            r1.x a11 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c10 = i3.a.c(I, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar, a11, qVar);
            u2.r.J(eVar2, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c10, qVar);
            j7.d(str, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, i11).getBaseRegular500(qVar, EchoThemeTypography.$stable), qVar, 0, 0, 131070);
            qVar.p(true);
            if (z6) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            s2 b10 = j1.f.b(f10, null, "alpha", qVar, 3072, 22);
            i3.t o6 = p2.o(qVar2, 48);
            f1 d10 = r1.p.d(i3.d.f13001e, false);
            int hashCode3 = Long.hashCode(qVar.T);
            c3.o l10 = qVar.l();
            i3.t c11 = i3.a.c(o6, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar, d10, qVar);
            u2.r.J(eVar2, l10, qVar);
            defpackage.f.u(hashCode3, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c11, qVar);
            y2.a(kd.a.M(R.drawable.checkmark_1, qVar, 0), null, r1.d.E(l1.n.h(p2.o(m3.h.a(qVar2, ActionItem$lambda$0$0$1(b10)), 24), echoTheme.getColors(qVar, i11).getText().getPrimary(qVar, EchoThemeColors.Text.$stable), echoTheme.getShapes(qVar, i11).getFull(qVar, EchoThemeShapes.$stable)), 5), echoTheme.getColors(qVar, i11).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable), qVar, u3.c.$stable | 48, 0);
            qVar.p(true);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    private static final float ActionItem$lambda$0$0$1(s2 s2Var) {
        return ((Number) s2Var.getValue()).floatValue();
    }

    public static final sn.z ActionItem$lambda$1(String str, boolean z6, ho.a aVar, int i10, u2.m mVar, int i11) {
        ActionItem(str, z6, aVar, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void BluetoothActionSelectorSheet(BluetoothButton bluetoothButton, BluetoothButtonAction bluetoothButtonAction, ho.l lVar, ho.a aVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        int i13;
        int i14;
        int i15;
        bluetoothButton.getClass();
        bluetoothButtonAction.getClass();
        lVar.getClass();
        aVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1488092226);
        if ((i10 & 6) == 0) {
            if (qVar.d(bluetoothButton.ordinal())) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i11 = i15 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.d(bluetoothButtonAction.ordinal())) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i11 |= i14;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(lVar)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i11 |= i13;
        }
        if ((i10 & 3072) == 0) {
            if (qVar.h(aVar)) {
                i12 = 2048;
            } else {
                i12 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i12;
        }
        if ((i11 & 1171) != 1170) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            BottomSheetScaffoldKt.EchoBottomSheetScaffold(false, aVar, null, false, null, ComposableSingletons$BluetoothActionSelectorSheetKt.INSTANCE.m1490getLambda$861251588$app_productionRelease(), c3.k.d(-1601182901, true, new io.elevenlabs.readerapp.core.h(getAvailableActionsForButton(bluetoothButton), bluetoothButtonAction, lVar, 7), qVar), qVar, ((i11 >> 6) & 112) | 1769472, 29);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new c3.d(bluetoothButton, bluetoothButtonAction, lVar, aVar, i10, 4);
        }
    }

    public static final sn.z BluetoothActionSelectorSheet$lambda$0(List list, BluetoothButtonAction bluetoothButtonAction, final ho.l lVar, r1.y yVar, final BottomSheetControl bottomSheetControl, u2.m mVar, int i10) {
        i3.q qVar;
        boolean z6;
        u2.q qVar2;
        u2.e eVar;
        boolean z10;
        char c5;
        i3.q qVar3;
        boolean z11;
        boolean z12;
        i3.q qVar4;
        boolean z13;
        i3.q qVar5;
        boolean z14;
        i3.q qVar6;
        boolean z15;
        i3.q qVar7;
        u2.m mVar2 = mVar;
        yVar.getClass();
        bottomSheetControl.getClass();
        i3.q qVar8 = i3.q.f13017a;
        i3.t y10 = l1.n.y(p2.e(qVar8, 1.0f), l1.n.x(mVar2), true, true);
        r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, mVar2, 0);
        u2.q qVar9 = (u2.q) mVar2;
        int hashCode = Long.hashCode(qVar9.T);
        c3.o l4 = qVar9.l();
        i3.t c10 = i3.a.c(y10, mVar2);
        h4.h.f11920i.getClass();
        h4.f fVar = h4.g.f11903b;
        f2 f2Var = qVar9.f33969a;
        qVar9.b0();
        if (qVar9.S) {
            qVar9.k(fVar);
        } else {
            qVar9.k0();
        }
        u2.r.J(h4.g.f11907f, a10, mVar2);
        u2.r.J(h4.g.f11906e, l4, mVar2);
        u2.r.y(mVar2, Integer.valueOf(hashCode), h4.g.f11908g);
        u2.r.F(h4.g.f11909h, mVar2);
        u2.r.J(h4.g.f11905d, c10, mVar2);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (ig.f.I(BluetoothButtonAction.SKIP_FORWARD_15, BluetoothButtonAction.SKIP_FORWARD_30, BluetoothButtonAction.SKIP_FORWARD_60).contains((BluetoothButtonAction) obj)) {
                arrayList.add(obj);
            }
        }
        boolean isEmpty = arrayList.isEmpty();
        u2.e eVar2 = u2.l.f33918a;
        if (!isEmpty) {
            qVar9.X(1726599912);
            String R = kj.c.R(mVar2, io.elevenlabs.readerapp.R.string.player_preferences_controls_skip_forward_section);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i11 = EchoTheme.$stable;
            i3.q qVar10 = qVar8;
            u2.e eVar3 = eVar2;
            qVar2 = qVar9;
            j7.d(R, r1.d.F(qVar8, echoTheme.getSpacings(mVar2, i11).getX5(), echoTheme.getSpacings(mVar2, i11).getX2()), echoTheme.getColors(mVar2, i11).getText().getSecondary(mVar2, EchoThemeColors.Text.$stable), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(mVar2, i11).getSmRegular600(mVar2, EchoThemeTypography.$stable), mVar, 0, 0, 131064);
            mVar2 = mVar;
            qVar2.X(-1329761376);
            Iterator it = arrayList.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i13 = i12 + 1;
                if (i12 >= 0) {
                    final BluetoothButtonAction bluetoothButtonAction2 = (BluetoothButtonAction) next;
                    String actionLabel = getActionLabel(bluetoothButtonAction2, mVar2, 0);
                    if (bluetoothButtonAction == bluetoothButtonAction2) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    boolean f10 = qVar2.f(lVar) | qVar2.d(bluetoothButtonAction2.ordinal()) | qVar2.h(bottomSheetControl);
                    Object L = qVar2.L();
                    u2.e eVar4 = eVar3;
                    if (f10 || L == eVar4) {
                        final int i14 = 0;
                        L = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.a
                            @Override // ho.a
                            public final Object invoke() {
                                sn.z BluetoothActionSelectorSheet$lambda$0$0$1$0$0;
                                sn.z BluetoothActionSelectorSheet$lambda$0$0$3$0$0;
                                sn.z BluetoothActionSelectorSheet$lambda$0$0$5$0$0;
                                sn.z BluetoothActionSelectorSheet$lambda$0$0$7$0$0;
                                switch (i14) {
                                    case 0:
                                        BluetoothActionSelectorSheet$lambda$0$0$1$0$0 = BluetoothActionSelectorSheetKt.BluetoothActionSelectorSheet$lambda$0$0$1$0$0(lVar, bluetoothButtonAction2, bottomSheetControl);
                                        return BluetoothActionSelectorSheet$lambda$0$0$1$0$0;
                                    case 1:
                                        BluetoothActionSelectorSheet$lambda$0$0$3$0$0 = BluetoothActionSelectorSheetKt.BluetoothActionSelectorSheet$lambda$0$0$3$0$0(lVar, bluetoothButtonAction2, bottomSheetControl);
                                        return BluetoothActionSelectorSheet$lambda$0$0$3$0$0;
                                    case 2:
                                        BluetoothActionSelectorSheet$lambda$0$0$5$0$0 = BluetoothActionSelectorSheetKt.BluetoothActionSelectorSheet$lambda$0$0$5$0$0(lVar, bluetoothButtonAction2, bottomSheetControl);
                                        return BluetoothActionSelectorSheet$lambda$0$0$5$0$0;
                                    default:
                                        BluetoothActionSelectorSheet$lambda$0$0$7$0$0 = BluetoothActionSelectorSheetKt.BluetoothActionSelectorSheet$lambda$0$0$7$0$0(lVar, bluetoothButtonAction2, bottomSheetControl);
                                        return BluetoothActionSelectorSheet$lambda$0$0$7$0$0;
                                }
                            }
                        };
                        qVar2.h0(L);
                    }
                    ActionItem(actionLabel, z15, (ho.a) L, mVar2, 0);
                    if (i12 < arrayList.size() - 1) {
                        qVar2.X(-1975941076);
                        qVar7 = qVar10;
                        DividerKt.m1827DivideriJQMabo(r1.d.G(qVar7, EchoTheme.INSTANCE.getSpacings(mVar2, EchoTheme.$stable).getX5(), t2.u.P, 2), 0L, mVar2, 0, 2);
                        qVar2.p(false);
                    } else {
                        qVar7 = qVar10;
                        qVar2.X(-1975836327);
                        qVar2.p(false);
                    }
                    i12 = i13;
                    eVar3 = eVar4;
                    qVar10 = qVar7;
                } else {
                    ig.f.U();
                    throw null;
                }
            }
            eVar = eVar3;
            qVar = qVar10;
            c5 = 2;
            z10 = false;
            z6 = true;
            qVar2.p(false);
            r1.d.g(p2.f(qVar, EchoTheme.INSTANCE.getSpacings(mVar2, EchoTheme.$stable).getX4()), mVar2);
            qVar2.p(false);
        } else {
            qVar = qVar8;
            z6 = true;
            qVar2 = qVar9;
            eVar = eVar2;
            z10 = false;
            c5 = 2;
            qVar2.X(1727681037);
            qVar2.p(false);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (ig.f.I(BluetoothButtonAction.SKIP_BACKWARD_15, BluetoothButtonAction.SKIP_BACKWARD_30, BluetoothButtonAction.SKIP_BACKWARD_60).contains((BluetoothButtonAction) obj2)) {
                arrayList2.add(obj2);
            }
        }
        if (!arrayList2.isEmpty()) {
            qVar2.X(1728071141);
            String R2 = kj.c.R(mVar2, io.elevenlabs.readerapp.R.string.player_preferences_controls_skip_backward_section);
            EchoTheme echoTheme2 = EchoTheme.INSTANCE;
            int i15 = EchoTheme.$stable;
            i3.q qVar11 = qVar;
            u2.e eVar5 = eVar;
            j7.d(R2, r1.d.F(qVar, echoTheme2.getSpacings(mVar2, i15).getX5(), echoTheme2.getSpacings(mVar2, i15).getX2()), echoTheme2.getColors(mVar2, i15).getText().getSecondary(mVar2, EchoThemeColors.Text.$stable), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme2.getTypography(mVar2, i15).getSmRegular600(mVar2, EchoThemeTypography.$stable), mVar, 0, 0, 131064);
            mVar2 = mVar;
            qVar2.X(-1329713855);
            Iterator it2 = arrayList2.iterator();
            int i16 = 0;
            while (it2.hasNext()) {
                Object next2 = it2.next();
                int i17 = i16 + 1;
                if (i16 >= 0) {
                    final BluetoothButtonAction bluetoothButtonAction3 = (BluetoothButtonAction) next2;
                    String actionLabel2 = getActionLabel(bluetoothButtonAction3, mVar2, 0);
                    if (bluetoothButtonAction == bluetoothButtonAction3) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean f11 = qVar2.f(lVar) | qVar2.d(bluetoothButtonAction3.ordinal()) | qVar2.h(bottomSheetControl);
                    Object L2 = qVar2.L();
                    u2.e eVar6 = eVar5;
                    if (f11 || L2 == eVar6) {
                        final int i18 = 1;
                        L2 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.a
                            @Override // ho.a
                            public final Object invoke() {
                                sn.z BluetoothActionSelectorSheet$lambda$0$0$1$0$0;
                                sn.z BluetoothActionSelectorSheet$lambda$0$0$3$0$0;
                                sn.z BluetoothActionSelectorSheet$lambda$0$0$5$0$0;
                                sn.z BluetoothActionSelectorSheet$lambda$0$0$7$0$0;
                                switch (i18) {
                                    case 0:
                                        BluetoothActionSelectorSheet$lambda$0$0$1$0$0 = BluetoothActionSelectorSheetKt.BluetoothActionSelectorSheet$lambda$0$0$1$0$0(lVar, bluetoothButtonAction3, bottomSheetControl);
                                        return BluetoothActionSelectorSheet$lambda$0$0$1$0$0;
                                    case 1:
                                        BluetoothActionSelectorSheet$lambda$0$0$3$0$0 = BluetoothActionSelectorSheetKt.BluetoothActionSelectorSheet$lambda$0$0$3$0$0(lVar, bluetoothButtonAction3, bottomSheetControl);
                                        return BluetoothActionSelectorSheet$lambda$0$0$3$0$0;
                                    case 2:
                                        BluetoothActionSelectorSheet$lambda$0$0$5$0$0 = BluetoothActionSelectorSheetKt.BluetoothActionSelectorSheet$lambda$0$0$5$0$0(lVar, bluetoothButtonAction3, bottomSheetControl);
                                        return BluetoothActionSelectorSheet$lambda$0$0$5$0$0;
                                    default:
                                        BluetoothActionSelectorSheet$lambda$0$0$7$0$0 = BluetoothActionSelectorSheetKt.BluetoothActionSelectorSheet$lambda$0$0$7$0$0(lVar, bluetoothButtonAction3, bottomSheetControl);
                                        return BluetoothActionSelectorSheet$lambda$0$0$7$0$0;
                                }
                            }
                        };
                        qVar2.h0(L2);
                    }
                    ActionItem(actionLabel2, z14, (ho.a) L2, mVar2, 0);
                    if (i16 < arrayList2.size() - 1) {
                        qVar2.X(-2007417981);
                        qVar6 = qVar11;
                        DividerKt.m1827DivideriJQMabo(r1.d.G(qVar6, EchoTheme.INSTANCE.getSpacings(mVar2, EchoTheme.$stable).getX5(), t2.u.P, 2), 0L, mVar2, 0, 2);
                        qVar2.p(false);
                    } else {
                        qVar6 = qVar11;
                        qVar2.X(-2007313232);
                        qVar2.p(false);
                    }
                    i16 = i17;
                    eVar5 = eVar6;
                    qVar11 = qVar6;
                } else {
                    ig.f.U();
                    throw null;
                }
            }
            eVar = eVar5;
            qVar = qVar11;
            c5 = 2;
            z10 = false;
            z6 = true;
            qVar2.p(false);
            r1.d.g(p2.f(qVar, EchoTheme.INSTANCE.getSpacings(mVar2, EchoTheme.$stable).getX4()), mVar2);
            qVar2.p(false);
        } else {
            qVar2.X(1729155149);
            qVar2.p(false);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : list) {
            if (ig.f.I(BluetoothButtonAction.NEXT_CHAPTER, BluetoothButtonAction.PREVIOUS_CHAPTER).contains((BluetoothButtonAction) obj3)) {
                arrayList3.add(obj3);
            }
        }
        if (!arrayList3.isEmpty()) {
            qVar2.X(1729471690);
            String R3 = kj.c.R(mVar2, io.elevenlabs.readerapp.R.string.player_preferences_controls_chapter_navigation_section);
            EchoTheme echoTheme3 = EchoTheme.INSTANCE;
            int i19 = EchoTheme.$stable;
            i3.q qVar12 = qVar;
            u2.e eVar7 = eVar;
            j7.d(R3, r1.d.F(qVar, echoTheme3.getSpacings(mVar2, i19).getX5(), echoTheme3.getSpacings(mVar2, i19).getX2()), echoTheme3.getColors(mVar2, i19).getText().getSecondary(mVar2, EchoThemeColors.Text.$stable), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme3.getTypography(mVar2, i19).getSmRegular600(mVar2, EchoThemeTypography.$stable), mVar, 0, 0, 131064);
            mVar2 = mVar;
            qVar2.X(-1329668676);
            Iterator it3 = arrayList3.iterator();
            int i20 = 0;
            while (it3.hasNext()) {
                Object next3 = it3.next();
                int i21 = i20 + 1;
                if (i20 >= 0) {
                    final BluetoothButtonAction bluetoothButtonAction4 = (BluetoothButtonAction) next3;
                    String actionLabel3 = getActionLabel(bluetoothButtonAction4, mVar2, 0);
                    if (bluetoothButtonAction == bluetoothButtonAction4) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean f12 = qVar2.f(lVar) | qVar2.d(bluetoothButtonAction4.ordinal()) | qVar2.h(bottomSheetControl);
                    Object L3 = qVar2.L();
                    u2.e eVar8 = eVar7;
                    if (f12 || L3 == eVar8) {
                        final int i22 = 2;
                        L3 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.a
                            @Override // ho.a
                            public final Object invoke() {
                                sn.z BluetoothActionSelectorSheet$lambda$0$0$1$0$0;
                                sn.z BluetoothActionSelectorSheet$lambda$0$0$3$0$0;
                                sn.z BluetoothActionSelectorSheet$lambda$0$0$5$0$0;
                                sn.z BluetoothActionSelectorSheet$lambda$0$0$7$0$0;
                                switch (i22) {
                                    case 0:
                                        BluetoothActionSelectorSheet$lambda$0$0$1$0$0 = BluetoothActionSelectorSheetKt.BluetoothActionSelectorSheet$lambda$0$0$1$0$0(lVar, bluetoothButtonAction4, bottomSheetControl);
                                        return BluetoothActionSelectorSheet$lambda$0$0$1$0$0;
                                    case 1:
                                        BluetoothActionSelectorSheet$lambda$0$0$3$0$0 = BluetoothActionSelectorSheetKt.BluetoothActionSelectorSheet$lambda$0$0$3$0$0(lVar, bluetoothButtonAction4, bottomSheetControl);
                                        return BluetoothActionSelectorSheet$lambda$0$0$3$0$0;
                                    case 2:
                                        BluetoothActionSelectorSheet$lambda$0$0$5$0$0 = BluetoothActionSelectorSheetKt.BluetoothActionSelectorSheet$lambda$0$0$5$0$0(lVar, bluetoothButtonAction4, bottomSheetControl);
                                        return BluetoothActionSelectorSheet$lambda$0$0$5$0$0;
                                    default:
                                        BluetoothActionSelectorSheet$lambda$0$0$7$0$0 = BluetoothActionSelectorSheetKt.BluetoothActionSelectorSheet$lambda$0$0$7$0$0(lVar, bluetoothButtonAction4, bottomSheetControl);
                                        return BluetoothActionSelectorSheet$lambda$0$0$7$0$0;
                                }
                            }
                        };
                        qVar2.h0(L3);
                    }
                    ActionItem(actionLabel3, z13, (ho.a) L3, mVar2, 0);
                    if (i20 < arrayList3.size() - 1) {
                        qVar2.X(1463733540);
                        qVar5 = qVar12;
                        DividerKt.m1827DivideriJQMabo(r1.d.G(qVar5, EchoTheme.INSTANCE.getSpacings(mVar2, EchoTheme.$stable).getX5(), t2.u.P, 2), 0L, mVar2, 0, 2);
                        qVar2.p(false);
                    } else {
                        qVar5 = qVar12;
                        qVar2.X(1463838289);
                        qVar2.p(false);
                    }
                    i20 = i21;
                    eVar7 = eVar8;
                    qVar12 = qVar5;
                } else {
                    ig.f.U();
                    throw null;
                }
            }
            eVar = eVar7;
            qVar = qVar12;
            c5 = 2;
            z10 = false;
            z6 = true;
            qVar2.p(false);
            r1.d.g(p2.f(qVar, EchoTheme.INSTANCE.getSpacings(mVar2, EchoTheme.$stable).getX4()), mVar2);
            qVar2.p(false);
        } else {
            qVar2.X(1730550893);
            qVar2.p(false);
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : list) {
            if (ig.f.I(BluetoothButtonAction.VOICE_CHAT, BluetoothButtonAction.BOOKMARK, BluetoothButtonAction.NOTHING).contains((BluetoothButtonAction) obj4)) {
                arrayList4.add(obj4);
            }
        }
        if (!arrayList4.isEmpty()) {
            qVar2.X(1730901875);
            String R4 = kj.c.R(mVar2, io.elevenlabs.readerapp.R.string.player_preferences_controls_other_actions_section);
            EchoTheme echoTheme4 = EchoTheme.INSTANCE;
            int i23 = EchoTheme.$stable;
            i3.q qVar13 = qVar;
            u2.e eVar9 = eVar;
            j7.d(R4, r1.d.F(qVar, echoTheme4.getSpacings(mVar2, i23).getX5(), echoTheme4.getSpacings(mVar2, i23).getX2()), echoTheme4.getColors(mVar2, i23).getText().getSecondary(mVar2, EchoThemeColors.Text.$stable), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme4.getTypography(mVar2, i23).getSmRegular600(mVar2, EchoThemeTypography.$stable), mVar, 0, 0, 131064);
            mVar2 = mVar;
            Iterator it4 = arrayList4.iterator();
            int i24 = 0;
            while (it4.hasNext()) {
                Object next4 = it4.next();
                int i25 = i24 + 1;
                if (i24 >= 0) {
                    final BluetoothButtonAction bluetoothButtonAction5 = (BluetoothButtonAction) next4;
                    String actionLabel4 = getActionLabel(bluetoothButtonAction5, mVar2, 0);
                    if (bluetoothButtonAction == bluetoothButtonAction5) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    boolean f13 = qVar2.f(lVar) | qVar2.d(bluetoothButtonAction5.ordinal()) | qVar2.h(bottomSheetControl);
                    Object L4 = qVar2.L();
                    u2.e eVar10 = eVar9;
                    if (f13 || L4 == eVar10) {
                        final int i26 = 3;
                        L4 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.a
                            @Override // ho.a
                            public final Object invoke() {
                                sn.z BluetoothActionSelectorSheet$lambda$0$0$1$0$0;
                                sn.z BluetoothActionSelectorSheet$lambda$0$0$3$0$0;
                                sn.z BluetoothActionSelectorSheet$lambda$0$0$5$0$0;
                                sn.z BluetoothActionSelectorSheet$lambda$0$0$7$0$0;
                                switch (i26) {
                                    case 0:
                                        BluetoothActionSelectorSheet$lambda$0$0$1$0$0 = BluetoothActionSelectorSheetKt.BluetoothActionSelectorSheet$lambda$0$0$1$0$0(lVar, bluetoothButtonAction5, bottomSheetControl);
                                        return BluetoothActionSelectorSheet$lambda$0$0$1$0$0;
                                    case 1:
                                        BluetoothActionSelectorSheet$lambda$0$0$3$0$0 = BluetoothActionSelectorSheetKt.BluetoothActionSelectorSheet$lambda$0$0$3$0$0(lVar, bluetoothButtonAction5, bottomSheetControl);
                                        return BluetoothActionSelectorSheet$lambda$0$0$3$0$0;
                                    case 2:
                                        BluetoothActionSelectorSheet$lambda$0$0$5$0$0 = BluetoothActionSelectorSheetKt.BluetoothActionSelectorSheet$lambda$0$0$5$0$0(lVar, bluetoothButtonAction5, bottomSheetControl);
                                        return BluetoothActionSelectorSheet$lambda$0$0$5$0$0;
                                    default:
                                        BluetoothActionSelectorSheet$lambda$0$0$7$0$0 = BluetoothActionSelectorSheetKt.BluetoothActionSelectorSheet$lambda$0$0$7$0$0(lVar, bluetoothButtonAction5, bottomSheetControl);
                                        return BluetoothActionSelectorSheet$lambda$0$0$7$0$0;
                                }
                            }
                        };
                        qVar2.h0(L4);
                    }
                    ActionItem(actionLabel4, z12, (ho.a) L4, mVar2, 0);
                    if (i24 < arrayList4.size() - 1) {
                        qVar2.X(639920741);
                        qVar4 = qVar13;
                        DividerKt.m1827DivideriJQMabo(r1.d.G(qVar4, EchoTheme.INSTANCE.getSpacings(mVar2, EchoTheme.$stable).getX5(), t2.u.P, 2), 0L, mVar2, 0, 2);
                        qVar2.p(false);
                    } else {
                        qVar4 = qVar13;
                        qVar2.X(640025490);
                        qVar2.p(false);
                    }
                    i24 = i25;
                    eVar9 = eVar10;
                    qVar13 = qVar4;
                } else {
                    ig.f.U();
                    throw null;
                }
            }
            qVar3 = qVar13;
            z11 = true;
            qVar2.p(false);
        } else {
            qVar3 = qVar;
            z11 = z6;
            qVar2.X(1731910925);
            qVar2.p(false);
        }
        r1.d.g(p2.f(qVar3, EchoTheme.INSTANCE.getSpacings(mVar2, EchoTheme.$stable).getX5()), mVar2);
        qVar2.p(z11);
        return sn.z.f31622a;
    }

    public static final sn.z BluetoothActionSelectorSheet$lambda$0$0$1$0$0(ho.l lVar, BluetoothButtonAction bluetoothButtonAction, BottomSheetControl bottomSheetControl) {
        lVar.invoke(bluetoothButtonAction);
        bottomSheetControl.close();
        return sn.z.f31622a;
    }

    public static final sn.z BluetoothActionSelectorSheet$lambda$0$0$3$0$0(ho.l lVar, BluetoothButtonAction bluetoothButtonAction, BottomSheetControl bottomSheetControl) {
        lVar.invoke(bluetoothButtonAction);
        bottomSheetControl.close();
        return sn.z.f31622a;
    }

    public static final sn.z BluetoothActionSelectorSheet$lambda$0$0$5$0$0(ho.l lVar, BluetoothButtonAction bluetoothButtonAction, BottomSheetControl bottomSheetControl) {
        lVar.invoke(bluetoothButtonAction);
        bottomSheetControl.close();
        return sn.z.f31622a;
    }

    public static final sn.z BluetoothActionSelectorSheet$lambda$0$0$7$0$0(ho.l lVar, BluetoothButtonAction bluetoothButtonAction, BottomSheetControl bottomSheetControl) {
        lVar.invoke(bluetoothButtonAction);
        bottomSheetControl.close();
        return sn.z.f31622a;
    }

    public static final sn.z BluetoothActionSelectorSheet$lambda$1(BluetoothButton bluetoothButton, BluetoothButtonAction bluetoothButtonAction, ho.l lVar, ho.a aVar, int i10, u2.m mVar, int i11) {
        BluetoothActionSelectorSheet(bluetoothButton, bluetoothButtonAction, lVar, aVar, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final String getActionLabel(BluetoothButtonAction bluetoothButtonAction, u2.m mVar, int i10) {
        bluetoothButtonAction.getClass();
        switch (WhenMappings.$EnumSwitchMapping$1[bluetoothButtonAction.ordinal()]) {
            case 1:
                u2.q qVar = (u2.q) mVar;
                qVar.X(710115568);
                String R = kj.c.R(qVar, io.elevenlabs.readerapp.R.string.player_preferences_controls_skip_forward_15);
                qVar.p(false);
                return R;
            case 2:
                u2.q qVar2 = (u2.q) mVar;
                qVar2.X(710119216);
                String R2 = kj.c.R(qVar2, io.elevenlabs.readerapp.R.string.player_preferences_controls_skip_forward_30);
                qVar2.p(false);
                return R2;
            case 3:
                u2.q qVar3 = (u2.q) mVar;
                qVar3.X(710122864);
                String R3 = kj.c.R(qVar3, io.elevenlabs.readerapp.R.string.player_preferences_controls_skip_forward_60);
                qVar3.p(false);
                return R3;
            case 4:
                u2.q qVar4 = (u2.q) mVar;
                qVar4.X(710126545);
                String R4 = kj.c.R(qVar4, io.elevenlabs.readerapp.R.string.player_preferences_controls_skip_backward_15);
                qVar4.p(false);
                return R4;
            case 5:
                u2.q qVar5 = (u2.q) mVar;
                qVar5.X(710130257);
                String R5 = kj.c.R(qVar5, io.elevenlabs.readerapp.R.string.player_preferences_controls_skip_backward_30);
                qVar5.p(false);
                return R5;
            case 6:
                u2.q qVar6 = (u2.q) mVar;
                qVar6.X(710133969);
                String R6 = kj.c.R(qVar6, io.elevenlabs.readerapp.R.string.player_preferences_controls_skip_backward_60);
                qVar6.p(false);
                return R6;
            case 7:
                u2.q qVar7 = (u2.q) mVar;
                qVar7.X(710137549);
                String R7 = kj.c.R(qVar7, io.elevenlabs.readerapp.R.string.player_preferences_controls_next_chapter);
                qVar7.p(false);
                return R7;
            case 8:
                u2.q qVar8 = (u2.q) mVar;
                qVar8.X(710141137);
                String R8 = kj.c.R(qVar8, io.elevenlabs.readerapp.R.string.player_preferences_controls_previous_chapter);
                qVar8.p(false);
                return R8;
            case 9:
                u2.q qVar9 = (u2.q) mVar;
                qVar9.X(710144651);
                String R9 = kj.c.R(qVar9, io.elevenlabs.readerapp.R.string.player_preferences_controls_voice_chat);
                qVar9.p(false);
                return R9;
            case 10:
                u2.q qVar10 = (u2.q) mVar;
                qVar10.X(710147913);
                String R10 = kj.c.R(qVar10, io.elevenlabs.readerapp.R.string.player_preferences_controls_bookmark);
                qVar10.p(false);
                return R10;
            case 11:
                u2.q qVar11 = (u2.q) mVar;
                qVar11.X(710151179);
                String R11 = kj.c.R(qVar11, io.elevenlabs.readerapp.R.string.player_preferences_controls_play_pause);
                qVar11.p(false);
                return R11;
            case 12:
                u2.q qVar12 = (u2.q) mVar;
                qVar12.X(710154408);
                String R12 = kj.c.R(qVar12, io.elevenlabs.readerapp.R.string.player_preferences_controls_nothing);
                qVar12.p(false);
                return R12;
            default:
                throw com.google.android.gms.internal.play_billing.b.h(710114885, (u2.q) mVar, false);
        }
    }

    private static final List<BluetoothButtonAction> getAvailableActionsForButton(BluetoothButton bluetoothButton) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[bluetoothButton.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        return ig.f.I(BluetoothButtonAction.SKIP_BACKWARD_15, BluetoothButtonAction.SKIP_BACKWARD_30, BluetoothButtonAction.SKIP_BACKWARD_60, BluetoothButtonAction.PREVIOUS_CHAPTER, BluetoothButtonAction.VOICE_CHAT, BluetoothButtonAction.BOOKMARK, BluetoothButtonAction.NOTHING);
                    }
                    c6.p();
                    return null;
                }
                return ig.f.I(BluetoothButtonAction.SKIP_FORWARD_15, BluetoothButtonAction.SKIP_FORWARD_30, BluetoothButtonAction.SKIP_FORWARD_60, BluetoothButtonAction.NEXT_CHAPTER, BluetoothButtonAction.VOICE_CHAT, BluetoothButtonAction.BOOKMARK, BluetoothButtonAction.NOTHING);
            }
            return ig.f.I(BluetoothButtonAction.PREVIOUS_CHAPTER, BluetoothButtonAction.SKIP_BACKWARD_15, BluetoothButtonAction.SKIP_BACKWARD_30, BluetoothButtonAction.SKIP_BACKWARD_60, BluetoothButtonAction.VOICE_CHAT, BluetoothButtonAction.BOOKMARK, BluetoothButtonAction.NOTHING);
        }
        return ig.f.I(BluetoothButtonAction.NEXT_CHAPTER, BluetoothButtonAction.SKIP_FORWARD_15, BluetoothButtonAction.SKIP_FORWARD_30, BluetoothButtonAction.SKIP_FORWARD_60, BluetoothButtonAction.VOICE_CHAT, BluetoothButtonAction.BOOKMARK, BluetoothButtonAction.NOTHING);
    }
}
