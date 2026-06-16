package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import a2.a2;
import androidx.lifecycle.r1;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import f4.f1;
import io.elevenlabs.domain.model.CollectionMeta;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.components.RememberCollectionIconKt;
import io.elevenlabs.ui.components.AdaptiveGridKt;
import io.elevenlabs.ui.components.ButtonIconKt;
import io.elevenlabs.ui.components.ButtonIconSize;
import io.elevenlabs.ui.components.ButtonIconVariant;
import io.elevenlabs.ui.components.ButtonKt;
import io.elevenlabs.ui.components.ButtonSize;
import io.elevenlabs.ui.components.InputKt;
import io.elevenlabs.ui.components.InputState;
import io.elevenlabs.ui.components.SelectableBoxKt;
import io.elevenlabs.ui.components.headers.HeaderKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import q2.k5;
import q2.y2;
import r1.l2;
import r1.m1;
import r1.p2;
import r1.z1;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a/\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001aI\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2 \b\u0002\u0010\f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0004\u0012\u00020\u00030\u000b2\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0011\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0011\u0010\u0010\u001a\u000f\u0010\u0012\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0012\u0010\u0010¨\u0006\u0014²\u0006\u000e\u0010\u0013\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "collectionId", "Lkotlin/Function0;", "Lsn/z;", "onGoBack", "Lio/elevenlabs/readerapp/ui/screens/authenticated/collections/EditCollectionViewModel;", "vm", "EditCollectionScreen", "(Ljava/lang/String;Lho/a;Lio/elevenlabs/readerapp/ui/screens/authenticated/collections/EditCollectionViewModel;Lu2/m;II)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/collections/EditCollectionState;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lkotlin/Function1;", "action", "EditCollectionScreenUI", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/collections/EditCollectionState;Lho/l;Lho/a;Lu2/m;II)V", "Preview_EditCollectionScreen_Idle", "(Lu2/m;I)V", "Preview_EditCollectionScreen_Changed", "Preview_EditCollectionScreen_Loading", DiagnosticsEntry.NAME_KEY, "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class EditCollectionScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:38:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EditCollectionScreen(String str, ho.a aVar, EditCollectionViewModel editCollectionViewModel, u2.m mVar, int i10, int i11) {
        int i12;
        EditCollectionViewModel editCollectionViewModel2;
        boolean z6;
        u2.q qVar;
        EditCollectionViewModel editCollectionViewModel3;
        q7.c cVar;
        EditCollectionViewModel editCollectionViewModel4;
        int i13;
        boolean z10;
        boolean h10;
        Object L;
        boolean z11;
        Object L2;
        boolean h11;
        Object L3;
        int i14;
        int i15;
        int i16;
        str.getClass();
        aVar.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-1763156761);
        if ((i10 & 6) == 0) {
            if (qVar2.f(str)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(aVar)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        if ((i10 & 384) == 0) {
            if ((i11 & 4) == 0) {
                editCollectionViewModel2 = editCollectionViewModel;
                if (qVar2.h(editCollectionViewModel2)) {
                    i14 = RpcError.MAX_MESSAGE_BYTES;
                    i12 |= i14;
                }
            } else {
                editCollectionViewModel2 = editCollectionViewModel;
            }
            i14 = 128;
            i12 |= i14;
        } else {
            editCollectionViewModel2 = editCollectionViewModel;
        }
        int i17 = i12;
        boolean z12 = true;
        if ((i17 & 147) != 146) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar2.O(i17 & 1, z6)) {
            qVar2.T();
            if ((i10 & 1) != 0 && !qVar2.y()) {
                qVar2.R();
                if ((i11 & 4) != 0) {
                    i17 &= -897;
                }
            } else if ((i11 & 4) != 0) {
                r1 a10 = r7.a.a(qVar2);
                if (a10 != null) {
                    pl.f o6 = tb.a.o(a10, qVar2);
                    if (a10 instanceof androidx.lifecycle.o) {
                        cVar = ((androidx.lifecycle.o) a10).getDefaultViewModelCreationExtras();
                    } else {
                        cVar = q7.a.f28123b;
                    }
                    qVar = qVar2;
                    int i18 = i17 & (-897);
                    editCollectionViewModel4 = (EditCollectionViewModel) gg.b.j0(kotlin.jvm.internal.e0.f20562a.b(EditCollectionViewModel.class), a10, null, o6, cVar, qVar);
                    i13 = i18;
                    qVar.q();
                    EditCollectionState editCollectionState = (EditCollectionState) u2.r.o(editCollectionViewModel4.getStateFlow(), qVar, 0).getValue();
                    Boolean valueOf = Boolean.valueOf(editCollectionState.getGoBack());
                    boolean f10 = qVar.f(editCollectionState);
                    if ((i13 & 112) != 32) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    h10 = f10 | z10 | qVar.h(editCollectionViewModel4);
                    L = qVar.L();
                    u2.e eVar = u2.l.f33918a;
                    if (!h10 || L == eVar) {
                        L = new EditCollectionScreenKt$EditCollectionScreen$1$1(editCollectionState, aVar, editCollectionViewModel4, null);
                        qVar.h0(L);
                    }
                    u2.r.f((ho.p) L, valueOf, qVar);
                    boolean h12 = qVar.h(editCollectionViewModel4);
                    if ((i13 & 14) != 4) {
                        z12 = false;
                    }
                    z11 = h12 | z12;
                    L2 = qVar.L();
                    if (!z11 || L2 == eVar) {
                        L2 = new EditCollectionScreenKt$EditCollectionScreen$2$1(editCollectionViewModel4, str, null);
                        qVar.h0(L2);
                    }
                    u2.r.f((ho.p) L2, str, qVar);
                    h11 = qVar.h(editCollectionViewModel4);
                    L3 = qVar.L();
                    if (!h11 || L3 == eVar) {
                        L3 = new o0(editCollectionViewModel4, 0);
                        qVar.h0(L3);
                    }
                    EditCollectionScreenUI(editCollectionState, (ho.l) L3, aVar, qVar, (i13 << 3) & 896, 0);
                    editCollectionViewModel3 = editCollectionViewModel4;
                } else {
                    c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
            }
            qVar = qVar2;
            i13 = i17;
            editCollectionViewModel4 = editCollectionViewModel2;
            qVar.q();
            EditCollectionState editCollectionState2 = (EditCollectionState) u2.r.o(editCollectionViewModel4.getStateFlow(), qVar, 0).getValue();
            Boolean valueOf2 = Boolean.valueOf(editCollectionState2.getGoBack());
            boolean f102 = qVar.f(editCollectionState2);
            if ((i13 & 112) != 32) {
            }
            h10 = f102 | z10 | qVar.h(editCollectionViewModel4);
            L = qVar.L();
            u2.e eVar2 = u2.l.f33918a;
            if (!h10) {
            }
            L = new EditCollectionScreenKt$EditCollectionScreen$1$1(editCollectionState2, aVar, editCollectionViewModel4, null);
            qVar.h0(L);
            u2.r.f((ho.p) L, valueOf2, qVar);
            boolean h122 = qVar.h(editCollectionViewModel4);
            if ((i13 & 14) != 4) {
            }
            z11 = h122 | z12;
            L2 = qVar.L();
            if (!z11) {
            }
            L2 = new EditCollectionScreenKt$EditCollectionScreen$2$1(editCollectionViewModel4, str, null);
            qVar.h0(L2);
            u2.r.f((ho.p) L2, str, qVar);
            h11 = qVar.h(editCollectionViewModel4);
            L3 = qVar.L();
            if (!h11) {
            }
            L3 = new o0(editCollectionViewModel4, 0);
            qVar.h0(L3);
            EditCollectionScreenUI(editCollectionState2, (ho.l) L3, aVar, qVar, (i13 << 3) & 896, 0);
            editCollectionViewModel3 = editCollectionViewModel4;
        } else {
            qVar = qVar2;
            qVar.R();
            editCollectionViewModel3 = editCollectionViewModel2;
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new fm.f(str, aVar, editCollectionViewModel3, i10, i11, 28);
        }
    }

    public static final sn.z EditCollectionScreen$lambda$2$0(EditCollectionViewModel editCollectionViewModel, ho.l lVar) {
        lVar.getClass();
        lVar.invoke(editCollectionViewModel);
        return sn.z.f31622a;
    }

    public static final sn.z EditCollectionScreen$lambda$3(String str, ho.a aVar, EditCollectionViewModel editCollectionViewModel, int i10, int i11, u2.m mVar, int i12) {
        EditCollectionScreen(str, aVar, editCollectionViewModel, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EditCollectionScreenUI(EditCollectionState editCollectionState, ho.l lVar, ho.a aVar, u2.m mVar, int i10, int i11) {
        int i12;
        ho.l lVar2;
        int i13;
        int i14;
        ho.a aVar2;
        int i15;
        boolean z6;
        u2.q qVar;
        ho.l lVar3;
        ho.a aVar3;
        u2.r1 r10;
        ho.l lVar4;
        ho.a aVar4;
        int i16;
        editCollectionState.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(1345020330);
        if ((i10 & 6) == 0) {
            if (qVar2.f(editCollectionState)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i10;
        } else {
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            lVar2 = lVar;
            if (qVar2.h(lVar2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            i14 = i11 & 4;
            if (i14 == 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                aVar2 = aVar;
                if (qVar2.h(aVar2)) {
                    i15 = RpcError.MAX_MESSAGE_BYTES;
                } else {
                    i15 = 128;
                }
                i12 |= i15;
                if ((i12 & 147) != 146) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (qVar2.O(i12 & 1, z6)) {
                    Object obj = u2.l.f33918a;
                    if (i17 != 0) {
                        Object L = qVar2.L();
                        if (L == obj) {
                            L = new y(12);
                            qVar2.h0(L);
                        }
                        lVar4 = (ho.l) L;
                    } else {
                        lVar4 = lVar2;
                    }
                    if (i14 != 0) {
                        Object L2 = qVar2.L();
                        if (L2 == obj) {
                            L2 = new b(8);
                            qVar2.h0(L2);
                        }
                        aVar4 = (ho.a) L2;
                    } else {
                        aVar4 = aVar2;
                    }
                    qVar = qVar2;
                    k5.a(null, c3.k.d(-1606835090, true, new n(1, aVar4), qVar2), null, null, null, 0, 0L, 0L, null, c3.k.d(-951961159, true, new n0(editCollectionState, lVar4), qVar2), qVar, 805306416, 509);
                    ho.l lVar5 = lVar4;
                    aVar3 = aVar4;
                    lVar3 = lVar5;
                } else {
                    qVar = qVar2;
                    qVar.R();
                    lVar3 = lVar2;
                    aVar3 = aVar2;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new fm.f(editCollectionState, lVar3, aVar3, i10, i11, 27);
                    return;
                }
                return;
            }
            aVar2 = aVar;
            if ((i12 & 147) != 146) {
            }
            if (qVar2.O(i12 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        lVar2 = lVar;
        i14 = i11 & 4;
        if (i14 == 0) {
        }
        aVar2 = aVar;
        if ((i12 & 147) != 146) {
        }
        if (qVar2.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final sn.z EditCollectionScreenUI$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z EditCollectionScreenUI$lambda$2(ho.a aVar, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            HeaderKt.Header(kj.c.R(qVar, R.string.edit_collection_title), null, c3.k.d(1549327922, true, new m(2, aVar), qVar), null, null, 0, qVar, 384, 58);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z EditCollectionScreenUI$lambda$2$0(ho.a aVar, l2 l2Var, u2.m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ButtonIconKt.ButtonIcon(io.elevenlabs.ui.R.drawable.close, kj.c.R(qVar, io.elevenlabs.ui.R.string.accessibility_bottom_sheet_dialog_close), aVar, null, ButtonIconVariant.Secondary, ButtonIconSize.Medium, false, false, false, qVar, 221184, 456);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z EditCollectionScreenUI$lambda$3(EditCollectionState editCollectionState, ho.l lVar, z1 z1Var, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        z1Var.getClass();
        if ((i10 & 6) == 0) {
            if (((u2.q) mVar).f(z1Var)) {
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
            i3.q qVar2 = i3.q.f13017a;
            i3.t D = r1.d.D(p2.d(qVar2, 1.0f), z1Var);
            r1.e eVar = r1.j.f29230c;
            i3.j jVar = i3.d.B0;
            r1.x a10 = r1.w.a(eVar, jVar, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(D, qVar);
            h4.h.f11920i.getClass();
            ho.a aVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(aVar);
            } else {
                qVar.k0();
            }
            h4.e eVar2 = h4.g.f11907f;
            u2.r.J(eVar2, a10, qVar);
            h4.e eVar3 = h4.g.f11906e;
            u2.r.J(eVar3, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar4 = h4.g.f11908g;
            u2.r.y(qVar, valueOf, eVar4);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar);
            h4.e eVar5 = h4.g.f11905d;
            u2.r.J(eVar5, c5, qVar);
            i3.t e10 = p2.e(qVar2, 1.0f);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            i3.t y10 = l1.n.y(e10.then(new m1(1.0f, true)), l1.n.x(qVar), true, true);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i13 = ElevenLabsTheme.$stable;
            i3.t x10 = ib.i.x(elevenLabsTheme, qVar, i13, y10);
            r1.x a11 = r1.w.a(eVar, jVar, qVar, 0);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c10 = i3.a.c(x10, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(aVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar2, a11, qVar);
            u2.r.J(eVar3, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar4, qVar, dVar);
            u2.r.J(eVar5, c10, qVar);
            i3.t x11 = ib.i.x(elevenLabsTheme, qVar, i13, l1.n.h(p2.e(qVar2, 1.0f), elevenLabsTheme.getColor(qVar, i13).getBackground().m2006getTertiary0d7_KjU(), elevenLabsTheme.getShapes(qVar, i13).getMd()));
            r1.x a12 = r1.w.a(eVar, i3.d.C0, qVar, 48);
            int hashCode3 = Long.hashCode(qVar.T);
            c3.o l10 = qVar.l();
            i3.t c11 = i3.a.c(x11, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(aVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar2, a12, qVar);
            u2.r.J(eVar3, l10, qVar);
            defpackage.f.u(hashCode3, qVar, eVar4, qVar, dVar);
            u2.r.J(eVar5, c11, qVar);
            l1.n.c(kd.a.M(R.drawable.collections_image, qVar, 0), null, p2.f(qVar2, 100), null, null, t2.u.P, null, qVar, u3.c.$stable | 432, 120);
            ib.i.p(elevenLabsTheme, qVar, i13, qVar2, qVar);
            j7.d(kj.c.R(qVar, R.string.edit_collection_title), null, defpackage.f.A(elevenLabsTheme, qVar, i13), 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i13).getBodyXSmall500(), qVar, 0, 0, 130042);
            qVar.p(true);
            r1.d.g(p2.f(qVar2, elevenLabsTheme.getSpacings(qVar, i13).m2360getX8D9Ej5fM()), qVar);
            j7.d(kj.c.R(qVar, R.string.new_collection_name_title), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i13).getSubtitleMedium700(), qVar, 0, 0, 131070);
            boolean f10 = qVar.f(editCollectionState.getCollectionId());
            Object L = qVar.L();
            Object obj = u2.l.f33918a;
            if (f10 || L == obj) {
                L = u2.r.A(editCollectionState.getName());
                qVar.h0(L);
            }
            z0 z0Var = (z0) L;
            String EditCollectionScreenUI$lambda$3$0$0$2 = EditCollectionScreenUI$lambda$3$0$0$2(z0Var);
            String R = kj.c.R(qVar, R.string.new_collection_name_placeholder);
            i3.t I = r1.d.I(qVar2, t2.u.P, elevenLabsTheme.getSpacings(qVar, i13).m2353getX2D9Ej5fM(), t2.u.P, t2.u.P, 13);
            boolean f11 = qVar.f(z0Var) | qVar.f(lVar);
            Object L2 = qVar.L();
            if (f11 || L2 == obj) {
                L2 = new i(lVar, z0Var, 2);
                qVar.h0(L2);
            }
            InputKt.Input(EditCollectionScreenUI$lambda$3$0$0$2, (ho.l) L2, I, (i3.t) null, (InputState) null, (String) null, (String) null, R, (ho.p) null, (a2) null, (a2.z1) null, (y4.d0) null, false, 0, (u2.m) qVar, 0, 0, 16248);
            r1.d.g(p2.f(qVar2, elevenLabsTheme.getSpacings(qVar, i13).m2358getX6D9Ej5fM()), qVar);
            j7.d(kj.c.R(qVar, R.string.new_collection_icon), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i13).getSubtitleMedium700(), qVar, 0, 0, 131070);
            AdaptiveGridKt.m1773AdaptiveGrid5PRATvw(r1.d.I(qVar2, t2.u.P, elevenLabsTheme.getSpacings(qVar, i13).m2353getX2D9Ej5fM(), t2.u.P, t2.u.P, 13), CollectionMeta.Icon.getEntries(), 60, t2.u.P, 0, elevenLabsTheme.getSpacings(qVar, i13).m2355getX3D9Ej5fM(), elevenLabsTheme.getSpacings(qVar, i13).m2355getX3D9Ej5fM(), c3.k.d(-1352383370, true, new n0(lVar, editCollectionState), qVar), qVar, 12583296, 24);
            qVar.p(true);
            String R2 = kj.c.R(qVar, R.string.edit_collection_save);
            ButtonSize buttonSize = ButtonSize.Medium;
            i3.t x12 = ib.i.x(elevenLabsTheme, qVar, i13, p2.e(qVar2, 1.0f));
            boolean z10 = !wq.n.m0(editCollectionState.getName());
            boolean isLoading = editCollectionState.isLoading();
            boolean f12 = qVar.f(lVar);
            Object L3 = qVar.L();
            if (f12 || L3 == obj) {
                L3 = new j(lVar, 5);
                qVar.h0(L3);
            }
            ButtonKt.Button(R2, (ho.a) L3, x12, buttonSize, null, null, null, isLoading, z10, false, qVar, 3072, 624);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    private static final String EditCollectionScreenUI$lambda$3$0$0$2(z0 z0Var) {
        return (String) z0Var.getValue();
    }

    public static final sn.z EditCollectionScreenUI$lambda$3$0$0$4$0(ho.l lVar, z0 z0Var, String str) {
        str.getClass();
        z0Var.setValue(str);
        lVar.invoke(new k(str, 5));
        return sn.z.f31622a;
    }

    public static final sn.z EditCollectionScreenUI$lambda$3$0$0$4$0$0(String str, EditCollectionViewModel editCollectionViewModel) {
        editCollectionViewModel.getClass();
        editCollectionViewModel.setName(str);
        return sn.z.f31622a;
    }

    public static final sn.z EditCollectionScreenUI$lambda$3$0$0$5(ho.l lVar, EditCollectionState editCollectionState, CollectionMeta.Icon icon, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        boolean z10;
        boolean z11;
        int i12;
        icon.getClass();
        if ((i10 & 6) == 0) {
            if (((u2.q) mVar).d(icon.ordinal())) {
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
            boolean f10 = qVar.f(lVar);
            if ((i11 & 14) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z12 = z10 | f10;
            Object L = qVar.L();
            if (z12 || L == u2.l.f33918a) {
                L = new a(lVar, icon, 6);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            if (editCollectionState.getIcon() == icon) {
                z11 = true;
            } else {
                z11 = false;
            }
            SelectableBoxKt.m1873SelectableBox3f6hBDE(aVar, z11, "", p2.o(i3.q.f13017a, 60), 0L, null, c3.k.d(-1266187694, true, new c(icon, 2), qVar), qVar, 1576320, 48);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z EditCollectionScreenUI$lambda$3$0$0$5$0$0(ho.l lVar, CollectionMeta.Icon icon) {
        lVar.invoke(new m0(icon, 1));
        return sn.z.f31622a;
    }

    public static final sn.z EditCollectionScreenUI$lambda$3$0$0$5$0$0$0(CollectionMeta.Icon icon, EditCollectionViewModel editCollectionViewModel) {
        editCollectionViewModel.getClass();
        editCollectionViewModel.setIcon(icon);
        return sn.z.f31622a;
    }

    public static final sn.z EditCollectionScreenUI$lambda$3$0$0$5$1(CollectionMeta.Icon icon, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            i3.t d10 = p2.d(i3.q.f13017a, 1.0f);
            f1 d11 = r1.p.d(i3.d.f13001e, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(d10, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(h4.g.f11907f, d11, qVar);
            u2.r.J(h4.g.f11906e, l4, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c5, qVar);
            y2.a(kd.a.M(RememberCollectionIconKt.rememberCollectionIcon("", icon, qVar, 6), qVar, 0), null, null, 0L, qVar, u3.c.$stable | 48, 12);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z EditCollectionScreenUI$lambda$3$0$1$0(ho.l lVar) {
        lVar.invoke(new y(13));
        return sn.z.f31622a;
    }

    public static final sn.z EditCollectionScreenUI$lambda$3$0$1$0$0(EditCollectionViewModel editCollectionViewModel) {
        editCollectionViewModel.getClass();
        editCollectionViewModel.submit();
        return sn.z.f31622a;
    }

    public static final sn.z EditCollectionScreenUI$lambda$4(EditCollectionState editCollectionState, ho.l lVar, ho.a aVar, int i10, int i11, u2.m mVar, int i12) {
        EditCollectionScreenUI(editCollectionState, lVar, aVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void Preview_EditCollectionScreen_Changed(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1959500448);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EditCollectionScreenUI(new EditCollectionState(null, CollectionMeta.Icon.Star, "Test collection", false, false, 25, null), null, null, qVar, 0, 6);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new x(i10, 8);
        }
    }

    public static final sn.z Preview_EditCollectionScreen_Changed$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_EditCollectionScreen_Changed(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_EditCollectionScreen_Idle(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-875327988);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EditCollectionScreenUI(new EditCollectionState(null, null, null, false, false, 31, null), null, null, qVar, 0, 6);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new x(i10, 10);
        }
    }

    public static final sn.z Preview_EditCollectionScreen_Idle$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_EditCollectionScreen_Idle(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_EditCollectionScreen_Loading(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-907870232);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EditCollectionScreenUI(new EditCollectionState(null, CollectionMeta.Icon.Star, "Test collection", true, false, 17, null), null, null, qVar, 0, 6);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new x(i10, 9);
        }
    }

    public static final sn.z Preview_EditCollectionScreen_Loading$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_EditCollectionScreen_Loading(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
