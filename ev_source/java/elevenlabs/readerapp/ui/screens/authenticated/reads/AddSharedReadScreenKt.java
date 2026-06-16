package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import androidx.lifecycle.r1;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.ButtonIconKt;
import io.elevenlabs.ui.components.ButtonIconSize;
import io.elevenlabs.ui.components.ButtonIconVariant;
import io.elevenlabs.ui.components.ButtonKt;
import io.elevenlabs.ui.components.ButtonSize;
import io.elevenlabs.ui.components.LoaderKt;
import io.elevenlabs.ui.components.headers.HeaderActionsKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import q2.k5;
import r1.l2;
import r1.p2;
import r1.z1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000(\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001aK\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001aI\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2 \b\u0002\u0010\u000e\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0011\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"", "ownerId", "readId", "Lkotlin/Function1;", "Lsn/z;", "navigateToPlayer", "Lkotlin/Function0;", "onClose", "Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/AddSharedReadViewModel;", "vm", "AddSharedReadScreen", "(Ljava/lang/String;Ljava/lang/String;Lho/l;Lho/a;Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/AddSharedReadViewModel;Lu2/m;II)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/AddSharedReadState;", RemoteConfigConstants.ResponseFieldKey.STATE, "action", "AddSharedReadScreenUI", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/AddSharedReadState;Lho/l;Lho/a;Lu2/m;II)V", "Preview_AddSharedReadScreen_Idle", "(Lu2/m;I)V", "Preview_AddSharedReadScreen_Error", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AddSharedReadScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0113 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0144 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AddSharedReadScreen(String str, String str2, ho.l lVar, ho.a aVar, AddSharedReadViewModel addSharedReadViewModel, u2.m mVar, int i10, int i11) {
        int i12;
        ho.a aVar2;
        AddSharedReadViewModel addSharedReadViewModel2;
        boolean z6;
        u2.q qVar;
        AddSharedReadViewModel addSharedReadViewModel3;
        q7.c cVar;
        int i13;
        u2.q qVar2;
        int i14;
        AddSharedReadViewModel addSharedReadViewModel4;
        u2.q qVar3;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean h10;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        str.getClass();
        str2.getClass();
        lVar.getClass();
        aVar.getClass();
        u2.q qVar4 = (u2.q) mVar;
        qVar4.Z(-347081059);
        if ((i10 & 6) == 0) {
            if (qVar4.f(str)) {
                i23 = 4;
            } else {
                i23 = 2;
            }
            i12 = i23 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar4.f(str2)) {
                i22 = 32;
            } else {
                i22 = 16;
            }
            i12 |= i22;
        }
        if ((i10 & 384) == 0) {
            if (qVar4.h(lVar)) {
                i21 = 256;
            } else {
                i21 = 128;
            }
            i12 |= i21;
        }
        if ((i10 & 3072) == 0) {
            aVar2 = aVar;
            if (qVar4.h(aVar2)) {
                i20 = 2048;
            } else {
                i20 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i20;
        } else {
            aVar2 = aVar;
        }
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                addSharedReadViewModel2 = addSharedReadViewModel;
                if (qVar4.h(addSharedReadViewModel2)) {
                    i19 = 16384;
                    i12 |= i19;
                }
            } else {
                addSharedReadViewModel2 = addSharedReadViewModel;
            }
            i19 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            i12 |= i19;
        } else {
            addSharedReadViewModel2 = addSharedReadViewModel;
        }
        if ((i12 & 9363) != 9362) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar4.O(i12 & 1, z6)) {
            qVar4.T();
            if ((i10 & 1) != 0 && !qVar4.y()) {
                qVar4.R();
                if ((i11 & 16) != 0) {
                    AddSharedReadViewModel addSharedReadViewModel5 = addSharedReadViewModel2;
                    i14 = i12 & (-57345);
                    addSharedReadViewModel4 = addSharedReadViewModel5;
                    qVar3 = qVar4;
                    i13 = 0;
                    qVar3.q();
                    boolean h11 = qVar3.h(addSharedReadViewModel4);
                    if ((i14 & 14) == 4) {
                    }
                    int i24 = (h11 ? 1 : 0) | i15;
                    if ((i14 & 112) == 32) {
                    }
                    i17 = i24 | i16;
                    Object L = qVar3.L();
                    u2.e eVar = u2.l.f33918a;
                    Object obj = L;
                    if (i17 == 0) {
                    }
                    AddSharedReadScreenKt$AddSharedReadScreen$1$1 addSharedReadScreenKt$AddSharedReadScreen$1$1 = new AddSharedReadScreenKt$AddSharedReadScreen$1$1(addSharedReadViewModel4, str, str2, null);
                    qVar3.h0(addSharedReadScreenKt$AddSharedReadScreen$1$1);
                    obj = addSharedReadScreenKt$AddSharedReadScreen$1$1;
                    u2.r.g(str, str2, (ho.p) obj, qVar3);
                    AddSharedReadState addSharedReadState = (AddSharedReadState) u2.r.o(addSharedReadViewModel4.getStateFlow(), qVar3, i13).getValue();
                    String navigateToPlayerWithReadId = addSharedReadState.getNavigateToPlayerWithReadId();
                    boolean f10 = qVar3.f(addSharedReadState);
                    if ((i14 & 896) == 256) {
                    }
                    i18 = (f10 ? 1 : 0) | i13;
                    Object L2 = qVar3.L();
                    Object obj2 = L2;
                    if (i18 == 0) {
                    }
                    AddSharedReadScreenKt$AddSharedReadScreen$2$1 addSharedReadScreenKt$AddSharedReadScreen$2$1 = new AddSharedReadScreenKt$AddSharedReadScreen$2$1(addSharedReadState, lVar, null);
                    qVar3.h0(addSharedReadScreenKt$AddSharedReadScreen$2$1);
                    obj2 = addSharedReadScreenKt$AddSharedReadScreen$2$1;
                    u2.r.f((ho.p) obj2, navigateToPlayerWithReadId, qVar3);
                    h10 = qVar3.h(addSharedReadViewModel4);
                    Object L3 = qVar3.L();
                    Object obj3 = L3;
                    if (!h10) {
                    }
                    g gVar = new g(addSharedReadViewModel4, 0);
                    qVar3.h0(gVar);
                    obj3 = gVar;
                    u2.q qVar5 = qVar3;
                    AddSharedReadScreenUI(addSharedReadState, (ho.l) obj3, aVar2, qVar5, (i14 >> 3) & 896, 0);
                    qVar = qVar5;
                    addSharedReadViewModel3 = addSharedReadViewModel4;
                }
            } else if ((i11 & 16) != 0) {
                r1 a10 = r7.a.a(qVar4);
                if (a10 != null) {
                    u2.q qVar6 = qVar4;
                    pl.f o6 = tb.a.o(a10, qVar6);
                    if (a10 instanceof androidx.lifecycle.o) {
                        cVar = ((androidx.lifecycle.o) a10).getDefaultViewModelCreationExtras();
                    } else {
                        cVar = q7.a.f28123b;
                    }
                    i13 = 0;
                    addSharedReadViewModel2 = (AddSharedReadViewModel) gg.b.j0(kotlin.jvm.internal.e0.f20562a.b(AddSharedReadViewModel.class), a10, null, o6, cVar, qVar6);
                    i12 &= -57345;
                    qVar2 = qVar6;
                    AddSharedReadViewModel addSharedReadViewModel6 = addSharedReadViewModel2;
                    i14 = i12;
                    addSharedReadViewModel4 = addSharedReadViewModel6;
                    qVar3 = qVar2;
                    qVar3.q();
                    boolean h112 = qVar3.h(addSharedReadViewModel4);
                    if ((i14 & 14) == 4) {
                        i15 = 1;
                    } else {
                        i15 = i13;
                    }
                    int i242 = (h112 ? 1 : 0) | i15;
                    if ((i14 & 112) == 32) {
                        i16 = 1;
                    } else {
                        i16 = i13;
                    }
                    i17 = i242 | i16;
                    Object L4 = qVar3.L();
                    u2.e eVar2 = u2.l.f33918a;
                    Object obj4 = L4;
                    if (i17 == 0 || L4 == eVar2) {
                        AddSharedReadScreenKt$AddSharedReadScreen$1$1 addSharedReadScreenKt$AddSharedReadScreen$1$12 = new AddSharedReadScreenKt$AddSharedReadScreen$1$1(addSharedReadViewModel4, str, str2, null);
                        qVar3.h0(addSharedReadScreenKt$AddSharedReadScreen$1$12);
                        obj4 = addSharedReadScreenKt$AddSharedReadScreen$1$12;
                    }
                    u2.r.g(str, str2, (ho.p) obj4, qVar3);
                    AddSharedReadState addSharedReadState2 = (AddSharedReadState) u2.r.o(addSharedReadViewModel4.getStateFlow(), qVar3, i13).getValue();
                    String navigateToPlayerWithReadId2 = addSharedReadState2.getNavigateToPlayerWithReadId();
                    boolean f102 = qVar3.f(addSharedReadState2);
                    if ((i14 & 896) == 256) {
                        i13 = 1;
                    }
                    i18 = (f102 ? 1 : 0) | i13;
                    Object L22 = qVar3.L();
                    Object obj22 = L22;
                    if (i18 == 0 || L22 == eVar2) {
                        AddSharedReadScreenKt$AddSharedReadScreen$2$1 addSharedReadScreenKt$AddSharedReadScreen$2$12 = new AddSharedReadScreenKt$AddSharedReadScreen$2$1(addSharedReadState2, lVar, null);
                        qVar3.h0(addSharedReadScreenKt$AddSharedReadScreen$2$12);
                        obj22 = addSharedReadScreenKt$AddSharedReadScreen$2$12;
                    }
                    u2.r.f((ho.p) obj22, navigateToPlayerWithReadId2, qVar3);
                    h10 = qVar3.h(addSharedReadViewModel4);
                    Object L32 = qVar3.L();
                    Object obj32 = L32;
                    if (!h10 || L32 == eVar2) {
                        g gVar2 = new g(addSharedReadViewModel4, 0);
                        qVar3.h0(gVar2);
                        obj32 = gVar2;
                    }
                    u2.q qVar52 = qVar3;
                    AddSharedReadScreenUI(addSharedReadState2, (ho.l) obj32, aVar2, qVar52, (i14 >> 3) & 896, 0);
                    qVar = qVar52;
                    addSharedReadViewModel3 = addSharedReadViewModel4;
                } else {
                    c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
            }
            qVar2 = qVar4;
            i13 = 0;
            AddSharedReadViewModel addSharedReadViewModel62 = addSharedReadViewModel2;
            i14 = i12;
            addSharedReadViewModel4 = addSharedReadViewModel62;
            qVar3 = qVar2;
            qVar3.q();
            boolean h1122 = qVar3.h(addSharedReadViewModel4);
            if ((i14 & 14) == 4) {
            }
            int i2422 = (h1122 ? 1 : 0) | i15;
            if ((i14 & 112) == 32) {
            }
            i17 = i2422 | i16;
            Object L42 = qVar3.L();
            u2.e eVar22 = u2.l.f33918a;
            Object obj42 = L42;
            if (i17 == 0) {
            }
            AddSharedReadScreenKt$AddSharedReadScreen$1$1 addSharedReadScreenKt$AddSharedReadScreen$1$122 = new AddSharedReadScreenKt$AddSharedReadScreen$1$1(addSharedReadViewModel4, str, str2, null);
            qVar3.h0(addSharedReadScreenKt$AddSharedReadScreen$1$122);
            obj42 = addSharedReadScreenKt$AddSharedReadScreen$1$122;
            u2.r.g(str, str2, (ho.p) obj42, qVar3);
            AddSharedReadState addSharedReadState22 = (AddSharedReadState) u2.r.o(addSharedReadViewModel4.getStateFlow(), qVar3, i13).getValue();
            String navigateToPlayerWithReadId22 = addSharedReadState22.getNavigateToPlayerWithReadId();
            boolean f1022 = qVar3.f(addSharedReadState22);
            if ((i14 & 896) == 256) {
            }
            i18 = (f1022 ? 1 : 0) | i13;
            Object L222 = qVar3.L();
            Object obj222 = L222;
            if (i18 == 0) {
            }
            AddSharedReadScreenKt$AddSharedReadScreen$2$1 addSharedReadScreenKt$AddSharedReadScreen$2$122 = new AddSharedReadScreenKt$AddSharedReadScreen$2$1(addSharedReadState22, lVar, null);
            qVar3.h0(addSharedReadScreenKt$AddSharedReadScreen$2$122);
            obj222 = addSharedReadScreenKt$AddSharedReadScreen$2$122;
            u2.r.f((ho.p) obj222, navigateToPlayerWithReadId22, qVar3);
            h10 = qVar3.h(addSharedReadViewModel4);
            Object L322 = qVar3.L();
            Object obj322 = L322;
            if (!h10) {
            }
            g gVar22 = new g(addSharedReadViewModel4, 0);
            qVar3.h0(gVar22);
            obj322 = gVar22;
            u2.q qVar522 = qVar3;
            AddSharedReadScreenUI(addSharedReadState22, (ho.l) obj322, aVar2, qVar522, (i14 >> 3) & 896, 0);
            qVar = qVar522;
            addSharedReadViewModel3 = addSharedReadViewModel4;
        } else {
            qVar = qVar4;
            qVar.R();
            addSharedReadViewModel3 = addSharedReadViewModel2;
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.components.explore.p(str, str2, lVar, aVar, addSharedReadViewModel3, i10, i11);
        }
    }

    public static final sn.z AddSharedReadScreen$lambda$2$0(AddSharedReadViewModel addSharedReadViewModel, ho.l lVar) {
        lVar.getClass();
        lVar.invoke(addSharedReadViewModel);
        return sn.z.f31622a;
    }

    public static final sn.z AddSharedReadScreen$lambda$3(String str, String str2, ho.l lVar, ho.a aVar, AddSharedReadViewModel addSharedReadViewModel, int i10, int i11, u2.m mVar, int i12) {
        AddSharedReadScreen(str, str2, lVar, aVar, addSharedReadViewModel, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AddSharedReadScreenUI(AddSharedReadState addSharedReadState, ho.l lVar, ho.a aVar, u2.m mVar, int i10, int i11) {
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
        addSharedReadState.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-325352504);
        if ((i10 & 6) == 0) {
            if (qVar2.f(addSharedReadState)) {
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
                            L = new j(9);
                            qVar2.h0(L);
                        }
                        lVar4 = (ho.l) L;
                    } else {
                        lVar4 = lVar2;
                    }
                    if (i14 != 0) {
                        Object L2 = qVar2.L();
                        if (L2 == obj) {
                            L2 = new c(0);
                            qVar2.h0(L2);
                        }
                        aVar4 = (ho.a) L2;
                    } else {
                        aVar4 = aVar2;
                    }
                    qVar = qVar2;
                    k5.a(null, c3.k.d(-1180281724, true, new d(aVar4, 0), qVar2), null, null, null, 0, 0L, 0L, null, c3.k.d(1761709785, true, new e(addSharedReadState, lVar4), qVar2), qVar, 805306416, 509);
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
                    r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.c((Object) addSharedReadState, lVar3, aVar3, i10, i11, 19);
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

    public static final sn.z AddSharedReadScreenUI$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z AddSharedReadScreenUI$lambda$2(ho.a aVar, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            HeaderActionsKt.HeaderActions((i3.t) null, (String) null, (ho.q) null, c3.k.d(-1364539062, true, new b(0, aVar), qVar), (i3.f) null, qVar, 3072, 23);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z AddSharedReadScreenUI$lambda$2$0(ho.a aVar, l2 l2Var, u2.m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            int i11 = R.drawable.close;
            String R = kj.c.R(qVar, R.string.accessibility_bottom_sheet_dialog_close);
            boolean f10 = qVar.f(aVar);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new f(0, aVar);
                qVar.h0(L);
            }
            ButtonIconKt.ButtonIcon(i11, R, (ho.a) L, null, ButtonIconVariant.Secondary, ButtonIconSize.Medium, false, false, false, qVar, 221184, 456);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z AddSharedReadScreenUI$lambda$2$0$0$0(ho.a aVar) {
        aVar.invoke();
        return sn.z.f31622a;
    }

    public static final sn.z AddSharedReadScreenUI$lambda$3(AddSharedReadState addSharedReadState, ho.l lVar, z1 z1Var, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        u2.q qVar;
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
        u2.q qVar2 = (u2.q) mVar;
        if (qVar2.O(i11 & 1, z6)) {
            i3.q qVar3 = i3.q.f13017a;
            i3.t D = r1.d.D(p2.d(qVar3, 1.0f), z1Var);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i13 = ElevenLabsTheme.$stable;
            i3.t f10 = ib.i.f(elevenLabsTheme, qVar2, i13, D);
            r1.x a10 = r1.w.a(r1.j.f29232e, i3.d.C0, qVar2, 54);
            int hashCode = Long.hashCode(qVar2.T);
            c3.o l4 = qVar2.l();
            i3.t c5 = i3.a.c(f10, qVar2);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar);
            } else {
                qVar2.k0();
            }
            u2.r.J(h4.g.f11907f, a10, qVar2);
            u2.r.J(h4.g.f11906e, l4, qVar2);
            u2.r.y(qVar2, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar2);
            u2.r.J(h4.g.f11905d, c5, qVar2);
            if (!wq.n.m0(addSharedReadState.getError())) {
                qVar2.X(990804028);
                j7.d(addSharedReadState.getError(), null, 0L, 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar2, i13).getBodyMedium700(), qVar2, 0, 0, 130046);
                ib.i.C(elevenLabsTheme, qVar2, i13, qVar3, qVar2);
                String R = kj.c.R(qVar2, io.elevenlabs.readerapp.R.string.common_retry);
                boolean f11 = qVar2.f(lVar);
                Object L = qVar2.L();
                if (f11 || L == u2.l.f33918a) {
                    L = new a(lVar, 0);
                    qVar2.h0(L);
                }
                ButtonKt.Button(R, (ho.a) L, null, ButtonSize.Medium, null, null, null, false, false, false, qVar2, 3072, 1012);
                qVar = qVar2;
                qVar.p(false);
            } else {
                qVar2.X(991304523);
                LoaderKt.m1840LoadereopBjH0(null, 0L, 0L, null, qVar2, 0, 15);
                ib.i.C(elevenLabsTheme, qVar2, i13, qVar3, qVar2);
                j7.d(kj.c.R(qVar2, io.elevenlabs.readerapp.R.string.loading_shared_content), null, 0L, 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar2, i13).getSubtitleMedium700(), qVar2, 0, 0, 130046);
                qVar = qVar2;
                qVar.p(false);
            }
            qVar.p(true);
        } else {
            qVar2.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z AddSharedReadScreenUI$lambda$3$0$0$0(ho.l lVar) {
        lVar.invoke(new j(10));
        return sn.z.f31622a;
    }

    public static final sn.z AddSharedReadScreenUI$lambda$3$0$0$0$0(AddSharedReadViewModel addSharedReadViewModel) {
        addSharedReadViewModel.getClass();
        addSharedReadViewModel.load();
        return sn.z.f31622a;
    }

    public static final sn.z AddSharedReadScreenUI$lambda$4(AddSharedReadState addSharedReadState, ho.l lVar, ho.a aVar, int i10, int i11, u2.m mVar, int i12) {
        AddSharedReadScreenUI(addSharedReadState, lVar, aVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void Preview_AddSharedReadScreen_Error(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-885254084);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            AddSharedReadScreenUI(new AddSharedReadState(false, "Some error", null, null, null, 29, null), null, null, qVar, 0, 6);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.e(i10, 14);
        }
    }

    public static final sn.z Preview_AddSharedReadScreen_Error$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_AddSharedReadScreen_Error(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_AddSharedReadScreen_Idle(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-455023880);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            AddSharedReadScreenUI(new AddSharedReadState(false, null, null, null, null, 31, null), null, null, qVar, 0, 6);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.e(i10, 13);
        }
    }

    public static final sn.z Preview_AddSharedReadScreen_Idle$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_AddSharedReadScreen_Idle(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
