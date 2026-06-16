package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import android.gov.nist.javax.sip.parser.TokenNames;
import androidx.lifecycle.r1;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import io.elevenlabs.audio.AudioPermissionManager;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.SyncStatus;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.components.ReadMetaRowKt;
import io.elevenlabs.readerapp.ui.previews.ReadsFactoryKt;
import io.elevenlabs.ui.components.BackButtonWithBackgroundKt;
import io.elevenlabs.ui.components.ButtonKt;
import io.elevenlabs.ui.components.ButtonSize;
import io.elevenlabs.ui.components.CheckboxKt;
import io.elevenlabs.ui.components.DividerKt;
import io.elevenlabs.ui.components.InputSearchKt;
import io.elevenlabs.ui.components.headers.HeaderActionsKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.k5;
import r1.l2;
import r1.m1;
import r1.p2;
import r1.z1;
import rd.c1;
import u2.s2;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aC\u0010\t\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001aI\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2 \b\u0002\u0010\r\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0010\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0012\u0010\u0011\u001a\u000f\u0010\u0013\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0013\u0010\u0011\u001a\u000f\u0010\u0014\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0014\u0010\u0011\u001a\u000f\u0010\u0015\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0015\u0010\u0011\"\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c²\u0006\u000e\u0010\u0019\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u001b\u001a\u00020\u001a8\nX\u008a\u0084\u0002"}, d2 = {"", "collectionId", "Lkotlin/Function0;", "Lsn/z;", "onGoBack", "Lkotlin/Function1;", "onNavigateToCollection", "Lio/elevenlabs/readerapp/ui/screens/authenticated/collections/AddReadsToCollectionViewModel;", "vm", "AddReadsToCollectionScreen", "(Ljava/lang/String;Lho/a;Lho/l;Lio/elevenlabs/readerapp/ui/screens/authenticated/collections/AddReadsToCollectionViewModel;Lu2/m;II)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/collections/AddReadsToCollectionState;", RemoteConfigConstants.ResponseFieldKey.STATE, "action", "AddReadsToCollectionScreenUI", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/collections/AddReadsToCollectionState;Lho/l;Lho/a;Lu2/m;II)V", "Preview_AddReadsToCollectionScreen_Idle", "(Lu2/m;I)V", "Preview_AddReadsToCollectionScreen_Error", "Preview_AddReadsToCollectionScreen_Ready", "Preview_AddReadsToCollectionScreen_Submitting", "Preview_AddReadsToCollectionScreen_Loading", "", "PAGE_SIZE", TokenNames.I, "query", "", "hasReachedEnd", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AddReadsToCollectionScreenKt {
    private static final int PAGE_SIZE = 10;

    /* JADX WARN: Removed duplicated region for block: B:42:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0144 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AddReadsToCollectionScreen(String str, ho.a aVar, ho.l lVar, AddReadsToCollectionViewModel addReadsToCollectionViewModel, u2.m mVar, int i10, int i11) {
        int i12;
        ho.a aVar2;
        AddReadsToCollectionViewModel addReadsToCollectionViewModel2;
        boolean z6;
        u2.q qVar;
        AddReadsToCollectionViewModel addReadsToCollectionViewModel3;
        u2.q qVar2;
        q7.c cVar;
        int i13;
        AddReadsToCollectionViewModel addReadsToCollectionViewModel4;
        int i14;
        boolean z10;
        boolean z11;
        Object L;
        boolean z12;
        boolean z13;
        boolean z14;
        Object L2;
        boolean h10;
        Object L3;
        int i15;
        int i16;
        int i17;
        int i18;
        str.getClass();
        aVar.getClass();
        lVar.getClass();
        u2.q qVar3 = (u2.q) mVar;
        qVar3.Z(-333098393);
        if ((i10 & 6) == 0) {
            if (qVar3.f(str)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i12 = i18 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            aVar2 = aVar;
            if (qVar3.h(aVar2)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i12 |= i17;
        } else {
            aVar2 = aVar;
        }
        if ((i10 & 384) == 0) {
            if (qVar3.h(lVar)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i12 |= i16;
        }
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                addReadsToCollectionViewModel2 = addReadsToCollectionViewModel;
                if (qVar3.h(addReadsToCollectionViewModel2)) {
                    i15 = 2048;
                    i12 |= i15;
                }
            } else {
                addReadsToCollectionViewModel2 = addReadsToCollectionViewModel;
            }
            i15 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            i12 |= i15;
        } else {
            addReadsToCollectionViewModel2 = addReadsToCollectionViewModel;
        }
        if ((i12 & 1171) != 1170) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar3.O(i12 & 1, z6)) {
            qVar3.T();
            if ((i10 & 1) != 0 && !qVar3.y()) {
                qVar3.R();
                if ((i11 & 8) != 0) {
                    AddReadsToCollectionViewModel addReadsToCollectionViewModel5 = addReadsToCollectionViewModel2;
                    i13 = i12 & (-7169);
                    addReadsToCollectionViewModel4 = addReadsToCollectionViewModel5;
                    qVar2 = qVar3;
                    qVar2.q();
                    AddReadsToCollectionState addReadsToCollectionState = (AddReadsToCollectionState) u2.r.o(addReadsToCollectionViewModel4.getStateFlow(), qVar2, 0).getValue();
                    boolean h11 = qVar2.h(addReadsToCollectionViewModel4);
                    i14 = i13 & 14;
                    if (i14 == 4) {
                    }
                    z11 = h11 | z10;
                    L = qVar2.L();
                    u2.e eVar = u2.l.f33918a;
                    if (!z11) {
                    }
                    L = new AddReadsToCollectionScreenKt$AddReadsToCollectionScreen$1$1(addReadsToCollectionViewModel4, str, null);
                    qVar2.h0(L);
                    u2.r.f((ho.p) L, str, qVar2);
                    String navigateToCollectionId = addReadsToCollectionState.getNavigateToCollectionId();
                    boolean h12 = qVar2.h(addReadsToCollectionState);
                    if ((i13 & 896) == 256) {
                    }
                    boolean z15 = h12 | z12;
                    if (i14 == 4) {
                    }
                    z14 = z15 | z13;
                    L2 = qVar2.L();
                    if (!z14) {
                    }
                    L2 = new AddReadsToCollectionScreenKt$AddReadsToCollectionScreen$2$1(addReadsToCollectionState, lVar, str, null);
                    qVar2.h0(L2);
                    u2.r.f((ho.p) L2, navigateToCollectionId, qVar2);
                    h10 = qVar2.h(addReadsToCollectionViewModel4);
                    L3 = qVar2.L();
                    if (!h10) {
                    }
                    L3 = new l(addReadsToCollectionViewModel4, 0);
                    qVar2.h0(L3);
                    u2.q qVar4 = qVar2;
                    AddReadsToCollectionScreenUI(addReadsToCollectionState, (ho.l) L3, aVar2, qVar4, (i13 << 3) & 896, 0);
                    qVar = qVar4;
                    addReadsToCollectionViewModel3 = addReadsToCollectionViewModel4;
                }
            } else if ((i11 & 8) != 0) {
                r1 a10 = r7.a.a(qVar3);
                if (a10 != null) {
                    qVar2 = qVar3;
                    pl.f o6 = tb.a.o(a10, qVar2);
                    if (a10 instanceof androidx.lifecycle.o) {
                        cVar = ((androidx.lifecycle.o) a10).getDefaultViewModelCreationExtras();
                    } else {
                        cVar = q7.a.f28123b;
                    }
                    addReadsToCollectionViewModel2 = (AddReadsToCollectionViewModel) gg.b.j0(kotlin.jvm.internal.e0.f20562a.b(AddReadsToCollectionViewModel.class), a10, null, o6, cVar, qVar2);
                    i12 &= -7169;
                    AddReadsToCollectionViewModel addReadsToCollectionViewModel6 = addReadsToCollectionViewModel2;
                    i13 = i12;
                    addReadsToCollectionViewModel4 = addReadsToCollectionViewModel6;
                    qVar2.q();
                    AddReadsToCollectionState addReadsToCollectionState2 = (AddReadsToCollectionState) u2.r.o(addReadsToCollectionViewModel4.getStateFlow(), qVar2, 0).getValue();
                    boolean h112 = qVar2.h(addReadsToCollectionViewModel4);
                    i14 = i13 & 14;
                    if (i14 == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z11 = h112 | z10;
                    L = qVar2.L();
                    u2.e eVar2 = u2.l.f33918a;
                    if (!z11 || L == eVar2) {
                        L = new AddReadsToCollectionScreenKt$AddReadsToCollectionScreen$1$1(addReadsToCollectionViewModel4, str, null);
                        qVar2.h0(L);
                    }
                    u2.r.f((ho.p) L, str, qVar2);
                    String navigateToCollectionId2 = addReadsToCollectionState2.getNavigateToCollectionId();
                    boolean h122 = qVar2.h(addReadsToCollectionState2);
                    if ((i13 & 896) == 256) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    boolean z152 = h122 | z12;
                    if (i14 == 4) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = z152 | z13;
                    L2 = qVar2.L();
                    if (!z14 || L2 == eVar2) {
                        L2 = new AddReadsToCollectionScreenKt$AddReadsToCollectionScreen$2$1(addReadsToCollectionState2, lVar, str, null);
                        qVar2.h0(L2);
                    }
                    u2.r.f((ho.p) L2, navigateToCollectionId2, qVar2);
                    h10 = qVar2.h(addReadsToCollectionViewModel4);
                    L3 = qVar2.L();
                    if (!h10 || L3 == eVar2) {
                        L3 = new l(addReadsToCollectionViewModel4, 0);
                        qVar2.h0(L3);
                    }
                    u2.q qVar42 = qVar2;
                    AddReadsToCollectionScreenUI(addReadsToCollectionState2, (ho.l) L3, aVar2, qVar42, (i13 << 3) & 896, 0);
                    qVar = qVar42;
                    addReadsToCollectionViewModel3 = addReadsToCollectionViewModel4;
                } else {
                    c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
            }
            qVar2 = qVar3;
            AddReadsToCollectionViewModel addReadsToCollectionViewModel62 = addReadsToCollectionViewModel2;
            i13 = i12;
            addReadsToCollectionViewModel4 = addReadsToCollectionViewModel62;
            qVar2.q();
            AddReadsToCollectionState addReadsToCollectionState22 = (AddReadsToCollectionState) u2.r.o(addReadsToCollectionViewModel4.getStateFlow(), qVar2, 0).getValue();
            boolean h1122 = qVar2.h(addReadsToCollectionViewModel4);
            i14 = i13 & 14;
            if (i14 == 4) {
            }
            z11 = h1122 | z10;
            L = qVar2.L();
            u2.e eVar22 = u2.l.f33918a;
            if (!z11) {
            }
            L = new AddReadsToCollectionScreenKt$AddReadsToCollectionScreen$1$1(addReadsToCollectionViewModel4, str, null);
            qVar2.h0(L);
            u2.r.f((ho.p) L, str, qVar2);
            String navigateToCollectionId22 = addReadsToCollectionState22.getNavigateToCollectionId();
            boolean h1222 = qVar2.h(addReadsToCollectionState22);
            if ((i13 & 896) == 256) {
            }
            boolean z1522 = h1222 | z12;
            if (i14 == 4) {
            }
            z14 = z1522 | z13;
            L2 = qVar2.L();
            if (!z14) {
            }
            L2 = new AddReadsToCollectionScreenKt$AddReadsToCollectionScreen$2$1(addReadsToCollectionState22, lVar, str, null);
            qVar2.h0(L2);
            u2.r.f((ho.p) L2, navigateToCollectionId22, qVar2);
            h10 = qVar2.h(addReadsToCollectionViewModel4);
            L3 = qVar2.L();
            if (!h10) {
            }
            L3 = new l(addReadsToCollectionViewModel4, 0);
            qVar2.h0(L3);
            u2.q qVar422 = qVar2;
            AddReadsToCollectionScreenUI(addReadsToCollectionState22, (ho.l) L3, aVar2, qVar422, (i13 << 3) & 896, 0);
            qVar = qVar422;
            addReadsToCollectionViewModel3 = addReadsToCollectionViewModel4;
        } else {
            qVar = qVar3;
            qVar.R();
            addReadsToCollectionViewModel3 = addReadsToCollectionViewModel2;
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.core.l((Object) str, (Object) aVar, lVar, (Object) addReadsToCollectionViewModel3, i10, i11, 13);
        }
    }

    public static final sn.z AddReadsToCollectionScreen$lambda$2$0(AddReadsToCollectionViewModel addReadsToCollectionViewModel, ho.l lVar) {
        lVar.getClass();
        lVar.invoke(addReadsToCollectionViewModel);
        return sn.z.f31622a;
    }

    public static final sn.z AddReadsToCollectionScreen$lambda$3(String str, ho.a aVar, ho.l lVar, AddReadsToCollectionViewModel addReadsToCollectionViewModel, int i10, int i11, u2.m mVar, int i12) {
        AddReadsToCollectionScreen(str, aVar, lVar, addReadsToCollectionViewModel, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AddReadsToCollectionScreenUI(AddReadsToCollectionState addReadsToCollectionState, ho.l lVar, ho.a aVar, u2.m mVar, int i10, int i11) {
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
        addReadsToCollectionState.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-1897106339);
        if ((i10 & 6) == 0) {
            if (qVar2.h(addReadsToCollectionState)) {
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
                    u2.e eVar = u2.l.f33918a;
                    if (i17 != 0) {
                        Object L = qVar2.L();
                        if (L == eVar) {
                            L = new o(16);
                            qVar2.h0(L);
                        }
                        lVar4 = (ho.l) L;
                    } else {
                        lVar4 = lVar2;
                    }
                    if (i14 != 0) {
                        Object L2 = qVar2.L();
                        if (L2 == eVar) {
                            L2 = new b(2);
                            qVar2.h0(L2);
                        }
                        aVar4 = (ho.a) L2;
                    } else {
                        aVar4 = aVar2;
                    }
                    Object L3 = qVar2.L();
                    if (L3 == eVar) {
                        L3 = u2.r.A(addReadsToCollectionState.getQuery());
                        qVar2.h0(L3);
                    }
                    qVar = qVar2;
                    k5.a(null, c3.k.d(-1692332511, true, new n(0, aVar4), qVar2), null, null, null, 0, 0L, 0L, null, c3.k.d(2079917740, true, new fm.o(lVar4, addReadsToCollectionState, (z0) L3, 8), qVar2), qVar, 805306416, 509);
                    lVar3 = lVar4;
                    aVar3 = aVar4;
                } else {
                    qVar = qVar2;
                    qVar.R();
                    lVar3 = lVar2;
                    aVar3 = aVar2;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new fm.f(addReadsToCollectionState, lVar3, aVar3, i10, i11, 26);
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

    public static final sn.z AddReadsToCollectionScreenUI$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    private static final String AddReadsToCollectionScreenUI$lambda$3(z0 z0Var) {
        return (String) z0Var.getValue();
    }

    public static final sn.z AddReadsToCollectionScreenUI$lambda$5(ho.a aVar, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            HeaderActionsKt.HeaderActions((i3.t) null, kj.c.R(qVar, R.string.add_collection_title), c3.k.d(-699287812, true, new m(0, aVar), qVar), (ho.q) null, (i3.f) null, qVar, 384, 25);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z AddReadsToCollectionScreenUI$lambda$5$0(ho.a aVar, l2 l2Var, u2.m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            BackButtonWithBackgroundKt.BackButtonWithBackground(aVar, t2.u.P, qVar, 0, 2);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z AddReadsToCollectionScreenUI$lambda$6(ho.l lVar, AddReadsToCollectionState addReadsToCollectionState, z0 z0Var, z1 z1Var, u2.m mVar, int i10) {
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
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(D, qVar);
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
            String AddReadsToCollectionScreenUI$lambda$3 = AddReadsToCollectionScreenUI$lambda$3(z0Var);
            String R = kj.c.R(qVar, R.string.search_placeholder);
            i3.t e10 = p2.e(qVar2, 1.0f);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i13 = ElevenLabsTheme.$stable;
            i3.t I = r1.d.I(r1.d.G(e10, elevenLabsTheme.getSpacings(qVar, i13).m2356getX4D9Ej5fM(), t2.u.P, 2), t2.u.P, t2.u.P, t2.u.P, elevenLabsTheme.getSpacings(qVar, i13).m2356getX4D9Ej5fM(), 7);
            boolean f10 = qVar.f(lVar);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (f10 || L == eVar) {
                L = new i(lVar, z0Var, 0);
                qVar.h0(L);
            }
            InputSearchKt.InputSearch(AddReadsToCollectionScreenUI$lambda$3, (ho.l) L, I, R, qVar, 0, 0);
            t1.z a11 = t1.b0.a(0, qVar, 3);
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = u2.r.s(new l0(a11, 1));
                qVar.h0(L2);
            }
            s2 s2Var = (s2) L2;
            Boolean valueOf = Boolean.valueOf(AddReadsToCollectionScreenUI$lambda$6$0$2(s2Var));
            boolean f11 = qVar.f(lVar);
            Object L3 = qVar.L();
            if (f11 || L3 == eVar) {
                L3 = new AddReadsToCollectionScreenKt$AddReadsToCollectionScreenUI$4$1$2$1(lVar, s2Var, null);
                qVar.h0(L3);
            }
            u2.r.f((ho.p) L3, valueOf, qVar);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            m1 m1Var = new m1(1.0f, true);
            boolean h10 = qVar.h(addReadsToCollectionState) | qVar.f(lVar);
            Object L4 = qVar.L();
            if (h10 || L4 == eVar) {
                L4 = new f0(addReadsToCollectionState, lVar, 3);
                qVar.h0(L4);
            }
            c1.c(m1Var, a11, null, false, null, null, null, false, null, (ho.l) L4, qVar, 0, 508);
            String R2 = kj.c.R(qVar, R.string.add_collection_action);
            ButtonSize buttonSize = ButtonSize.Medium;
            boolean f12 = qVar.f(addReadsToCollectionState.getSelectedItemsIds());
            Object L5 = qVar.L();
            if (f12 || L5 == eVar) {
                L5 = Boolean.valueOf(!addReadsToCollectionState.getSelectedItemsIds().isEmpty());
                qVar.h0(L5);
            }
            boolean booleanValue = ((Boolean) L5).booleanValue();
            i3.t x10 = ib.i.x(elevenLabsTheme, qVar, i13, p2.e(qVar2, 1.0f));
            boolean isSubmitLoading = addReadsToCollectionState.isSubmitLoading();
            boolean f13 = qVar.f(lVar);
            Object L6 = qVar.L();
            if (f13 || L6 == eVar) {
                L6 = new j(lVar, 0);
                qVar.h0(L6);
            }
            ButtonKt.Button(R2, (ho.a) L6, x10, buttonSize, null, null, null, isSubmitLoading, booleanValue, false, qVar, 3072, 624);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z AddReadsToCollectionScreenUI$lambda$6$0$0$0(ho.l lVar, z0 z0Var, String str) {
        str.getClass();
        z0Var.setValue(str);
        lVar.invoke(new k(str, 0));
        return sn.z.f31622a;
    }

    public static final sn.z AddReadsToCollectionScreenUI$lambda$6$0$0$0$0(String str, AddReadsToCollectionViewModel addReadsToCollectionViewModel) {
        addReadsToCollectionViewModel.getClass();
        addReadsToCollectionViewModel.setQuery(str);
        return sn.z.f31622a;
    }

    public static final boolean AddReadsToCollectionScreenUI$lambda$6$0$2(s2 s2Var) {
        return ((Boolean) s2Var.getValue()).booleanValue();
    }

    public static final sn.z AddReadsToCollectionScreenUI$lambda$6$0$4$0(final AddReadsToCollectionState addReadsToCollectionState, final ho.l lVar, t1.t tVar) {
        tVar.getClass();
        if (addReadsToCollectionState.getReads().isEmpty()) {
            if (addReadsToCollectionState.getSyncStatus() == SyncStatus.READY) {
                t1.t.c(tVar, null, null, ComposableSingletons$AddReadsToCollectionScreenKt.INSTANCE.getLambda$918815243$app_productionRelease(), 3);
            } else if (addReadsToCollectionState.getSyncStatus() == SyncStatus.ERROR) {
                t1.t.c(tVar, null, null, ComposableSingletons$AddReadsToCollectionScreenKt.INSTANCE.getLambda$490133570$app_productionRelease(), 3);
            } else if (addReadsToCollectionState.isLoading()) {
                t1.t.c(tVar, null, null, ComposableSingletons$AddReadsToCollectionScreenKt.INSTANCE.getLambda$2072485635$app_productionRelease(), 3);
            }
        } else {
            final List<ReadMeta> reads = addReadsToCollectionState.getReads();
            final o oVar = new o(14);
            final AddReadsToCollectionScreenKt$AddReadsToCollectionScreenUI$lambda$6$0$4$0$$inlined$items$default$1 addReadsToCollectionScreenKt$AddReadsToCollectionScreenUI$lambda$6$0$4$0$$inlined$items$default$1 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadsToCollectionScreenKt$AddReadsToCollectionScreenUI$lambda$6$0$4$0$$inlined$items$default$1
                @Override // ho.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((ReadMeta) obj);
                }

                @Override // ho.l
                public final Void invoke(ReadMeta readMeta) {
                    return null;
                }
            };
            ((t1.i) tVar).u(reads.size(), new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadsToCollectionScreenKt$AddReadsToCollectionScreenUI$lambda$6$0$4$0$$inlined$items$default$2
                public final Object invoke(int i10) {
                    return ho.l.this.invoke(reads.get(i10));
                }

                @Override // ho.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }
            }, new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadsToCollectionScreenKt$AddReadsToCollectionScreenUI$lambda$6$0$4$0$$inlined$items$default$3
                public final Object invoke(int i10) {
                    return ho.l.this.invoke(reads.get(i10));
                }

                @Override // ho.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }
            }, new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadsToCollectionScreenKt$AddReadsToCollectionScreenUI$lambda$6$0$4$0$$inlined$items$default$4
                public final void invoke(t1.b bVar, int i10, u2.m mVar, int i11) {
                    int i12;
                    boolean z6;
                    int i13;
                    int i14;
                    if ((i11 & 6) == 0) {
                        if (((u2.q) mVar).f(bVar)) {
                            i14 = 4;
                        } else {
                            i14 = 2;
                        }
                        i12 = i11 | i14;
                    } else {
                        i12 = i11;
                    }
                    if ((i11 & 48) == 0) {
                        if (((u2.q) mVar).d(i10)) {
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
                    u2.q qVar = (u2.q) mVar;
                    if (qVar.O(i12 & 1, z6)) {
                        final ReadMeta readMeta = (ReadMeta) reads.get(i10);
                        qVar.X(-1754820154);
                        i3.q qVar2 = i3.q.f13017a;
                        i3.t a10 = t1.b.a(bVar, p2.e(qVar2, 1.0f), null, 7);
                        r1.x a11 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
                        int hashCode = Long.hashCode(qVar.T);
                        c3.o l4 = qVar.l();
                        i3.t c5 = i3.a.c(a10, qVar);
                        h4.h.f11920i.getClass();
                        ho.a aVar = h4.g.f11903b;
                        qVar.b0();
                        if (qVar.S) {
                            qVar.k(aVar);
                        } else {
                            qVar.k0();
                        }
                        u2.r.J(h4.g.f11907f, a11, qVar);
                        u2.r.J(h4.g.f11906e, l4, qVar);
                        u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
                        u2.r.F(h4.g.f11909h, qVar);
                        u2.r.J(h4.g.f11905d, c5, qVar);
                        boolean contains = addReadsToCollectionState.getSelectedItemsIds().contains(readMeta.getReadId());
                        boolean f10 = qVar.f(lVar) | qVar.h(readMeta);
                        Object L = qVar.L();
                        if (f10 || L == u2.l.f33918a) {
                            final ho.l lVar2 = lVar;
                            L = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadsToCollectionScreenKt$AddReadsToCollectionScreenUI$4$1$3$1$2$1$1$1
                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m1325invoke() {
                                    ho.l lVar3 = ho.l.this;
                                    final ReadMeta readMeta2 = readMeta;
                                    lVar3.invoke(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadsToCollectionScreenKt$AddReadsToCollectionScreenUI$4$1$3$1$2$1$1$1.1
                                        public final void invoke(AddReadsToCollectionViewModel addReadsToCollectionViewModel) {
                                            addReadsToCollectionViewModel.getClass();
                                            addReadsToCollectionViewModel.toggleRead(ReadMeta.this.getReadId());
                                        }

                                        @Override // ho.l
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                            invoke((AddReadsToCollectionViewModel) obj);
                                            return sn.z.f31622a;
                                        }
                                    });
                                }

                                @Override // ho.a
                                public /* bridge */ /* synthetic */ Object invoke() {
                                    m1325invoke();
                                    return sn.z.f31622a;
                                }
                            };
                            qVar.h0(L);
                        }
                        String title = readMeta.getTitle();
                        i3.t e10 = p2.e(qVar2, 1.0f);
                        ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                        int i15 = ElevenLabsTheme.$stable;
                        i3.t I = r1.d.I(e10, elevenLabsTheme.getSpacings(qVar, i15).m2356getX4D9Ej5fM(), t2.u.P, t2.u.P, t2.u.P, 14);
                        final r1.z zVar = r1.z.f29398a;
                        CheckboxKt.Checkbox(contains, (ho.a) L, title, I, null, c3.k.d(-212896133, true, new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadsToCollectionScreenKt$AddReadsToCollectionScreenUI$4$1$3$1$2$1$2
                            public final void invoke(u2.m mVar2, int i16) {
                                boolean z10;
                                i3.t c10;
                                if ((i16 & 3) != 2) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                u2.q qVar3 = (u2.q) mVar2;
                                if (qVar3.O(i16 & 1, z10)) {
                                    ReadMeta readMeta2 = ReadMeta.this;
                                    c10 = ((r1.z) zVar).c(i3.q.f13017a, 1.0f, true);
                                    ReadMetaRowKt.ReadMetaRow(readMeta2, c10, qVar3, 0, 0);
                                    return;
                                }
                                qVar3.R();
                            }

                            @Override // ho.p
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((u2.m) obj, ((Number) obj2).intValue());
                                return sn.z.f31622a;
                            }
                        }, qVar), qVar, 196608, 16);
                        DividerKt.m1827DivideriJQMabo(null, elevenLabsTheme.getColor(qVar, i15).getDivider().m2058getLightLine0d7_KjU(), qVar, 0, 1);
                        qVar.p(true);
                        qVar.p(false);
                        return;
                    }
                    qVar.R();
                }

                @Override // ho.r
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    invoke((t1.b) obj, ((Number) obj2).intValue(), (u2.m) obj3, ((Number) obj4).intValue());
                    return sn.z.f31622a;
                }
            }, true, 802480018));
            if (addReadsToCollectionState.getHasMore() && !addReadsToCollectionState.getReads().isEmpty()) {
                t1.t.c(tVar, null, null, ComposableSingletons$AddReadsToCollectionScreenKt.INSTANCE.m1334getLambda$2142140766$app_productionRelease(), 3);
            }
        }
        return sn.z.f31622a;
    }

    public static final Object AddReadsToCollectionScreenUI$lambda$6$0$4$0$0(ReadMeta readMeta) {
        readMeta.getClass();
        return readMeta.getReadId();
    }

    public static final sn.z AddReadsToCollectionScreenUI$lambda$6$0$6$0(ho.l lVar) {
        lVar.invoke(new o(15));
        return sn.z.f31622a;
    }

    public static final sn.z AddReadsToCollectionScreenUI$lambda$6$0$6$0$0(AddReadsToCollectionViewModel addReadsToCollectionViewModel) {
        addReadsToCollectionViewModel.getClass();
        addReadsToCollectionViewModel.submit();
        return sn.z.f31622a;
    }

    public static final sn.z AddReadsToCollectionScreenUI$lambda$7(AddReadsToCollectionState addReadsToCollectionState, ho.l lVar, ho.a aVar, int i10, int i11, u2.m mVar, int i12) {
        AddReadsToCollectionScreenUI(addReadsToCollectionState, lVar, aVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void Preview_AddReadsToCollectionScreen_Error(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(60179348);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            AddReadsToCollectionScreenUI(new AddReadsToCollectionState(null, SyncStatus.ERROR, null, false, null, false, null, 0, null, false, 1021, null), null, null, qVar, 0, 6);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.author.c(i10, 22);
        }
    }

    public static final sn.z Preview_AddReadsToCollectionScreen_Error$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_AddReadsToCollectionScreen_Error(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_AddReadsToCollectionScreen_Idle(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-879070670);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            AddReadsToCollectionScreenUI(new AddReadsToCollectionState(null, null, null, false, null, false, null, 0, null, false, 1023, null), null, null, qVar, 0, 6);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.author.c(i10, 18);
        }
    }

    public static final sn.z Preview_AddReadsToCollectionScreen_Idle$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_AddReadsToCollectionScreen_Idle(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_AddReadsToCollectionScreen_Loading(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1012718584);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            List stubReadMetaList$default = ReadsFactoryKt.stubReadMetaList$default(3, null, 2, null);
            SyncStatus syncStatus = SyncStatus.READY;
            List b12 = tn.o.b1(tn.o.q0(stubReadMetaList$default, 1), 1);
            ArrayList arrayList = new ArrayList(tn.p.a0(b12, 10));
            Iterator it = b12.iterator();
            while (it.hasNext()) {
                arrayList.add(((ReadMeta) it.next()).getReadId());
            }
            AddReadsToCollectionScreenUI(new AddReadsToCollectionState(null, syncStatus, stubReadMetaList$default, false, tn.o.l1(arrayList), false, null, 0, null, true, 489, null), null, null, qVar, 0, 6);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.author.c(i10, 19);
        }
    }

    public static final sn.z Preview_AddReadsToCollectionScreen_Loading$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_AddReadsToCollectionScreen_Loading(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_AddReadsToCollectionScreen_Ready(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1789902481);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            List stubReadMetaList$default = ReadsFactoryKt.stubReadMetaList$default(5, null, 2, null);
            SyncStatus syncStatus = SyncStatus.READY;
            List b12 = tn.o.b1(tn.o.q0(stubReadMetaList$default, 1), 1);
            ArrayList arrayList = new ArrayList(tn.p.a0(b12, 10));
            Iterator it = b12.iterator();
            while (it.hasNext()) {
                arrayList.add(((ReadMeta) it.next()).getReadId());
            }
            AddReadsToCollectionScreenUI(new AddReadsToCollectionState(null, syncStatus, stubReadMetaList$default, false, tn.o.l1(arrayList), false, null, 0, null, false, AudioPermissionManager.AUDIO_PERMISSION_REQUEST_CODE, null), null, null, qVar, 0, 6);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.author.c(i10, 21);
        }
    }

    public static final sn.z Preview_AddReadsToCollectionScreen_Ready$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_AddReadsToCollectionScreen_Ready(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_AddReadsToCollectionScreen_Submitting(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-317780956);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            List stubReadMetaList$default = ReadsFactoryKt.stubReadMetaList$default(5, null, 2, null);
            SyncStatus syncStatus = SyncStatus.READY;
            List b12 = tn.o.b1(tn.o.q0(stubReadMetaList$default, 1), 1);
            ArrayList arrayList = new ArrayList(tn.p.a0(b12, 10));
            Iterator it = b12.iterator();
            while (it.hasNext()) {
                arrayList.add(((ReadMeta) it.next()).getReadId());
            }
            AddReadsToCollectionScreenUI(new AddReadsToCollectionState(null, syncStatus, stubReadMetaList$default, false, tn.o.l1(arrayList), true, null, 0, null, false, 969, null), null, null, qVar, 0, 6);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.author.c(i10, 20);
        }
    }

    public static final sn.z Preview_AddReadsToCollectionScreen_Submitting$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_AddReadsToCollectionScreen_Submitting(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
