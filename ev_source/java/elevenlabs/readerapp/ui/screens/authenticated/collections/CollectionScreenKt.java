package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import a2.n2;
import a2.q0;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import com.revenuecat.purchases.ui.revenuecatui.components.SensibleDefaults;
import f4.f1;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.model.CollectionMeta;
import io.elevenlabs.domain.model.CollectionMetaKt;
import io.elevenlabs.domain.model.MediaItemState;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.ReadMetaKt;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.components.ReadMetaRowKt;
import io.elevenlabs.readerapp.ui.previews.CollectionFactoryKt;
import io.elevenlabs.readerapp.ui.previews.ReadsFactoryKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.library.DownloadAction;
import io.elevenlabs.readerapp.ui.screens.authenticated.library.DownloadActionHelper;
import io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.MiniPlayerKt;
import io.elevenlabs.ui.components.ActionConfig;
import io.elevenlabs.ui.components.ActionSpec;
import io.elevenlabs.ui.components.ActionSpecBuilder;
import io.elevenlabs.ui.components.BackButtonWithBackgroundKt;
import io.elevenlabs.ui.components.ButtonIconKt;
import io.elevenlabs.ui.components.ButtonIconSize;
import io.elevenlabs.ui.components.ButtonIconVariant;
import io.elevenlabs.ui.components.ButtonKt;
import io.elevenlabs.ui.components.ButtonSize;
import io.elevenlabs.ui.components.ConfirmationDialogKt;
import io.elevenlabs.ui.components.DividerKt;
import io.elevenlabs.ui.components.EmptyScreenKt;
import io.elevenlabs.ui.components.ErrorContainerKt;
import io.elevenlabs.ui.components.ErrorScreenKt;
import io.elevenlabs.ui.components.LoaderKt;
import io.elevenlabs.ui.components.MenuKt;
import io.elevenlabs.ui.components.SwipeToActionBoxKt;
import io.elevenlabs.ui.components.animations.AnimatedVisibilityContainersKt;
import io.elevenlabs.ui.components.headers.HeaderActionsKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.components.EchoToastKt;
import io.elevenlabs.ui.extensions.ComposeExtensionsKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.elevenlabs.ui.theme.ReaderColors;
import io.livekit.android.room.SignalClient;
import io.livekit.android.rpc.RpcError;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.PeerConnection;
import q2.j7;
import q2.k5;
import r1.c3;
import r1.d2;
import r1.i2;
import r1.k2;
import r1.l2;
import r1.p2;
import r1.u0;
import r1.z1;
import rd.c1;
import u2.r1;
import u2.s2;
import u2.x0;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000@\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001ay\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00052\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u008b\u0001\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u001e\u0010\u0013\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u000f\u0010\u0018\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u000f\u0010\u001a\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001a\u0010\u0019\u001a\u000f\u0010\u001b\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001b\u0010\u0019\u001a\u000f\u0010\u001c\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001c\u0010\u0019\u001a\u000f\u0010\u001d\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001d\u0010\u0019\u001a\u000f\u0010\u001e\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001e\u0010\u0019\u001a\u000f\u0010\u001f\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001f\u0010\u0019\u001a\u000f\u0010 \u001a\u00020\u0003H\u0007¢\u0006\u0004\b \u0010\u0019\u001a\u000f\u0010!\u001a\u00020\u0003H\u0007¢\u0006\u0004\b!\u0010\u0019\u001a\u000f\u0010\"\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\"\u0010\u0019\u001a\u000f\u0010#\u001a\u00020\u0003H\u0007¢\u0006\u0004\b#\u0010\u0019\u001a\u000f\u0010$\u001a\u00020\u0003H\u0007¢\u0006\u0004\b$\u0010\u0019¨\u0006+²\u0006\u000e\u0010&\u001a\u00020%8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010(\u001a\u00020'8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010)\u001a\u00020'8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010*\u001a\u00020'8\nX\u008a\u0084\u0002"}, d2 = {"", "collectionId", "Lkotlin/Function0;", "Lsn/z;", "onGoBack", "Lkotlin/Function1;", "onNavigateToRead", "Lkotlin/Function2;", "Lio/elevenlabs/domain/Analytics$Event$PlayerActivationSource;", "onNavigateToPlayer", "onNavigateToAddReadsScreen", "onNavigateToEditCollection", "Lio/elevenlabs/readerapp/ui/screens/authenticated/collections/CollectionViewModel;", "vm", "CollectionScreen", "(Ljava/lang/String;Lho/a;Lho/l;Lho/p;Lho/a;Lho/a;Lio/elevenlabs/readerapp/ui/screens/authenticated/collections/CollectionViewModel;Lu2/m;II)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/collections/CollectionState;", RemoteConfigConstants.ResponseFieldKey.STATE, "miniPlayer", "action", "ExploreCollectionScreenUI", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/collections/CollectionState;Lho/p;Lho/l;Lho/a;Lho/l;Lho/a;Lho/a;Lu2/m;II)V", "CollectionHeader", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/collections/CollectionState;Lu2/m;I)V", "Preview_CollectionScreenUI_idle", "(Lu2/m;I)V", "Preview_CollectionScreenUI_loading", "Preview_CollectionScreenUI_error", "Preview_CollectionScreenUI_no_subscription_ready", "Preview_CollectionScreenUI_no_subscription_empty", "Preview_CollectionScreenUI_no_subscription_no_description", "Preview_CollectionScreenUI_with_unreads", "Preview_CollectionScreenUI_newsletter", "Preview_CollectionScreenUI_newsletter_long_description", "Preview_CollectionScreenUI_success_toast", "Preview_CollectionScreenUI_owner_empty", "Preview_CollectionScreenUI_owner", "", "miniPlayerHeight", "", "menuExpanded", "deleteConfirmationVisible", "hasReachedEnd", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class CollectionScreenKt {
    private static final void CollectionHeader(final CollectionState collectionState, u2.m mVar, final int i10) {
        int i11;
        boolean z6;
        String title;
        int i12;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1757199584);
        if ((i10 & 6) == 0) {
            if (qVar.h(collectionState)) {
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
            if (collectionState.getMeta() == null) {
                r1 r10 = qVar.r();
                if (r10 != null) {
                    final int i13 = 0;
                    r10.f34012d = new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.collections.z
                        @Override // ho.p
                        public final Object invoke(Object obj, Object obj2) {
                            sn.z CollectionHeader$lambda$0;
                            sn.z CollectionHeader$lambda$2;
                            int i14 = i13;
                            u2.m mVar2 = (u2.m) obj;
                            int intValue = ((Integer) obj2).intValue();
                            switch (i14) {
                                case 0:
                                    CollectionHeader$lambda$0 = CollectionScreenKt.CollectionHeader$lambda$0(collectionState, i10, mVar2, intValue);
                                    return CollectionHeader$lambda$0;
                                default:
                                    CollectionHeader$lambda$2 = CollectionScreenKt.CollectionHeader$lambda$2(collectionState, i10, mVar2, intValue);
                                    return CollectionHeader$lambda$2;
                            }
                        }
                    };
                    return;
                }
                return;
            }
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i14 = ElevenLabsTheme.$stable;
            float m2357getX5D9Ej5fM = elevenLabsTheme.getSpacings(qVar, i14).m2357getX5D9Ej5fM();
            i3.q qVar2 = i3.q.f13017a;
            i3.t E = r1.d.E(qVar2, m2357getX5D9Ej5fM);
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
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
            u2.r.J(h4.g.f11907f, a10, qVar);
            u2.r.J(h4.g.f11906e, l4, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c5, qVar);
            if (CollectionMetaKt.isReadLater(collectionState.getMeta())) {
                qVar.X(-1434873312);
                title = kj.c.R(qVar, R.string.read_later_collection_title);
                qVar.p(false);
            } else {
                qVar.X(-1434793084);
                qVar.p(false);
                title = collectionState.getMeta().getTitle();
            }
            j7.d(title, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i14).getTitleLarge700Inter(), qVar, 0, 0, 131070);
            qVar = qVar;
            String description = collectionState.getMeta().getDescription();
            if (description != null && !wq.n.m0(description)) {
                qVar.X(-1434586283);
                r1.d.g(p2.f(qVar2, elevenLabsTheme.getSpacings(qVar, i14).m2350getX1D9Ej5fM()), qVar);
                j7.d(description, null, defpackage.f.A(elevenLabsTheme, qVar, i14), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i14).getSubtitleSmall500(), qVar, 0, 0, 131066);
                qVar = qVar;
                qVar.p(false);
            } else {
                qVar.X(-1434318164);
                qVar.p(false);
            }
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r11 = qVar.r();
        if (r11 != null) {
            final int i15 = 1;
            r11.f34012d = new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.collections.z
                @Override // ho.p
                public final Object invoke(Object obj, Object obj2) {
                    sn.z CollectionHeader$lambda$0;
                    sn.z CollectionHeader$lambda$2;
                    int i142 = i15;
                    u2.m mVar2 = (u2.m) obj;
                    int intValue = ((Integer) obj2).intValue();
                    switch (i142) {
                        case 0:
                            CollectionHeader$lambda$0 = CollectionScreenKt.CollectionHeader$lambda$0(collectionState, i10, mVar2, intValue);
                            return CollectionHeader$lambda$0;
                        default:
                            CollectionHeader$lambda$2 = CollectionScreenKt.CollectionHeader$lambda$2(collectionState, i10, mVar2, intValue);
                            return CollectionHeader$lambda$2;
                    }
                }
            };
        }
    }

    public static final sn.z CollectionHeader$lambda$0(CollectionState collectionState, int i10, u2.m mVar, int i11) {
        CollectionHeader(collectionState, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final sn.z CollectionHeader$lambda$2(CollectionState collectionState, int i10, u2.m mVar, int i11) {
        CollectionHeader(collectionState, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0149 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0195 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CollectionScreen(String str, ho.a aVar, ho.l lVar, ho.p pVar, ho.a aVar2, ho.a aVar3, CollectionViewModel collectionViewModel, u2.m mVar, int i10, int i11) {
        int i12;
        CollectionViewModel collectionViewModel2;
        boolean z6;
        CollectionViewModel collectionViewModel3;
        q7.c cVar;
        boolean z10;
        int i13;
        int i14;
        CollectionViewModel collectionViewModel4;
        boolean h10;
        Object L;
        int i15;
        int i16;
        Object L2;
        int i17;
        Object L3;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        ho.a aVar4 = aVar;
        str.getClass();
        aVar4.getClass();
        lVar.getClass();
        pVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(404443818);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i24 = 4;
            } else {
                i24 = 2;
            }
            i12 = i24 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(aVar4)) {
                i23 = 32;
            } else {
                i23 = 16;
            }
            i12 |= i23;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(lVar)) {
                i22 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i22 = 128;
            }
            i12 |= i22;
        }
        if ((i10 & 3072) == 0) {
            if (qVar.h(pVar)) {
                i21 = 2048;
            } else {
                i21 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i21;
        }
        if ((i10 & 24576) == 0) {
            if (qVar.h(aVar2)) {
                i20 = 16384;
            } else {
                i20 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i20;
        }
        if ((196608 & i10) == 0) {
            if (qVar.h(aVar3)) {
                i19 = 131072;
            } else {
                i19 = 65536;
            }
            i12 |= i19;
        }
        if ((1572864 & i10) == 0) {
            if ((i11 & 64) == 0) {
                collectionViewModel2 = collectionViewModel;
                if (qVar.h(collectionViewModel2)) {
                    i18 = 1048576;
                    i12 |= i18;
                }
            } else {
                collectionViewModel2 = collectionViewModel;
            }
            i18 = 524288;
            i12 |= i18;
        } else {
            collectionViewModel2 = collectionViewModel;
        }
        int i25 = i12;
        if ((599187 & i25) != 599186) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i25 & 1, z6)) {
            qVar.T();
            if ((i10 & 1) != 0 && !qVar.y()) {
                qVar.R();
                if ((i11 & 64) != 0) {
                    i13 = 0;
                    i14 = i25 & (-3670017);
                    z10 = true;
                    collectionViewModel4 = collectionViewModel2;
                    qVar.q();
                    CollectionState collectionState = (CollectionState) u2.r.o(collectionViewModel4.getStateFlow(), qVar, i13).getValue();
                    c3.j d10 = c3.k.d(-1932927259, z10, new c(pVar, 1), qVar);
                    h10 = qVar.h(collectionViewModel4);
                    L = qVar.L();
                    u2.e eVar = u2.l.f33918a;
                    if (!h10) {
                    }
                    L = new u(collectionViewModel4, 0);
                    qVar.h0(L);
                    int i26 = i14 << 6;
                    int i27 = i14 << 3;
                    ExploreCollectionScreenUI(collectionState, d10, (ho.l) L, aVar4, lVar, aVar2, aVar3, qVar, (i26 & 57344) | (i26 & 7168) | 48 | (i27 & 458752) | (i27 & 3670016), 0);
                    aVar4 = aVar4;
                    qVar = qVar;
                    boolean h11 = qVar.h(collectionViewModel4);
                    if ((i14 & 14) == 4) {
                    }
                    i16 = (h11 ? 1 : 0) | i15;
                    L2 = qVar.L();
                    if (i16 == 0) {
                    }
                    L2 = new CollectionScreenKt$CollectionScreen$3$1(collectionViewModel4, str, null);
                    qVar.h0(L2);
                    u2.r.f((ho.p) L2, str, qVar);
                    Boolean valueOf = Boolean.valueOf(collectionState.getNavigateBack());
                    boolean h12 = qVar.h(collectionState);
                    if ((i14 & 112) == 32) {
                    }
                    i17 = (h12 ? 1 : 0) | i13;
                    L3 = qVar.L();
                    if (i17 == 0) {
                    }
                    L3 = new CollectionScreenKt$CollectionScreen$4$1(collectionState, aVar4, null);
                    qVar.h0(L3);
                    u2.r.f((ho.p) L3, valueOf, qVar);
                    collectionViewModel3 = collectionViewModel4;
                }
            } else if ((i11 & 64) != 0) {
                androidx.lifecycle.r1 a10 = r7.a.a(qVar);
                if (a10 != null) {
                    pl.f o6 = tb.a.o(a10, qVar);
                    if (a10 instanceof androidx.lifecycle.o) {
                        cVar = ((androidx.lifecycle.o) a10).getDefaultViewModelCreationExtras();
                    } else {
                        cVar = q7.a.f28123b;
                    }
                    z10 = true;
                    i13 = 0;
                    i14 = i25 & (-3670017);
                    collectionViewModel4 = (CollectionViewModel) gg.b.j0(kotlin.jvm.internal.e0.f20562a.b(CollectionViewModel.class), a10, null, o6, cVar, qVar);
                    qVar.q();
                    CollectionState collectionState2 = (CollectionState) u2.r.o(collectionViewModel4.getStateFlow(), qVar, i13).getValue();
                    c3.j d102 = c3.k.d(-1932927259, z10, new c(pVar, 1), qVar);
                    h10 = qVar.h(collectionViewModel4);
                    L = qVar.L();
                    u2.e eVar2 = u2.l.f33918a;
                    if (!h10 || L == eVar2) {
                        L = new u(collectionViewModel4, 0);
                        qVar.h0(L);
                    }
                    int i262 = i14 << 6;
                    int i272 = i14 << 3;
                    ExploreCollectionScreenUI(collectionState2, d102, (ho.l) L, aVar4, lVar, aVar2, aVar3, qVar, (i262 & 57344) | (i262 & 7168) | 48 | (i272 & 458752) | (i272 & 3670016), 0);
                    aVar4 = aVar4;
                    qVar = qVar;
                    boolean h112 = qVar.h(collectionViewModel4);
                    if ((i14 & 14) == 4) {
                        i15 = 1;
                    } else {
                        i15 = i13;
                    }
                    i16 = (h112 ? 1 : 0) | i15;
                    L2 = qVar.L();
                    if (i16 == 0 || L2 == eVar2) {
                        L2 = new CollectionScreenKt$CollectionScreen$3$1(collectionViewModel4, str, null);
                        qVar.h0(L2);
                    }
                    u2.r.f((ho.p) L2, str, qVar);
                    Boolean valueOf2 = Boolean.valueOf(collectionState2.getNavigateBack());
                    boolean h122 = qVar.h(collectionState2);
                    if ((i14 & 112) == 32) {
                        i13 = 1;
                    }
                    i17 = (h122 ? 1 : 0) | i13;
                    L3 = qVar.L();
                    if (i17 == 0 || L3 == eVar2) {
                        L3 = new CollectionScreenKt$CollectionScreen$4$1(collectionState2, aVar4, null);
                        qVar.h0(L3);
                    }
                    u2.r.f((ho.p) L3, valueOf2, qVar);
                    collectionViewModel3 = collectionViewModel4;
                } else {
                    c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
            }
            i13 = 0;
            z10 = true;
            i14 = i25;
            collectionViewModel4 = collectionViewModel2;
            qVar.q();
            CollectionState collectionState22 = (CollectionState) u2.r.o(collectionViewModel4.getStateFlow(), qVar, i13).getValue();
            c3.j d1022 = c3.k.d(-1932927259, z10, new c(pVar, 1), qVar);
            h10 = qVar.h(collectionViewModel4);
            L = qVar.L();
            u2.e eVar22 = u2.l.f33918a;
            if (!h10) {
            }
            L = new u(collectionViewModel4, 0);
            qVar.h0(L);
            int i2622 = i14 << 6;
            int i2722 = i14 << 3;
            ExploreCollectionScreenUI(collectionState22, d1022, (ho.l) L, aVar4, lVar, aVar2, aVar3, qVar, (i2622 & 57344) | (i2622 & 7168) | 48 | (i2722 & 458752) | (i2722 & 3670016), 0);
            aVar4 = aVar4;
            qVar = qVar;
            boolean h1122 = qVar.h(collectionViewModel4);
            if ((i14 & 14) == 4) {
            }
            i16 = (h1122 ? 1 : 0) | i15;
            L2 = qVar.L();
            if (i16 == 0) {
            }
            L2 = new CollectionScreenKt$CollectionScreen$3$1(collectionViewModel4, str, null);
            qVar.h0(L2);
            u2.r.f((ho.p) L2, str, qVar);
            Boolean valueOf22 = Boolean.valueOf(collectionState22.getNavigateBack());
            boolean h1222 = qVar.h(collectionState22);
            if ((i14 & 112) == 32) {
            }
            i17 = (h1222 ? 1 : 0) | i13;
            L3 = qVar.L();
            if (i17 == 0) {
            }
            L3 = new CollectionScreenKt$CollectionScreen$4$1(collectionState22, aVar4, null);
            qVar.h0(L3);
            u2.r.f((ho.p) L3, valueOf22, qVar);
            collectionViewModel3 = collectionViewModel4;
        } else {
            qVar.R();
            collectionViewModel3 = collectionViewModel2;
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new fm.c(str, aVar4, lVar, pVar, aVar2, aVar3, collectionViewModel3, i10, i11);
        }
    }

    public static final sn.z CollectionScreen$lambda$0(ho.p pVar, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            boolean f10 = qVar.f(pVar);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new b0(pVar, 3);
                qVar.h0(L);
            }
            MiniPlayerKt.m1520MiniPlayerGSIvlCE(t2.u.P, false, 0L, (ho.l) L, null, qVar, 48, 21);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z CollectionScreen$lambda$0$0$0(ho.p pVar, String str) {
        str.getClass();
        pVar.invoke(str, Analytics.Event.PlayerActivationSource.Mini);
        return sn.z.f31622a;
    }

    public static final sn.z CollectionScreen$lambda$1$0(CollectionViewModel collectionViewModel, ho.l lVar) {
        lVar.getClass();
        lVar.invoke(collectionViewModel);
        return sn.z.f31622a;
    }

    public static final sn.z CollectionScreen$lambda$4(String str, ho.a aVar, ho.l lVar, ho.p pVar, ho.a aVar2, ho.a aVar3, CollectionViewModel collectionViewModel, int i10, int i11, u2.m mVar, int i12) {
        CollectionScreen(str, aVar, lVar, pVar, aVar2, aVar3, collectionViewModel, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void ExploreCollectionScreenUI(CollectionState collectionState, ho.p pVar, ho.l lVar, ho.a aVar, ho.l lVar2, ho.a aVar2, ho.a aVar3, u2.m mVar, int i10, int i11) {
        int i12;
        ho.a aVar4;
        int i13;
        int i14;
        int i15;
        int i16;
        ho.a aVar5;
        int i17;
        int i18;
        ho.a aVar6;
        int i19;
        boolean z6;
        ho.l lVar3;
        u2.q qVar;
        ho.l lVar4;
        ho.a aVar7;
        ho.a aVar8;
        r1 r10;
        ho.a aVar9;
        ho.l lVar5;
        ho.a aVar10;
        boolean z10;
        boolean z11;
        int i20;
        int i21;
        int i22;
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(2023585785);
        if ((i10 & 6) == 0) {
            if (qVar2.h(collectionState)) {
                i22 = 4;
            } else {
                i22 = 2;
            }
            i12 = i22 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(pVar)) {
                i21 = 32;
            } else {
                i21 = 16;
            }
            i12 |= i21;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.h(lVar)) {
                i20 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i20 = 128;
            }
            i12 |= i20;
        }
        int i23 = i11 & 8;
        if (i23 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            aVar4 = aVar;
            if (qVar2.h(aVar4)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i13;
            i14 = i11 & 16;
            if (i14 == 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                if (qVar2.h(lVar2)) {
                    i15 = 16384;
                } else {
                    i15 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i12 |= i15;
                i16 = i11 & 32;
                if (i16 != 0) {
                    i12 |= 196608;
                } else if ((196608 & i10) == 0) {
                    aVar5 = aVar2;
                    if (qVar2.h(aVar5)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i12 |= i17;
                    i18 = i11 & 64;
                    if (i18 == 0) {
                        i12 |= 1572864;
                    } else if ((1572864 & i10) == 0) {
                        aVar6 = aVar3;
                        if (qVar2.h(aVar6)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i12 |= i19;
                        if ((i12 & 599187) != 599186) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (qVar2.O(i12 & 1, z6)) {
                            u2.e eVar = u2.l.f33918a;
                            if (i23 != 0) {
                                Object L = qVar2.L();
                                if (L == eVar) {
                                    L = new b(4);
                                    qVar2.h0(L);
                                }
                                aVar9 = (ho.a) L;
                            } else {
                                aVar9 = aVar4;
                            }
                            if (i14 != 0) {
                                Object L2 = qVar2.L();
                                if (L2 == eVar) {
                                    L2 = new y(6);
                                    qVar2.h0(L2);
                                }
                                lVar5 = (ho.l) L2;
                            } else {
                                lVar5 = lVar2;
                            }
                            if (i16 != 0) {
                                Object L3 = qVar2.L();
                                if (L3 == eVar) {
                                    L3 = new b(5);
                                    qVar2.h0(L3);
                                }
                                aVar5 = (ho.a) L3;
                            }
                            if (i18 != 0) {
                                Object L4 = qVar2.L();
                                if (L4 == eVar) {
                                    L4 = new b(3);
                                    qVar2.h0(L4);
                                }
                                aVar10 = (ho.a) L4;
                            } else {
                                aVar10 = aVar6;
                            }
                            Object L5 = qVar2.L();
                            if (L5 == eVar) {
                                L5 = com.google.android.gms.internal.play_billing.b.t(0, qVar2);
                            }
                            x0 x0Var = (x0) L5;
                            float rememberPxToDp = ComposeExtensionsKt.rememberPxToDp(ExploreCollectionScreenUI$lambda$5(x0Var), (u2.m) qVar2, 0);
                            String navigateToReadId = collectionState.getNavigateToReadId();
                            boolean h10 = qVar2.h(collectionState);
                            if ((i12 & 57344) == 16384) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            boolean z12 = h10 | z10;
                            int i24 = i12;
                            if ((i12 & 896) == 256) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            boolean z13 = z11 | z12;
                            Object L6 = qVar2.L();
                            if (z13 || L6 == eVar) {
                                L6 = new CollectionScreenKt$ExploreCollectionScreenUI$5$1(collectionState, lVar5, lVar, null);
                                qVar2.h0(L6);
                            }
                            u2.r.f((ho.p) L6, navigateToReadId, qVar2);
                            i3.l lVar6 = i3.d.f12997a;
                            f1 d10 = r1.p.d(lVar6, false);
                            int hashCode = Long.hashCode(qVar2.T);
                            c3.o l4 = qVar2.l();
                            i3.q qVar3 = i3.q.f13017a;
                            i3.t c5 = i3.a.c(qVar3, qVar2);
                            h4.h.f11920i.getClass();
                            h4.f fVar = h4.g.f11903b;
                            qVar2.b0();
                            ho.a aVar11 = aVar9;
                            if (qVar2.S) {
                                qVar2.k(fVar);
                            } else {
                                qVar2.k0();
                            }
                            h4.e eVar2 = h4.g.f11907f;
                            u2.r.J(eVar2, d10, qVar2);
                            h4.e eVar3 = h4.g.f11906e;
                            u2.r.J(eVar3, l4, qVar2);
                            Integer valueOf = Integer.valueOf(hashCode);
                            h4.e eVar4 = h4.g.f11908g;
                            u2.r.y(qVar2, valueOf, eVar4);
                            h4.d dVar = h4.g.f11909h;
                            u2.r.F(dVar, qVar2);
                            h4.e eVar5 = h4.g.f11905d;
                            u2.r.J(eVar5, c5, qVar2);
                            lVar4 = lVar5;
                            ho.a aVar12 = aVar5;
                            ho.a aVar13 = aVar10;
                            k5.a(null, c3.k.d(1488689263, true, new f2.o(aVar11, collectionState, aVar12, lVar, aVar10), qVar2), null, null, null, 0, 0L, 0L, null, c3.k.d(2121393220, true, new q(collectionState, lVar, rememberPxToDp, aVar12), qVar2), qVar2, 805306416, 509);
                            qVar = qVar2;
                            i3.t I = r1.d.I(r1.t.f29349a.b(qVar3, i3.d.Z), t2.u.P, t2.u.P, t2.u.P, ElevenLabsTheme.INSTANCE.getSpacings(qVar, ElevenLabsTheme.$stable).m2357getX5D9Ej5fM(), 7);
                            Object L7 = qVar.L();
                            if (L7 == eVar) {
                                L7 = new b0(x0Var, 2);
                                qVar.h0(L7);
                            }
                            i3.t q = f4.i0.q(I, (ho.l) L7);
                            f1 d11 = r1.p.d(lVar6, false);
                            int hashCode2 = Long.hashCode(qVar.T);
                            c3.o l7 = qVar.l();
                            i3.t c10 = i3.a.c(q, qVar);
                            qVar.b0();
                            if (qVar.S) {
                                qVar.k(fVar);
                            } else {
                                qVar.k0();
                            }
                            u2.r.J(eVar2, d11, qVar);
                            u2.r.J(eVar3, l7, qVar);
                            defpackage.f.u(hashCode2, qVar, eVar4, qVar, dVar);
                            u2.r.J(eVar5, c10, qVar);
                            pVar.invoke(qVar, Integer.valueOf((i24 >> 3) & 14));
                            qVar.p(true);
                            lVar3 = lVar;
                            AnimatedVisibilityContainersKt.AnimatedSlideTopWithFadeVisibility(collectionState.getShowAddingSuccessToast(), c3.k.d(-808182486, true, new r(lVar3, 0), qVar), qVar, 48);
                            qVar.p(true);
                            aVar8 = aVar13;
                            aVar4 = aVar11;
                            aVar7 = aVar12;
                        } else {
                            lVar3 = lVar;
                            qVar = qVar2;
                            qVar.R();
                            lVar4 = lVar2;
                            aVar7 = aVar5;
                            aVar8 = aVar6;
                        }
                        r10 = qVar.r();
                        if (r10 != null) {
                            r10.f34012d = new fm.c(collectionState, pVar, lVar3, aVar4, lVar4, aVar7, aVar8, i10, i11, 2);
                            return;
                        }
                        return;
                    }
                    aVar6 = aVar3;
                    if ((i12 & 599187) != 599186) {
                    }
                    if (qVar2.O(i12 & 1, z6)) {
                    }
                    r10 = qVar.r();
                    if (r10 != null) {
                    }
                }
                aVar5 = aVar2;
                i18 = i11 & 64;
                if (i18 == 0) {
                }
                aVar6 = aVar3;
                if ((i12 & 599187) != 599186) {
                }
                if (qVar2.O(i12 & 1, z6)) {
                }
                r10 = qVar.r();
                if (r10 != null) {
                }
            }
            i16 = i11 & 32;
            if (i16 != 0) {
            }
            aVar5 = aVar2;
            i18 = i11 & 64;
            if (i18 == 0) {
            }
            aVar6 = aVar3;
            if ((i12 & 599187) != 599186) {
            }
            if (qVar2.O(i12 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        aVar4 = aVar;
        i14 = i11 & 16;
        if (i14 == 0) {
        }
        i16 = i11 & 32;
        if (i16 != 0) {
        }
        aVar5 = aVar2;
        i18 = i11 & 64;
        if (i18 == 0) {
        }
        aVar6 = aVar3;
        if ((i12 & 599187) != 599186) {
        }
        if (qVar2.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final sn.z ExploreCollectionScreenUI$lambda$1$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    private static final int ExploreCollectionScreenUI$lambda$5(x0 x0Var) {
        return ((u2.f1) x0Var).h();
    }

    private static final void ExploreCollectionScreenUI$lambda$6(x0 x0Var, int i10) {
        ((u2.f1) x0Var).i(i10);
    }

    public static final sn.z ExploreCollectionScreenUI$lambda$8$0(ho.a aVar, CollectionState collectionState, ho.a aVar2, ho.l lVar, ho.a aVar3, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            HeaderActionsKt.HeaderActions((i3.t) null, (String) null, c3.k.d(-173208076, true, new m(1, aVar), qVar), c3.k.d(-122523083, true, new n2(collectionState, aVar2, lVar, aVar3, 5), qVar), (i3.f) null, qVar, 3456, 19);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ExploreCollectionScreenUI$lambda$8$0$0(ho.a aVar, l2 l2Var, u2.m mVar, int i10) {
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

    public static final sn.z ExploreCollectionScreenUI$lambda$8$0$1(CollectionState collectionState, ho.a aVar, ho.l lVar, ho.a aVar2, l2 l2Var, u2.m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            if (collectionState.getMeta() != null && collectionState.getMeta().isOwner()) {
                qVar.X(637271270);
                int i11 = io.elevenlabs.ui.R.drawable.plus_large;
                String R = kj.c.R(qVar, R.string.collection_empty_state_action);
                boolean f10 = qVar.f(aVar);
                Object L = qVar.L();
                u2.e eVar = u2.l.f33918a;
                if (f10 || L == eVar) {
                    L = new s(1, aVar);
                    qVar.h0(L);
                }
                ButtonIconVariant buttonIconVariant = ButtonIconVariant.Primary;
                ButtonIconSize buttonIconSize = ButtonIconSize.Small;
                u2.q qVar2 = qVar;
                ButtonIconKt.ButtonIcon(i11, R, (ho.a) L, null, buttonIconVariant, buttonIconSize, false, false, false, qVar2, 221184, 456);
                f1 d10 = r1.p.d(i3.d.f12997a, false);
                int hashCode = Long.hashCode(qVar2.T);
                c3.o l4 = qVar2.l();
                i3.t c5 = i3.a.c(i3.q.f13017a, qVar2);
                h4.h.f11920i.getClass();
                h4.f fVar = h4.g.f11903b;
                qVar2.b0();
                if (qVar2.S) {
                    qVar2.k(fVar);
                } else {
                    qVar2.k0();
                }
                u2.r.J(h4.g.f11907f, d10, qVar2);
                u2.r.J(h4.g.f11906e, l4, qVar2);
                u2.r.y(qVar2, Integer.valueOf(hashCode), h4.g.f11908g);
                u2.r.F(h4.g.f11909h, qVar2);
                u2.r.J(h4.g.f11905d, c5, qVar2);
                Object L2 = qVar2.L();
                if (L2 == eVar) {
                    L2 = u2.r.A(Boolean.FALSE);
                    qVar2.h0(L2);
                }
                final z0 z0Var = (z0) L2;
                int i12 = io.elevenlabs.ui.R.drawable.dot_grid_1x3_horizontal;
                String R2 = kj.c.R(qVar2, R.string.player_accessibility_more);
                Object L3 = qVar2.L();
                if (L3 == eVar) {
                    final int i13 = 0;
                    L3 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.collections.v
                        @Override // ho.a
                        public final Object invoke() {
                            sn.z ExploreCollectionScreenUI$lambda$8$0$1$1$3$0;
                            sn.z ExploreCollectionScreenUI$lambda$8$0$1$1$7$0;
                            sn.z ExploreCollectionScreenUI$lambda$8$0$1$1$9$0;
                            switch (i13) {
                                case 0:
                                    ExploreCollectionScreenUI$lambda$8$0$1$1$3$0 = CollectionScreenKt.ExploreCollectionScreenUI$lambda$8$0$1$1$3$0(z0Var);
                                    return ExploreCollectionScreenUI$lambda$8$0$1$1$3$0;
                                case 1:
                                    ExploreCollectionScreenUI$lambda$8$0$1$1$7$0 = CollectionScreenKt.ExploreCollectionScreenUI$lambda$8$0$1$1$7$0(z0Var);
                                    return ExploreCollectionScreenUI$lambda$8$0$1$1$7$0;
                                default:
                                    ExploreCollectionScreenUI$lambda$8$0$1$1$9$0 = CollectionScreenKt.ExploreCollectionScreenUI$lambda$8$0$1$1$9$0(z0Var);
                                    return ExploreCollectionScreenUI$lambda$8$0$1$1$9$0;
                            }
                        }
                    };
                    qVar2.h0(L3);
                }
                ButtonIconKt.ButtonIcon(i12, R2, (ho.a) L3, null, ButtonIconVariant.Menu, buttonIconSize, false, false, false, qVar2, 221568, 456);
                Object L4 = qVar2.L();
                if (L4 == eVar) {
                    L4 = u2.r.A(Boolean.FALSE);
                    qVar2.h0(L4);
                }
                final z0 z0Var2 = (z0) L4;
                if (ExploreCollectionScreenUI$lambda$8$0$1$1$5(z0Var2)) {
                    qVar2.X(185295144);
                    Object L5 = qVar2.L();
                    if (L5 == eVar) {
                        final int i14 = 1;
                        L5 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.collections.v
                            @Override // ho.a
                            public final Object invoke() {
                                sn.z ExploreCollectionScreenUI$lambda$8$0$1$1$3$0;
                                sn.z ExploreCollectionScreenUI$lambda$8$0$1$1$7$0;
                                sn.z ExploreCollectionScreenUI$lambda$8$0$1$1$9$0;
                                switch (i14) {
                                    case 0:
                                        ExploreCollectionScreenUI$lambda$8$0$1$1$3$0 = CollectionScreenKt.ExploreCollectionScreenUI$lambda$8$0$1$1$3$0(z0Var2);
                                        return ExploreCollectionScreenUI$lambda$8$0$1$1$3$0;
                                    case 1:
                                        ExploreCollectionScreenUI$lambda$8$0$1$1$7$0 = CollectionScreenKt.ExploreCollectionScreenUI$lambda$8$0$1$1$7$0(z0Var2);
                                        return ExploreCollectionScreenUI$lambda$8$0$1$1$7$0;
                                    default:
                                        ExploreCollectionScreenUI$lambda$8$0$1$1$9$0 = CollectionScreenKt.ExploreCollectionScreenUI$lambda$8$0$1$1$9$0(z0Var2);
                                        return ExploreCollectionScreenUI$lambda$8$0$1$1$9$0;
                                }
                            }
                        };
                        qVar2.h0(L5);
                    }
                    ho.a aVar3 = (ho.a) L5;
                    boolean f11 = qVar2.f(lVar);
                    Object L6 = qVar2.L();
                    if (f11 || L6 == eVar) {
                        L6 = new j(lVar, 2);
                        qVar2.h0(L6);
                    }
                    ConfirmationDialogKt.ConfirmationDialog(aVar3, (ho.a) L6, kj.c.R(qVar2, R.string.collection_delete_confirmation_title), kj.c.R(qVar2, R.string.collection_delete_confirmation_message), kj.c.R(qVar2, R.string.collection_delete_confirmation_dismiss), kj.c.R(qVar2, R.string.collection_delete_confirmation_confirm), false, qVar2, 6, 64);
                    qVar2 = qVar2;
                    qVar2.p(false);
                } else {
                    qVar2.X(186131214);
                    qVar2.p(false);
                }
                boolean isReadLater = CollectionMetaKt.isReadLater(collectionState.getMeta());
                boolean ExploreCollectionScreenUI$lambda$8$0$1$1$1 = ExploreCollectionScreenUI$lambda$8$0$1$1$1(z0Var);
                Object L7 = qVar2.L();
                if (L7 == eVar) {
                    final int i15 = 2;
                    L7 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.collections.v
                        @Override // ho.a
                        public final Object invoke() {
                            sn.z ExploreCollectionScreenUI$lambda$8$0$1$1$3$0;
                            sn.z ExploreCollectionScreenUI$lambda$8$0$1$1$7$0;
                            sn.z ExploreCollectionScreenUI$lambda$8$0$1$1$9$0;
                            switch (i15) {
                                case 0:
                                    ExploreCollectionScreenUI$lambda$8$0$1$1$3$0 = CollectionScreenKt.ExploreCollectionScreenUI$lambda$8$0$1$1$3$0(z0Var);
                                    return ExploreCollectionScreenUI$lambda$8$0$1$1$3$0;
                                case 1:
                                    ExploreCollectionScreenUI$lambda$8$0$1$1$7$0 = CollectionScreenKt.ExploreCollectionScreenUI$lambda$8$0$1$1$7$0(z0Var);
                                    return ExploreCollectionScreenUI$lambda$8$0$1$1$7$0;
                                default:
                                    ExploreCollectionScreenUI$lambda$8$0$1$1$9$0 = CollectionScreenKt.ExploreCollectionScreenUI$lambda$8$0$1$1$9$0(z0Var);
                                    return ExploreCollectionScreenUI$lambda$8$0$1$1$9$0;
                            }
                        }
                    };
                    qVar2.h0(L7);
                }
                ho.a aVar4 = (ho.a) L7;
                qVar2.X(-686716983);
                un.b o6 = ig.f.o();
                if (!isReadLater) {
                    qVar2.X(489514094);
                    o6.add(c3.k.d(571187468, true, new w(aVar2, z0Var, 0), qVar2));
                    qVar2.p(false);
                } else {
                    qVar2.X(490214663);
                    qVar2.p(false);
                }
                o6.add(c3.k.d(572307633, true, new q0(lVar, collectionState, z0Var, 5), qVar2));
                if (!isReadLater) {
                    qVar2.X(491172997);
                    o6.add(c3.k.d(1501127299, true, new w(z0Var, z0Var2), qVar2));
                    qVar2.p(false);
                } else {
                    qVar2.X(491882215);
                    qVar2.p(false);
                }
                un.b i16 = ig.f.i(o6);
                qVar2.p(false);
                u2.q qVar3 = qVar2;
                MenuKt.m1842MenuILWXrKs(ExploreCollectionScreenUI$lambda$8$0$1$1$1, aVar4, null, 0L, null, i16, qVar3, 48, 28);
                qVar3.p(true);
                qVar3.p(false);
            } else {
                qVar.X(642352077);
                qVar.p(false);
            }
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ExploreCollectionScreenUI$lambda$8$0$1$0$0(ho.a aVar) {
        aVar.invoke();
        return sn.z.f31622a;
    }

    private static final boolean ExploreCollectionScreenUI$lambda$8$0$1$1$1(z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    public static final sn.z ExploreCollectionScreenUI$lambda$8$0$1$1$10$0(ho.a aVar, z0 z0Var, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            boolean f10 = qVar.f(aVar);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new a(aVar, z0Var);
                qVar.h0(L);
            }
            MenuKt.MenuItem((ho.a) L, false, kj.c.R(qVar, R.string.collection_menu_edit), Integer.valueOf(io.elevenlabs.ui.R.drawable.pencil), false, false, qVar, 0, 50);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ExploreCollectionScreenUI$lambda$8$0$1$1$10$0$0$0(ho.a aVar, z0 z0Var) {
        ExploreCollectionScreenUI$lambda$8$0$1$1$2(z0Var, false);
        aVar.invoke();
        return sn.z.f31622a;
    }

    public static final sn.z ExploreCollectionScreenUI$lambda$8$0$1$1$10$1(ho.l lVar, CollectionState collectionState, z0 z0Var, u2.m mVar, int i10) {
        boolean z6;
        boolean z10;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            boolean f10 = qVar.f(lVar);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new a(lVar, z0Var, 1);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            if (!collectionState.isLoadingMore() && !collectionState.isLoading()) {
                z10 = true;
            } else {
                z10 = false;
            }
            MenuKt.MenuItem(aVar, z10, kj.c.R(qVar, R.string.menu_item_player_add_to_queue), Integer.valueOf(io.elevenlabs.ui.R.drawable.playlist_add), false, false, qVar, 0, 48);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ExploreCollectionScreenUI$lambda$8$0$1$1$10$1$0$0(ho.l lVar, z0 z0Var) {
        ExploreCollectionScreenUI$lambda$8$0$1$1$2(z0Var, false);
        lVar.invoke(new o(26));
        return sn.z.f31622a;
    }

    public static final sn.z ExploreCollectionScreenUI$lambda$8$0$1$1$10$1$0$0$0(CollectionViewModel collectionViewModel) {
        collectionViewModel.getClass();
        collectionViewModel.onClickAddFullCollectionToQueue();
        return sn.z.f31622a;
    }

    public static final sn.z ExploreCollectionScreenUI$lambda$8$0$1$1$10$2(z0 z0Var, z0 z0Var2, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new a(z0Var, z0Var2, 2);
                qVar.h0(L);
            }
            MenuKt.MenuItem((ho.a) L, false, kj.c.R(qVar, R.string.collection_menu_delete), Integer.valueOf(io.elevenlabs.ui.R.drawable.trash_can), false, false, qVar, 6, 50);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ExploreCollectionScreenUI$lambda$8$0$1$1$10$2$0$0(z0 z0Var, z0 z0Var2) {
        ExploreCollectionScreenUI$lambda$8$0$1$1$2(z0Var, false);
        ExploreCollectionScreenUI$lambda$8$0$1$1$6(z0Var2, true);
        return sn.z.f31622a;
    }

    private static final void ExploreCollectionScreenUI$lambda$8$0$1$1$2(z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    public static final sn.z ExploreCollectionScreenUI$lambda$8$0$1$1$3$0(z0 z0Var) {
        ExploreCollectionScreenUI$lambda$8$0$1$1$2(z0Var, !ExploreCollectionScreenUI$lambda$8$0$1$1$1(z0Var));
        return sn.z.f31622a;
    }

    private static final boolean ExploreCollectionScreenUI$lambda$8$0$1$1$5(z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    private static final void ExploreCollectionScreenUI$lambda$8$0$1$1$6(z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    public static final sn.z ExploreCollectionScreenUI$lambda$8$0$1$1$7$0(z0 z0Var) {
        ExploreCollectionScreenUI$lambda$8$0$1$1$6(z0Var, false);
        return sn.z.f31622a;
    }

    public static final sn.z ExploreCollectionScreenUI$lambda$8$0$1$1$8$0(ho.l lVar) {
        lVar.invoke(new y(2));
        return sn.z.f31622a;
    }

    public static final sn.z ExploreCollectionScreenUI$lambda$8$0$1$1$8$0$0(CollectionViewModel collectionViewModel) {
        collectionViewModel.getClass();
        collectionViewModel.onDelete();
        return sn.z.f31622a;
    }

    public static final sn.z ExploreCollectionScreenUI$lambda$8$0$1$1$9$0(z0 z0Var) {
        ExploreCollectionScreenUI$lambda$8$0$1$1$2(z0Var, false);
        return sn.z.f31622a;
    }

    public static final sn.z ExploreCollectionScreenUI$lambda$8$1(CollectionState collectionState, ho.l lVar, float f10, ho.a aVar, z1 z1Var, u2.m mVar, int i10) {
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
            t1.z a10 = t1.b0.a(0, qVar, 3);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = u2.r.s(new l0(a10, 2));
                qVar.h0(L);
            }
            s2 s2Var = (s2) L;
            Boolean valueOf = Boolean.valueOf(ExploreCollectionScreenUI$lambda$8$1$1(s2Var));
            Boolean valueOf2 = Boolean.valueOf(collectionState.isLoading());
            boolean h10 = qVar.h(collectionState) | qVar.f(lVar);
            Object L2 = qVar.L();
            if (h10 || L2 == eVar) {
                L2 = new CollectionScreenKt$ExploreCollectionScreenUI$6$2$1$1(collectionState, lVar, s2Var, null);
                qVar.h0(L2);
            }
            u2.r.g(valueOf, valueOf2, (ho.p) L2, qVar);
            float d10 = z1Var.d();
            h5.m mVar2 = h5.m.f12093a;
            d2 d2Var = new d2(r1.d.m(z1Var, mVar2), d10, r1.d.l(z1Var, mVar2), z1Var.a() + f10);
            i3.q qVar2 = i3.q.f13017a;
            i3.t d11 = p2.d(qVar2, 1.0f);
            boolean h11 = qVar.h(collectionState) | qVar.f(aVar) | qVar.f(lVar);
            Object L3 = qVar.L();
            if (h11 || L3 == eVar) {
                L3 = new a2.o0(collectionState, aVar, lVar, 18);
                qVar.h0(L3);
            }
            c1.c(d11, a10, d2Var, false, null, null, null, false, null, (ho.l) L3, qVar, 6, 504);
            if (!wq.n.m0(collectionState.getError())) {
                qVar.X(-2006409796);
                ErrorScreenKt.m1836ErrorScreenV9fs2A(r1.d.D(qVar2, z1Var), null, collectionState.getError(), c3.k.d(915690021, true, new r(lVar, 1), qVar), null, 0L, qVar, 3072, 50);
                qVar.p(false);
            } else {
                qVar.X(-2005946594);
                qVar.p(false);
            }
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final boolean ExploreCollectionScreenUI$lambda$8$1$1(s2 s2Var) {
        return ((Boolean) s2Var.getValue()).booleanValue();
    }

    public static final sn.z ExploreCollectionScreenUI$lambda$8$1$3$0(final CollectionState collectionState, final ho.a aVar, final ho.l lVar, t1.t tVar) {
        CollectionMeta meta;
        tVar.getClass();
        final int i10 = 0;
        t1.t.c(tVar, null, null, new c3.j(new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.collections.p
            @Override // ho.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                sn.z ExploreCollectionScreenUI$lambda$8$1$3$0$0;
                sn.z ExploreCollectionScreenUI$lambda$8$1$3$0$5;
                switch (i10) {
                    case 0:
                        ExploreCollectionScreenUI$lambda$8$1$3$0$0 = CollectionScreenKt.ExploreCollectionScreenUI$lambda$8$1$3$0$0((CollectionState) collectionState, (t1.b) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                        return ExploreCollectionScreenUI$lambda$8$1$3$0$0;
                    default:
                        ExploreCollectionScreenUI$lambda$8$1$3$0$5 = CollectionScreenKt.ExploreCollectionScreenUI$lambda$8$1$3$0$5((ho.l) collectionState, (t1.b) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                        return ExploreCollectionScreenUI$lambda$8$1$3$0$5;
                }
            }
        }, true, 2123307225), 3);
        if (collectionState.isLoading()) {
            t1.t.c(tVar, null, null, ComposableSingletons$CollectionScreenKt.INSTANCE.m1339getLambda$454723212$app_productionRelease(), 3);
        }
        if (collectionState.getReads().isEmpty() && !collectionState.isLoading()) {
            if (collectionState.getMeta() != null) {
                final int i11 = 0;
                t1.t.c(tVar, null, null, new c3.j(new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.collections.t
                    @Override // ho.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        sn.z ExploreCollectionScreenUI$lambda$8$1$3$0$1;
                        sn.z ExploreCollectionScreenUI$lambda$8$1$3$0$4;
                        switch (i11) {
                            case 0:
                                int intValue = ((Integer) obj3).intValue();
                                ExploreCollectionScreenUI$lambda$8$1$3$0$1 = CollectionScreenKt.ExploreCollectionScreenUI$lambda$8$1$3$0$1(collectionState, (ho.a) aVar, (t1.b) obj, (u2.m) obj2, intValue);
                                return ExploreCollectionScreenUI$lambda$8$1$3$0$1;
                            default:
                                int intValue2 = ((Integer) obj3).intValue();
                                ExploreCollectionScreenUI$lambda$8$1$3$0$4 = CollectionScreenKt.ExploreCollectionScreenUI$lambda$8$1$3$0$4(collectionState, (ho.l) aVar, (t1.b) obj, (u2.m) obj2, intValue2);
                                return ExploreCollectionScreenUI$lambda$8$1$3$0$4;
                        }
                    }
                }, true, 1788753478), 3);
            }
        } else {
            if (!collectionState.getReads().isEmpty() && (meta = collectionState.getMeta()) != null && CollectionMetaKt.isNewsletter(meta)) {
                t1.t.c(tVar, null, null, ComposableSingletons$CollectionScreenKt.INSTANCE.getLambda$621246415$app_productionRelease(), 3);
            }
            final List<ReadMeta> reads = collectionState.getReads();
            final o oVar = new o(23);
            final CollectionScreenKt$ExploreCollectionScreenUI$lambda$8$1$3$0$$inlined$items$default$1 collectionScreenKt$ExploreCollectionScreenUI$lambda$8$1$3$0$$inlined$items$default$1 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.collections.CollectionScreenKt$ExploreCollectionScreenUI$lambda$8$1$3$0$$inlined$items$default$1
                @Override // ho.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((ReadMeta) obj);
                }

                @Override // ho.l
                public final Void invoke(ReadMeta readMeta) {
                    return null;
                }
            };
            ((t1.i) tVar).u(reads.size(), new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.collections.CollectionScreenKt$ExploreCollectionScreenUI$lambda$8$1$3$0$$inlined$items$default$2
                public final Object invoke(int i12) {
                    return ho.l.this.invoke(reads.get(i12));
                }

                @Override // ho.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }
            }, new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.collections.CollectionScreenKt$ExploreCollectionScreenUI$lambda$8$1$3$0$$inlined$items$default$3
                public final Object invoke(int i12) {
                    return ho.l.this.invoke(reads.get(i12));
                }

                @Override // ho.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }
            }, new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.collections.CollectionScreenKt$ExploreCollectionScreenUI$lambda$8$1$3$0$$inlined$items$default$4
                public final void invoke(t1.b bVar, int i12, u2.m mVar, int i13) {
                    int i14;
                    boolean z6;
                    boolean z10;
                    int i15;
                    int i16;
                    int i17;
                    if ((i13 & 6) == 0) {
                        if (((u2.q) mVar).f(bVar)) {
                            i17 = 4;
                        } else {
                            i17 = 2;
                        }
                        i14 = i13 | i17;
                    } else {
                        i14 = i13;
                    }
                    if ((i13 & 48) == 0) {
                        if (((u2.q) mVar).d(i12)) {
                            i16 = 32;
                        } else {
                            i16 = 16;
                        }
                        i14 |= i16;
                    }
                    if ((i14 & 147) != 146) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    u2.q qVar = (u2.q) mVar;
                    if (qVar.O(i14 & 1, z6)) {
                        final ReadMeta readMeta = (ReadMeta) reads.get(i12);
                        qVar.X(-737780535);
                        boolean f10 = qVar.f(collectionState.getPlayerQueue()) | qVar.f(readMeta);
                        Object L = qVar.L();
                        Object obj = u2.l.f33918a;
                        if (f10 || L == obj) {
                            List<MediaItemState> playerQueue = collectionState.getPlayerQueue();
                            if (playerQueue == null || !playerQueue.isEmpty()) {
                                Iterator<T> it = playerQueue.iterator();
                                while (it.hasNext()) {
                                    if (kotlin.jvm.internal.m.c(((MediaItemState) it.next()).getReadId(), readMeta.getReadId())) {
                                        z10 = true;
                                        break;
                                    }
                                }
                            }
                            z10 = false;
                            L = Boolean.valueOf(z10);
                            qVar.h0(L);
                        }
                        boolean booleanValue = ((Boolean) L).booleanValue();
                        i3.q qVar2 = i3.q.f13017a;
                        i3.t a10 = t1.b.a(bVar, p2.e(qVar2, 1.0f), null, 7);
                        r1.x a11 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
                        int hashCode = Long.hashCode(qVar.T);
                        c3.o l4 = qVar.l();
                        i3.t c5 = i3.a.c(a10, qVar);
                        h4.h.f11920i.getClass();
                        ho.a aVar2 = h4.g.f11903b;
                        qVar.b0();
                        if (qVar.S) {
                            qVar.k(aVar2);
                        } else {
                            qVar.k0();
                        }
                        u2.r.J(h4.g.f11907f, a11, qVar);
                        u2.r.J(h4.g.f11906e, l4, qVar);
                        u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
                        u2.r.F(h4.g.f11909h, qVar);
                        u2.r.J(h4.g.f11905d, c5, qVar);
                        int i18 = io.elevenlabs.ui.R.drawable.playlist_add;
                        if (booleanValue) {
                            i15 = R.string.menu_item_player_remove_from_queue;
                        } else {
                            i15 = R.string.menu_item_player_add_to_queue;
                        }
                        String R = kj.c.R(qVar, i15);
                        ReaderColors readerColors = ReaderColors.INSTANCE;
                        final ActionConfig actionConfig = new ActionConfig(i18, R, readerColors.m2461getTeal6000d7_KjU(), false, false, 24, null);
                        final ActionConfig actionConfig2 = new ActionConfig(io.elevenlabs.ui.R.drawable.unread, kj.c.R(qVar, R.string.menu_action_mark_unread), readerColors.m2439getPurple6000d7_KjU(), false, false, 24, null);
                        final ActionConfig actionConfig3 = new ActionConfig(io.elevenlabs.ui.R.drawable.trash_can, kj.c.R(qVar, R.string.swipe_action_remove_from_collection), ElevenLabsTheme.INSTANCE.getColor(qVar, ElevenLabsTheme.$stable).getButtonBackground().m2015getDangerConfirm0d7_KjU(), true, false, 16, null);
                        final ActionConfig actionConfig4 = new ActionConfig(io.elevenlabs.ui.R.drawable.bucket, kj.c.R(qVar, R.string.swipe_action_archive), readerColors.m2419getNeutral8000d7_KjU(), true, false, 16, null);
                        final DownloadActionHelper createDownloadActionHelper = LibraryScreenKt.createDownloadActionHelper(readMeta.getOfflineReadData(), readMeta.isPaid(), qVar, 0);
                        final ho.l lVar2 = lVar;
                        final CollectionState collectionState2 = collectionState;
                        ActionSpec actionSpec = SwipeToActionBoxKt.actionSpec(c3.k.d(832052503, true, new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.collections.CollectionScreenKt$ExploreCollectionScreenUI$6$2$2$1$4$1$actionSpec$1
                            public final void invoke(ActionSpecBuilder actionSpecBuilder, u2.m mVar2, int i19) {
                                boolean z11;
                                boolean h10;
                                int i20;
                                actionSpecBuilder.getClass();
                                if ((i19 & 6) == 0) {
                                    if ((i19 & 8) == 0) {
                                        h10 = ((u2.q) mVar2).f(actionSpecBuilder);
                                    } else {
                                        h10 = ((u2.q) mVar2).h(actionSpecBuilder);
                                    }
                                    if (h10) {
                                        i20 = 4;
                                    } else {
                                        i20 = 2;
                                    }
                                    i19 |= i20;
                                }
                                if ((i19 & 19) != 18) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                u2.q qVar3 = (u2.q) mVar2;
                                if (qVar3.O(i19 & 1, z11)) {
                                    boolean h11 = qVar3.h(ActionConfig.this) | qVar3.f(lVar2) | qVar3.h(readMeta) | qVar3.h(actionConfig3) | qVar3.h(actionConfig4) | qVar3.h(actionConfig) | qVar3.h(createDownloadActionHelper);
                                    final ActionConfig actionConfig5 = ActionConfig.this;
                                    final ActionConfig actionConfig6 = actionConfig3;
                                    final ActionConfig actionConfig7 = actionConfig4;
                                    final ActionConfig actionConfig8 = actionConfig;
                                    final DownloadActionHelper downloadActionHelper = createDownloadActionHelper;
                                    final ho.l lVar3 = lVar2;
                                    final ReadMeta readMeta2 = readMeta;
                                    Object L2 = qVar3.L();
                                    u2.e eVar = u2.l.f33918a;
                                    if (h11 || L2 == eVar) {
                                        L2 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.collections.CollectionScreenKt$ExploreCollectionScreenUI$6$2$2$1$4$1$actionSpec$1$1$1
                                            public final void invoke(ActionSpecBuilder.HandlerScope handlerScope) {
                                                handlerScope.getClass();
                                                ActionConfig actionConfig9 = ActionConfig.this;
                                                final ho.l lVar4 = lVar3;
                                                final ReadMeta readMeta3 = readMeta2;
                                                handlerScope.handledBy(actionConfig9, new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.collections.CollectionScreenKt$ExploreCollectionScreenUI$6$2$2$1$4$1$actionSpec$1$1$1.1
                                                    /* renamed from: invoke, reason: collision with other method in class */
                                                    public final void m1327invoke() {
                                                        ho.l lVar5 = ho.l.this;
                                                        final ReadMeta readMeta4 = readMeta3;
                                                        lVar5.invoke(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.collections.CollectionScreenKt.ExploreCollectionScreenUI.6.2.2.1.4.1.actionSpec.1.1.1.1.1
                                                            public final void invoke(CollectionViewModel collectionViewModel) {
                                                                collectionViewModel.getClass();
                                                                collectionViewModel.markAsUnread(ReadMeta.this);
                                                            }

                                                            @Override // ho.l
                                                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                                invoke((CollectionViewModel) obj2);
                                                                return sn.z.f31622a;
                                                            }
                                                        });
                                                    }

                                                    @Override // ho.a
                                                    public /* bridge */ /* synthetic */ Object invoke() {
                                                        m1327invoke();
                                                        return sn.z.f31622a;
                                                    }
                                                });
                                                ActionConfig actionConfig10 = actionConfig6;
                                                final ho.l lVar5 = lVar3;
                                                final ReadMeta readMeta4 = readMeta2;
                                                handlerScope.handledBy(actionConfig10, new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.collections.CollectionScreenKt$ExploreCollectionScreenUI$6$2$2$1$4$1$actionSpec$1$1$1.2
                                                    /* renamed from: invoke, reason: collision with other method in class */
                                                    public final void m1328invoke() {
                                                        ho.l lVar6 = ho.l.this;
                                                        final ReadMeta readMeta5 = readMeta4;
                                                        lVar6.invoke(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.collections.CollectionScreenKt.ExploreCollectionScreenUI.6.2.2.1.4.1.actionSpec.1.1.1.2.1
                                                            public final void invoke(CollectionViewModel collectionViewModel) {
                                                                collectionViewModel.getClass();
                                                                collectionViewModel.removeFromCollection(ReadMeta.this.getReadId());
                                                            }

                                                            @Override // ho.l
                                                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                                invoke((CollectionViewModel) obj2);
                                                                return sn.z.f31622a;
                                                            }
                                                        });
                                                    }

                                                    @Override // ho.a
                                                    public /* bridge */ /* synthetic */ Object invoke() {
                                                        m1328invoke();
                                                        return sn.z.f31622a;
                                                    }
                                                });
                                                ActionConfig actionConfig11 = actionConfig7;
                                                final ho.l lVar6 = lVar3;
                                                final ReadMeta readMeta5 = readMeta2;
                                                handlerScope.handledBy(actionConfig11, new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.collections.CollectionScreenKt$ExploreCollectionScreenUI$6$2$2$1$4$1$actionSpec$1$1$1.3
                                                    /* renamed from: invoke, reason: collision with other method in class */
                                                    public final void m1329invoke() {
                                                        ho.l lVar7 = ho.l.this;
                                                        final ReadMeta readMeta6 = readMeta5;
                                                        lVar7.invoke(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.collections.CollectionScreenKt.ExploreCollectionScreenUI.6.2.2.1.4.1.actionSpec.1.1.1.3.1
                                                            public final void invoke(CollectionViewModel collectionViewModel) {
                                                                collectionViewModel.getClass();
                                                                collectionViewModel.archive(ReadMeta.this);
                                                            }

                                                            @Override // ho.l
                                                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                                invoke((CollectionViewModel) obj2);
                                                                return sn.z.f31622a;
                                                            }
                                                        });
                                                    }

                                                    @Override // ho.a
                                                    public /* bridge */ /* synthetic */ Object invoke() {
                                                        m1329invoke();
                                                        return sn.z.f31622a;
                                                    }
                                                });
                                                ActionConfig actionConfig12 = actionConfig8;
                                                final ho.l lVar7 = lVar3;
                                                final ReadMeta readMeta6 = readMeta2;
                                                handlerScope.handledBy(actionConfig12, new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.collections.CollectionScreenKt$ExploreCollectionScreenUI$6$2$2$1$4$1$actionSpec$1$1$1.4
                                                    /* renamed from: invoke, reason: collision with other method in class */
                                                    public final void m1330invoke() {
                                                        ho.l lVar8 = ho.l.this;
                                                        final ReadMeta readMeta7 = readMeta6;
                                                        lVar8.invoke(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.collections.CollectionScreenKt.ExploreCollectionScreenUI.6.2.2.1.4.1.actionSpec.1.1.1.4.1
                                                            public final void invoke(CollectionViewModel collectionViewModel) {
                                                                collectionViewModel.getClass();
                                                                collectionViewModel.onClickAddOrRemoveFromQueue(ReadMeta.this);
                                                            }

                                                            @Override // ho.l
                                                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                                invoke((CollectionViewModel) obj2);
                                                                return sn.z.f31622a;
                                                            }
                                                        });
                                                    }

                                                    @Override // ho.a
                                                    public /* bridge */ /* synthetic */ Object invoke() {
                                                        m1330invoke();
                                                        return sn.z.f31622a;
                                                    }
                                                });
                                                DownloadActionHelper downloadActionHelper2 = downloadActionHelper;
                                                final ho.l lVar8 = lVar3;
                                                final ReadMeta readMeta7 = readMeta2;
                                                downloadActionHelper2.addHandlers(handlerScope, new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.collections.CollectionScreenKt$ExploreCollectionScreenUI$6$2$2$1$4$1$actionSpec$1$1$1.5

                                                    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                                                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                                                    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.collections.CollectionScreenKt$ExploreCollectionScreenUI$6$2$2$1$4$1$actionSpec$1$1$1$5$WhenMappings */
                                                    /* loaded from: classes4.dex */
                                                    public static final /* synthetic */ class WhenMappings {
                                                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                                        static {
                                                            int[] iArr = new int[DownloadAction.values().length];
                                                            try {
                                                                iArr[DownloadAction.START_DOWNLOAD.ordinal()] = 1;
                                                            } catch (NoSuchFieldError unused) {
                                                            }
                                                            try {
                                                                iArr[DownloadAction.REMOVE_DOWNLOAD.ordinal()] = 2;
                                                            } catch (NoSuchFieldError unused2) {
                                                            }
                                                            try {
                                                                iArr[DownloadAction.CANCEL_DOWNLOAD.ordinal()] = 3;
                                                            } catch (NoSuchFieldError unused3) {
                                                            }
                                                            $EnumSwitchMapping$0 = iArr;
                                                        }
                                                    }

                                                    public final void invoke(DownloadAction downloadAction) {
                                                        downloadAction.getClass();
                                                        int i21 = WhenMappings.$EnumSwitchMapping$0[downloadAction.ordinal()];
                                                        if (i21 != 1) {
                                                            if (i21 != 2) {
                                                                if (i21 == 3) {
                                                                    ho.l lVar9 = ho.l.this;
                                                                    final ReadMeta readMeta8 = readMeta7;
                                                                    lVar9.invoke(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.collections.CollectionScreenKt.ExploreCollectionScreenUI.6.2.2.1.4.1.actionSpec.1.1.1.5.3
                                                                        public final void invoke(CollectionViewModel collectionViewModel) {
                                                                            collectionViewModel.getClass();
                                                                            collectionViewModel.removeDownload(ReadMeta.this, true);
                                                                        }

                                                                        @Override // ho.l
                                                                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                                            invoke((CollectionViewModel) obj2);
                                                                            return sn.z.f31622a;
                                                                        }
                                                                    });
                                                                    return;
                                                                }
                                                                c6.p();
                                                                return;
                                                            }
                                                            ho.l lVar10 = ho.l.this;
                                                            final ReadMeta readMeta9 = readMeta7;
                                                            lVar10.invoke(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.collections.CollectionScreenKt.ExploreCollectionScreenUI.6.2.2.1.4.1.actionSpec.1.1.1.5.2
                                                                public final void invoke(CollectionViewModel collectionViewModel) {
                                                                    collectionViewModel.getClass();
                                                                    collectionViewModel.removeDownload(ReadMeta.this, false);
                                                                }

                                                                @Override // ho.l
                                                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                                    invoke((CollectionViewModel) obj2);
                                                                    return sn.z.f31622a;
                                                                }
                                                            });
                                                            return;
                                                        }
                                                        ho.l lVar11 = ho.l.this;
                                                        final ReadMeta readMeta10 = readMeta7;
                                                        lVar11.invoke(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.collections.CollectionScreenKt.ExploreCollectionScreenUI.6.2.2.1.4.1.actionSpec.1.1.1.5.1
                                                            public final void invoke(CollectionViewModel collectionViewModel) {
                                                                collectionViewModel.getClass();
                                                                collectionViewModel.downloadRead(ReadMeta.this);
                                                            }

                                                            @Override // ho.l
                                                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                                invoke((CollectionViewModel) obj2);
                                                                return sn.z.f31622a;
                                                            }
                                                        });
                                                    }

                                                    @Override // ho.l
                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                        invoke((DownloadAction) obj2);
                                                        return sn.z.f31622a;
                                                    }
                                                });
                                            }

                                            @Override // ho.l
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                invoke((ActionSpecBuilder.HandlerScope) obj2);
                                                return sn.z.f31622a;
                                            }
                                        };
                                        qVar3.h0(L2);
                                    }
                                    actionSpecBuilder.handlers((ho.l) L2);
                                    boolean h12 = qVar3.h(createDownloadActionHelper) | qVar3.h(actionConfig) | qVar3.h(readMeta) | qVar3.h(ActionConfig.this) | qVar3.h(collectionState2) | qVar3.h(actionConfig3) | qVar3.h(actionConfig4);
                                    final DownloadActionHelper downloadActionHelper2 = createDownloadActionHelper;
                                    final ActionConfig actionConfig9 = actionConfig;
                                    final ReadMeta readMeta3 = readMeta;
                                    final ActionConfig actionConfig10 = ActionConfig.this;
                                    final CollectionState collectionState3 = collectionState2;
                                    final ActionConfig actionConfig11 = actionConfig3;
                                    final ActionConfig actionConfig12 = actionConfig4;
                                    Object L3 = qVar3.L();
                                    if (h12 || L3 == eVar) {
                                        L3 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.collections.CollectionScreenKt$ExploreCollectionScreenUI$6$2$2$1$4$1$actionSpec$1$2$1
                                            public final void invoke(ActionSpecBuilder.PlacementScope placementScope) {
                                                placementScope.getClass();
                                                placementScope.setStartSide(tn.o.O0(ig.f.H(actionConfig9), DownloadActionHelper.this.getDownloadActions()));
                                                ReadMeta readMeta4 = readMeta3;
                                                ActionConfig actionConfig13 = actionConfig10;
                                                CollectionState collectionState4 = collectionState3;
                                                ActionConfig actionConfig14 = actionConfig11;
                                                ActionConfig actionConfig15 = actionConfig12;
                                                un.b o6 = ig.f.o();
                                                if (!readMeta4.getMarkedAsUnread()) {
                                                    o6.add(actionConfig13);
                                                }
                                                CollectionMeta meta2 = collectionState4.getMeta();
                                                if (meta2 != null && meta2.isOwner()) {
                                                    o6.add(actionConfig14);
                                                } else {
                                                    o6.add(actionConfig15);
                                                }
                                                placementScope.setEndSide(ig.f.i(o6));
                                            }

                                            @Override // ho.l
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                invoke((ActionSpecBuilder.PlacementScope) obj2);
                                                return sn.z.f31622a;
                                            }
                                        };
                                        qVar3.h0(L3);
                                    }
                                    actionSpecBuilder.placement((ho.l) L3);
                                    return;
                                }
                                qVar3.R();
                            }

                            @Override // ho.q
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4) {
                                invoke((ActionSpecBuilder) obj2, (u2.m) obj3, ((Number) obj4).intValue());
                                return sn.z.f31622a;
                            }
                        }, qVar), qVar, 6);
                        String title = readMeta.getTitle();
                        boolean f11 = qVar.f(lVar) | qVar.h(readMeta);
                        Object L2 = qVar.L();
                        if (f11 || L2 == obj) {
                            final ho.l lVar3 = lVar;
                            L2 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.collections.CollectionScreenKt$ExploreCollectionScreenUI$6$2$2$1$4$1$1$1
                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m1326invoke() {
                                    ho.l lVar4 = ho.l.this;
                                    final ReadMeta readMeta2 = readMeta;
                                    lVar4.invoke(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.collections.CollectionScreenKt$ExploreCollectionScreenUI$6$2$2$1$4$1$1$1.1
                                        public final void invoke(CollectionViewModel collectionViewModel) {
                                            collectionViewModel.getClass();
                                            if (ReadMetaKt.isConverted(ReadMeta.this)) {
                                                collectionViewModel.onReadClicked(ReadMeta.this.getReadId());
                                            }
                                        }

                                        @Override // ho.l
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                            invoke((CollectionViewModel) obj2);
                                            return sn.z.f31622a;
                                        }
                                    });
                                }

                                @Override // ho.a
                                public /* bridge */ /* synthetic */ Object invoke() {
                                    m1326invoke();
                                    return sn.z.f31622a;
                                }
                            };
                            qVar.h0(L2);
                        }
                        final CollectionState collectionState3 = collectionState;
                        SwipeToActionBoxKt.SwipeToActionBox(title, null, (ho.a) L2, actionSpec, null, null, c3.k.d(1214498872, true, new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.collections.CollectionScreenKt$ExploreCollectionScreenUI$6$2$2$1$4$1$2
                            public final void invoke(u2.m mVar2, int i19) {
                                boolean z11;
                                boolean z12;
                                Date date;
                                if ((i19 & 3) != 2) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                u2.q qVar3 = (u2.q) mVar2;
                                if (qVar3.O(i19 & 1, z11)) {
                                    i3.t h10 = l1.n.h(p2.e(i3.q.f13017a, 1.0f), ib.i.d(ElevenLabsTheme.INSTANCE, qVar3, ElevenLabsTheme.$stable), p3.h0.f26395b);
                                    i3.k kVar = i3.d.f13005z0;
                                    ReadMeta readMeta2 = ReadMeta.this;
                                    CollectionState collectionState4 = collectionState3;
                                    k2 a12 = i2.a(r1.j.f29228a, kVar, qVar3, 48);
                                    int hashCode2 = Long.hashCode(qVar3.T);
                                    c3.o l7 = qVar3.l();
                                    i3.t c10 = i3.a.c(h10, qVar3);
                                    h4.h.f11920i.getClass();
                                    h4.f fVar = h4.g.f11903b;
                                    qVar3.b0();
                                    if (qVar3.S) {
                                        qVar3.k(fVar);
                                    } else {
                                        qVar3.k0();
                                    }
                                    u2.r.J(h4.g.f11907f, a12, qVar3);
                                    u2.r.J(h4.g.f11906e, l7, qVar3);
                                    u2.r.y(qVar3, Integer.valueOf(hashCode2), h4.g.f11908g);
                                    u2.r.F(h4.g.f11909h, qVar3);
                                    u2.r.J(h4.g.f11905d, c10, qVar3);
                                    if (!readMeta2.getMarkedAsUnread()) {
                                        CollectionMeta meta2 = collectionState4.getMeta();
                                        if (meta2 != null) {
                                            date = meta2.getLastOpenedAt();
                                        } else {
                                            date = null;
                                        }
                                        if (date == null || !readMeta2.getCreatedAt().after(collectionState4.getMeta().getLastOpenedAt())) {
                                            z12 = false;
                                            ReadMetaRowKt.PublicReadMetaRow(readMeta2, null, null, z12, false, qVar3, 24576, 6);
                                            qVar3.p(true);
                                            return;
                                        }
                                    }
                                    z12 = true;
                                    ReadMetaRowKt.PublicReadMetaRow(readMeta2, null, null, z12, false, qVar3, 24576, 6);
                                    qVar3.p(true);
                                    return;
                                }
                                qVar3.R();
                            }

                            @Override // ho.p
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                                invoke((u2.m) obj2, ((Number) obj3).intValue());
                                return sn.z.f31622a;
                            }
                        }, qVar), qVar, 1572864, 50);
                        DividerKt.m1828DividerLightiJQMabo(p2.e(qVar2, 1.0f), 0L, qVar, 6, 2);
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
            if (!wq.n.m0(collectionState.getLoadingMoreError())) {
                final int i12 = 1;
                t1.t.c(tVar, null, null, new c3.j(new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.collections.t
                    @Override // ho.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        sn.z ExploreCollectionScreenUI$lambda$8$1$3$0$1;
                        sn.z ExploreCollectionScreenUI$lambda$8$1$3$0$4;
                        switch (i12) {
                            case 0:
                                int intValue = ((Integer) obj3).intValue();
                                ExploreCollectionScreenUI$lambda$8$1$3$0$1 = CollectionScreenKt.ExploreCollectionScreenUI$lambda$8$1$3$0$1(collectionState, (ho.a) lVar, (t1.b) obj, (u2.m) obj2, intValue);
                                return ExploreCollectionScreenUI$lambda$8$1$3$0$1;
                            default:
                                int intValue2 = ((Integer) obj3).intValue();
                                ExploreCollectionScreenUI$lambda$8$1$3$0$4 = CollectionScreenKt.ExploreCollectionScreenUI$lambda$8$1$3$0$4(collectionState, (ho.l) lVar, (t1.b) obj, (u2.m) obj2, intValue2);
                                return ExploreCollectionScreenUI$lambda$8$1$3$0$4;
                        }
                    }
                }, true, 340372422), 3);
            } else if (collectionState.getHasMore() && !collectionState.isLoading()) {
                final int i13 = 1;
                t1.t.c(tVar, null, null, new c3.j(new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.collections.p
                    @Override // ho.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        sn.z ExploreCollectionScreenUI$lambda$8$1$3$0$0;
                        sn.z ExploreCollectionScreenUI$lambda$8$1$3$0$5;
                        switch (i13) {
                            case 0:
                                ExploreCollectionScreenUI$lambda$8$1$3$0$0 = CollectionScreenKt.ExploreCollectionScreenUI$lambda$8$1$3$0$0((CollectionState) lVar, (t1.b) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                                return ExploreCollectionScreenUI$lambda$8$1$3$0$0;
                            default:
                                ExploreCollectionScreenUI$lambda$8$1$3$0$5 = CollectionScreenKt.ExploreCollectionScreenUI$lambda$8$1$3$0$5((ho.l) lVar, (t1.b) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                                return ExploreCollectionScreenUI$lambda$8$1$3$0$5;
                        }
                    }
                }, true, 2136721327), 3);
            }
        }
        t1.t.c(tVar, null, null, ComposableSingletons$CollectionScreenKt.INSTANCE.getLambda$524435536$app_productionRelease(), 3);
        return sn.z.f31622a;
    }

    public static final sn.z ExploreCollectionScreenUI$lambda$8$1$3$0$0(CollectionState collectionState, t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            CollectionHeader(collectionState, qVar, 0);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ExploreCollectionScreenUI$lambda$8$1$3$0$1(CollectionState collectionState, ho.a aVar, t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            if (collectionState.getMeta().isOwner()) {
                qVar.X(1095726129);
                ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                int i11 = ElevenLabsTheme.$stable;
                float m2356getX4D9Ej5fM = elevenLabsTheme.getSpacings(qVar, i11).m2356getX4D9Ej5fM();
                i3.q qVar2 = i3.q.f13017a;
                i3.t E = r1.d.E(qVar2, m2356getX4D9Ej5fM);
                r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.C0, qVar, 48);
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
                u2.r.J(h4.g.f11907f, a10, qVar);
                u2.r.J(h4.g.f11906e, l4, qVar);
                u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
                u2.r.F(h4.g.f11909h, qVar);
                u2.r.J(h4.g.f11905d, c5, qVar);
                r1.d.g(p2.f(qVar2, elevenLabsTheme.getSpacings(qVar, i11).m2360getX8D9Ej5fM()), qVar);
                l1.n.c(kd.a.M(R.drawable.collections_image, qVar, 0), null, p2.f(qVar2, SensibleDefaults.X_OFFSET), null, null, t2.u.P, null, qVar, u3.c.$stable | 432, 120);
                ib.i.p(elevenLabsTheme, qVar, i11, qVar2, qVar);
                j7.d(kj.c.R(qVar, R.string.collection_empty_state), null, defpackage.f.A(elevenLabsTheme, qVar, i11), 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i11).getBodySmall500(), qVar, 0, 0, 130042);
                r1.d.g(p2.f(qVar2, elevenLabsTheme.getSpacings(qVar, i11).m2360getX8D9Ej5fM()), qVar);
                String R = kj.c.R(qVar, R.string.collection_empty_state_action);
                ButtonSize buttonSize = ButtonSize.Medium;
                boolean f10 = qVar.f(aVar);
                Object L = qVar.L();
                if (f10 || L == u2.l.f33918a) {
                    L = new s(0, aVar);
                    qVar.h0(L);
                }
                ButtonKt.Button(R, (ho.a) L, null, buttonSize, null, null, null, false, false, false, qVar, 3072, 1012);
                qVar.p(true);
                qVar.p(false);
            } else {
                qVar.X(1097314972);
                EmptyScreenKt.EmptyScreen(null, kj.c.R(qVar, R.string.collection_no_reads), qVar, 0, 1);
                qVar.p(false);
            }
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ExploreCollectionScreenUI$lambda$8$1$3$0$1$0$0$0(ho.a aVar) {
        aVar.invoke();
        return sn.z.f31622a;
    }

    public static final Object ExploreCollectionScreenUI$lambda$8$1$3$0$2(ReadMeta readMeta) {
        readMeta.getClass();
        return readMeta.getReadId();
    }

    public static final sn.z ExploreCollectionScreenUI$lambda$8$1$3$0$4(CollectionState collectionState, ho.l lVar, t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            i3.t e10 = p2.e(qVar2, 1.0f);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i11 = ElevenLabsTheme.$stable;
            i3.t x10 = ib.i.x(elevenLabsTheme, qVar, i11, e10);
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.C0, qVar, 48);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(x10, qVar);
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
            ErrorContainerKt.ErrorContainer(collectionState.getLoadingMoreError(), qVar, 0);
            ib.i.A(elevenLabsTheme, qVar, i11, qVar2, qVar);
            String R = kj.c.R(qVar, R.string.common_retry);
            boolean f10 = qVar.f(lVar);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new j(lVar, 3);
                qVar.h0(L);
            }
            ButtonKt.Button(R, (ho.a) L, p2.e(qVar2, 1.0f), null, null, null, null, false, false, false, qVar, 384, 1016);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ExploreCollectionScreenUI$lambda$8$1$3$0$4$0$0$0(ho.l lVar) {
        lVar.invoke(new o(27));
        return sn.z.f31622a;
    }

    public static final sn.z ExploreCollectionScreenUI$lambda$8$1$3$0$4$0$0$0$0(CollectionViewModel collectionViewModel) {
        collectionViewModel.getClass();
        collectionViewModel.loadMore();
        return sn.z.f31622a;
    }

    public static final sn.z ExploreCollectionScreenUI$lambda$8$1$3$0$5(ho.l lVar, t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        boolean O = qVar.O(i10 & 1, z6);
        sn.z zVar = sn.z.f31622a;
        if (O) {
            boolean f10 = qVar.f(lVar);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new CollectionScreenKt$ExploreCollectionScreenUI$6$2$2$1$6$1$1(lVar, null);
                qVar.h0(L);
            }
            u2.r.f((ho.p) L, zVar, qVar);
            LoaderKt.LoaderRow(qVar, 0);
            return zVar;
        }
        qVar.R();
        return zVar;
    }

    public static final sn.z ExploreCollectionScreenUI$lambda$8$1$4(ho.l lVar, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            String R = kj.c.R(qVar, R.string.common_retry);
            boolean f10 = qVar.f(lVar);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new j(lVar, 1);
                qVar.h0(L);
            }
            ButtonKt.Button(R, (ho.a) L, p2.e(i3.q.f13017a, 1.0f), null, null, null, null, false, false, false, qVar, 384, 1016);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ExploreCollectionScreenUI$lambda$8$1$4$0$0(ho.l lVar) {
        lVar.invoke(new y(5));
        return sn.z.f31622a;
    }

    public static final sn.z ExploreCollectionScreenUI$lambda$8$1$4$0$0$0(CollectionViewModel collectionViewModel) {
        collectionViewModel.getClass();
        collectionViewModel.load();
        return sn.z.f31622a;
    }

    public static final sn.z ExploreCollectionScreenUI$lambda$8$2$0(x0 x0Var, h5.l lVar) {
        ExploreCollectionScreenUI$lambda$6(x0Var, (int) (lVar.f12092a & 4294967295L));
        return sn.z.f31622a;
    }

    public static final sn.z ExploreCollectionScreenUI$lambda$8$4(ho.l lVar, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            WeakHashMap weakHashMap = c3.f29142x;
            i3.t e10 = ib.i.e(EchoTheme.INSTANCE, qVar, EchoTheme.$stable, r1.d.P(i3.q.f13017a, u0.e(qVar).f29154l));
            String R = kj.c.R(qVar, R.string.collection_add_success_title);
            String R2 = kj.c.R(qVar, R.string.collection_add_success_text);
            boolean f10 = qVar.f(lVar);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new j(lVar, 4);
                qVar.h0(L);
            }
            EchoToastKt.EchoToast(R2, e10, R, null, (ho.a) L, null, qVar, 0, 40);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ExploreCollectionScreenUI$lambda$8$4$0$0(ho.l lVar) {
        lVar.invoke(new o(20));
        return sn.z.f31622a;
    }

    public static final sn.z ExploreCollectionScreenUI$lambda$8$4$0$0$0(CollectionViewModel collectionViewModel) {
        collectionViewModel.getClass();
        collectionViewModel.onSuccessToastClick();
        return sn.z.f31622a;
    }

    public static final sn.z ExploreCollectionScreenUI$lambda$9(CollectionState collectionState, ho.p pVar, ho.l lVar, ho.a aVar, ho.l lVar2, ho.a aVar2, ho.a aVar3, int i10, int i11, u2.m mVar, int i12) {
        ExploreCollectionScreenUI(collectionState, pVar, lVar, aVar, lVar2, aVar2, aVar3, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void Preview_CollectionScreenUI_error(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-898605080);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            CollectionState collectionState = new CollectionState(null, false, false, null, false, null, "Some error", null, null, null, null, null, false, false, null, 32701, null);
            ho.p lambda$650882723$app_productionRelease = ComposableSingletons$CollectionScreenKt.INSTANCE.getLambda$650882723$app_productionRelease();
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new o(22);
                qVar.h0(L);
            }
            ExploreCollectionScreenUI(collectionState, lambda$650882723$app_productionRelease, (ho.l) L, null, null, null, null, qVar, 432, 120);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.author.c(i10, 26);
        }
    }

    public static final sn.z Preview_CollectionScreenUI_error$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_CollectionScreenUI_error$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_CollectionScreenUI_error(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_CollectionScreenUI_idle(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1760776212);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            CollectionState collectionState = new CollectionState(null, false, false, null, false, null, null, null, null, null, null, null, false, false, null, 32767, null);
            ho.p lambda$2029985233$app_productionRelease = ComposableSingletons$CollectionScreenKt.INSTANCE.getLambda$2029985233$app_productionRelease();
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new o(21);
                qVar.h0(L);
            }
            ExploreCollectionScreenUI(collectionState, lambda$2029985233$app_productionRelease, (ho.l) L, null, null, null, null, qVar, 432, 120);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.author.c(i10, 25);
        }
    }

    public static final sn.z Preview_CollectionScreenUI_idle$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_CollectionScreenUI_idle$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_CollectionScreenUI_idle(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_CollectionScreenUI_loading(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-570137060);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            CollectionState collectionState = new CollectionState(null, true, false, null, false, null, null, null, null, null, null, null, false, false, null, 32765, null);
            ho.p m1337getLambda$1866010089$app_productionRelease = ComposableSingletons$CollectionScreenKt.INSTANCE.m1337getLambda$1866010089$app_productionRelease();
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new y(0);
                qVar.h0(L);
            }
            ExploreCollectionScreenUI(collectionState, m1337getLambda$1866010089$app_productionRelease, (ho.l) L, null, null, null, null, qVar, 432, 120);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new x(i10, 1);
        }
    }

    public static final sn.z Preview_CollectionScreenUI_loading$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_CollectionScreenUI_loading$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_CollectionScreenUI_loading(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_CollectionScreenUI_newsletter(u2.m mVar, int i10) {
        boolean z6;
        ReadMeta copy;
        ReadMeta copy2;
        ReadMeta copy3;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-959749167);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            Date date = new Date(1714026044L);
            CollectionMeta copy$default = CollectionMeta.copy$default(CollectionFactoryKt.stubCollectionMeta(), null, null, null, null, null, false, date, null, "newsletter", null, false, null, 3775, null);
            ReadMeta stubReadMeta$default = ReadsFactoryKt.stubReadMeta$default(null, 1, null);
            long time = date.getTime();
            long j4 = SignalClient.CLOSE_REASON_NORMAL_CLOSURE;
            copy = stubReadMeta$default.copy((r84 & 1) != 0 ? stubReadMeta$default.articleImageUrl : null, (r84 & 2) != 0 ? stubReadMeta$default.author : null, (r84 & 4) != 0 ? stubReadMeta$default.chapters : null, (r84 & 8) != 0 ? stubReadMeta$default.charCount : 0L, (r84 & 16) != 0 ? stubReadMeta$default.createdAt : new Date(time + j4), (r84 & 32) != 0 ? stubReadMeta$default.updatedAt : null, (r84 & 64) != 0 ? stubReadMeta$default.addedAt : null, (r84 & 128) != 0 ? stubReadMeta$default.description : null, (r84 & RpcError.MAX_MESSAGE_BYTES) != 0 ? stubReadMeta$default.lastListenedCharOffset : 0L, (r84 & 512) != 0 ? stubReadMeta$default.readId : "a", (r84 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? stubReadMeta$default.source : null, (r84 & 2048) != 0 ? stubReadMeta$default.title : "Unread", (r84 & 4096) != 0 ? stubReadMeta$default.subtitle : null, (r84 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? stubReadMeta$default.url : null, (r84 & 16384) != 0 ? stubReadMeta$default.wordCount : 0L, (r84 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? stubReadMeta$default.originalFileType : null, (r84 & 65536) != 0 ? stubReadMeta$default.hasOriginalAudio : false, (r84 & 131072) != 0 ? stubReadMeta$default.matureContent : false, (r84 & 262144) != 0 ? stubReadMeta$default.origin : null, (r84 & 524288) != 0 ? stubReadMeta$default.contentType : null, (r84 & 1048576) != 0 ? stubReadMeta$default.genre : null, (r84 & 2097152) != 0 ? stubReadMeta$default.isBookType : false, (r84 & 4194304) != 0 ? stubReadMeta$default.fromUserImport : false, (r84 & 8388608) != 0 ? stubReadMeta$default.rating : null, (r84 & 16777216) != 0 ? stubReadMeta$default.userRating : null, (r84 & 33554432) != 0 ? stubReadMeta$default.lastUsedVoiceId : null, (r84 & 67108864) != 0 ? stubReadMeta$default.creationStatus : null, (r84 & 134217728) != 0 ? stubReadMeta$default.creationProgress : null, (r84 & 268435456) != 0 ? stubReadMeta$default.isArchived : false, (r84 & 536870912) != 0 ? stubReadMeta$default.markedAsUnread : false, (r84 & 1073741824) != 0 ? stubReadMeta$default.completedAt : null, (r84 & Integer.MIN_VALUE) != 0 ? stubReadMeta$default.publicationDate : null, (r85 & 1) != 0 ? stubReadMeta$default.language : null, (r85 & 2) != 0 ? stubReadMeta$default.publisherProfileId : null, (r85 & 4) != 0 ? stubReadMeta$default.canDelete : false, (r85 & 8) != 0 ? stubReadMeta$default.androidProductId : null, (r85 & 16) != 0 ? stubReadMeta$default.isPaid : false, (r85 & 32) != 0 ? stubReadMeta$default.offlineReadData : null, (r85 & 64) != 0 ? stubReadMeta$default.previewAudio : null, (r85 & 128) != 0 ? stubReadMeta$default.originalVoice : null, (r85 & RpcError.MAX_MESSAGE_BYTES) != 0 ? stubReadMeta$default.voiceSelectionConfig : null, (r85 & 512) != 0 ? stubReadMeta$default.sampleConfig : null, (r85 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? stubReadMeta$default.displayMode : null, (r85 & 2048) != 0 ? stubReadMeta$default.inUserLibrary : false, (r85 & 4096) != 0 ? stubReadMeta$default.canUseAssistant : false, (r85 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? stubReadMeta$default.audioType : null, (r85 & 16384) != 0 ? stubReadMeta$default.useDrm : false, (r85 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? stubReadMeta$default.lastListenedAudioFileNumber : null, (r85 & 65536) != 0 ? stubReadMeta$default.lastListenedAudioSeconds : null, (r85 & 131072) != 0 ? stubReadMeta$default.audioDurationSeconds : null, (r85 & 262144) != 0 ? stubReadMeta$default.audioTypes : null, (r85 & 524288) != 0 ? stubReadMeta$default.isVoiceChangerOn : false, (r85 & 1048576) != 0 ? stubReadMeta$default.lastUsedAudioType : null, (r85 & 2097152) != 0 ? stubReadMeta$default.coverImageUrls : null, (r85 & 4194304) != 0 ? stubReadMeta$default.coverAspectRatio : null, (r85 & 8388608) != 0 ? stubReadMeta$default.blurPlaceholder : null);
            copy2 = r17.copy((r84 & 1) != 0 ? r17.articleImageUrl : null, (r84 & 2) != 0 ? r17.author : null, (r84 & 4) != 0 ? r17.chapters : null, (r84 & 8) != 0 ? r17.charCount : 0L, (r84 & 16) != 0 ? r17.createdAt : new Date(date.getTime() + j4), (r84 & 32) != 0 ? r17.updatedAt : null, (r84 & 64) != 0 ? r17.addedAt : null, (r84 & 128) != 0 ? r17.description : null, (r84 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r17.lastListenedCharOffset : 0L, (r84 & 512) != 0 ? r17.readId : "b", (r84 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r17.source : null, (r84 & 2048) != 0 ? r17.title : "Unread with very long title that will collide with the unread indicator", (r84 & 4096) != 0 ? r17.subtitle : null, (r84 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r17.url : null, (r84 & 16384) != 0 ? r17.wordCount : 0L, (r84 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r17.originalFileType : null, (r84 & 65536) != 0 ? r17.hasOriginalAudio : false, (r84 & 131072) != 0 ? r17.matureContent : false, (r84 & 262144) != 0 ? r17.origin : null, (r84 & 524288) != 0 ? r17.contentType : null, (r84 & 1048576) != 0 ? r17.genre : null, (r84 & 2097152) != 0 ? r17.isBookType : false, (r84 & 4194304) != 0 ? r17.fromUserImport : false, (r84 & 8388608) != 0 ? r17.rating : null, (r84 & 16777216) != 0 ? r17.userRating : null, (r84 & 33554432) != 0 ? r17.lastUsedVoiceId : null, (r84 & 67108864) != 0 ? r17.creationStatus : null, (r84 & 134217728) != 0 ? r17.creationProgress : null, (r84 & 268435456) != 0 ? r17.isArchived : false, (r84 & 536870912) != 0 ? r17.markedAsUnread : false, (r84 & 1073741824) != 0 ? r17.completedAt : null, (r84 & Integer.MIN_VALUE) != 0 ? r17.publicationDate : null, (r85 & 1) != 0 ? r17.language : null, (r85 & 2) != 0 ? r17.publisherProfileId : null, (r85 & 4) != 0 ? r17.canDelete : false, (r85 & 8) != 0 ? r17.androidProductId : null, (r85 & 16) != 0 ? r17.isPaid : false, (r85 & 32) != 0 ? r17.offlineReadData : null, (r85 & 64) != 0 ? r17.previewAudio : null, (r85 & 128) != 0 ? r17.originalVoice : null, (r85 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r17.voiceSelectionConfig : null, (r85 & 512) != 0 ? r17.sampleConfig : null, (r85 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r17.displayMode : null, (r85 & 2048) != 0 ? r17.inUserLibrary : false, (r85 & 4096) != 0 ? r17.canUseAssistant : false, (r85 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r17.audioType : null, (r85 & 16384) != 0 ? r17.useDrm : false, (r85 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r17.lastListenedAudioFileNumber : null, (r85 & 65536) != 0 ? r17.lastListenedAudioSeconds : null, (r85 & 131072) != 0 ? r17.audioDurationSeconds : null, (r85 & 262144) != 0 ? r17.audioTypes : null, (r85 & 524288) != 0 ? r17.isVoiceChangerOn : false, (r85 & 1048576) != 0 ? r17.lastUsedAudioType : null, (r85 & 2097152) != 0 ? r17.coverImageUrls : null, (r85 & 4194304) != 0 ? r17.coverAspectRatio : null, (r85 & 8388608) != 0 ? ReadsFactoryKt.stubReadMeta$default(null, 1, null).blurPlaceholder : null);
            copy3 = r9.copy((r84 & 1) != 0 ? r9.articleImageUrl : null, (r84 & 2) != 0 ? r9.author : null, (r84 & 4) != 0 ? r9.chapters : null, (r84 & 8) != 0 ? r9.charCount : 0L, (r84 & 16) != 0 ? r9.createdAt : date, (r84 & 32) != 0 ? r9.updatedAt : null, (r84 & 64) != 0 ? r9.addedAt : null, (r84 & 128) != 0 ? r9.description : null, (r84 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r9.lastListenedCharOffset : 0L, (r84 & 512) != 0 ? r9.readId : "c", (r84 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r9.source : null, (r84 & 2048) != 0 ? r9.title : "Read", (r84 & 4096) != 0 ? r9.subtitle : null, (r84 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r9.url : null, (r84 & 16384) != 0 ? r9.wordCount : 0L, (r84 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r9.originalFileType : null, (r84 & 65536) != 0 ? r9.hasOriginalAudio : false, (r84 & 131072) != 0 ? r9.matureContent : false, (r84 & 262144) != 0 ? r9.origin : null, (r84 & 524288) != 0 ? r9.contentType : null, (r84 & 1048576) != 0 ? r9.genre : null, (r84 & 2097152) != 0 ? r9.isBookType : false, (r84 & 4194304) != 0 ? r9.fromUserImport : false, (r84 & 8388608) != 0 ? r9.rating : null, (r84 & 16777216) != 0 ? r9.userRating : null, (r84 & 33554432) != 0 ? r9.lastUsedVoiceId : null, (r84 & 67108864) != 0 ? r9.creationStatus : null, (r84 & 134217728) != 0 ? r9.creationProgress : null, (r84 & 268435456) != 0 ? r9.isArchived : false, (r84 & 536870912) != 0 ? r9.markedAsUnread : false, (r84 & 1073741824) != 0 ? r9.completedAt : null, (r84 & Integer.MIN_VALUE) != 0 ? r9.publicationDate : null, (r85 & 1) != 0 ? r9.language : null, (r85 & 2) != 0 ? r9.publisherProfileId : null, (r85 & 4) != 0 ? r9.canDelete : false, (r85 & 8) != 0 ? r9.androidProductId : null, (r85 & 16) != 0 ? r9.isPaid : false, (r85 & 32) != 0 ? r9.offlineReadData : null, (r85 & 64) != 0 ? r9.previewAudio : null, (r85 & 128) != 0 ? r9.originalVoice : null, (r85 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r9.voiceSelectionConfig : null, (r85 & 512) != 0 ? r9.sampleConfig : null, (r85 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r9.displayMode : null, (r85 & 2048) != 0 ? r9.inUserLibrary : false, (r85 & 4096) != 0 ? r9.canUseAssistant : false, (r85 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r9.audioType : null, (r85 & 16384) != 0 ? r9.useDrm : false, (r85 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r9.lastListenedAudioFileNumber : null, (r85 & 65536) != 0 ? r9.lastListenedAudioSeconds : null, (r85 & 131072) != 0 ? r9.audioDurationSeconds : null, (r85 & 262144) != 0 ? r9.audioTypes : null, (r85 & 524288) != 0 ? r9.isVoiceChangerOn : false, (r85 & 1048576) != 0 ? r9.lastUsedAudioType : null, (r85 & 2097152) != 0 ? r9.coverImageUrls : null, (r85 & 4194304) != 0 ? r9.coverAspectRatio : null, (r85 & 8388608) != 0 ? ReadsFactoryKt.stubReadMeta$default(null, 1, null).blurPlaceholder : null);
            CollectionState collectionState = new CollectionState(null, false, false, null, false, null, null, null, copy$default, null, ig.f.I(copy, copy2, copy3), null, false, false, null, 31485, null);
            ho.p lambda$1147867638$app_productionRelease = ComposableSingletons$CollectionScreenKt.INSTANCE.getLambda$1147867638$app_productionRelease();
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new o(29);
                qVar.h0(L);
            }
            ExploreCollectionScreenUI(collectionState, lambda$1147867638$app_productionRelease, (ho.l) L, null, null, null, null, qVar, 432, 120);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new x(i10, 0);
        }
    }

    public static final sn.z Preview_CollectionScreenUI_newsletter$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_CollectionScreenUI_newsletter$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_CollectionScreenUI_newsletter(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_CollectionScreenUI_newsletter_long_description(u2.m mVar, int i10) {
        boolean z6;
        ReadMeta copy;
        ReadMeta copy2;
        ReadMeta copy3;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-785318817);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            Date date = new Date(1714026044L);
            CollectionMeta copy$default = CollectionMeta.copy$default(CollectionFactoryKt.stubCollectionMeta(), null, null, null, "Written in Greek by the only Roman emperor who was also a philosopher, without any intention of publication, the Meditations of Marcus Aurelius offer a remarkable series of challenging spiritual reflections and exercises developed as the emperor struggled to understand himself and make sense of the universe. While the Meditations were composed to provide personal consolation and encouragement, Marcus Aurelius also created one of the greatest of all works of philosophy: a timeless collection that has been consulted and admired by statesmen, thinkers and readers throughout the centuries.", null, false, date, null, "newsletter", null, false, null, 3767, null);
            ReadMeta stubReadMeta$default = ReadsFactoryKt.stubReadMeta$default(null, 1, null);
            long time = date.getTime();
            long j4 = SignalClient.CLOSE_REASON_NORMAL_CLOSURE;
            copy = stubReadMeta$default.copy((r84 & 1) != 0 ? stubReadMeta$default.articleImageUrl : null, (r84 & 2) != 0 ? stubReadMeta$default.author : null, (r84 & 4) != 0 ? stubReadMeta$default.chapters : null, (r84 & 8) != 0 ? stubReadMeta$default.charCount : 0L, (r84 & 16) != 0 ? stubReadMeta$default.createdAt : new Date(time + j4), (r84 & 32) != 0 ? stubReadMeta$default.updatedAt : null, (r84 & 64) != 0 ? stubReadMeta$default.addedAt : null, (r84 & 128) != 0 ? stubReadMeta$default.description : null, (r84 & RpcError.MAX_MESSAGE_BYTES) != 0 ? stubReadMeta$default.lastListenedCharOffset : 0L, (r84 & 512) != 0 ? stubReadMeta$default.readId : "a", (r84 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? stubReadMeta$default.source : null, (r84 & 2048) != 0 ? stubReadMeta$default.title : "Unread", (r84 & 4096) != 0 ? stubReadMeta$default.subtitle : null, (r84 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? stubReadMeta$default.url : null, (r84 & 16384) != 0 ? stubReadMeta$default.wordCount : 0L, (r84 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? stubReadMeta$default.originalFileType : null, (r84 & 65536) != 0 ? stubReadMeta$default.hasOriginalAudio : false, (r84 & 131072) != 0 ? stubReadMeta$default.matureContent : false, (r84 & 262144) != 0 ? stubReadMeta$default.origin : null, (r84 & 524288) != 0 ? stubReadMeta$default.contentType : null, (r84 & 1048576) != 0 ? stubReadMeta$default.genre : null, (r84 & 2097152) != 0 ? stubReadMeta$default.isBookType : false, (r84 & 4194304) != 0 ? stubReadMeta$default.fromUserImport : false, (r84 & 8388608) != 0 ? stubReadMeta$default.rating : null, (r84 & 16777216) != 0 ? stubReadMeta$default.userRating : null, (r84 & 33554432) != 0 ? stubReadMeta$default.lastUsedVoiceId : null, (r84 & 67108864) != 0 ? stubReadMeta$default.creationStatus : null, (r84 & 134217728) != 0 ? stubReadMeta$default.creationProgress : null, (r84 & 268435456) != 0 ? stubReadMeta$default.isArchived : false, (r84 & 536870912) != 0 ? stubReadMeta$default.markedAsUnread : false, (r84 & 1073741824) != 0 ? stubReadMeta$default.completedAt : null, (r84 & Integer.MIN_VALUE) != 0 ? stubReadMeta$default.publicationDate : null, (r85 & 1) != 0 ? stubReadMeta$default.language : null, (r85 & 2) != 0 ? stubReadMeta$default.publisherProfileId : null, (r85 & 4) != 0 ? stubReadMeta$default.canDelete : false, (r85 & 8) != 0 ? stubReadMeta$default.androidProductId : null, (r85 & 16) != 0 ? stubReadMeta$default.isPaid : false, (r85 & 32) != 0 ? stubReadMeta$default.offlineReadData : null, (r85 & 64) != 0 ? stubReadMeta$default.previewAudio : null, (r85 & 128) != 0 ? stubReadMeta$default.originalVoice : null, (r85 & RpcError.MAX_MESSAGE_BYTES) != 0 ? stubReadMeta$default.voiceSelectionConfig : null, (r85 & 512) != 0 ? stubReadMeta$default.sampleConfig : null, (r85 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? stubReadMeta$default.displayMode : null, (r85 & 2048) != 0 ? stubReadMeta$default.inUserLibrary : false, (r85 & 4096) != 0 ? stubReadMeta$default.canUseAssistant : false, (r85 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? stubReadMeta$default.audioType : null, (r85 & 16384) != 0 ? stubReadMeta$default.useDrm : false, (r85 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? stubReadMeta$default.lastListenedAudioFileNumber : null, (r85 & 65536) != 0 ? stubReadMeta$default.lastListenedAudioSeconds : null, (r85 & 131072) != 0 ? stubReadMeta$default.audioDurationSeconds : null, (r85 & 262144) != 0 ? stubReadMeta$default.audioTypes : null, (r85 & 524288) != 0 ? stubReadMeta$default.isVoiceChangerOn : false, (r85 & 1048576) != 0 ? stubReadMeta$default.lastUsedAudioType : null, (r85 & 2097152) != 0 ? stubReadMeta$default.coverImageUrls : null, (r85 & 4194304) != 0 ? stubReadMeta$default.coverAspectRatio : null, (r85 & 8388608) != 0 ? stubReadMeta$default.blurPlaceholder : null);
            copy2 = r17.copy((r84 & 1) != 0 ? r17.articleImageUrl : null, (r84 & 2) != 0 ? r17.author : null, (r84 & 4) != 0 ? r17.chapters : null, (r84 & 8) != 0 ? r17.charCount : 0L, (r84 & 16) != 0 ? r17.createdAt : new Date(date.getTime() + j4), (r84 & 32) != 0 ? r17.updatedAt : null, (r84 & 64) != 0 ? r17.addedAt : null, (r84 & 128) != 0 ? r17.description : null, (r84 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r17.lastListenedCharOffset : 0L, (r84 & 512) != 0 ? r17.readId : "b", (r84 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r17.source : null, (r84 & 2048) != 0 ? r17.title : "Unread with very long title that will collide with the unread indicator", (r84 & 4096) != 0 ? r17.subtitle : null, (r84 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r17.url : null, (r84 & 16384) != 0 ? r17.wordCount : 0L, (r84 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r17.originalFileType : null, (r84 & 65536) != 0 ? r17.hasOriginalAudio : false, (r84 & 131072) != 0 ? r17.matureContent : false, (r84 & 262144) != 0 ? r17.origin : null, (r84 & 524288) != 0 ? r17.contentType : null, (r84 & 1048576) != 0 ? r17.genre : null, (r84 & 2097152) != 0 ? r17.isBookType : false, (r84 & 4194304) != 0 ? r17.fromUserImport : false, (r84 & 8388608) != 0 ? r17.rating : null, (r84 & 16777216) != 0 ? r17.userRating : null, (r84 & 33554432) != 0 ? r17.lastUsedVoiceId : null, (r84 & 67108864) != 0 ? r17.creationStatus : null, (r84 & 134217728) != 0 ? r17.creationProgress : null, (r84 & 268435456) != 0 ? r17.isArchived : false, (r84 & 536870912) != 0 ? r17.markedAsUnread : false, (r84 & 1073741824) != 0 ? r17.completedAt : null, (r84 & Integer.MIN_VALUE) != 0 ? r17.publicationDate : null, (r85 & 1) != 0 ? r17.language : null, (r85 & 2) != 0 ? r17.publisherProfileId : null, (r85 & 4) != 0 ? r17.canDelete : false, (r85 & 8) != 0 ? r17.androidProductId : null, (r85 & 16) != 0 ? r17.isPaid : false, (r85 & 32) != 0 ? r17.offlineReadData : null, (r85 & 64) != 0 ? r17.previewAudio : null, (r85 & 128) != 0 ? r17.originalVoice : null, (r85 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r17.voiceSelectionConfig : null, (r85 & 512) != 0 ? r17.sampleConfig : null, (r85 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r17.displayMode : null, (r85 & 2048) != 0 ? r17.inUserLibrary : false, (r85 & 4096) != 0 ? r17.canUseAssistant : false, (r85 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r17.audioType : null, (r85 & 16384) != 0 ? r17.useDrm : false, (r85 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r17.lastListenedAudioFileNumber : null, (r85 & 65536) != 0 ? r17.lastListenedAudioSeconds : null, (r85 & 131072) != 0 ? r17.audioDurationSeconds : null, (r85 & 262144) != 0 ? r17.audioTypes : null, (r85 & 524288) != 0 ? r17.isVoiceChangerOn : false, (r85 & 1048576) != 0 ? r17.lastUsedAudioType : null, (r85 & 2097152) != 0 ? r17.coverImageUrls : null, (r85 & 4194304) != 0 ? r17.coverAspectRatio : null, (r85 & 8388608) != 0 ? ReadsFactoryKt.stubReadMeta$default(null, 1, null).blurPlaceholder : null);
            copy3 = r9.copy((r84 & 1) != 0 ? r9.articleImageUrl : null, (r84 & 2) != 0 ? r9.author : null, (r84 & 4) != 0 ? r9.chapters : null, (r84 & 8) != 0 ? r9.charCount : 0L, (r84 & 16) != 0 ? r9.createdAt : date, (r84 & 32) != 0 ? r9.updatedAt : null, (r84 & 64) != 0 ? r9.addedAt : null, (r84 & 128) != 0 ? r9.description : null, (r84 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r9.lastListenedCharOffset : 0L, (r84 & 512) != 0 ? r9.readId : "c", (r84 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r9.source : null, (r84 & 2048) != 0 ? r9.title : "Read", (r84 & 4096) != 0 ? r9.subtitle : null, (r84 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r9.url : null, (r84 & 16384) != 0 ? r9.wordCount : 0L, (r84 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r9.originalFileType : null, (r84 & 65536) != 0 ? r9.hasOriginalAudio : false, (r84 & 131072) != 0 ? r9.matureContent : false, (r84 & 262144) != 0 ? r9.origin : null, (r84 & 524288) != 0 ? r9.contentType : null, (r84 & 1048576) != 0 ? r9.genre : null, (r84 & 2097152) != 0 ? r9.isBookType : false, (r84 & 4194304) != 0 ? r9.fromUserImport : false, (r84 & 8388608) != 0 ? r9.rating : null, (r84 & 16777216) != 0 ? r9.userRating : null, (r84 & 33554432) != 0 ? r9.lastUsedVoiceId : null, (r84 & 67108864) != 0 ? r9.creationStatus : null, (r84 & 134217728) != 0 ? r9.creationProgress : null, (r84 & 268435456) != 0 ? r9.isArchived : false, (r84 & 536870912) != 0 ? r9.markedAsUnread : false, (r84 & 1073741824) != 0 ? r9.completedAt : null, (r84 & Integer.MIN_VALUE) != 0 ? r9.publicationDate : null, (r85 & 1) != 0 ? r9.language : null, (r85 & 2) != 0 ? r9.publisherProfileId : null, (r85 & 4) != 0 ? r9.canDelete : false, (r85 & 8) != 0 ? r9.androidProductId : null, (r85 & 16) != 0 ? r9.isPaid : false, (r85 & 32) != 0 ? r9.offlineReadData : null, (r85 & 64) != 0 ? r9.previewAudio : null, (r85 & 128) != 0 ? r9.originalVoice : null, (r85 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r9.voiceSelectionConfig : null, (r85 & 512) != 0 ? r9.sampleConfig : null, (r85 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r9.displayMode : null, (r85 & 2048) != 0 ? r9.inUserLibrary : false, (r85 & 4096) != 0 ? r9.canUseAssistant : false, (r85 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r9.audioType : null, (r85 & 16384) != 0 ? r9.useDrm : false, (r85 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r9.lastListenedAudioFileNumber : null, (r85 & 65536) != 0 ? r9.lastListenedAudioSeconds : null, (r85 & 131072) != 0 ? r9.audioDurationSeconds : null, (r85 & 262144) != 0 ? r9.audioTypes : null, (r85 & 524288) != 0 ? r9.isVoiceChangerOn : false, (r85 & 1048576) != 0 ? r9.lastUsedAudioType : null, (r85 & 2097152) != 0 ? r9.coverImageUrls : null, (r85 & 4194304) != 0 ? r9.coverAspectRatio : null, (r85 & 8388608) != 0 ? ReadsFactoryKt.stubReadMeta$default(null, 1, null).blurPlaceholder : null);
            CollectionState collectionState = new CollectionState(null, false, false, null, false, null, null, null, copy$default, null, ig.f.I(copy, copy2, copy3), null, false, false, null, 31485, null);
            ho.p m1336getLambda$164053798$app_productionRelease = ComposableSingletons$CollectionScreenKt.INSTANCE.m1336getLambda$164053798$app_productionRelease();
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new o(19);
                qVar.h0(L);
            }
            ExploreCollectionScreenUI(collectionState, m1336getLambda$164053798$app_productionRelease, (ho.l) L, null, null, null, null, qVar, 432, 120);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.author.c(i10, 24);
        }
    }

    public static final sn.z Preview_CollectionScreenUI_newsletter_long_description$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_CollectionScreenUI_newsletter_long_description$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_CollectionScreenUI_newsletter_long_description(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_CollectionScreenUI_no_subscription_empty(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-707958583);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            CollectionState collectionState = new CollectionState(null, false, false, null, false, null, null, null, CollectionFactoryKt.stubCollectionMeta(), null, tn.t.f33547a, null, false, false, null, 31485, null);
            ho.p m1343getLambda$907943548$app_productionRelease = ComposableSingletons$CollectionScreenKt.INSTANCE.m1343getLambda$907943548$app_productionRelease();
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new y(3);
                qVar.h0(L);
            }
            ExploreCollectionScreenUI(collectionState, m1343getLambda$907943548$app_productionRelease, (ho.l) L, null, null, null, null, qVar, 432, 120);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new x(i10, 3);
        }
    }

    public static final sn.z Preview_CollectionScreenUI_no_subscription_empty$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_CollectionScreenUI_no_subscription_empty$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_CollectionScreenUI_no_subscription_empty(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_CollectionScreenUI_no_subscription_no_description(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1634326150);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            CollectionState collectionState = new CollectionState(null, false, false, null, false, null, null, null, CollectionMeta.copy$default(CollectionFactoryKt.stubCollectionMeta(), null, null, null, null, null, false, null, null, null, null, false, null, 4087, null), null, ReadsFactoryKt.stubReadMetaList$default(10, null, 2, null), null, false, false, null, 31485, null);
            ho.p m1340getLambda$542223585$app_productionRelease = ComposableSingletons$CollectionScreenKt.INSTANCE.m1340getLambda$542223585$app_productionRelease();
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new y(1);
                qVar.h0(L);
            }
            ExploreCollectionScreenUI(collectionState, m1340getLambda$542223585$app_productionRelease, (ho.l) L, null, null, null, null, qVar, 432, 120);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new x(i10, 2);
        }
    }

    public static final sn.z Preview_CollectionScreenUI_no_subscription_no_description$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_CollectionScreenUI_no_subscription_no_description$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_CollectionScreenUI_no_subscription_no_description(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_CollectionScreenUI_no_subscription_ready(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1461466399);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            CollectionState collectionState = new CollectionState(null, false, false, null, false, null, null, null, CollectionFactoryKt.stubCollectionMeta(), null, ReadsFactoryKt.stubReadMetaList$default(10, null, 2, null), null, false, false, null, 31485, null);
            ho.p lambda$1261481434$app_productionRelease = ComposableSingletons$CollectionScreenKt.INSTANCE.getLambda$1261481434$app_productionRelease();
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new o(24);
                qVar.h0(L);
            }
            ExploreCollectionScreenUI(collectionState, lambda$1261481434$app_productionRelease, (ho.l) L, null, null, null, null, qVar, 432, 120);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.author.c(i10, 27);
        }
    }

    public static final sn.z Preview_CollectionScreenUI_no_subscription_ready$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_CollectionScreenUI_no_subscription_ready$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_CollectionScreenUI_no_subscription_ready(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_CollectionScreenUI_owner(u2.m mVar, int i10) {
        boolean z6;
        ReadMeta copy;
        ReadMeta copy2;
        ReadMeta copy3;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1663091565);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            Date date = new Date(1714026044L);
            CollectionMeta copy$default = CollectionMeta.copy$default(CollectionFactoryKt.stubCollectionMeta(), null, null, null, null, null, false, date, null, "newsletter", null, true, null, 2751, null);
            ReadMeta stubReadMeta$default = ReadsFactoryKt.stubReadMeta$default(null, 1, null);
            long time = date.getTime();
            long j4 = SignalClient.CLOSE_REASON_NORMAL_CLOSURE;
            copy = stubReadMeta$default.copy((r84 & 1) != 0 ? stubReadMeta$default.articleImageUrl : null, (r84 & 2) != 0 ? stubReadMeta$default.author : null, (r84 & 4) != 0 ? stubReadMeta$default.chapters : null, (r84 & 8) != 0 ? stubReadMeta$default.charCount : 0L, (r84 & 16) != 0 ? stubReadMeta$default.createdAt : new Date(time + j4), (r84 & 32) != 0 ? stubReadMeta$default.updatedAt : null, (r84 & 64) != 0 ? stubReadMeta$default.addedAt : null, (r84 & 128) != 0 ? stubReadMeta$default.description : null, (r84 & RpcError.MAX_MESSAGE_BYTES) != 0 ? stubReadMeta$default.lastListenedCharOffset : 0L, (r84 & 512) != 0 ? stubReadMeta$default.readId : "a", (r84 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? stubReadMeta$default.source : null, (r84 & 2048) != 0 ? stubReadMeta$default.title : "Unread", (r84 & 4096) != 0 ? stubReadMeta$default.subtitle : null, (r84 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? stubReadMeta$default.url : null, (r84 & 16384) != 0 ? stubReadMeta$default.wordCount : 0L, (r84 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? stubReadMeta$default.originalFileType : null, (r84 & 65536) != 0 ? stubReadMeta$default.hasOriginalAudio : false, (r84 & 131072) != 0 ? stubReadMeta$default.matureContent : false, (r84 & 262144) != 0 ? stubReadMeta$default.origin : null, (r84 & 524288) != 0 ? stubReadMeta$default.contentType : null, (r84 & 1048576) != 0 ? stubReadMeta$default.genre : null, (r84 & 2097152) != 0 ? stubReadMeta$default.isBookType : false, (r84 & 4194304) != 0 ? stubReadMeta$default.fromUserImport : false, (r84 & 8388608) != 0 ? stubReadMeta$default.rating : null, (r84 & 16777216) != 0 ? stubReadMeta$default.userRating : null, (r84 & 33554432) != 0 ? stubReadMeta$default.lastUsedVoiceId : null, (r84 & 67108864) != 0 ? stubReadMeta$default.creationStatus : null, (r84 & 134217728) != 0 ? stubReadMeta$default.creationProgress : null, (r84 & 268435456) != 0 ? stubReadMeta$default.isArchived : false, (r84 & 536870912) != 0 ? stubReadMeta$default.markedAsUnread : false, (r84 & 1073741824) != 0 ? stubReadMeta$default.completedAt : null, (r84 & Integer.MIN_VALUE) != 0 ? stubReadMeta$default.publicationDate : null, (r85 & 1) != 0 ? stubReadMeta$default.language : null, (r85 & 2) != 0 ? stubReadMeta$default.publisherProfileId : null, (r85 & 4) != 0 ? stubReadMeta$default.canDelete : false, (r85 & 8) != 0 ? stubReadMeta$default.androidProductId : null, (r85 & 16) != 0 ? stubReadMeta$default.isPaid : false, (r85 & 32) != 0 ? stubReadMeta$default.offlineReadData : null, (r85 & 64) != 0 ? stubReadMeta$default.previewAudio : null, (r85 & 128) != 0 ? stubReadMeta$default.originalVoice : null, (r85 & RpcError.MAX_MESSAGE_BYTES) != 0 ? stubReadMeta$default.voiceSelectionConfig : null, (r85 & 512) != 0 ? stubReadMeta$default.sampleConfig : null, (r85 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? stubReadMeta$default.displayMode : null, (r85 & 2048) != 0 ? stubReadMeta$default.inUserLibrary : false, (r85 & 4096) != 0 ? stubReadMeta$default.canUseAssistant : false, (r85 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? stubReadMeta$default.audioType : null, (r85 & 16384) != 0 ? stubReadMeta$default.useDrm : false, (r85 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? stubReadMeta$default.lastListenedAudioFileNumber : null, (r85 & 65536) != 0 ? stubReadMeta$default.lastListenedAudioSeconds : null, (r85 & 131072) != 0 ? stubReadMeta$default.audioDurationSeconds : null, (r85 & 262144) != 0 ? stubReadMeta$default.audioTypes : null, (r85 & 524288) != 0 ? stubReadMeta$default.isVoiceChangerOn : false, (r85 & 1048576) != 0 ? stubReadMeta$default.lastUsedAudioType : null, (r85 & 2097152) != 0 ? stubReadMeta$default.coverImageUrls : null, (r85 & 4194304) != 0 ? stubReadMeta$default.coverAspectRatio : null, (r85 & 8388608) != 0 ? stubReadMeta$default.blurPlaceholder : null);
            copy2 = r17.copy((r84 & 1) != 0 ? r17.articleImageUrl : null, (r84 & 2) != 0 ? r17.author : null, (r84 & 4) != 0 ? r17.chapters : null, (r84 & 8) != 0 ? r17.charCount : 0L, (r84 & 16) != 0 ? r17.createdAt : new Date(date.getTime() + j4), (r84 & 32) != 0 ? r17.updatedAt : null, (r84 & 64) != 0 ? r17.addedAt : null, (r84 & 128) != 0 ? r17.description : null, (r84 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r17.lastListenedCharOffset : 0L, (r84 & 512) != 0 ? r17.readId : "b", (r84 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r17.source : null, (r84 & 2048) != 0 ? r17.title : "Unread with very long title that will collide with the unread indicator", (r84 & 4096) != 0 ? r17.subtitle : null, (r84 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r17.url : null, (r84 & 16384) != 0 ? r17.wordCount : 0L, (r84 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r17.originalFileType : null, (r84 & 65536) != 0 ? r17.hasOriginalAudio : false, (r84 & 131072) != 0 ? r17.matureContent : false, (r84 & 262144) != 0 ? r17.origin : null, (r84 & 524288) != 0 ? r17.contentType : null, (r84 & 1048576) != 0 ? r17.genre : null, (r84 & 2097152) != 0 ? r17.isBookType : false, (r84 & 4194304) != 0 ? r17.fromUserImport : false, (r84 & 8388608) != 0 ? r17.rating : null, (r84 & 16777216) != 0 ? r17.userRating : null, (r84 & 33554432) != 0 ? r17.lastUsedVoiceId : null, (r84 & 67108864) != 0 ? r17.creationStatus : null, (r84 & 134217728) != 0 ? r17.creationProgress : null, (r84 & 268435456) != 0 ? r17.isArchived : false, (r84 & 536870912) != 0 ? r17.markedAsUnread : false, (r84 & 1073741824) != 0 ? r17.completedAt : null, (r84 & Integer.MIN_VALUE) != 0 ? r17.publicationDate : null, (r85 & 1) != 0 ? r17.language : null, (r85 & 2) != 0 ? r17.publisherProfileId : null, (r85 & 4) != 0 ? r17.canDelete : false, (r85 & 8) != 0 ? r17.androidProductId : null, (r85 & 16) != 0 ? r17.isPaid : false, (r85 & 32) != 0 ? r17.offlineReadData : null, (r85 & 64) != 0 ? r17.previewAudio : null, (r85 & 128) != 0 ? r17.originalVoice : null, (r85 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r17.voiceSelectionConfig : null, (r85 & 512) != 0 ? r17.sampleConfig : null, (r85 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r17.displayMode : null, (r85 & 2048) != 0 ? r17.inUserLibrary : false, (r85 & 4096) != 0 ? r17.canUseAssistant : false, (r85 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r17.audioType : null, (r85 & 16384) != 0 ? r17.useDrm : false, (r85 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r17.lastListenedAudioFileNumber : null, (r85 & 65536) != 0 ? r17.lastListenedAudioSeconds : null, (r85 & 131072) != 0 ? r17.audioDurationSeconds : null, (r85 & 262144) != 0 ? r17.audioTypes : null, (r85 & 524288) != 0 ? r17.isVoiceChangerOn : false, (r85 & 1048576) != 0 ? r17.lastUsedAudioType : null, (r85 & 2097152) != 0 ? r17.coverImageUrls : null, (r85 & 4194304) != 0 ? r17.coverAspectRatio : null, (r85 & 8388608) != 0 ? ReadsFactoryKt.stubReadMeta$default(null, 1, null).blurPlaceholder : null);
            copy3 = r9.copy((r84 & 1) != 0 ? r9.articleImageUrl : null, (r84 & 2) != 0 ? r9.author : null, (r84 & 4) != 0 ? r9.chapters : null, (r84 & 8) != 0 ? r9.charCount : 0L, (r84 & 16) != 0 ? r9.createdAt : date, (r84 & 32) != 0 ? r9.updatedAt : null, (r84 & 64) != 0 ? r9.addedAt : null, (r84 & 128) != 0 ? r9.description : null, (r84 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r9.lastListenedCharOffset : 0L, (r84 & 512) != 0 ? r9.readId : "c", (r84 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r9.source : null, (r84 & 2048) != 0 ? r9.title : "Read", (r84 & 4096) != 0 ? r9.subtitle : null, (r84 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r9.url : null, (r84 & 16384) != 0 ? r9.wordCount : 0L, (r84 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r9.originalFileType : null, (r84 & 65536) != 0 ? r9.hasOriginalAudio : false, (r84 & 131072) != 0 ? r9.matureContent : false, (r84 & 262144) != 0 ? r9.origin : null, (r84 & 524288) != 0 ? r9.contentType : null, (r84 & 1048576) != 0 ? r9.genre : null, (r84 & 2097152) != 0 ? r9.isBookType : false, (r84 & 4194304) != 0 ? r9.fromUserImport : false, (r84 & 8388608) != 0 ? r9.rating : null, (r84 & 16777216) != 0 ? r9.userRating : null, (r84 & 33554432) != 0 ? r9.lastUsedVoiceId : null, (r84 & 67108864) != 0 ? r9.creationStatus : null, (r84 & 134217728) != 0 ? r9.creationProgress : null, (r84 & 268435456) != 0 ? r9.isArchived : false, (r84 & 536870912) != 0 ? r9.markedAsUnread : false, (r84 & 1073741824) != 0 ? r9.completedAt : null, (r84 & Integer.MIN_VALUE) != 0 ? r9.publicationDate : null, (r85 & 1) != 0 ? r9.language : null, (r85 & 2) != 0 ? r9.publisherProfileId : null, (r85 & 4) != 0 ? r9.canDelete : false, (r85 & 8) != 0 ? r9.androidProductId : null, (r85 & 16) != 0 ? r9.isPaid : false, (r85 & 32) != 0 ? r9.offlineReadData : null, (r85 & 64) != 0 ? r9.previewAudio : null, (r85 & 128) != 0 ? r9.originalVoice : null, (r85 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r9.voiceSelectionConfig : null, (r85 & 512) != 0 ? r9.sampleConfig : null, (r85 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r9.displayMode : null, (r85 & 2048) != 0 ? r9.inUserLibrary : false, (r85 & 4096) != 0 ? r9.canUseAssistant : false, (r85 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r9.audioType : null, (r85 & 16384) != 0 ? r9.useDrm : false, (r85 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r9.lastListenedAudioFileNumber : null, (r85 & 65536) != 0 ? r9.lastListenedAudioSeconds : null, (r85 & 131072) != 0 ? r9.audioDurationSeconds : null, (r85 & 262144) != 0 ? r9.audioTypes : null, (r85 & 524288) != 0 ? r9.isVoiceChangerOn : false, (r85 & 1048576) != 0 ? r9.lastUsedAudioType : null, (r85 & 2097152) != 0 ? r9.coverImageUrls : null, (r85 & 4194304) != 0 ? r9.coverAspectRatio : null, (r85 & 8388608) != 0 ? ReadsFactoryKt.stubReadMeta$default(null, 1, null).blurPlaceholder : null);
            CollectionState collectionState = new CollectionState(null, false, false, null, false, null, null, null, copy$default, null, ig.f.I(copy, copy2, copy3), null, false, false, null, 31485, null);
            ho.p m1335getLambda$113603762$app_productionRelease = ComposableSingletons$CollectionScreenKt.INSTANCE.m1335getLambda$113603762$app_productionRelease();
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new o(18);
                qVar.h0(L);
            }
            ExploreCollectionScreenUI(collectionState, m1335getLambda$113603762$app_productionRelease, (ho.l) L, null, null, null, null, qVar, 432, 120);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.author.c(i10, 23);
        }
    }

    public static final sn.z Preview_CollectionScreenUI_owner$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_CollectionScreenUI_owner$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_CollectionScreenUI_owner(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_CollectionScreenUI_owner_empty(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1170219103);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            CollectionState collectionState = new CollectionState(null, false, false, null, false, null, null, null, CollectionMeta.copy$default(CollectionFactoryKt.stubCollectionMeta(), null, null, null, null, null, false, new Date(1714026044L), null, "newsletter", null, true, null, 2751, null), null, tn.t.f33547a, null, false, false, null, 31485, null);
            ho.p m1338getLambda$258607588$app_productionRelease = ComposableSingletons$CollectionScreenKt.INSTANCE.m1338getLambda$258607588$app_productionRelease();
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new o(25);
                qVar.h0(L);
            }
            ExploreCollectionScreenUI(collectionState, m1338getLambda$258607588$app_productionRelease, (ho.l) L, null, null, null, null, qVar, 432, 120);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.author.c(i10, 28);
        }
    }

    public static final sn.z Preview_CollectionScreenUI_owner_empty$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_CollectionScreenUI_owner_empty$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_CollectionScreenUI_owner_empty(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_CollectionScreenUI_success_toast(u2.m mVar, int i10) {
        boolean z6;
        ReadMeta copy;
        ReadMeta copy2;
        ReadMeta copy3;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-477318965);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            Date date = new Date(1714026044L);
            CollectionMeta copy$default = CollectionMeta.copy$default(CollectionFactoryKt.stubCollectionMeta(), null, null, null, null, null, false, date, null, "newsletter", null, false, null, 3775, null);
            ReadMeta stubReadMeta$default = ReadsFactoryKt.stubReadMeta$default(null, 1, null);
            long time = date.getTime();
            long j4 = SignalClient.CLOSE_REASON_NORMAL_CLOSURE;
            copy = stubReadMeta$default.copy((r84 & 1) != 0 ? stubReadMeta$default.articleImageUrl : null, (r84 & 2) != 0 ? stubReadMeta$default.author : null, (r84 & 4) != 0 ? stubReadMeta$default.chapters : null, (r84 & 8) != 0 ? stubReadMeta$default.charCount : 0L, (r84 & 16) != 0 ? stubReadMeta$default.createdAt : new Date(time + j4), (r84 & 32) != 0 ? stubReadMeta$default.updatedAt : null, (r84 & 64) != 0 ? stubReadMeta$default.addedAt : null, (r84 & 128) != 0 ? stubReadMeta$default.description : null, (r84 & RpcError.MAX_MESSAGE_BYTES) != 0 ? stubReadMeta$default.lastListenedCharOffset : 0L, (r84 & 512) != 0 ? stubReadMeta$default.readId : "a", (r84 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? stubReadMeta$default.source : null, (r84 & 2048) != 0 ? stubReadMeta$default.title : "Unread", (r84 & 4096) != 0 ? stubReadMeta$default.subtitle : null, (r84 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? stubReadMeta$default.url : null, (r84 & 16384) != 0 ? stubReadMeta$default.wordCount : 0L, (r84 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? stubReadMeta$default.originalFileType : null, (r84 & 65536) != 0 ? stubReadMeta$default.hasOriginalAudio : false, (r84 & 131072) != 0 ? stubReadMeta$default.matureContent : false, (r84 & 262144) != 0 ? stubReadMeta$default.origin : null, (r84 & 524288) != 0 ? stubReadMeta$default.contentType : null, (r84 & 1048576) != 0 ? stubReadMeta$default.genre : null, (r84 & 2097152) != 0 ? stubReadMeta$default.isBookType : false, (r84 & 4194304) != 0 ? stubReadMeta$default.fromUserImport : false, (r84 & 8388608) != 0 ? stubReadMeta$default.rating : null, (r84 & 16777216) != 0 ? stubReadMeta$default.userRating : null, (r84 & 33554432) != 0 ? stubReadMeta$default.lastUsedVoiceId : null, (r84 & 67108864) != 0 ? stubReadMeta$default.creationStatus : null, (r84 & 134217728) != 0 ? stubReadMeta$default.creationProgress : null, (r84 & 268435456) != 0 ? stubReadMeta$default.isArchived : false, (r84 & 536870912) != 0 ? stubReadMeta$default.markedAsUnread : false, (r84 & 1073741824) != 0 ? stubReadMeta$default.completedAt : null, (r84 & Integer.MIN_VALUE) != 0 ? stubReadMeta$default.publicationDate : null, (r85 & 1) != 0 ? stubReadMeta$default.language : null, (r85 & 2) != 0 ? stubReadMeta$default.publisherProfileId : null, (r85 & 4) != 0 ? stubReadMeta$default.canDelete : false, (r85 & 8) != 0 ? stubReadMeta$default.androidProductId : null, (r85 & 16) != 0 ? stubReadMeta$default.isPaid : false, (r85 & 32) != 0 ? stubReadMeta$default.offlineReadData : null, (r85 & 64) != 0 ? stubReadMeta$default.previewAudio : null, (r85 & 128) != 0 ? stubReadMeta$default.originalVoice : null, (r85 & RpcError.MAX_MESSAGE_BYTES) != 0 ? stubReadMeta$default.voiceSelectionConfig : null, (r85 & 512) != 0 ? stubReadMeta$default.sampleConfig : null, (r85 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? stubReadMeta$default.displayMode : null, (r85 & 2048) != 0 ? stubReadMeta$default.inUserLibrary : false, (r85 & 4096) != 0 ? stubReadMeta$default.canUseAssistant : false, (r85 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? stubReadMeta$default.audioType : null, (r85 & 16384) != 0 ? stubReadMeta$default.useDrm : false, (r85 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? stubReadMeta$default.lastListenedAudioFileNumber : null, (r85 & 65536) != 0 ? stubReadMeta$default.lastListenedAudioSeconds : null, (r85 & 131072) != 0 ? stubReadMeta$default.audioDurationSeconds : null, (r85 & 262144) != 0 ? stubReadMeta$default.audioTypes : null, (r85 & 524288) != 0 ? stubReadMeta$default.isVoiceChangerOn : false, (r85 & 1048576) != 0 ? stubReadMeta$default.lastUsedAudioType : null, (r85 & 2097152) != 0 ? stubReadMeta$default.coverImageUrls : null, (r85 & 4194304) != 0 ? stubReadMeta$default.coverAspectRatio : null, (r85 & 8388608) != 0 ? stubReadMeta$default.blurPlaceholder : null);
            copy2 = r17.copy((r84 & 1) != 0 ? r17.articleImageUrl : null, (r84 & 2) != 0 ? r17.author : null, (r84 & 4) != 0 ? r17.chapters : null, (r84 & 8) != 0 ? r17.charCount : 0L, (r84 & 16) != 0 ? r17.createdAt : new Date(date.getTime() + j4), (r84 & 32) != 0 ? r17.updatedAt : null, (r84 & 64) != 0 ? r17.addedAt : null, (r84 & 128) != 0 ? r17.description : null, (r84 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r17.lastListenedCharOffset : 0L, (r84 & 512) != 0 ? r17.readId : "b", (r84 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r17.source : null, (r84 & 2048) != 0 ? r17.title : "Unread with very long title that will collide with the unread indicator", (r84 & 4096) != 0 ? r17.subtitle : null, (r84 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r17.url : null, (r84 & 16384) != 0 ? r17.wordCount : 0L, (r84 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r17.originalFileType : null, (r84 & 65536) != 0 ? r17.hasOriginalAudio : false, (r84 & 131072) != 0 ? r17.matureContent : false, (r84 & 262144) != 0 ? r17.origin : null, (r84 & 524288) != 0 ? r17.contentType : null, (r84 & 1048576) != 0 ? r17.genre : null, (r84 & 2097152) != 0 ? r17.isBookType : false, (r84 & 4194304) != 0 ? r17.fromUserImport : false, (r84 & 8388608) != 0 ? r17.rating : null, (r84 & 16777216) != 0 ? r17.userRating : null, (r84 & 33554432) != 0 ? r17.lastUsedVoiceId : null, (r84 & 67108864) != 0 ? r17.creationStatus : null, (r84 & 134217728) != 0 ? r17.creationProgress : null, (r84 & 268435456) != 0 ? r17.isArchived : false, (r84 & 536870912) != 0 ? r17.markedAsUnread : false, (r84 & 1073741824) != 0 ? r17.completedAt : null, (r84 & Integer.MIN_VALUE) != 0 ? r17.publicationDate : null, (r85 & 1) != 0 ? r17.language : null, (r85 & 2) != 0 ? r17.publisherProfileId : null, (r85 & 4) != 0 ? r17.canDelete : false, (r85 & 8) != 0 ? r17.androidProductId : null, (r85 & 16) != 0 ? r17.isPaid : false, (r85 & 32) != 0 ? r17.offlineReadData : null, (r85 & 64) != 0 ? r17.previewAudio : null, (r85 & 128) != 0 ? r17.originalVoice : null, (r85 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r17.voiceSelectionConfig : null, (r85 & 512) != 0 ? r17.sampleConfig : null, (r85 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r17.displayMode : null, (r85 & 2048) != 0 ? r17.inUserLibrary : false, (r85 & 4096) != 0 ? r17.canUseAssistant : false, (r85 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r17.audioType : null, (r85 & 16384) != 0 ? r17.useDrm : false, (r85 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r17.lastListenedAudioFileNumber : null, (r85 & 65536) != 0 ? r17.lastListenedAudioSeconds : null, (r85 & 131072) != 0 ? r17.audioDurationSeconds : null, (r85 & 262144) != 0 ? r17.audioTypes : null, (r85 & 524288) != 0 ? r17.isVoiceChangerOn : false, (r85 & 1048576) != 0 ? r17.lastUsedAudioType : null, (r85 & 2097152) != 0 ? r17.coverImageUrls : null, (r85 & 4194304) != 0 ? r17.coverAspectRatio : null, (r85 & 8388608) != 0 ? ReadsFactoryKt.stubReadMeta$default(null, 1, null).blurPlaceholder : null);
            copy3 = r9.copy((r84 & 1) != 0 ? r9.articleImageUrl : null, (r84 & 2) != 0 ? r9.author : null, (r84 & 4) != 0 ? r9.chapters : null, (r84 & 8) != 0 ? r9.charCount : 0L, (r84 & 16) != 0 ? r9.createdAt : date, (r84 & 32) != 0 ? r9.updatedAt : null, (r84 & 64) != 0 ? r9.addedAt : null, (r84 & 128) != 0 ? r9.description : null, (r84 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r9.lastListenedCharOffset : 0L, (r84 & 512) != 0 ? r9.readId : "c", (r84 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r9.source : null, (r84 & 2048) != 0 ? r9.title : "Read", (r84 & 4096) != 0 ? r9.subtitle : null, (r84 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r9.url : null, (r84 & 16384) != 0 ? r9.wordCount : 0L, (r84 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r9.originalFileType : null, (r84 & 65536) != 0 ? r9.hasOriginalAudio : false, (r84 & 131072) != 0 ? r9.matureContent : false, (r84 & 262144) != 0 ? r9.origin : null, (r84 & 524288) != 0 ? r9.contentType : null, (r84 & 1048576) != 0 ? r9.genre : null, (r84 & 2097152) != 0 ? r9.isBookType : false, (r84 & 4194304) != 0 ? r9.fromUserImport : false, (r84 & 8388608) != 0 ? r9.rating : null, (r84 & 16777216) != 0 ? r9.userRating : null, (r84 & 33554432) != 0 ? r9.lastUsedVoiceId : null, (r84 & 67108864) != 0 ? r9.creationStatus : null, (r84 & 134217728) != 0 ? r9.creationProgress : null, (r84 & 268435456) != 0 ? r9.isArchived : false, (r84 & 536870912) != 0 ? r9.markedAsUnread : false, (r84 & 1073741824) != 0 ? r9.completedAt : null, (r84 & Integer.MIN_VALUE) != 0 ? r9.publicationDate : null, (r85 & 1) != 0 ? r9.language : null, (r85 & 2) != 0 ? r9.publisherProfileId : null, (r85 & 4) != 0 ? r9.canDelete : false, (r85 & 8) != 0 ? r9.androidProductId : null, (r85 & 16) != 0 ? r9.isPaid : false, (r85 & 32) != 0 ? r9.offlineReadData : null, (r85 & 64) != 0 ? r9.previewAudio : null, (r85 & 128) != 0 ? r9.originalVoice : null, (r85 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r9.voiceSelectionConfig : null, (r85 & 512) != 0 ? r9.sampleConfig : null, (r85 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r9.displayMode : null, (r85 & 2048) != 0 ? r9.inUserLibrary : false, (r85 & 4096) != 0 ? r9.canUseAssistant : false, (r85 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r9.audioType : null, (r85 & 16384) != 0 ? r9.useDrm : false, (r85 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r9.lastListenedAudioFileNumber : null, (r85 & 65536) != 0 ? r9.lastListenedAudioSeconds : null, (r85 & 131072) != 0 ? r9.audioDurationSeconds : null, (r85 & 262144) != 0 ? r9.audioTypes : null, (r85 & 524288) != 0 ? r9.isVoiceChangerOn : false, (r85 & 1048576) != 0 ? r9.lastUsedAudioType : null, (r85 & 2097152) != 0 ? r9.coverImageUrls : null, (r85 & 4194304) != 0 ? r9.coverAspectRatio : null, (r85 & 8388608) != 0 ? ReadsFactoryKt.stubReadMeta$default(null, 1, null).blurPlaceholder : null);
            CollectionState collectionState = new CollectionState(null, false, false, null, false, null, null, null, copy$default, null, ig.f.I(copy, copy2, copy3), null, true, false, null, 27389, null);
            ho.p m1341getLambda$591981434$app_productionRelease = ComposableSingletons$CollectionScreenKt.INSTANCE.m1341getLambda$591981434$app_productionRelease();
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new o(28);
                qVar.h0(L);
            }
            ExploreCollectionScreenUI(collectionState, m1341getLambda$591981434$app_productionRelease, (ho.l) L, null, null, null, null, qVar, 432, 120);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.author.c(i10, 29);
        }
    }

    public static final sn.z Preview_CollectionScreenUI_success_toast$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_CollectionScreenUI_success_toast$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_CollectionScreenUI_success_toast(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_CollectionScreenUI_with_unreads(u2.m mVar, int i10) {
        boolean z6;
        ReadMeta copy;
        ReadMeta copy2;
        ReadMeta copy3;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1071690819);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            Date date = new Date(1714026044L);
            CollectionMeta copy$default = CollectionMeta.copy$default(CollectionFactoryKt.stubCollectionMeta(), null, null, null, null, null, false, date, null, null, null, false, null, 4031, null);
            ReadMeta stubReadMeta$default = ReadsFactoryKt.stubReadMeta$default(null, 1, null);
            long time = date.getTime();
            long j4 = SignalClient.CLOSE_REASON_NORMAL_CLOSURE;
            copy = stubReadMeta$default.copy((r84 & 1) != 0 ? stubReadMeta$default.articleImageUrl : null, (r84 & 2) != 0 ? stubReadMeta$default.author : null, (r84 & 4) != 0 ? stubReadMeta$default.chapters : null, (r84 & 8) != 0 ? stubReadMeta$default.charCount : 0L, (r84 & 16) != 0 ? stubReadMeta$default.createdAt : new Date(time + j4), (r84 & 32) != 0 ? stubReadMeta$default.updatedAt : null, (r84 & 64) != 0 ? stubReadMeta$default.addedAt : null, (r84 & 128) != 0 ? stubReadMeta$default.description : null, (r84 & RpcError.MAX_MESSAGE_BYTES) != 0 ? stubReadMeta$default.lastListenedCharOffset : 0L, (r84 & 512) != 0 ? stubReadMeta$default.readId : "a", (r84 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? stubReadMeta$default.source : null, (r84 & 2048) != 0 ? stubReadMeta$default.title : "Unread", (r84 & 4096) != 0 ? stubReadMeta$default.subtitle : null, (r84 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? stubReadMeta$default.url : null, (r84 & 16384) != 0 ? stubReadMeta$default.wordCount : 0L, (r84 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? stubReadMeta$default.originalFileType : null, (r84 & 65536) != 0 ? stubReadMeta$default.hasOriginalAudio : false, (r84 & 131072) != 0 ? stubReadMeta$default.matureContent : false, (r84 & 262144) != 0 ? stubReadMeta$default.origin : null, (r84 & 524288) != 0 ? stubReadMeta$default.contentType : null, (r84 & 1048576) != 0 ? stubReadMeta$default.genre : null, (r84 & 2097152) != 0 ? stubReadMeta$default.isBookType : false, (r84 & 4194304) != 0 ? stubReadMeta$default.fromUserImport : false, (r84 & 8388608) != 0 ? stubReadMeta$default.rating : null, (r84 & 16777216) != 0 ? stubReadMeta$default.userRating : null, (r84 & 33554432) != 0 ? stubReadMeta$default.lastUsedVoiceId : null, (r84 & 67108864) != 0 ? stubReadMeta$default.creationStatus : null, (r84 & 134217728) != 0 ? stubReadMeta$default.creationProgress : null, (r84 & 268435456) != 0 ? stubReadMeta$default.isArchived : false, (r84 & 536870912) != 0 ? stubReadMeta$default.markedAsUnread : false, (r84 & 1073741824) != 0 ? stubReadMeta$default.completedAt : null, (r84 & Integer.MIN_VALUE) != 0 ? stubReadMeta$default.publicationDate : null, (r85 & 1) != 0 ? stubReadMeta$default.language : null, (r85 & 2) != 0 ? stubReadMeta$default.publisherProfileId : null, (r85 & 4) != 0 ? stubReadMeta$default.canDelete : false, (r85 & 8) != 0 ? stubReadMeta$default.androidProductId : null, (r85 & 16) != 0 ? stubReadMeta$default.isPaid : false, (r85 & 32) != 0 ? stubReadMeta$default.offlineReadData : null, (r85 & 64) != 0 ? stubReadMeta$default.previewAudio : null, (r85 & 128) != 0 ? stubReadMeta$default.originalVoice : null, (r85 & RpcError.MAX_MESSAGE_BYTES) != 0 ? stubReadMeta$default.voiceSelectionConfig : null, (r85 & 512) != 0 ? stubReadMeta$default.sampleConfig : null, (r85 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? stubReadMeta$default.displayMode : null, (r85 & 2048) != 0 ? stubReadMeta$default.inUserLibrary : false, (r85 & 4096) != 0 ? stubReadMeta$default.canUseAssistant : false, (r85 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? stubReadMeta$default.audioType : null, (r85 & 16384) != 0 ? stubReadMeta$default.useDrm : false, (r85 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? stubReadMeta$default.lastListenedAudioFileNumber : null, (r85 & 65536) != 0 ? stubReadMeta$default.lastListenedAudioSeconds : null, (r85 & 131072) != 0 ? stubReadMeta$default.audioDurationSeconds : null, (r85 & 262144) != 0 ? stubReadMeta$default.audioTypes : null, (r85 & 524288) != 0 ? stubReadMeta$default.isVoiceChangerOn : false, (r85 & 1048576) != 0 ? stubReadMeta$default.lastUsedAudioType : null, (r85 & 2097152) != 0 ? stubReadMeta$default.coverImageUrls : null, (r85 & 4194304) != 0 ? stubReadMeta$default.coverAspectRatio : null, (r85 & 8388608) != 0 ? stubReadMeta$default.blurPlaceholder : null);
            copy2 = r17.copy((r84 & 1) != 0 ? r17.articleImageUrl : null, (r84 & 2) != 0 ? r17.author : null, (r84 & 4) != 0 ? r17.chapters : null, (r84 & 8) != 0 ? r17.charCount : 0L, (r84 & 16) != 0 ? r17.createdAt : new Date(date.getTime() + j4), (r84 & 32) != 0 ? r17.updatedAt : null, (r84 & 64) != 0 ? r17.addedAt : null, (r84 & 128) != 0 ? r17.description : null, (r84 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r17.lastListenedCharOffset : 0L, (r84 & 512) != 0 ? r17.readId : "b", (r84 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r17.source : null, (r84 & 2048) != 0 ? r17.title : "Unread with very long title that will collide with the unread indicator", (r84 & 4096) != 0 ? r17.subtitle : null, (r84 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r17.url : null, (r84 & 16384) != 0 ? r17.wordCount : 0L, (r84 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r17.originalFileType : null, (r84 & 65536) != 0 ? r17.hasOriginalAudio : false, (r84 & 131072) != 0 ? r17.matureContent : false, (r84 & 262144) != 0 ? r17.origin : null, (r84 & 524288) != 0 ? r17.contentType : null, (r84 & 1048576) != 0 ? r17.genre : null, (r84 & 2097152) != 0 ? r17.isBookType : false, (r84 & 4194304) != 0 ? r17.fromUserImport : false, (r84 & 8388608) != 0 ? r17.rating : null, (r84 & 16777216) != 0 ? r17.userRating : null, (r84 & 33554432) != 0 ? r17.lastUsedVoiceId : null, (r84 & 67108864) != 0 ? r17.creationStatus : null, (r84 & 134217728) != 0 ? r17.creationProgress : null, (r84 & 268435456) != 0 ? r17.isArchived : false, (r84 & 536870912) != 0 ? r17.markedAsUnread : false, (r84 & 1073741824) != 0 ? r17.completedAt : null, (r84 & Integer.MIN_VALUE) != 0 ? r17.publicationDate : null, (r85 & 1) != 0 ? r17.language : null, (r85 & 2) != 0 ? r17.publisherProfileId : null, (r85 & 4) != 0 ? r17.canDelete : false, (r85 & 8) != 0 ? r17.androidProductId : null, (r85 & 16) != 0 ? r17.isPaid : false, (r85 & 32) != 0 ? r17.offlineReadData : null, (r85 & 64) != 0 ? r17.previewAudio : null, (r85 & 128) != 0 ? r17.originalVoice : null, (r85 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r17.voiceSelectionConfig : null, (r85 & 512) != 0 ? r17.sampleConfig : null, (r85 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r17.displayMode : null, (r85 & 2048) != 0 ? r17.inUserLibrary : false, (r85 & 4096) != 0 ? r17.canUseAssistant : false, (r85 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r17.audioType : null, (r85 & 16384) != 0 ? r17.useDrm : false, (r85 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r17.lastListenedAudioFileNumber : null, (r85 & 65536) != 0 ? r17.lastListenedAudioSeconds : null, (r85 & 131072) != 0 ? r17.audioDurationSeconds : null, (r85 & 262144) != 0 ? r17.audioTypes : null, (r85 & 524288) != 0 ? r17.isVoiceChangerOn : false, (r85 & 1048576) != 0 ? r17.lastUsedAudioType : null, (r85 & 2097152) != 0 ? r17.coverImageUrls : null, (r85 & 4194304) != 0 ? r17.coverAspectRatio : null, (r85 & 8388608) != 0 ? ReadsFactoryKt.stubReadMeta$default(null, 1, null).blurPlaceholder : null);
            copy3 = r9.copy((r84 & 1) != 0 ? r9.articleImageUrl : null, (r84 & 2) != 0 ? r9.author : null, (r84 & 4) != 0 ? r9.chapters : null, (r84 & 8) != 0 ? r9.charCount : 0L, (r84 & 16) != 0 ? r9.createdAt : date, (r84 & 32) != 0 ? r9.updatedAt : null, (r84 & 64) != 0 ? r9.addedAt : null, (r84 & 128) != 0 ? r9.description : null, (r84 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r9.lastListenedCharOffset : 0L, (r84 & 512) != 0 ? r9.readId : "c", (r84 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r9.source : null, (r84 & 2048) != 0 ? r9.title : "Read", (r84 & 4096) != 0 ? r9.subtitle : null, (r84 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r9.url : null, (r84 & 16384) != 0 ? r9.wordCount : 0L, (r84 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r9.originalFileType : null, (r84 & 65536) != 0 ? r9.hasOriginalAudio : false, (r84 & 131072) != 0 ? r9.matureContent : false, (r84 & 262144) != 0 ? r9.origin : null, (r84 & 524288) != 0 ? r9.contentType : null, (r84 & 1048576) != 0 ? r9.genre : null, (r84 & 2097152) != 0 ? r9.isBookType : false, (r84 & 4194304) != 0 ? r9.fromUserImport : false, (r84 & 8388608) != 0 ? r9.rating : null, (r84 & 16777216) != 0 ? r9.userRating : null, (r84 & 33554432) != 0 ? r9.lastUsedVoiceId : null, (r84 & 67108864) != 0 ? r9.creationStatus : null, (r84 & 134217728) != 0 ? r9.creationProgress : null, (r84 & 268435456) != 0 ? r9.isArchived : false, (r84 & 536870912) != 0 ? r9.markedAsUnread : false, (r84 & 1073741824) != 0 ? r9.completedAt : null, (r84 & Integer.MIN_VALUE) != 0 ? r9.publicationDate : null, (r85 & 1) != 0 ? r9.language : null, (r85 & 2) != 0 ? r9.publisherProfileId : null, (r85 & 4) != 0 ? r9.canDelete : false, (r85 & 8) != 0 ? r9.androidProductId : null, (r85 & 16) != 0 ? r9.isPaid : false, (r85 & 32) != 0 ? r9.offlineReadData : null, (r85 & 64) != 0 ? r9.previewAudio : null, (r85 & 128) != 0 ? r9.originalVoice : null, (r85 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r9.voiceSelectionConfig : null, (r85 & 512) != 0 ? r9.sampleConfig : null, (r85 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r9.displayMode : null, (r85 & 2048) != 0 ? r9.inUserLibrary : false, (r85 & 4096) != 0 ? r9.canUseAssistant : false, (r85 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r9.audioType : null, (r85 & 16384) != 0 ? r9.useDrm : false, (r85 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r9.lastListenedAudioFileNumber : null, (r85 & 65536) != 0 ? r9.lastListenedAudioSeconds : null, (r85 & 131072) != 0 ? r9.audioDurationSeconds : null, (r85 & 262144) != 0 ? r9.audioTypes : null, (r85 & 524288) != 0 ? r9.isVoiceChangerOn : false, (r85 & 1048576) != 0 ? r9.lastUsedAudioType : null, (r85 & 2097152) != 0 ? r9.coverImageUrls : null, (r85 & 4194304) != 0 ? r9.coverAspectRatio : null, (r85 & 8388608) != 0 ? ReadsFactoryKt.stubReadMeta$default(null, 1, null).blurPlaceholder : null);
            CollectionState collectionState = new CollectionState(null, false, false, null, false, null, null, null, copy$default, null, ig.f.I(copy, copy2, copy3), null, false, false, null, 31485, null);
            ho.p m1342getLambda$733123288$app_productionRelease = ComposableSingletons$CollectionScreenKt.INSTANCE.m1342getLambda$733123288$app_productionRelease();
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new y(4);
                qVar.h0(L);
            }
            ExploreCollectionScreenUI(collectionState, m1342getLambda$733123288$app_productionRelease, (ho.l) L, null, null, null, null, qVar, 432, 120);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new x(i10, 4);
        }
    }

    public static final sn.z Preview_CollectionScreenUI_with_unreads$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_CollectionScreenUI_with_unreads$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_CollectionScreenUI_with_unreads(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
