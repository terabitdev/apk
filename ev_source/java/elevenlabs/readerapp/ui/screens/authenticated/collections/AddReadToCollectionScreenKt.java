package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import a2.v0;
import android.gov.nist.javax.sip.header.ParameterNames;
import androidx.lifecycle.r1;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import f4.f1;
import io.elevenlabs.domain.model.CollectionMeta;
import io.elevenlabs.domain.model.CollectionMetaKt;
import io.elevenlabs.domain.model.SyncStatus;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.components.CenteredCloseHeaderKt;
import io.elevenlabs.readerapp.ui.components.q0;
import io.elevenlabs.readerapp.ui.previews.CollectionFactoryKt;
import io.elevenlabs.ui.components.EchoButtonKt;
import io.elevenlabs.ui.components.EchoButtonSize;
import io.elevenlabs.ui.components.EchoButtonVariant;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import io.elevenlabs.ui.components.scaffolds.BottomSheetScaffoldKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.livekit.android.rpc.RpcError;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import q2.y2;
import r1.i2;
import r1.k2;
import r1.m1;
import r1.p2;
import rd.c1;
import s4.y0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000H\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0012\u001a=\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001a=\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\f2\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001aI\u0010\u0017\u001a\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00000\u00132\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\f2\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a-\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001d\u0010 \u001a\u00020\u00032\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b \u0010!\u001a\u0017\u0010#\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u0000H\u0003¢\u0006\u0004\b#\u0010$\u001a\u0017\u0010%\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b%\u0010&\u001a\u000f\u0010'\u001a\u00020\u0003H\u0007¢\u0006\u0004\b'\u0010(\u001a\u000f\u0010)\u001a\u00020\u0003H\u0007¢\u0006\u0004\b)\u0010(\u001a\u000f\u0010*\u001a\u00020\u0003H\u0007¢\u0006\u0004\b*\u0010(\u001a\u000f\u0010+\u001a\u00020\u0003H\u0007¢\u0006\u0004\b+\u0010(¨\u0006,"}, d2 = {"", "readId", "Lkotlin/Function0;", "Lsn/z;", "onDismiss", "onCreateNewCollection", "Lio/elevenlabs/readerapp/ui/screens/authenticated/collections/AddReadToCollectionViewModel;", "vm", "AddReadToCollectionSheet", "(Ljava/lang/String;Lho/a;Lho/a;Lio/elevenlabs/readerapp/ui/screens/authenticated/collections/AddReadToCollectionViewModel;Lu2/m;II)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/collections/AddReadToCollectionState;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lkotlin/Function1;", "onCollectionClick", "AddReadToCollectionSheetUI", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/collections/AddReadToCollectionState;Lho/l;Lho/a;Lu2/m;II)V", "", "Lio/elevenlabs/domain/model/CollectionMeta;", "collections", "", "addedCollectionIds", "Li3/t;", "modifier", "CollectionList", "(Ljava/util/List;Ljava/util/Set;Lho/l;Li3/t;Lu2/m;II)V", "title", "", "isAdded", "onClick", "CollectionItemRow", "(Ljava/lang/String;ZLho/a;Lu2/m;I)V", FirebaseAnalytics.Param.CONTENT, "CenteredPlaceholder", "(Lho/p;Lu2/m;I)V", ParameterNames.TEXT, "EmptyMessage", "(Ljava/lang/String;Lu2/m;I)V", "PreviewSheet", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/collections/AddReadToCollectionState;Lu2/m;I)V", "Preview_AddReadToCollection_Loading", "(Lu2/m;I)V", "Preview_AddReadToCollection_Error", "Preview_AddReadToCollection_Ready", "Preview_AddReadToCollection_SingleCollection", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AddReadToCollectionScreenKt {
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008e, code lost:
    
        if ((r23 & 8) != 0) goto L132;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AddReadToCollectionSheet(String str, ho.a aVar, ho.a aVar2, AddReadToCollectionViewModel addReadToCollectionViewModel, u2.m mVar, int i10, int i11) {
        int i12;
        AddReadToCollectionViewModel addReadToCollectionViewModel2;
        boolean z6;
        AddReadToCollectionViewModel addReadToCollectionViewModel3;
        q7.c cVar;
        boolean z10;
        int i13;
        int i14;
        int i15;
        int i16;
        str.getClass();
        aVar.getClass();
        aVar2.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(38650928);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(aVar)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(aVar2)) {
                i14 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                addReadToCollectionViewModel2 = addReadToCollectionViewModel;
                if (qVar.h(addReadToCollectionViewModel2)) {
                    i13 = 2048;
                    i12 |= i13;
                }
            } else {
                addReadToCollectionViewModel2 = addReadToCollectionViewModel;
            }
            i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            i12 |= i13;
        } else {
            addReadToCollectionViewModel2 = addReadToCollectionViewModel;
        }
        boolean z11 = false;
        if ((i12 & 1171) != 1170) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i12 & 1, z6)) {
            qVar.T();
            if ((i10 & 1) != 0 && !qVar.y()) {
                qVar.R();
            } else {
                if ((i11 & 8) != 0) {
                    r1 a10 = r7.a.a(qVar);
                    if (a10 != null) {
                        pl.f o6 = tb.a.o(a10, qVar);
                        if (a10 instanceof androidx.lifecycle.o) {
                            cVar = ((androidx.lifecycle.o) a10).getDefaultViewModelCreationExtras();
                        } else {
                            cVar = q7.a.f28123b;
                        }
                        addReadToCollectionViewModel2 = (AddReadToCollectionViewModel) gg.b.j0(kotlin.jvm.internal.e0.f20562a.b(AddReadToCollectionViewModel.class), a10, null, o6, cVar, qVar);
                        i12 &= -7169;
                    } else {
                        c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    }
                }
                AddReadToCollectionViewModel addReadToCollectionViewModel4 = addReadToCollectionViewModel2;
                int i17 = i12;
                qVar.q();
                boolean h10 = qVar.h(addReadToCollectionViewModel4);
                if ((i17 & 14) == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z12 = z10 | h10;
                Object L = qVar.L();
                u2.e eVar = u2.l.f33918a;
                if (z12 || L == eVar) {
                    L = new AddReadToCollectionScreenKt$AddReadToCollectionSheet$1$1(addReadToCollectionViewModel4, str, null);
                    qVar.h0(L);
                }
                u2.r.f((ho.p) L, str, qVar);
                AddReadToCollectionState addReadToCollectionState = (AddReadToCollectionState) u2.r.o(addReadToCollectionViewModel4.getStateFlow(), qVar, 0).getValue();
                boolean h11 = qVar.h(addReadToCollectionViewModel4);
                if ((i17 & 112) == 32) {
                    z11 = true;
                }
                boolean z13 = h11 | z11;
                Object L2 = qVar.L();
                if (z13 || L2 == eVar) {
                    L2 = new a(addReadToCollectionViewModel4, aVar, 0);
                    qVar.h0(L2);
                }
                BottomSheetScaffoldKt.EchoBottomSheetScaffold(false, (ho.a) L2, null, false, null, ComposableSingletons$AddReadToCollectionScreenKt.INSTANCE.m1332getLambda$1363745998$app_productionRelease(), c3.k.d(1422271363, true, new io.elevenlabs.readerapp.core.h(addReadToCollectionState, addReadToCollectionViewModel4, aVar2), qVar), qVar, 1769472, 29);
                qVar = qVar;
                addReadToCollectionViewModel3 = addReadToCollectionViewModel4;
            }
        } else {
            qVar.R();
            addReadToCollectionViewModel3 = addReadToCollectionViewModel2;
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.core.l((Object) str, (Object) aVar, (Object) aVar2, (Object) addReadToCollectionViewModel3, i10, i11, 11);
        }
    }

    public static final sn.z AddReadToCollectionSheet$lambda$1$0(AddReadToCollectionViewModel addReadToCollectionViewModel, ho.a aVar) {
        addReadToCollectionViewModel.onSheetDismissed();
        aVar.invoke();
        return sn.z.f31622a;
    }

    public static final sn.z AddReadToCollectionSheet$lambda$2(AddReadToCollectionState addReadToCollectionState, AddReadToCollectionViewModel addReadToCollectionViewModel, ho.a aVar, r1.y yVar, BottomSheetControl bottomSheetControl, u2.m mVar, int i10) {
        yVar.getClass();
        bottomSheetControl.getClass();
        Boolean valueOf = Boolean.valueOf(addReadToCollectionState.getCloseSheet());
        u2.q qVar = (u2.q) mVar;
        boolean h10 = qVar.h(addReadToCollectionState) | qVar.h(bottomSheetControl);
        Object L = qVar.L();
        u2.e eVar = u2.l.f33918a;
        if (h10 || L == eVar) {
            L = new AddReadToCollectionScreenKt$AddReadToCollectionSheet$3$1$1(addReadToCollectionState, bottomSheetControl, null);
            qVar.h0(L);
        }
        u2.r.f((ho.p) L, valueOf, qVar);
        boolean h11 = qVar.h(addReadToCollectionViewModel) | qVar.h(bottomSheetControl);
        Object L2 = qVar.L();
        if (h11 || L2 == eVar) {
            L2 = new f0(addReadToCollectionViewModel, bottomSheetControl, 2);
            qVar.h0(L2);
        }
        ho.l lVar = (ho.l) L2;
        boolean h12 = qVar.h(addReadToCollectionViewModel) | qVar.f(aVar) | qVar.h(bottomSheetControl);
        Object L3 = qVar.L();
        if (h12 || L3 == eVar) {
            L3 = new c3.b(addReadToCollectionViewModel, aVar, bottomSheetControl, 13);
            qVar.h0(L3);
        }
        AddReadToCollectionSheetUI(addReadToCollectionState, lVar, (ho.a) L3, qVar, 0, 0);
        return sn.z.f31622a;
    }

    public static final sn.z AddReadToCollectionSheet$lambda$2$1$0(AddReadToCollectionViewModel addReadToCollectionViewModel, BottomSheetControl bottomSheetControl, String str) {
        str.getClass();
        addReadToCollectionViewModel.toggle(str);
        bottomSheetControl.close();
        return sn.z.f31622a;
    }

    public static final sn.z AddReadToCollectionSheet$lambda$2$2$0(AddReadToCollectionViewModel addReadToCollectionViewModel, ho.a aVar, BottomSheetControl bottomSheetControl) {
        addReadToCollectionViewModel.onCreateNewCollectionClick();
        aVar.invoke();
        bottomSheetControl.close();
        return sn.z.f31622a;
    }

    public static final sn.z AddReadToCollectionSheet$lambda$3(String str, ho.a aVar, ho.a aVar2, AddReadToCollectionViewModel addReadToCollectionViewModel, int i10, int i11, u2.m mVar, int i12) {
        AddReadToCollectionSheet(str, aVar, aVar2, addReadToCollectionViewModel, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void AddReadToCollectionSheetUI(AddReadToCollectionState addReadToCollectionState, ho.l lVar, ho.a aVar, u2.m mVar, int i10, int i11) {
        AddReadToCollectionState addReadToCollectionState2;
        int i12;
        ho.l lVar2;
        int i13;
        int i14;
        int i15;
        boolean z6;
        ho.a aVar2;
        ho.l lVar3;
        u2.r1 r10;
        ho.l lVar4;
        ho.a aVar3;
        ho.l lVar5;
        int i16;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-196660683);
        if ((i10 & 6) == 0) {
            addReadToCollectionState2 = addReadToCollectionState;
            if (qVar.h(addReadToCollectionState2)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i10;
        } else {
            addReadToCollectionState2 = addReadToCollectionState;
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            lVar2 = lVar;
            if (qVar.h(lVar2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            i14 = i11 & 4;
            if (i14 == 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                if (qVar.h(aVar)) {
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
                if (qVar.O(i12 & 1, z6)) {
                    u2.e eVar = u2.l.f33918a;
                    if (i17 != 0) {
                        Object L = qVar.L();
                        if (L == eVar) {
                            L = new o(12);
                            qVar.h0(L);
                        }
                        lVar4 = (ho.l) L;
                    } else {
                        lVar4 = lVar2;
                    }
                    if (i14 != 0) {
                        Object L2 = qVar.L();
                        if (L2 == eVar) {
                            L2 = new b(1);
                            qVar.h0(L2);
                        }
                        aVar3 = (ho.a) L2;
                    } else {
                        aVar3 = aVar;
                    }
                    i3.q qVar2 = i3.q.f13017a;
                    i3.t e10 = p2.e(qVar2, 1.0f);
                    r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
                    int hashCode = Long.hashCode(qVar.T);
                    c3.o l4 = qVar.l();
                    i3.t c5 = i3.a.c(e10, qVar);
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
                    Set<String> addedCollectionIds = addReadToCollectionState2.getAddedCollectionIds();
                    if (addReadToCollectionState2.getCollections().isEmpty() && addReadToCollectionState2.getSyncStatus() == SyncStatus.ERROR) {
                        qVar.X(2049849917);
                        CenteredPlaceholder(ComposableSingletons$AddReadToCollectionScreenKt.INSTANCE.m1333getLambda$316069993$app_productionRelease(), qVar, 6);
                        qVar.p(false);
                    } else if (addReadToCollectionState2.getCollections().isEmpty() && addReadToCollectionState2.getSyncStatus() == SyncStatus.READY) {
                        qVar.X(2049855750);
                        CenteredPlaceholder(ComposableSingletons$AddReadToCollectionScreenKt.INSTANCE.getLambda$128317760$app_productionRelease(), qVar, 6);
                        qVar.p(false);
                    } else {
                        if (addReadToCollectionState2.getCollections().isEmpty() || addedCollectionIds == null) {
                            lVar5 = lVar4;
                            qVar.X(2049864238);
                            CenteredPlaceholder(ComposableSingletons$AddReadToCollectionScreenKt.INSTANCE.m1331getLambda$1251467553$app_productionRelease(), qVar, 6);
                            qVar.p(false);
                        } else {
                            qVar.X(2049866237);
                            List<CollectionMeta> collections = addReadToCollectionState2.getCollections();
                            if (1.0f <= 0.0d) {
                                s1.a.a("invalid weight; must be greater than zero");
                            }
                            CollectionList(collections, addedCollectionIds, lVar4, new m1(1.0f, false), qVar, (i12 << 3) & 896, 0);
                            lVar5 = lVar4;
                            qVar.p(false);
                        }
                        EchoTheme echoTheme = EchoTheme.INSTANCE;
                        int i18 = EchoTheme.$stable;
                        r1.d.g(p2.f(qVar2, echoTheme.getSpacings(qVar, i18).getX8()), qVar);
                        ho.a aVar4 = aVar3;
                        EchoButtonKt.m1835EchoButton562pCRU(kj.c.R(qVar, R.string.new_collection_create), aVar4, r1.d.G(qVar2, echoTheme.getSpacings(qVar, i18).getX5(), t2.u.P, 2), EchoButtonVariant.Secondary, EchoButtonSize.Large, null, false, true, null, false, false, qVar, ((i12 >> 3) & 112) | 12610560, 0, 1888);
                        qVar = qVar;
                        ib.i.o(echoTheme, qVar, i18, qVar2, qVar);
                        qVar.p(true);
                        aVar2 = aVar4;
                        lVar3 = lVar5;
                    }
                    lVar5 = lVar4;
                    EchoTheme echoTheme2 = EchoTheme.INSTANCE;
                    int i182 = EchoTheme.$stable;
                    r1.d.g(p2.f(qVar2, echoTheme2.getSpacings(qVar, i182).getX8()), qVar);
                    ho.a aVar42 = aVar3;
                    EchoButtonKt.m1835EchoButton562pCRU(kj.c.R(qVar, R.string.new_collection_create), aVar42, r1.d.G(qVar2, echoTheme2.getSpacings(qVar, i182).getX5(), t2.u.P, 2), EchoButtonVariant.Secondary, EchoButtonSize.Large, null, false, true, null, false, false, qVar, ((i12 >> 3) & 112) | 12610560, 0, 1888);
                    qVar = qVar;
                    ib.i.o(echoTheme2, qVar, i182, qVar2, qVar);
                    qVar.p(true);
                    aVar2 = aVar42;
                    lVar3 = lVar5;
                } else {
                    qVar.R();
                    aVar2 = aVar;
                    lVar3 = lVar2;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new fm.f(addReadToCollectionState, lVar3, aVar2, i10, i11, 25);
                    return;
                }
                return;
            }
            if ((i12 & 147) != 146) {
            }
            if (qVar.O(i12 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        lVar2 = lVar;
        i14 = i11 & 4;
        if (i14 == 0) {
        }
        if ((i12 & 147) != 146) {
        }
        if (qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final sn.z AddReadToCollectionSheetUI$lambda$0$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z AddReadToCollectionSheetUI$lambda$3(AddReadToCollectionState addReadToCollectionState, ho.l lVar, ho.a aVar, int i10, int i11, u2.m mVar, int i12) {
        AddReadToCollectionSheetUI(addReadToCollectionState, lVar, aVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    private static final void CenteredPlaceholder(ho.p pVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1069460088);
        if ((i10 & 6) == 0) {
            if (qVar.h(pVar)) {
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
            i3.t h10 = p2.h(p2.e(i3.q.f13017a, 1.0f), 120, t2.u.P, 2);
            f1 d10 = r1.p.d(i3.d.f13001e, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(h10, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(h4.g.f11907f, d10, qVar);
            u2.r.J(h4.g.f11906e, l4, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c5, qVar);
            j0.c.q(i11 & 14, pVar, qVar, true);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new d(i10, 0, pVar);
        }
    }

    public static final sn.z CenteredPlaceholder$lambda$1(ho.p pVar, int i10, u2.m mVar, int i11) {
        CenteredPlaceholder(pVar, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void CollectionItemRow(String str, boolean z6, ho.a aVar, u2.m mVar, int i10) {
        int i11;
        ho.a aVar2;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        int i14;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(181303754);
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
            aVar2 = aVar;
            if (qVar.h(aVar2)) {
                i12 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        } else {
            aVar2 = aVar;
        }
        if ((i11 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (qVar.O(i11 & 1, z10)) {
            i3.q qVar2 = i3.q.f13017a;
            i3.t p10 = l1.n.p(p2.e(qVar2, 1.0f), false, null, new p4.k(0), null, aVar2, 11);
            if ((i11 & 112) == 32) {
                z11 = true;
            } else {
                z11 = false;
            }
            Object L = qVar.L();
            if (z11 || L == u2.l.f33918a) {
                L = new io.elevenlabs.ocr.t(z6, 2);
                qVar.h0(L);
            }
            i3.t c5 = p4.q.c(p10, false, (ho.l) L);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i15 = EchoTheme.$stable;
            i3.t F = r1.d.F(c5, echoTheme.getSpacings(qVar, i15).getX4(), echoTheme.getSpacings(qVar, i15).getX3());
            k2 a10 = i2.a(r1.j.f29228a, i3.d.f13005z0, qVar, 48);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c10 = i3.a.c(F, qVar);
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
            u2.r.J(h4.g.f11905d, c10, qVar);
            y0 baseRegular500 = echoTheme.getTypography(qVar, i15).getBaseRegular500(qVar, EchoThemeTypography.$stable);
            long primary = echoTheme.getColors(qVar, i15).getText().getPrimary(qVar, EchoThemeColors.Text.$stable);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            j7.d(str, new m1(1.0f, true), primary, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, baseRegular500, qVar, i11 & 14, 0, 131064);
            qVar = qVar;
            if (z6) {
                qVar.X(-1682492103);
                r1.d.g(p2.s(qVar2, echoTheme.getSpacings(qVar, i15).getX4()), qVar);
                y2.a(kd.a.M(io.elevenlabs.ui.R.drawable.check_circle_filled, qVar, 0), null, p2.o(qVar2, echoTheme.getSpacings(qVar, i15).getX6()), echoTheme.getColors(qVar, i15).getIcon().getPrimary(qVar, EchoThemeColors.Icon.$stable), qVar, u3.c.$stable | 48, 0);
                qVar.p(false);
            } else {
                qVar.X(-1682150948);
                qVar.p(false);
            }
            qVar.p(true);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new e(str, z6, aVar, i10, 0);
        }
    }

    public static final sn.z CollectionItemRow$lambda$0$0(boolean z6, p4.b0 b0Var) {
        b0Var.getClass();
        p4.y.j(z6, b0Var);
        return sn.z.f31622a;
    }

    public static final sn.z CollectionItemRow$lambda$2(String str, boolean z6, ho.a aVar, int i10, u2.m mVar, int i11) {
        CollectionItemRow(str, z6, aVar, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void CollectionList(List<CollectionMeta> list, Set<String> set, ho.l lVar, i3.t tVar, u2.m mVar, int i10, int i11) {
        int i12;
        i3.t tVar2;
        int i13;
        boolean z6;
        i3.t tVar3;
        u2.r1 r10;
        i3.t tVar4;
        int i14;
        int i15;
        int i16;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-280792440);
        if ((i10 & 6) == 0) {
            if (qVar.h(list)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(set)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(lVar)) {
                i14 = 256;
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
            boolean z10 = false;
            if ((i12 & 1171) == 1170) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar.O(i12 & 1, z6)) {
                if (i17 != 0) {
                    tVar4 = i3.q.f13017a;
                } else {
                    tVar4 = tVar2;
                }
                String R = kj.c.R(qVar, R.string.read_later_collection_title);
                boolean f10 = qVar.f(list);
                Object L = qVar.L();
                u2.e eVar = u2.l.f33918a;
                if (f10 || L == eVar) {
                    L = tn.o.a1(new Comparator() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadToCollectionScreenKt$CollectionList$lambda$0$$inlined$sortedByDescending$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t10, T t11) {
                            return wn.e.g(Boolean.valueOf(CollectionMetaKt.isReadLater((CollectionMeta) t11)), Boolean.valueOf(CollectionMetaKt.isReadLater((CollectionMeta) t10)));
                        }
                    }, list);
                    qVar.h0(L);
                }
                List list2 = (List) L;
                i3.t e10 = p2.e(tVar4, 1.0f);
                boolean h10 = qVar.h(list2) | qVar.f(R) | qVar.h(set);
                if ((i12 & 896) == 256) {
                    z10 = true;
                }
                boolean z11 = h10 | z10;
                Object L2 = qVar.L();
                if (z11 || L2 == eVar) {
                    v0 v0Var = new v0(list2, R, set, lVar, 9);
                    qVar.h0(v0Var);
                    L2 = v0Var;
                }
                c1.c(e10, null, null, false, null, null, null, false, null, (ho.l) L2, qVar, 0, 510);
                tVar3 = tVar4;
            } else {
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.core.l((Object) list, (Object) set, lVar, (Object) tVar3, i10, i11, 12);
                return;
            }
            return;
        }
        tVar2 = tVar;
        boolean z102 = false;
        if ((i12 & 1171) == 1170) {
        }
        if (!qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z CollectionList$lambda$1$0(final List list, final String str, final Set set, final ho.l lVar, t1.t tVar) {
        tVar.getClass();
        final o oVar = new o(11);
        final AddReadToCollectionScreenKt$CollectionList$lambda$1$0$$inlined$items$default$1 addReadToCollectionScreenKt$CollectionList$lambda$1$0$$inlined$items$default$1 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadToCollectionScreenKt$CollectionList$lambda$1$0$$inlined$items$default$1
            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((CollectionMeta) obj);
            }

            @Override // ho.l
            public final Void invoke(CollectionMeta collectionMeta) {
                return null;
            }
        };
        ((t1.i) tVar).u(list.size(), new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadToCollectionScreenKt$CollectionList$lambda$1$0$$inlined$items$default$2
            public final Object invoke(int i10) {
                return ho.l.this.invoke(list.get(i10));
            }

            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        }, new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadToCollectionScreenKt$CollectionList$lambda$1$0$$inlined$items$default$3
            public final Object invoke(int i10) {
                return ho.l.this.invoke(list.get(i10));
            }

            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        }, new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadToCollectionScreenKt$CollectionList$lambda$1$0$$inlined$items$default$4
            public final void invoke(t1.b bVar, int i10, u2.m mVar, int i11) {
                int i12;
                boolean z6;
                String title;
                int i13;
                int i14;
                if ((i11 & 6) == 0) {
                    if (((u2.q) mVar).f(bVar)) {
                        i14 = 4;
                    } else {
                        i14 = 2;
                    }
                    i12 = i14 | i11;
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
                    final CollectionMeta collectionMeta = (CollectionMeta) list.get(i10);
                    qVar.X(1995020);
                    if (CollectionMetaKt.isReadLater(collectionMeta)) {
                        title = str;
                    } else {
                        title = collectionMeta.getTitle();
                    }
                    boolean contains = set.contains(collectionMeta.getId());
                    boolean f10 = qVar.f(lVar) | qVar.h(collectionMeta);
                    Object L = qVar.L();
                    if (f10 || L == u2.l.f33918a) {
                        final ho.l lVar2 = lVar;
                        L = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadToCollectionScreenKt$CollectionList$1$1$2$1$1
                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m1324invoke() {
                                ho.l.this.invoke(collectionMeta.getId());
                            }

                            @Override // ho.a
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m1324invoke();
                                return sn.z.f31622a;
                            }
                        };
                        qVar.h0(L);
                    }
                    AddReadToCollectionScreenKt.CollectionItemRow(title, contains, (ho.a) L, qVar, 0);
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
        return sn.z.f31622a;
    }

    public static final Object CollectionList$lambda$1$0$0(CollectionMeta collectionMeta) {
        collectionMeta.getClass();
        return collectionMeta.getId();
    }

    public static final sn.z CollectionList$lambda$2(List list, Set set, ho.l lVar, i3.t tVar, int i10, int i11, u2.m mVar, int i12) {
        CollectionList(list, set, lVar, tVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void EmptyMessage(String str, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1528069515);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i10 | i12;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            i3.t e10 = p2.e(i3.q.f13017a, 1.0f);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i13 = EchoTheme.$stable;
            i3.t E = r1.d.E(e10, echoTheme.getSpacings(qVar, i13).getX5());
            f1 d10 = r1.p.d(i3.d.f13001e, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(E, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(h4.g.f11907f, d10, qVar);
            u2.r.J(h4.g.f11906e, l4, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c5, qVar);
            j7.d(str, null, echoTheme.getColors(qVar, i13).getText().getTertiary(qVar, EchoThemeColors.Text.$stable), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, echoTheme.getTypography(qVar, i13).getSmRegular500(qVar, EchoThemeTypography.$stable), qVar, i11 & 14, 0, 131066);
            qVar = qVar;
            qVar.p(true);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new q0(str, i10, 4);
        }
    }

    public static final sn.z EmptyMessage$lambda$1(String str, int i10, u2.m mVar, int i11) {
        EmptyMessage(str, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    private static final void PreviewSheet(AddReadToCollectionState addReadToCollectionState, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(843697416);
        if ((i10 & 6) == 0) {
            if (qVar.h(addReadToCollectionState)) {
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
            EchoTheme.INSTANCE.invoke(null, c3.k.d(-1811730194, true, new c(addReadToCollectionState, 0), qVar), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new em.a(addReadToCollectionState, i10, 5);
        }
    }

    public static final sn.z PreviewSheet$lambda$0(AddReadToCollectionState addReadToCollectionState, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            i3.t h10 = l1.n.h(i3.q.f13017a, EchoTheme.INSTANCE.getColors(qVar, EchoTheme.$stable).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable), p3.h0.f26395b);
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(h10, qVar);
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
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new b(0);
                qVar.h0(L);
            }
            CenteredCloseHeaderKt.CenteredCloseHeader("Add to collection", (ho.a) L, qVar, 54);
            AddReadToCollectionSheetUI(addReadToCollectionState, null, null, qVar, 0, 6);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z PreviewSheet$lambda$1(AddReadToCollectionState addReadToCollectionState, int i10, u2.m mVar, int i11) {
        PreviewSheet(addReadToCollectionState, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_AddReadToCollection_Error(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1860398248);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            PreviewSheet(new AddReadToCollectionState(null, SyncStatus.ERROR, null, null, false, 29, null), qVar, 0);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.author.c(i10, 15);
        }
    }

    public static final sn.z Preview_AddReadToCollection_Error$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_AddReadToCollection_Error(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_AddReadToCollection_Loading(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1512112548);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            PreviewSheet(new AddReadToCollectionState(null, null, null, null, false, 31, null), qVar, 0);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.author.c(i10, 16);
        }
    }

    public static final sn.z Preview_AddReadToCollection_Loading$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_AddReadToCollection_Loading(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_AddReadToCollection_Ready(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1920078307);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            List<CollectionMeta> stubCollectionsList = CollectionFactoryKt.stubCollectionsList();
            ArrayList arrayList = new ArrayList(tn.p.a0(stubCollectionsList, 10));
            Iterator<T> it = stubCollectionsList.iterator();
            while (it.hasNext()) {
                arrayList.add(CollectionMeta.copy$default((CollectionMeta) it.next(), null, null, null, null, null, false, null, null, null, null, true, null, 3071, null));
            }
            PreviewSheet(new AddReadToCollectionState(null, SyncStatus.READY, arrayList, tn.n.f1(new String[]{((CollectionMeta) arrayList.get(0)).getId(), ((CollectionMeta) arrayList.get(3)).getId()}), false, 17, null), qVar, 0);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.author.c(i10, 17);
        }
    }

    public static final sn.z Preview_AddReadToCollection_Ready$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_AddReadToCollection_Ready(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_AddReadToCollection_SingleCollection(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1595179186);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            PreviewSheet(new AddReadToCollectionState(null, SyncStatus.READY, ig.f.H(CollectionMeta.copy$default((CollectionMeta) tn.o.w0(CollectionFactoryKt.stubCollectionsList()), null, null, null, null, null, false, null, null, null, null, true, null, 3071, null)), tn.v.f33549a, false, 17, null), qVar, 0);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.author.c(i10, 14);
        }
    }

    public static final sn.z Preview_AddReadToCollection_SingleCollection$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_AddReadToCollection_SingleCollection(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
