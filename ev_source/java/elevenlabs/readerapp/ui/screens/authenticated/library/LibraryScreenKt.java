package io.elevenlabs.readerapp.ui.screens.authenticated.library;

import a2.k3;
import android.gov.nist.core.LexerCore;
import androidx.lifecycle.j1;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import f4.f1;
import i1.j2;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.model.CollectionMeta;
import io.elevenlabs.domain.model.CollectionMetaKt;
import io.elevenlabs.domain.model.MediaItemState;
import io.elevenlabs.domain.model.OfflineReadData;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.ReadMetaKt;
import io.elevenlabs.domain.model.SyncStatus;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.readerapp.ui.components.CollectionMetaSmallRowKt;
import io.elevenlabs.readerapp.ui.components.ReadMetaRowKt;
import io.elevenlabs.readerapp.ui.previews.CollectionFactoryKt;
import io.elevenlabs.readerapp.ui.previews.ReadsFactoryKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.collections.AddReadToCollectionScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.collections.CreateCollectionSheetKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.MiniPlayerKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.r0;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.ActionConfig;
import io.elevenlabs.ui.components.ActionSpec;
import io.elevenlabs.ui.components.ActionSpecBuilder;
import io.elevenlabs.ui.components.ButtonContainerKt;
import io.elevenlabs.ui.components.ButtonIconKt;
import io.elevenlabs.ui.components.ButtonIconSize;
import io.elevenlabs.ui.components.ButtonIconVariant;
import io.elevenlabs.ui.components.ChipGroupKt;
import io.elevenlabs.ui.components.ChipIconPosition;
import io.elevenlabs.ui.components.ChipKt;
import io.elevenlabs.ui.components.ConfirmationDialogKt;
import io.elevenlabs.ui.components.DividerKt;
import io.elevenlabs.ui.components.EmptyScreenKt;
import io.elevenlabs.ui.components.FullWidthButtonKt;
import io.elevenlabs.ui.components.FullWidthButtonSize;
import io.elevenlabs.ui.components.FullWidthButtonVariant;
import io.elevenlabs.ui.components.MenuKt;
import io.elevenlabs.ui.components.SearchButtonKt;
import io.elevenlabs.ui.components.SwipeToActionBoxKt;
import io.elevenlabs.ui.components.animations.AnimatedVisibilityContainersKt;
import io.elevenlabs.ui.components.headers.EchoHeaderStyle;
import io.elevenlabs.ui.components.headers.HeaderKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.extensions.ComposeExtensionsKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.elevenlabs.ui.theme.ElevenLabsThemeKt;
import io.elevenlabs.ui.theme.ReaderColors;
import io.livekit.android.rpc.RpcError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import q2.k5;
import r1.c3;
import r1.d2;
import r1.l2;
import r1.o1;
import r1.p2;
import r1.u0;
import r1.z1;
import rd.c1;
import u2.r1;
import u2.s2;
import u2.x0;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0006\u001aÅ\u0001\u0010\u0017\u001a\u00020\u00032\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001aó\u0001\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00192\u001e\u0010\u001b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u0004\u0012\u00020\u00030\u00062\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00002\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0003¢\u0006\u0004\b\u001f\u0010 \u001ag\u0010%\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u001e\u0010\u001b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u0004\u0012\u00020\u00030\u00062\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00062\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0006H\u0003¢\u0006\u0004\b%\u0010&\u001aK\u0010'\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020!2\u001e\u0010\u001b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u0004\u0012\u00020\u00030\u00062\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0006H\u0003¢\u0006\u0004\b'\u0010(\u001a\u000f\u0010*\u001a\u00020)H\u0003¢\u0006\u0004\b*\u0010+\u001a%\u0010-\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020)2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0003¢\u0006\u0004\b-\u0010.\u001a\u000f\u00100\u001a\u00020/H\u0003¢\u0006\u0004\b0\u00101\u001a5\u00107\u001a\u00020\u0003*\u0002022\f\u00105\u001a\b\u0012\u0004\u0012\u000204032\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0006H\u0002¢\u0006\u0004\b7\u00108\u001aC\u00109\u001a\u00020\u0003*\u0002022\f\u00109\u001a\b\u0012\u0004\u0012\u000204032\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00062\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0002¢\u0006\u0004\b9\u0010;\u001a7\u0010<\u001a\u00020\u00032\u001e\u0010\u001b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u0004\u0012\u00020\u00030\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0003¢\u0006\u0004\b<\u0010=\u001a\u0015\u0010?\u001a\u0002042\u0006\u0010>\u001a\u00020\u0001¢\u0006\u0004\b?\u0010@\u001a!\u0010E\u001a\u00020D2\b\u0010B\u001a\u0004\u0018\u00010A2\u0006\u0010C\u001a\u00020#H\u0007¢\u0006\u0004\bE\u0010F\u001a+\u0010G\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0003¢\u0006\u0004\bG\u0010H\u001a\u000f\u0010I\u001a\u00020\u0003H\u0007¢\u0006\u0004\bI\u0010J\u001a\u000f\u0010K\u001a\u00020\u0003H\u0007¢\u0006\u0004\bK\u0010J\u001a\u000f\u0010L\u001a\u00020\u0003H\u0007¢\u0006\u0004\bL\u0010J\u001a\u000f\u0010M\u001a\u00020\u0003H\u0007¢\u0006\u0004\bM\u0010J\u001a\u000f\u0010N\u001a\u00020\u0003H\u0007¢\u0006\u0004\bN\u0010J\u001a\u000f\u0010O\u001a\u00020\u0003H\u0007¢\u0006\u0004\bO\u0010J\u001a\u000f\u0010P\u001a\u00020\u0003H\u0007¢\u0006\u0004\bP\u0010J\u001a\u000f\u0010Q\u001a\u00020\u0003H\u0007¢\u0006\u0004\bQ\u0010J\u001a\u000f\u0010R\u001a\u00020\u0003H\u0007¢\u0006\u0004\bR\u0010J¨\u0006\\²\u0006\u0010\u0010S\u001a\u0004\u0018\u00010\u00018\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010T\u001a\u0004\u0018\u00010\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010U\u001a\u00020#8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010W\u001a\u00020V8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010X\u001a\u00020V8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010Y\u001a\u00020#8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010Z\u001a\u00020#8\nX\u008a\u0084\u0002²\u0006\u000e\u0010[\u001a\u00020#8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lkotlin/Function2;", "", "Lio/elevenlabs/domain/Analytics$Event$PlayerActivationSource;", "Lsn/z;", "onNavigateToRead", "onNavigateToPlayer", "Lkotlin/Function1;", "onNavigateToLibraryCollection", "Lkotlin/Function0;", "onNavigateToLibrarySearch", "onNavigateToImport", "onNavigateToExplore", "bottomBar", "Li1/j2;", "sharedTransitionScope", "Li1/o;", "animatedContentScope", "Lio/elevenlabs/readerapp/ui/screens/authenticated/library/LibraryTab;", "initialTab", "Lio/elevenlabs/domain/services/ReadsService$SortBy;", "initialSortBy", "Lio/elevenlabs/readerapp/ui/screens/authenticated/library/LibraryViewModel;", "vm", "LibraryScreen", "(Lho/p;Lho/p;Lho/l;Lho/a;Lho/a;Lho/a;Lho/p;Li1/j2;Li1/o;Lio/elevenlabs/readerapp/ui/screens/authenticated/library/LibraryTab;Lio/elevenlabs/domain/services/ReadsService$SortBy;Lio/elevenlabs/readerapp/ui/screens/authenticated/library/LibraryViewModel;Lu2/m;III)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/library/LibraryState;", RemoteConfigConstants.ResponseFieldKey.STATE, "action", "onShowCreateCollection", "onShowAddToCollectionSheet", "miniPlayer", "LibraryScreenUI", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/library/LibraryState;Lho/l;Lho/p;Lho/l;Lho/a;Lho/a;Lho/l;Lho/a;Lho/a;Lho/p;Lho/p;Li1/j2;Li1/o;Lu2/m;III)V", "Lio/elevenlabs/domain/model/ReadMeta;", "meta", "", "isInQueue", "SavedItem", "(Lio/elevenlabs/domain/model/ReadMeta;ZLho/l;Lho/l;Lho/l;Lu2/m;I)V", "ArchiveItem", "(Lio/elevenlabs/domain/model/ReadMeta;Lho/l;Lho/l;Lu2/m;I)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/library/DeleteConfirmationState;", "rememberDeleteConfirmationState", "(Lu2/m;I)Lio/elevenlabs/readerapp/ui/screens/authenticated/library/DeleteConfirmationState;", "onConfirm", "DeleteReadConfirmationDialog", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/library/DeleteConfirmationState;Lho/a;Lu2/m;I)V", "Lio/elevenlabs/ui/components/ActionConfig;", "createDeleteActionConfig", "(Lu2/m;I)Lio/elevenlabs/ui/components/ActionConfig;", "Lt1/t;", "", "Lio/elevenlabs/domain/model/CollectionMeta;", "byTypeCollections", "onNavigateToCollection", "typeCollections", "(Lt1/t;Ljava/util/List;Lho/l;)V", "userCollections", "onCreateNewCollection", "(Lt1/t;Ljava/util/List;Lho/l;Lho/a;)V", "Tabs", "(Lho/l;Lio/elevenlabs/readerapp/ui/screens/authenticated/library/LibraryState;Lu2/m;I)V", "title", "downloadsCollection", "(Ljava/lang/String;)Lio/elevenlabs/domain/model/CollectionMeta;", "Lio/elevenlabs/domain/model/OfflineReadData;", "offlineReadData", "isReadPaid", "Lio/elevenlabs/readerapp/ui/screens/authenticated/library/DownloadActionHelper;", "createDownloadActionHelper", "(Lio/elevenlabs/domain/model/OfflineReadData;ZLu2/m;I)Lio/elevenlabs/readerapp/ui/screens/authenticated/library/DownloadActionHelper;", "LibraryEmptyStateView", "(Lho/a;Lho/a;Lu2/m;I)V", "Preview_LibraryScreen_Idle", "(Lu2/m;I)V", "Preview_LibraryScreen_Error", "Preview_LibraryScreen_Synced", "Preview_LibraryScreen_Empty", "Preview_LibraryScreen_Collections_loading", "Preview_LibraryScreen_Collections_error", "Preview_LibraryScreen_Collections_loaded", "Preview_LibraryScreen_Playing", "Preview_LibraryEmptyStateView", "addToCollectionReadId", "createCollectionForReadId", "showCreateCollection", "", "miniPlayerHeight", "headerHeight", "headerVisible", "hasReachedEnd", "menuExpanded", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class LibraryScreenKt {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[LibraryTab.values().length];
            try {
                iArr[LibraryTab.ARCHIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LibraryTab.SAVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LibraryTab.COLLECTIONS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ReadsService.SortBy.values().length];
            try {
                iArr2[ReadsService.SortBy.UpdatedAt.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ReadsService.SortBy.AddedAt.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ReadsService.SortBy.Progress.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[DownloadAction.values().length];
            try {
                iArr3[DownloadAction.START_DOWNLOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[DownloadAction.REMOVE_DOWNLOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[DownloadAction.CANCEL_DOWNLOAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final void ArchiveItem(ReadMeta readMeta, ho.l lVar, ho.l lVar2, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        boolean z10;
        int i12;
        int i13;
        int i14;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1762958261);
        if ((i10 & 6) == 0) {
            if (qVar.h(readMeta)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(lVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(lVar2)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        int i15 = i11;
        boolean z11 = false;
        if ((i15 & 147) != 146) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i15 & 1, z6)) {
            DeleteConfirmationState rememberDeleteConfirmationState = rememberDeleteConfirmationState(qVar, 0);
            if ((i15 & 112) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean h10 = z10 | qVar.h(readMeta);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (h10 || L == eVar) {
                L = new e(lVar, readMeta, 6);
                qVar.h0(L);
            }
            DeleteReadConfirmationDialog(rememberDeleteConfirmationState, (ho.a) L, qVar, 0);
            ActionSpec actionSpec = SwipeToActionBoxKt.actionSpec(c3.k.d(1320692865, true, new d0(lVar, readMeta, rememberDeleteConfirmationState, new ActionConfig(R.drawable.bucket, kj.c.R(qVar, io.elevenlabs.readerapp.R.string.swipe_action_unarchive), ElevenLabsTheme.INSTANCE.getColors(qVar, ElevenLabsTheme.$stable).getUnarchiveActionBg(), true, false, 16, null), createDeleteActionConfig(qVar, 0)), qVar), qVar, 6);
            String title = readMeta.getTitle();
            boolean h11 = qVar.h(readMeta);
            if ((i15 & 896) == 256) {
                z11 = true;
            }
            boolean z12 = h11 | z11;
            Object L2 = qVar.L();
            if (z12 || L2 == eVar) {
                L2 = new e(readMeta, lVar2, 7);
                qVar.h0(L2);
            }
            SwipeToActionBoxKt.SwipeToActionBox(title, null, (ho.a) L2, actionSpec, null, null, c3.k.d(-640289630, true, new g(1, readMeta), qVar), qVar, 1572864, 50);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new k3(i10, 15, lVar, (Object) readMeta, (Object) lVar2);
        }
    }

    public static final sn.z ArchiveItem$lambda$0$0(ho.l lVar, ReadMeta readMeta) {
        lVar.invoke(new i(8, readMeta));
        return sn.z.f31622a;
    }

    public static final sn.z ArchiveItem$lambda$0$0$0(ReadMeta readMeta, LibraryViewModel libraryViewModel) {
        libraryViewModel.getClass();
        libraryViewModel.removeItem(readMeta);
        return sn.z.f31622a;
    }

    public static final sn.z ArchiveItem$lambda$1(ActionConfig actionConfig, final ho.l lVar, ReadMeta readMeta, ActionConfig actionConfig2, final DeleteConfirmationState deleteConfirmationState, ActionSpecBuilder actionSpecBuilder, u2.m mVar, int i10) {
        boolean z6;
        final ActionConfig actionConfig3;
        final ReadMeta readMeta2;
        final ActionConfig actionConfig4;
        boolean h10;
        int i11;
        actionSpecBuilder.getClass();
        if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                h10 = ((u2.q) mVar).f(actionSpecBuilder);
            } else {
                h10 = ((u2.q) mVar).h(actionSpecBuilder);
            }
            if (h10) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 |= i11;
        }
        if ((i10 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            boolean h11 = qVar.h(actionConfig) | qVar.f(lVar) | qVar.h(readMeta) | qVar.h(actionConfig2) | qVar.f(deleteConfirmationState);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (!h11 && L != eVar) {
                actionConfig3 = actionConfig;
                readMeta2 = readMeta;
                actionConfig4 = actionConfig2;
            } else {
                actionConfig3 = actionConfig;
                readMeta2 = readMeta;
                actionConfig4 = actionConfig2;
                ho.l lVar2 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.library.z
                    @Override // ho.l
                    public final Object invoke(Object obj) {
                        sn.z ArchiveItem$lambda$1$0$0;
                        ArchiveItem$lambda$1$0$0 = LibraryScreenKt.ArchiveItem$lambda$1$0$0(actionConfig3, actionConfig4, lVar, readMeta2, deleteConfirmationState, (ActionSpecBuilder.HandlerScope) obj);
                        return ArchiveItem$lambda$1$0$0;
                    }
                };
                qVar.h0(lVar2);
                L = lVar2;
            }
            actionSpecBuilder.handlers((ho.l) L);
            boolean h12 = qVar.h(actionConfig3) | qVar.h(readMeta2) | qVar.h(actionConfig4);
            Object L2 = qVar.L();
            if (h12 || L2 == eVar) {
                L2 = new g0(actionConfig3, readMeta2, actionConfig4, 1);
                qVar.h0(L2);
            }
            actionSpecBuilder.placement((ho.l) L2);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ArchiveItem$lambda$1$0$0(ActionConfig actionConfig, ActionConfig actionConfig2, ho.l lVar, ReadMeta readMeta, DeleteConfirmationState deleteConfirmationState, ActionSpecBuilder.HandlerScope handlerScope) {
        handlerScope.getClass();
        handlerScope.handledBy(actionConfig, new e(lVar, readMeta, 4));
        handlerScope.handledByWithConfirm(actionConfig2, new LibraryScreenKt$ArchiveItem$actionSpec$1$1$1$2(deleteConfirmationState, null));
        return sn.z.f31622a;
    }

    public static final sn.z ArchiveItem$lambda$1$0$0$0(ho.l lVar, ReadMeta readMeta) {
        lVar.invoke(new i(5, readMeta));
        return sn.z.f31622a;
    }

    public static final sn.z ArchiveItem$lambda$1$0$0$0$0(ReadMeta readMeta, LibraryViewModel libraryViewModel) {
        libraryViewModel.getClass();
        libraryViewModel.unarchiveItem(readMeta);
        return sn.z.f31622a;
    }

    public static final sn.z ArchiveItem$lambda$1$1$0(ActionConfig actionConfig, ReadMeta readMeta, ActionConfig actionConfig2, ActionSpecBuilder.PlacementScope placementScope) {
        placementScope.getClass();
        placementScope.setStartSide(ig.f.H(actionConfig));
        if (readMeta.getCanDelete()) {
            placementScope.setEndSide(ig.f.H(actionConfig2));
        }
        return sn.z.f31622a;
    }

    public static final sn.z ArchiveItem$lambda$2$0(ReadMeta readMeta, ho.l lVar) {
        if (ReadMetaKt.isConverted(readMeta)) {
            lVar.invoke(readMeta.getReadId());
        }
        return sn.z.f31622a;
    }

    public static final sn.z ArchiveItem$lambda$3(ReadMeta readMeta, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ReadMetaRowKt.ReadMetaRow(readMeta, l1.n.h(i3.q.f13017a, EchoTheme.INSTANCE.getColors(qVar, EchoTheme.$stable).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable), p3.h0.f26395b), qVar, 0, 0);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ArchiveItem$lambda$4(ReadMeta readMeta, ho.l lVar, ho.l lVar2, int i10, u2.m mVar, int i11) {
        ArchiveItem(readMeta, lVar, lVar2, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    private static final void DeleteReadConfirmationDialog(DeleteConfirmationState deleteConfirmationState, ho.a aVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1013827136);
        if ((i10 & 6) == 0) {
            if (qVar.f(deleteConfirmationState)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(aVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        boolean z12 = true;
        if ((i11 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            if (deleteConfirmationState.isVisible()) {
                qVar.X(-714042176);
                int i14 = i11 & 14;
                if (i14 == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Object L = qVar.L();
                u2.e eVar = u2.l.f33918a;
                if (z10 || L == eVar) {
                    L = new d(deleteConfirmationState, 1);
                    qVar.h0(L);
                }
                ho.a aVar2 = (ho.a) L;
                if ((i11 & 112) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (i14 != 4) {
                    z12 = false;
                }
                boolean z13 = z11 | z12;
                Object L2 = qVar.L();
                if (z13 || L2 == eVar) {
                    L2 = new n(aVar, deleteConfirmationState, 0);
                    qVar.h0(L2);
                }
                ConfirmationDialogKt.ConfirmationDialog(aVar2, (ho.a) L2, kj.c.R(qVar, io.elevenlabs.readerapp.R.string.read_delete_confirmation_title), kj.c.R(qVar, io.elevenlabs.readerapp.R.string.read_delete_confirmation_message), kj.c.R(qVar, io.elevenlabs.readerapp.R.string.read_delete_confirmation_dismiss), kj.c.R(qVar, io.elevenlabs.readerapp.R.string.read_delete_confirmation_confirm), false, qVar, 0, 64);
                qVar.p(false);
            } else {
                qVar.X(-713517470);
                qVar.p(false);
            }
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new q(deleteConfirmationState, aVar, i10, 0);
        }
    }

    public static final sn.z DeleteReadConfirmationDialog$lambda$0$0(DeleteConfirmationState deleteConfirmationState) {
        deleteConfirmationState.onDismiss();
        return sn.z.f31622a;
    }

    public static final sn.z DeleteReadConfirmationDialog$lambda$1$0(ho.a aVar, DeleteConfirmationState deleteConfirmationState) {
        aVar.invoke();
        deleteConfirmationState.onConfirm();
        return sn.z.f31622a;
    }

    public static final sn.z DeleteReadConfirmationDialog$lambda$2(DeleteConfirmationState deleteConfirmationState, ho.a aVar, int i10, u2.m mVar, int i11) {
        DeleteReadConfirmationDialog(deleteConfirmationState, aVar, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void LibraryEmptyStateView(ho.a aVar, ho.a aVar2, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        ho.a aVar3;
        ho.a aVar4;
        int i12;
        int i13;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(860430545);
        if ((i10 & 6) == 0) {
            if (qVar.h(aVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(aVar2)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        int i14 = i11;
        if ((i14 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i14 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            i3.t e10 = p2.e(qVar2, 1.0f);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i15 = ElevenLabsTheme.$stable;
            i3.t I = r1.d.I(r1.d.G(e10, elevenLabsTheme.getSpacings(qVar, i15).m2357getX5D9Ej5fM(), t2.u.P, 2), t2.u.P, elevenLabsTheme.getSpacings(qVar, i15).m2354getX25D9Ej5fM(), t2.u.P, t2.u.P, 13);
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.C0, qVar, 48);
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
            u2.r.J(h4.g.f11907f, a10, qVar);
            u2.r.J(h4.g.f11906e, l4, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c5, qVar);
            l1.n.c(kd.a.M(io.elevenlabs.readerapp.R.drawable.empty_state_notes, qVar, 0), null, p2.p(qVar2, 96, 112), null, null, t2.u.P, null, qVar, u3.c.$stable | 432, 120);
            r1.d.g(p2.f(qVar2, elevenLabsTheme.getSpacings(qVar, i15).m2360getX8D9Ej5fM()), qVar);
            j7.d(kj.c.R(qVar, io.elevenlabs.readerapp.R.string.library_empty_state_title), p2.u(qVar2, t2.u.P, 300, 1), ib.i.w(elevenLabsTheme, qVar, i15), 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i15).getBodySmall500(), qVar, 48, 0, 130040);
            r1.d.g(p2.f(qVar2, elevenLabsTheme.getSpacings(qVar, i15).m2360getX8D9Ej5fM()), qVar);
            String R = kj.c.R(qVar, io.elevenlabs.readerapp.R.string.library_empty_state_import_action);
            FullWidthButtonSize fullWidthButtonSize = FullWidthButtonSize.Large;
            FullWidthButtonKt.FullWidthButton(R, aVar, p2.e(qVar2, 1.0f), fullWidthButtonSize, null, null, false, false, false, qVar, ((i14 << 3) & 112) | 3456, 496);
            ib.i.A(elevenLabsTheme, qVar, i15, qVar2, qVar);
            aVar3 = aVar;
            aVar4 = aVar2;
            FullWidthButtonKt.FullWidthButton(kj.c.R(qVar, io.elevenlabs.readerapp.R.string.library_empty_state_explore_action), aVar4, p2.e(qVar2, 1.0f), fullWidthButtonSize, FullWidthButtonVariant.Border, null, false, false, false, qVar, (i14 & 112) | 28032, 480);
            qVar.p(true);
        } else {
            aVar3 = aVar;
            aVar4 = aVar2;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new q(aVar3, aVar4, i10);
        }
    }

    public static final sn.z LibraryEmptyStateView$lambda$1(ho.a aVar, ho.a aVar2, int i10, u2.m mVar, int i11) {
        LibraryEmptyStateView(aVar, aVar2, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f8  */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LibraryScreen(final ho.p pVar, ho.p pVar2, ho.l lVar, ho.a aVar, ho.a aVar2, ho.a aVar3, ho.p pVar3, j2 j2Var, i1.o oVar, LibraryTab libraryTab, ReadsService.SortBy sortBy, LibraryViewModel libraryViewModel, u2.m mVar, int i10, int i11, int i12) {
        int i13;
        int ordinal;
        int i14;
        int i15;
        int i16;
        LibraryViewModel libraryViewModel2;
        char c5;
        boolean z6;
        ReadsService.SortBy sortBy2;
        LibraryViewModel libraryViewModel3;
        LibraryTab libraryTab2;
        u2.q qVar;
        r1 r10;
        LibraryTab libraryTab3;
        ReadsService.SortBy sortBy3;
        q7.c cVar;
        int i17;
        int i18;
        Object obj;
        u2.q qVar2;
        Object L;
        Object obj2;
        Object L2;
        Object L3;
        String LibraryScreen$lambda$1;
        z0 z0Var;
        int i19;
        z0 z0Var2;
        Object obj3;
        ReadsService.SortBy sortBy4;
        ?? r22;
        z0 z0Var3;
        final LibraryViewModel libraryViewModel4;
        z0 z0Var4;
        String LibraryScreen$lambda$4;
        Object obj4;
        z0 z0Var5;
        boolean h10;
        Object L4;
        boolean z10;
        boolean z11;
        Object L5;
        boolean z12;
        boolean h11;
        Object L6;
        boolean h12;
        Object L7;
        boolean z13;
        boolean z14;
        Object L8;
        Object L9;
        Object L10;
        z0 z0Var6;
        boolean z15;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        pVar.getClass();
        pVar2.getClass();
        lVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        pVar3.getClass();
        u2.q qVar3 = (u2.q) mVar;
        qVar3.Z(-256382586);
        if ((i10 & 6) == 0) {
            if (qVar3.h(pVar)) {
                i29 = 4;
            } else {
                i29 = 2;
            }
            i13 = i29 | i10;
        } else {
            i13 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar3.h(pVar2)) {
                i28 = 32;
            } else {
                i28 = 16;
            }
            i13 |= i28;
        }
        if ((i10 & 384) == 0) {
            if (qVar3.h(lVar)) {
                i27 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i27 = 128;
            }
            i13 |= i27;
        }
        if ((i10 & 3072) == 0) {
            if (qVar3.h(aVar)) {
                i26 = 2048;
            } else {
                i26 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i13 |= i26;
        }
        if ((i10 & 24576) == 0) {
            if (qVar3.h(aVar2)) {
                i25 = 16384;
            } else {
                i25 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i13 |= i25;
        }
        if ((196608 & i10) == 0) {
            if (qVar3.h(aVar3)) {
                i24 = 131072;
            } else {
                i24 = 65536;
            }
            i13 |= i24;
        }
        if ((1572864 & i10) == 0) {
            if (qVar3.h(pVar3)) {
                i23 = 1048576;
            } else {
                i23 = 524288;
            }
            i13 |= i23;
        }
        if ((i10 & 12582912) == 0) {
            if (qVar3.f(j2Var)) {
                i22 = 8388608;
            } else {
                i22 = 4194304;
            }
            i13 |= i22;
        }
        if ((i10 & 100663296) == 0) {
            if (qVar3.h(oVar)) {
                i21 = 67108864;
            } else {
                i21 = 33554432;
            }
            i13 |= i21;
        }
        int i30 = i12 & 512;
        int i31 = -1;
        if (i30 != 0) {
            i13 |= 805306368;
        } else if ((i10 & 805306368) == 0) {
            if (libraryTab == null) {
                ordinal = -1;
            } else {
                ordinal = libraryTab.ordinal();
            }
            if (qVar3.d(ordinal)) {
                i14 = 536870912;
            } else {
                i14 = 268435456;
            }
            i13 |= i14;
        }
        int i32 = i12 & UserMetadata.MAX_ATTRIBUTE_SIZE;
        if (i32 != 0) {
            i15 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            if (sortBy != null) {
                i31 = sortBy.ordinal();
            }
            if (qVar3.d(i31)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i15 = i11 | i16;
        } else {
            i15 = i11;
        }
        if ((i11 & 48) == 0) {
            if ((i12 & 2048) == 0) {
                libraryViewModel2 = libraryViewModel;
                if (qVar3.h(libraryViewModel2)) {
                    i20 = 32;
                    i15 |= i20;
                }
            } else {
                libraryViewModel2 = libraryViewModel;
            }
            i20 = 16;
            i15 |= i20;
        } else {
            libraryViewModel2 = libraryViewModel;
        }
        if ((i13 & 306783379) == 306783378) {
            c5 = 18;
            if ((i15 & 19) == 18) {
                z6 = false;
                if (!qVar3.O(i13 & 1, z6)) {
                    qVar3.T();
                    if ((i10 & 1) != 0 && !qVar3.y()) {
                        qVar3.R();
                        if ((i12 & 2048) != 0) {
                            i15 &= -113;
                        }
                        libraryTab3 = libraryTab;
                        sortBy3 = sortBy;
                    } else {
                        if (i30 != 0) {
                            libraryTab3 = null;
                        } else {
                            libraryTab3 = libraryTab;
                        }
                        if (i32 != 0) {
                            sortBy3 = null;
                        } else {
                            sortBy3 = sortBy;
                        }
                        if ((i12 & 2048) != 0) {
                            androidx.lifecycle.r1 a10 = r7.a.a(qVar3);
                            if (a10 != null) {
                                pl.f o6 = tb.a.o(a10, qVar3);
                                if (a10 instanceof androidx.lifecycle.o) {
                                    cVar = ((androidx.lifecycle.o) a10).getDefaultViewModelCreationExtras();
                                } else {
                                    cVar = q7.a.f28123b;
                                }
                                i17 = i13;
                                i18 = 0;
                                obj = null;
                                j1 j02 = gg.b.j0(kotlin.jvm.internal.e0.f20562a.b(LibraryViewModel.class), a10, null, o6, cVar, qVar3);
                                qVar2 = qVar3;
                                i15 &= -113;
                                libraryViewModel2 = (LibraryViewModel) j02;
                                qVar2.q();
                                LibraryState libraryState = (LibraryState) u2.r.o(libraryViewModel2.getStateFlow(), qVar2, i18).getValue();
                                L = qVar2.L();
                                obj2 = u2.l.f33918a;
                                if (L == obj2) {
                                    L = u2.r.A(obj);
                                    qVar2.h0(L);
                                }
                                z0 z0Var7 = (z0) L;
                                L2 = qVar2.L();
                                if (L2 == obj2) {
                                    L2 = u2.r.A(obj);
                                    qVar2.h0(L2);
                                }
                                z0 z0Var8 = (z0) L2;
                                L3 = qVar2.L();
                                if (L3 == obj2) {
                                    L3 = u2.r.A(Boolean.FALSE);
                                    qVar2.h0(L3);
                                }
                                z0 z0Var9 = (z0) L3;
                                LibraryScreen$lambda$1 = LibraryScreen$lambda$1(z0Var7);
                                if (LibraryScreen$lambda$1 != null) {
                                    qVar2.X(-1440798921);
                                    qVar2.p(false);
                                    i19 = i17;
                                    z0Var3 = z0Var7;
                                    obj3 = obj2;
                                    z0Var2 = z0Var8;
                                    z0Var = z0Var9;
                                    libraryViewModel4 = libraryViewModel2;
                                    r22 = 0;
                                    sortBy4 = sortBy3;
                                } else {
                                    qVar2.X(-1440798920);
                                    Object L11 = qVar2.L();
                                    if (L11 == obj2) {
                                        z0Var = z0Var9;
                                        L11 = new j(z0Var7, 2);
                                        qVar2.h0(L11);
                                    } else {
                                        z0Var = z0Var9;
                                    }
                                    ho.a aVar4 = (ho.a) L11;
                                    boolean f10 = qVar2.f(LibraryScreen$lambda$1);
                                    Object L12 = qVar2.L();
                                    if (f10 || L12 == obj2) {
                                        L12 = new n(LibraryScreen$lambda$1, z0Var8, 3);
                                        qVar2.h0(L12);
                                    }
                                    ho.a aVar5 = (ho.a) L12;
                                    i19 = i17;
                                    z0Var2 = z0Var8;
                                    obj3 = obj2;
                                    sortBy4 = sortBy3;
                                    r22 = 0;
                                    z0Var3 = z0Var7;
                                    libraryViewModel4 = libraryViewModel2;
                                    AddReadToCollectionScreenKt.AddReadToCollectionSheet(LibraryScreen$lambda$1, aVar4, aVar5, null, qVar2, 48, 8);
                                    qVar2.p(false);
                                }
                                if (!LibraryScreen$lambda$7(z0Var)) {
                                    qVar2.X(-1440539853);
                                    Object L13 = qVar2.L();
                                    if (L13 == obj3) {
                                        z0Var6 = z0Var;
                                        L13 = new j(z0Var6, 3);
                                        qVar2.h0(L13);
                                    } else {
                                        z0Var6 = z0Var;
                                    }
                                    ho.a aVar6 = (ho.a) L13;
                                    if ((i19 & 896) == 256) {
                                        z15 = true;
                                    } else {
                                        z15 = r22;
                                    }
                                    Object L14 = qVar2.L();
                                    if (z15 || L14 == obj3) {
                                        L14 = new h0(lVar, z0Var6, 1);
                                        qVar2.h0(L14);
                                    }
                                    z0Var4 = z0Var6;
                                    CreateCollectionSheetKt.CreateCollectionSheet(null, aVar6, (ho.l) L14, null, qVar2, 54, 8);
                                    qVar2.p(r22);
                                } else {
                                    z0Var4 = z0Var;
                                    qVar2.X(-1440254436);
                                    qVar2.p(r22);
                                }
                                LibraryScreen$lambda$4 = LibraryScreen$lambda$4(z0Var2);
                                if (LibraryScreen$lambda$4 != null) {
                                    qVar2.X(-1440211874);
                                    qVar2.p(r22);
                                } else {
                                    qVar2.X(-1440211873);
                                    boolean f11 = qVar2.f(libraryState.getReads()) | qVar2.f(LibraryScreen$lambda$4);
                                    Object L15 = qVar2.L();
                                    if (f11 || L15 == obj3) {
                                        Iterator<T> it = libraryState.getReads().iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                obj4 = it.next();
                                                if (kotlin.jvm.internal.m.c(((ReadMeta) obj4).getReadId(), LibraryScreen$lambda$4)) {
                                                    break;
                                                }
                                            } else {
                                                obj4 = null;
                                                break;
                                            }
                                        }
                                        L15 = (ReadMeta) obj4;
                                        qVar2.h0(L15);
                                    }
                                    ReadMeta readMeta = (ReadMeta) L15;
                                    Object L16 = qVar2.L();
                                    if (L16 == obj3) {
                                        z0Var5 = z0Var2;
                                        L16 = new j(z0Var5, 4);
                                        qVar2.h0(L16);
                                    } else {
                                        z0Var5 = z0Var2;
                                    }
                                    ho.a aVar7 = (ho.a) L16;
                                    Object L17 = qVar2.L();
                                    if (L17 == obj3) {
                                        L17 = new u(z0Var5, 0);
                                        qVar2.h0(L17);
                                    }
                                    CreateCollectionSheetKt.CreateCollectionSheet(readMeta, aVar7, (ho.l) L17, null, qVar2, 432, 8);
                                    qVar2.p(r22);
                                }
                                boolean rememberIsAppInForeground = ComposeExtensionsKt.rememberIsAppInForeground(qVar2, r22);
                                Boolean valueOf = Boolean.valueOf(rememberIsAppInForeground);
                                h10 = qVar2.h(libraryViewModel4) | qVar2.g(rememberIsAppInForeground);
                                L4 = qVar2.L();
                                if (!h10 || L4 == obj3) {
                                    L4 = new LibraryScreenKt$LibraryScreen$5$1(libraryViewModel4, rememberIsAppInForeground, null);
                                    qVar2.h0(L4);
                                }
                                u2.r.f((ho.p) L4, valueOf, qVar2);
                                boolean h13 = qVar2.h(libraryViewModel4);
                                if ((1879048192 & i19) != 536870912) {
                                    z10 = true;
                                } else {
                                    z10 = r22;
                                }
                                z11 = h13 | z10;
                                L5 = qVar2.L();
                                if (!z11 || L5 == obj3) {
                                    L5 = new LibraryScreenKt$LibraryScreen$6$1(libraryViewModel4, libraryTab3, null);
                                    qVar2.h0(L5);
                                }
                                u2.r.f((ho.p) L5, libraryTab3, qVar2);
                                if ((i15 & 14) != 4) {
                                    z12 = true;
                                } else {
                                    z12 = r22;
                                }
                                h11 = qVar2.h(libraryViewModel4) | z12;
                                L6 = qVar2.L();
                                if (!h11 || L6 == obj3) {
                                    L6 = new LibraryScreenKt$LibraryScreen$7$1(sortBy4, libraryViewModel4, null);
                                    qVar2.h0(L6);
                                }
                                u2.r.f((ho.p) L6, sortBy4, qVar2);
                                h12 = qVar2.h(libraryViewModel4);
                                L7 = qVar2.L();
                                if (!h12 || L7 == obj3) {
                                    L7 = new i0(libraryViewModel4, 1);
                                    qVar2.h0(L7);
                                }
                                ho.l lVar2 = (ho.l) L7;
                                boolean h14 = qVar2.h(libraryViewModel4);
                                if ((i19 & 14) != 4) {
                                    z13 = true;
                                } else {
                                    z13 = r22;
                                }
                                z14 = h14 | z13;
                                L8 = qVar2.L();
                                if (!z14 || L8 == obj3) {
                                    L8 = new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.library.v
                                        @Override // ho.p
                                        public final Object invoke(Object obj5, Object obj6) {
                                            sn.z LibraryScreen$lambda$17$0;
                                            LibraryScreen$lambda$17$0 = LibraryScreenKt.LibraryScreen$lambda$17$0(LibraryViewModel.this, pVar, (String) obj5, (Analytics.Event.PlayerActivationSource) obj6);
                                            return LibraryScreen$lambda$17$0;
                                        }
                                    };
                                    qVar2.h0(L8);
                                }
                                ho.p pVar4 = (ho.p) L8;
                                L9 = qVar2.L();
                                if (L9 == obj3) {
                                    L9 = new j(z0Var4, 5);
                                    qVar2.h0(L9);
                                }
                                ho.a aVar8 = (ho.a) L9;
                                L10 = qVar2.L();
                                if (L10 == obj3) {
                                    L10 = new u(z0Var3, 1);
                                    qVar2.h0(L10);
                                }
                                int i33 = i19 << 3;
                                int i34 = i19 << 9;
                                u2.q qVar4 = qVar2;
                                LibraryScreenUI(libraryState, lVar2, pVar4, lVar, aVar, aVar8, (ho.l) L10, aVar2, aVar3, c3.k.d(796039373, true, new k(pVar2, 1), qVar2), pVar3, j2Var, oVar, qVar4, (i33 & 57344) | (i33 & 7168) | 807075840 | (29360128 & i34) | (i34 & 234881024), (i19 >> 18) & 1022, 0);
                                qVar = qVar4;
                                libraryTab2 = libraryTab3;
                                sortBy2 = sortBy4;
                                libraryViewModel3 = libraryViewModel4;
                            } else {
                                c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                return;
                            }
                        }
                    }
                    i17 = i13;
                    i18 = 0;
                    obj = null;
                    qVar2 = qVar3;
                    qVar2.q();
                    LibraryState libraryState2 = (LibraryState) u2.r.o(libraryViewModel2.getStateFlow(), qVar2, i18).getValue();
                    L = qVar2.L();
                    obj2 = u2.l.f33918a;
                    if (L == obj2) {
                    }
                    z0 z0Var72 = (z0) L;
                    L2 = qVar2.L();
                    if (L2 == obj2) {
                    }
                    z0 z0Var82 = (z0) L2;
                    L3 = qVar2.L();
                    if (L3 == obj2) {
                    }
                    z0 z0Var92 = (z0) L3;
                    LibraryScreen$lambda$1 = LibraryScreen$lambda$1(z0Var72);
                    if (LibraryScreen$lambda$1 != null) {
                    }
                    if (!LibraryScreen$lambda$7(z0Var)) {
                    }
                    LibraryScreen$lambda$4 = LibraryScreen$lambda$4(z0Var2);
                    if (LibraryScreen$lambda$4 != null) {
                    }
                    boolean rememberIsAppInForeground2 = ComposeExtensionsKt.rememberIsAppInForeground(qVar2, r22);
                    Boolean valueOf2 = Boolean.valueOf(rememberIsAppInForeground2);
                    h10 = qVar2.h(libraryViewModel4) | qVar2.g(rememberIsAppInForeground2);
                    L4 = qVar2.L();
                    if (!h10) {
                    }
                    L4 = new LibraryScreenKt$LibraryScreen$5$1(libraryViewModel4, rememberIsAppInForeground2, null);
                    qVar2.h0(L4);
                    u2.r.f((ho.p) L4, valueOf2, qVar2);
                    boolean h132 = qVar2.h(libraryViewModel4);
                    if ((1879048192 & i19) != 536870912) {
                    }
                    z11 = h132 | z10;
                    L5 = qVar2.L();
                    if (!z11) {
                    }
                    L5 = new LibraryScreenKt$LibraryScreen$6$1(libraryViewModel4, libraryTab3, null);
                    qVar2.h0(L5);
                    u2.r.f((ho.p) L5, libraryTab3, qVar2);
                    if ((i15 & 14) != 4) {
                    }
                    h11 = qVar2.h(libraryViewModel4) | z12;
                    L6 = qVar2.L();
                    if (!h11) {
                    }
                    L6 = new LibraryScreenKt$LibraryScreen$7$1(sortBy4, libraryViewModel4, null);
                    qVar2.h0(L6);
                    u2.r.f((ho.p) L6, sortBy4, qVar2);
                    h12 = qVar2.h(libraryViewModel4);
                    L7 = qVar2.L();
                    if (!h12) {
                    }
                    L7 = new i0(libraryViewModel4, 1);
                    qVar2.h0(L7);
                    ho.l lVar22 = (ho.l) L7;
                    boolean h142 = qVar2.h(libraryViewModel4);
                    if ((i19 & 14) != 4) {
                    }
                    z14 = h142 | z13;
                    L8 = qVar2.L();
                    if (!z14) {
                    }
                    L8 = new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.library.v
                        @Override // ho.p
                        public final Object invoke(Object obj5, Object obj6) {
                            sn.z LibraryScreen$lambda$17$0;
                            LibraryScreen$lambda$17$0 = LibraryScreenKt.LibraryScreen$lambda$17$0(LibraryViewModel.this, pVar, (String) obj5, (Analytics.Event.PlayerActivationSource) obj6);
                            return LibraryScreen$lambda$17$0;
                        }
                    };
                    qVar2.h0(L8);
                    ho.p pVar42 = (ho.p) L8;
                    L9 = qVar2.L();
                    if (L9 == obj3) {
                    }
                    ho.a aVar82 = (ho.a) L9;
                    L10 = qVar2.L();
                    if (L10 == obj3) {
                    }
                    int i332 = i19 << 3;
                    int i342 = i19 << 9;
                    u2.q qVar42 = qVar2;
                    LibraryScreenUI(libraryState2, lVar22, pVar42, lVar, aVar, aVar82, (ho.l) L10, aVar2, aVar3, c3.k.d(796039373, true, new k(pVar2, 1), qVar2), pVar3, j2Var, oVar, qVar42, (i332 & 57344) | (i332 & 7168) | 807075840 | (29360128 & i342) | (i342 & 234881024), (i19 >> 18) & 1022, 0);
                    qVar = qVar42;
                    libraryTab2 = libraryTab3;
                    sortBy2 = sortBy4;
                    libraryViewModel3 = libraryViewModel4;
                } else {
                    qVar3.R();
                    sortBy2 = sortBy;
                    libraryViewModel3 = libraryViewModel2;
                    libraryTab2 = libraryTab;
                    qVar = qVar3;
                }
                r10 = qVar.r();
                if (r10 == null) {
                    r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.m(pVar, pVar2, lVar, aVar, aVar2, aVar3, pVar3, j2Var, oVar, libraryTab2, sortBy2, libraryViewModel3, i10, i11, i12);
                    return;
                }
                return;
            }
        } else {
            c5 = 18;
        }
        z6 = true;
        if (!qVar3.O(i13 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    private static final String LibraryScreen$lambda$1(z0 z0Var) {
        return (String) z0Var.getValue();
    }

    public static final sn.z LibraryScreen$lambda$10$0(z0 z0Var) {
        LibraryScreen$lambda$8(z0Var, false);
        return sn.z.f31622a;
    }

    public static final sn.z LibraryScreen$lambda$11$0(ho.l lVar, z0 z0Var, String str) {
        str.getClass();
        LibraryScreen$lambda$8(z0Var, false);
        lVar.invoke(str);
        return sn.z.f31622a;
    }

    public static final sn.z LibraryScreen$lambda$12$1$0(z0 z0Var) {
        z0Var.setValue(null);
        return sn.z.f31622a;
    }

    public static final sn.z LibraryScreen$lambda$12$2$0(z0 z0Var, String str) {
        str.getClass();
        z0Var.setValue(null);
        return sn.z.f31622a;
    }

    public static final sn.z LibraryScreen$lambda$16$0(LibraryViewModel libraryViewModel, ho.l lVar) {
        lVar.getClass();
        lVar.invoke(libraryViewModel);
        return sn.z.f31622a;
    }

    public static final sn.z LibraryScreen$lambda$17$0(LibraryViewModel libraryViewModel, ho.p pVar, String str, Analytics.Event.PlayerActivationSource playerActivationSource) {
        str.getClass();
        playerActivationSource.getClass();
        libraryViewModel.getAnalytics().log(Analytics.Event.ClickedMyReadsItem.INSTANCE);
        pVar.invoke(str, playerActivationSource);
        return sn.z.f31622a;
    }

    public static final sn.z LibraryScreen$lambda$18$0(z0 z0Var) {
        LibraryScreen$lambda$8(z0Var, true);
        return sn.z.f31622a;
    }

    public static final sn.z LibraryScreen$lambda$19$0(z0 z0Var, String str) {
        str.getClass();
        z0Var.setValue(str);
        return sn.z.f31622a;
    }

    public static final sn.z LibraryScreen$lambda$20(ho.p pVar, u2.m mVar, int i10) {
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
                L = new i0(pVar, 2);
                qVar.h0(L);
            }
            MiniPlayerKt.m1520MiniPlayerGSIvlCE(t2.u.P, false, 0L, (ho.l) L, null, qVar, 0, 23);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z LibraryScreen$lambda$20$0$0(ho.p pVar, String str) {
        str.getClass();
        pVar.invoke(str, Analytics.Event.PlayerActivationSource.Mini);
        return sn.z.f31622a;
    }

    public static final sn.z LibraryScreen$lambda$21(ho.p pVar, ho.p pVar2, ho.l lVar, ho.a aVar, ho.a aVar2, ho.a aVar3, ho.p pVar3, j2 j2Var, i1.o oVar, LibraryTab libraryTab, ReadsService.SortBy sortBy, LibraryViewModel libraryViewModel, int i10, int i11, int i12, u2.m mVar, int i13) {
        LibraryScreen(pVar, pVar2, lVar, aVar, aVar2, aVar3, pVar3, j2Var, oVar, libraryTab, sortBy, libraryViewModel, mVar, u2.r.M(i10 | 1), u2.r.M(i11), i12);
        return sn.z.f31622a;
    }

    private static final String LibraryScreen$lambda$4(z0 z0Var) {
        return (String) z0Var.getValue();
    }

    private static final boolean LibraryScreen$lambda$7(z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    private static final void LibraryScreen$lambda$8(z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    public static final sn.z LibraryScreen$lambda$9$0$0(z0 z0Var) {
        z0Var.setValue(null);
        return sn.z.f31622a;
    }

    public static final sn.z LibraryScreen$lambda$9$1$0(String str, z0 z0Var) {
        z0Var.setValue(str);
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0196  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void LibraryScreenUI(final LibraryState libraryState, final ho.l lVar, ho.p pVar, ho.l lVar2, ho.a aVar, ho.a aVar2, ho.l lVar3, ho.a aVar3, ho.a aVar4, final ho.p pVar2, final ho.p pVar3, j2 j2Var, i1.o oVar, u2.m mVar, final int i10, final int i11, final int i12) {
        int i13;
        ho.l lVar4;
        ho.p pVar4;
        int i14;
        int i15;
        ho.l lVar5;
        int i16;
        int i17;
        ho.a aVar5;
        int i18;
        int i19;
        ho.a aVar6;
        int i20;
        int i21;
        ho.l lVar6;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        boolean z6;
        u2.q qVar;
        final ho.a aVar7;
        final i1.o oVar2;
        final ho.l lVar7;
        final ho.l lVar8;
        final ho.p pVar5;
        final ho.a aVar8;
        final j2 j2Var2;
        r1 r10;
        final ho.p pVar6;
        final ho.l lVar9;
        final ho.a aVar9;
        int i34;
        final ho.a aVar10;
        final ho.a aVar11;
        final ho.a aVar12;
        final j2 j2Var3;
        final i1.o oVar3;
        int i35;
        int i36;
        int i37;
        int i38;
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(1351614375);
        if ((i10 & 6) == 0) {
            if (qVar2.h(libraryState)) {
                i38 = 4;
            } else {
                i38 = 2;
            }
            i13 = i38 | i10;
        } else {
            i13 = i10;
        }
        if ((i10 & 48) == 0) {
            lVar4 = lVar;
            if (qVar2.h(lVar4)) {
                i37 = 32;
            } else {
                i37 = 16;
            }
            i13 |= i37;
        } else {
            lVar4 = lVar;
        }
        int i39 = i12 & 4;
        if (i39 != 0) {
            i13 |= 384;
        } else if ((i10 & 384) == 0) {
            pVar4 = pVar;
            if (qVar2.h(pVar4)) {
                i14 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i14 = 128;
            }
            i13 |= i14;
            i15 = i12 & 8;
            if (i15 == 0) {
                i13 |= 3072;
            } else if ((i10 & 3072) == 0) {
                lVar5 = lVar2;
                if (qVar2.h(lVar5)) {
                    i16 = 2048;
                } else {
                    i16 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i13 |= i16;
                i17 = i12 & 16;
                if (i17 != 0) {
                    i13 |= 24576;
                } else if ((i10 & 24576) == 0) {
                    aVar5 = aVar;
                    if (qVar2.h(aVar5)) {
                        i18 = 16384;
                    } else {
                        i18 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i13 |= i18;
                    i19 = i12 & 32;
                    if (i19 == 0) {
                        i13 |= 196608;
                        aVar6 = aVar2;
                    } else {
                        aVar6 = aVar2;
                        if ((i10 & 196608) == 0) {
                            if (qVar2.h(aVar6)) {
                                i20 = 131072;
                            } else {
                                i20 = 65536;
                            }
                            i13 |= i20;
                        }
                    }
                    i21 = i12 & 64;
                    if (i21 == 0) {
                        i13 |= 1572864;
                        lVar6 = lVar3;
                    } else {
                        lVar6 = lVar3;
                        if ((i10 & 1572864) == 0) {
                            if (qVar2.h(lVar6)) {
                                i22 = 1048576;
                            } else {
                                i22 = 524288;
                            }
                            i13 |= i22;
                        }
                    }
                    i23 = i12 & 128;
                    if (i23 == 0) {
                        i13 |= 12582912;
                    } else if ((i10 & 12582912) == 0) {
                        if (qVar2.h(aVar3)) {
                            i24 = 8388608;
                        } else {
                            i24 = 4194304;
                        }
                        i13 |= i24;
                    }
                    i25 = i12 & RpcError.MAX_MESSAGE_BYTES;
                    if (i25 == 0) {
                        i13 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        i26 = i25;
                        if (qVar2.h(aVar4)) {
                            i27 = 67108864;
                        } else {
                            i27 = 33554432;
                        }
                        i13 |= i27;
                        if ((i10 & 805306368) == 0) {
                            if (qVar2.h(pVar2)) {
                                i36 = 536870912;
                            } else {
                                i36 = 268435456;
                            }
                            i13 |= i36;
                        }
                        if ((i11 & 6) == 0) {
                            if (qVar2.h(pVar3)) {
                                i35 = 4;
                            } else {
                                i35 = 2;
                            }
                            i28 = i11 | i35;
                        } else {
                            i28 = i11;
                        }
                        i29 = i12 & 2048;
                        if (i29 != 0) {
                            i28 |= 48;
                            i30 = i29;
                        } else if ((i11 & 48) == 0) {
                            i30 = i29;
                            if (qVar2.f(j2Var)) {
                                i31 = 32;
                            } else {
                                i31 = 16;
                            }
                            i28 |= i31;
                        } else {
                            i30 = i29;
                        }
                        int i40 = i28;
                        i32 = i12 & 4096;
                        if (i32 != 0) {
                            i40 |= 384;
                        } else if ((i11 & 384) == 0) {
                            if (qVar2.h(oVar)) {
                                i33 = RpcError.MAX_MESSAGE_BYTES;
                            } else {
                                i33 = 128;
                            }
                            i40 |= i33;
                            if ((i13 & 306783379) != 306783378 && (i40 & 147) == 146) {
                                z6 = false;
                            } else {
                                z6 = true;
                            }
                            if (!qVar2.O(i13 & 1, z6)) {
                                Object obj = u2.l.f33918a;
                                if (i39 != 0) {
                                    Object L = qVar2.L();
                                    if (L == obj) {
                                        L = new b(26);
                                        qVar2.h0(L);
                                    }
                                    pVar6 = (ho.p) L;
                                } else {
                                    pVar6 = pVar4;
                                }
                                if (i15 != 0) {
                                    Object L2 = qVar2.L();
                                    if (L2 == obj) {
                                        L2 = new e0(4);
                                        qVar2.h0(L2);
                                    }
                                    lVar9 = (ho.l) L2;
                                } else {
                                    lVar9 = lVar5;
                                }
                                if (i17 != 0) {
                                    Object L3 = qVar2.L();
                                    if (L3 == obj) {
                                        L3 = new c(2);
                                        qVar2.h0(L3);
                                    }
                                    aVar9 = (ho.a) L3;
                                } else {
                                    aVar9 = aVar5;
                                }
                                if (i19 != 0) {
                                    Object L4 = qVar2.L();
                                    if (L4 == obj) {
                                        L4 = new c(3);
                                        qVar2.h0(L4);
                                    }
                                    int i41 = i26;
                                    aVar10 = (ho.a) L4;
                                    i34 = i41;
                                } else {
                                    i34 = i26;
                                    aVar10 = aVar6;
                                }
                                if (i21 != 0) {
                                    Object L5 = qVar2.L();
                                    if (L5 == obj) {
                                        L5 = new e0(5);
                                        qVar2.h0(L5);
                                    }
                                    lVar6 = (ho.l) L5;
                                }
                                final ho.l lVar10 = lVar6;
                                if (i23 != 0) {
                                    Object L6 = qVar2.L();
                                    if (L6 == obj) {
                                        L6 = new c(4);
                                        qVar2.h0(L6);
                                    }
                                    aVar11 = (ho.a) L6;
                                } else {
                                    aVar11 = aVar3;
                                }
                                if (i34 != 0) {
                                    Object L7 = qVar2.L();
                                    if (L7 == obj) {
                                        L7 = new c(5);
                                        qVar2.h0(L7);
                                    }
                                    aVar12 = (ho.a) L7;
                                } else {
                                    aVar12 = aVar4;
                                }
                                if (i30 != 0) {
                                    j2Var3 = null;
                                } else {
                                    j2Var3 = j2Var;
                                }
                                if (i32 != 0) {
                                    oVar3 = null;
                                } else {
                                    oVar3 = oVar;
                                }
                                long primary = EchoTheme.INSTANCE.getColors(qVar2, EchoTheme.$stable).getBackground().getPrimary(qVar2, EchoThemeColors.Background.$stable);
                                WeakHashMap weakHashMap = c3.f29142x;
                                final ho.l lVar11 = lVar4;
                                aVar7 = aVar12;
                                aVar6 = aVar10;
                                aVar5 = aVar9;
                                qVar = qVar2;
                                k5.a(null, null, pVar3, null, null, 0, primary, 0L, new r1.i0(u0.e(qVar2).f29154l, new o1(u0.e(qVar2).f29154l, 16)), c3.k.d(-909021386, true, new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.library.p
                                    @Override // ho.q
                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                        sn.z LibraryScreenUI$lambda$7$0;
                                        int intValue = ((Integer) obj4).intValue();
                                        LibraryScreenUI$lambda$7$0 = LibraryScreenKt.LibraryScreenUI$lambda$7$0(LibraryState.this, lVar11, aVar11, aVar12, pVar6, lVar10, lVar9, aVar10, j2Var3, oVar3, aVar9, pVar2, (z1) obj2, (u2.m) obj3, intValue);
                                        return LibraryScreenUI$lambda$7$0;
                                    }
                                }, qVar2), qVar, ((i40 << 6) & 896) | 805306368, 187);
                                lVar8 = lVar10;
                                lVar7 = lVar9;
                                aVar8 = aVar11;
                                pVar5 = pVar6;
                                j2Var2 = j2Var3;
                                oVar2 = oVar3;
                            } else {
                                qVar = qVar2;
                                qVar.R();
                                aVar7 = aVar4;
                                oVar2 = oVar;
                                lVar7 = lVar5;
                                lVar8 = lVar6;
                                pVar5 = pVar4;
                                aVar8 = aVar3;
                                j2Var2 = j2Var;
                            }
                            final ho.a aVar13 = aVar5;
                            final ho.a aVar14 = aVar6;
                            r10 = qVar.r();
                            if (r10 == null) {
                                r10.f34012d = new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.library.r
                                    @Override // ho.p
                                    public final Object invoke(Object obj2, Object obj3) {
                                        sn.z LibraryScreenUI$lambda$8;
                                        int intValue = ((Integer) obj3).intValue();
                                        LibraryScreenUI$lambda$8 = LibraryScreenKt.LibraryScreenUI$lambda$8(LibraryState.this, lVar, pVar5, lVar7, aVar13, aVar14, lVar8, aVar8, aVar7, pVar2, pVar3, j2Var2, oVar2, i10, i11, i12, (u2.m) obj2, intValue);
                                        return LibraryScreenUI$lambda$8;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        if ((i13 & 306783379) != 306783378) {
                        }
                        z6 = true;
                        if (!qVar2.O(i13 & 1, z6)) {
                        }
                        final ho.a aVar132 = aVar5;
                        final ho.a aVar142 = aVar6;
                        r10 = qVar.r();
                        if (r10 == null) {
                        }
                    }
                    i26 = i25;
                    if ((i10 & 805306368) == 0) {
                    }
                    if ((i11 & 6) == 0) {
                    }
                    i29 = i12 & 2048;
                    if (i29 != 0) {
                    }
                    int i402 = i28;
                    i32 = i12 & 4096;
                    if (i32 != 0) {
                    }
                    if ((i13 & 306783379) != 306783378) {
                    }
                    z6 = true;
                    if (!qVar2.O(i13 & 1, z6)) {
                    }
                    final ho.a aVar1322 = aVar5;
                    final ho.a aVar1422 = aVar6;
                    r10 = qVar.r();
                    if (r10 == null) {
                    }
                }
                aVar5 = aVar;
                i19 = i12 & 32;
                if (i19 == 0) {
                }
                i21 = i12 & 64;
                if (i21 == 0) {
                }
                i23 = i12 & 128;
                if (i23 == 0) {
                }
                i25 = i12 & RpcError.MAX_MESSAGE_BYTES;
                if (i25 == 0) {
                }
                i26 = i25;
                if ((i10 & 805306368) == 0) {
                }
                if ((i11 & 6) == 0) {
                }
                i29 = i12 & 2048;
                if (i29 != 0) {
                }
                int i4022 = i28;
                i32 = i12 & 4096;
                if (i32 != 0) {
                }
                if ((i13 & 306783379) != 306783378) {
                }
                z6 = true;
                if (!qVar2.O(i13 & 1, z6)) {
                }
                final ho.a aVar13222 = aVar5;
                final ho.a aVar14222 = aVar6;
                r10 = qVar.r();
                if (r10 == null) {
                }
            }
            lVar5 = lVar2;
            i17 = i12 & 16;
            if (i17 != 0) {
            }
            aVar5 = aVar;
            i19 = i12 & 32;
            if (i19 == 0) {
            }
            i21 = i12 & 64;
            if (i21 == 0) {
            }
            i23 = i12 & 128;
            if (i23 == 0) {
            }
            i25 = i12 & RpcError.MAX_MESSAGE_BYTES;
            if (i25 == 0) {
            }
            i26 = i25;
            if ((i10 & 805306368) == 0) {
            }
            if ((i11 & 6) == 0) {
            }
            i29 = i12 & 2048;
            if (i29 != 0) {
            }
            int i40222 = i28;
            i32 = i12 & 4096;
            if (i32 != 0) {
            }
            if ((i13 & 306783379) != 306783378) {
            }
            z6 = true;
            if (!qVar2.O(i13 & 1, z6)) {
            }
            final ho.a aVar132222 = aVar5;
            final ho.a aVar142222 = aVar6;
            r10 = qVar.r();
            if (r10 == null) {
            }
        }
        pVar4 = pVar;
        i15 = i12 & 8;
        if (i15 == 0) {
        }
        lVar5 = lVar2;
        i17 = i12 & 16;
        if (i17 != 0) {
        }
        aVar5 = aVar;
        i19 = i12 & 32;
        if (i19 == 0) {
        }
        i21 = i12 & 64;
        if (i21 == 0) {
        }
        i23 = i12 & 128;
        if (i23 == 0) {
        }
        i25 = i12 & RpcError.MAX_MESSAGE_BYTES;
        if (i25 == 0) {
        }
        i26 = i25;
        if ((i10 & 805306368) == 0) {
        }
        if ((i11 & 6) == 0) {
        }
        i29 = i12 & 2048;
        if (i29 != 0) {
        }
        int i402222 = i28;
        i32 = i12 & 4096;
        if (i32 != 0) {
        }
        if ((i13 & 306783379) != 306783378) {
        }
        z6 = true;
        if (!qVar2.O(i13 & 1, z6)) {
        }
        final ho.a aVar1322222 = aVar5;
        final ho.a aVar1422222 = aVar6;
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z LibraryScreenUI$lambda$0$0(String str, Analytics.Event.PlayerActivationSource playerActivationSource) {
        str.getClass();
        playerActivationSource.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z LibraryScreenUI$lambda$1$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z LibraryScreenUI$lambda$4$0(String str) {
        str.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z LibraryScreenUI$lambda$7$0(LibraryState libraryState, ho.l lVar, ho.a aVar, ho.a aVar2, ho.p pVar, ho.l lVar2, ho.l lVar3, ho.a aVar3, j2 j2Var, i1.o oVar, ho.a aVar4, ho.p pVar2, z1 z1Var, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        i3.q qVar;
        z0 z0Var;
        u2.q qVar2;
        u2.e eVar;
        i3.l lVar4;
        b4.d dVar;
        z1 z1Var2;
        boolean z10;
        Object b0Var;
        z0 z0Var2;
        i3.q qVar3;
        x0 x0Var;
        int i12;
        i3.l lVar5 = i3.d.f12997a;
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
        u2.q qVar4 = (u2.q) mVar;
        if (qVar4.O(i11 & 1, z6)) {
            Object L = qVar4.L();
            u2.e eVar2 = u2.l.f33918a;
            if (L == eVar2) {
                L = com.google.android.gms.internal.play_billing.b.t(0, qVar4);
            }
            x0 x0Var2 = (x0) L;
            float rememberPxToDp = ComposeExtensionsKt.rememberPxToDp(LibraryScreenUI$lambda$7$0$1(x0Var2), (u2.m) qVar4, 0);
            Object[] objArr = new Object[0];
            Object L2 = qVar4.L();
            if (L2 == eVar2) {
                L2 = new c(6);
                qVar4.h0(L2);
            }
            x0 x0Var3 = (x0) f3.m.e(objArr, (ho.a) L2, qVar4, 48);
            float rememberPxToDp2 = ComposeExtensionsKt.rememberPxToDp(LibraryScreenUI$lambda$7$0$4(x0Var3), (u2.m) qVar4, 0);
            Object L3 = qVar4.L();
            if (L3 == eVar2) {
                L3 = u2.r.A(Boolean.TRUE);
                qVar4.h0(L3);
            }
            z0 z0Var3 = (z0) L3;
            Object L4 = qVar4.L();
            if (L4 == eVar2) {
                L4 = new u(z0Var3, 2);
                qVar4.h0(L4);
            }
            b4.a rememberUiVisibilityNestedScrollConnection = AnimatedVisibilityContainersKt.rememberUiVisibilityNestedScrollConnection(null, (ho.l) L4, qVar4, 48, 1);
            i3.q qVar5 = i3.q.f13017a;
            i3.t d10 = p2.d(qVar5, 1.0f);
            f1 d11 = r1.p.d(lVar5, false);
            int i13 = i11;
            int hashCode = Long.hashCode(qVar4.T);
            c3.o l4 = qVar4.l();
            i3.t c5 = i3.a.c(d10, qVar4);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar4.b0();
            x0 x0Var4 = x0Var2;
            if (qVar4.S) {
                qVar4.k(fVar);
            } else {
                qVar4.k0();
            }
            u2.r.J(h4.g.f11907f, d11, qVar4);
            u2.r.J(h4.g.f11906e, l4, qVar4);
            u2.r.y(qVar4, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar4);
            u2.r.J(h4.g.f11905d, c5, qVar4);
            int i14 = WhenMappings.$EnumSwitchMapping$0[libraryState.getActiveTab().ordinal()];
            if (i14 != 1 && i14 != 2) {
                if (i14 == 3) {
                    qVar4.X(743181859);
                    boolean f10 = qVar4.f(libraryState.getCollections());
                    Object L5 = qVar4.L();
                    Object obj = L5;
                    if (f10 || L5 == eVar2) {
                        List<CollectionMeta> collections = libraryState.getCollections();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : collections) {
                            if (((CollectionMeta) obj2).isOwner()) {
                                arrayList.add(obj2);
                            }
                        }
                        qVar4.h0(arrayList);
                        obj = arrayList;
                    }
                    List list = (List) obj;
                    boolean f11 = qVar4.f(libraryState.getCollections());
                    Object L6 = qVar4.L();
                    Object obj3 = L6;
                    if (f11 || L6 == eVar2) {
                        List<CollectionMeta> collections2 = libraryState.getCollections();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj4 : collections2) {
                            if (!((CollectionMeta) obj4).isOwner()) {
                                arrayList2.add(obj4);
                            }
                        }
                        qVar4.h0(arrayList2);
                        obj3 = arrayList2;
                    }
                    List list2 = (List) obj3;
                    i3.t a10 = b4.f.a(p2.d(qVar5, 1.0f), rememberUiVisibilityNestedScrollConnection, null);
                    boolean c10 = qVar4.c(rememberPxToDp2) | qVar4.f(lVar) | qVar4.h(libraryState) | qVar4.h(list) | qVar4.f(lVar3) | qVar4.f(aVar3) | qVar4.h(list2) | qVar4.c(rememberPxToDp);
                    Object L7 = qVar4.L();
                    if (!c10 && L7 != eVar2) {
                        qVar3 = qVar5;
                        b0Var = L7;
                        x0Var = x0Var4;
                        z0Var2 = z0Var3;
                    } else {
                        z0Var2 = z0Var3;
                        qVar3 = qVar5;
                        x0Var = x0Var4;
                        b0Var = new b0(libraryState, list, lVar3, aVar3, list2, rememberPxToDp2, lVar, rememberPxToDp);
                        qVar4.h0(b0Var);
                    }
                    qVar2 = qVar4;
                    x0Var4 = x0Var;
                    z0Var = z0Var2;
                    qVar = qVar3;
                    eVar = eVar2;
                    lVar4 = lVar5;
                    c1.c(a10, null, z1Var, false, null, null, null, false, null, (ho.l) b0Var, qVar2, (i13 << 6) & 896, 506);
                    qVar2.p(false);
                    z1Var2 = z1Var;
                    z10 = false;
                } else {
                    throw com.google.android.gms.internal.play_billing.b.h(-1361694344, qVar4, false);
                }
            } else {
                qVar = qVar5;
                z0Var = z0Var3;
                qVar2 = qVar4;
                eVar = eVar2;
                lVar4 = lVar5;
                qVar2.X(737159024);
                t1.z a11 = t1.b0.a(0, qVar2, 3);
                Object L8 = qVar2.L();
                if (L8 == eVar) {
                    L8 = u2.r.s(new d(a11, 2));
                    qVar2.h0(L8);
                }
                s2 s2Var = (s2) L8;
                Boolean valueOf = Boolean.valueOf(LibraryScreenUI$lambda$7$0$10$1(s2Var));
                boolean f12 = qVar2.f(lVar);
                Object L9 = qVar2.L();
                if (f12 || L9 == eVar) {
                    L9 = new LibraryScreenKt$LibraryScreenUI$8$1$1$1$1(lVar, s2Var, null);
                    qVar2.h0(L9);
                }
                u2.r.f((ho.p) L9, valueOf, qVar2);
                ReadsService.SortBy sortBy = libraryState.getSortBy();
                boolean f13 = qVar2.f(a11);
                Object L10 = qVar2.L();
                if (!f13 && L10 != eVar) {
                    dVar = null;
                } else {
                    dVar = null;
                    L10 = new LibraryScreenKt$LibraryScreenUI$8$1$1$2$1(a11, null);
                    qVar2.h0(L10);
                }
                u2.r.f((ho.p) L10, sortBy, qVar2);
                i3.t a12 = b4.f.a(p2.d(qVar, 1.0f), rememberUiVisibilityNestedScrollConnection, dVar);
                boolean c11 = qVar2.c(rememberPxToDp2) | qVar2.f(lVar) | qVar2.h(libraryState) | qVar2.f(aVar) | qVar2.f(aVar2) | qVar2.f(pVar) | qVar2.f(lVar2) | qVar2.c(rememberPxToDp);
                Object L11 = qVar2.L();
                if (c11 || L11 == eVar) {
                    b0 b0Var2 = new b0(libraryState, rememberPxToDp2, lVar, aVar, aVar2, pVar, lVar2, rememberPxToDp);
                    qVar2.h0(b0Var2);
                    L11 = b0Var2;
                }
                c1.c(a12, a11, z1Var, false, null, null, null, false, null, (ho.l) L11, qVar2, (i13 << 6) & 896, 504);
                z1Var2 = z1Var;
                z10 = false;
                qVar2.p(false);
            }
            AnimatedVisibilityContainersKt.AnimatedSlideTopVisibility(LibraryScreenUI$lambda$7$0$7(z0Var), c3.k.d(-976434263, true, new id.l(x0Var3, j2Var, oVar, aVar4, libraryState, lVar), qVar2), qVar2, 48);
            i3.t D = r1.d.D(p2.d(qVar, 1.0f), z1Var2);
            f1 d12 = r1.p.d(i3.d.Z, z10);
            int hashCode2 = Long.hashCode(qVar2.T);
            c3.o l7 = qVar2.l();
            i3.t c12 = i3.a.c(D, qVar2);
            h4.h.f11920i.getClass();
            h4.f fVar2 = h4.g.f11903b;
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar2);
            } else {
                qVar2.k0();
            }
            h4.e eVar3 = h4.g.f11907f;
            u2.r.J(eVar3, d12, qVar2);
            h4.e eVar4 = h4.g.f11906e;
            u2.r.J(eVar4, l7, qVar2);
            Integer valueOf2 = Integer.valueOf(hashCode2);
            h4.e eVar5 = h4.g.f11908g;
            u2.r.y(qVar2, valueOf2, eVar5);
            h4.d dVar2 = h4.g.f11909h;
            u2.r.F(dVar2, qVar2);
            h4.e eVar6 = h4.g.f11905d;
            u2.r.J(eVar6, c12, qVar2);
            i3.t e10 = p2.e(qVar, 1.0f);
            Object L12 = qVar2.L();
            if (L12 == eVar) {
                L12 = new x(x0Var4, 1);
                qVar2.h0(L12);
            }
            i3.t q = f4.i0.q(e10, (ho.l) L12);
            f1 d13 = r1.p.d(lVar4, false);
            int hashCode3 = Long.hashCode(qVar2.T);
            c3.o l10 = qVar2.l();
            i3.t c13 = i3.a.c(q, qVar2);
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar2);
            } else {
                qVar2.k0();
            }
            u2.r.J(eVar3, d13, qVar2);
            u2.r.J(eVar4, l10, qVar2);
            defpackage.f.u(hashCode3, qVar2, eVar5, qVar2, dVar2);
            u2.r.J(eVar6, c13, qVar2);
            j0.c.r(0, pVar2, qVar2, true, true);
            qVar2.p(true);
        } else {
            qVar4.R();
        }
        return sn.z.f31622a;
    }

    private static final int LibraryScreenUI$lambda$7$0$1(x0 x0Var) {
        return ((u2.f1) x0Var).h();
    }

    public static final boolean LibraryScreenUI$lambda$7$0$10$1(s2 s2Var) {
        return ((Boolean) s2Var.getValue()).booleanValue();
    }

    public static final sn.z LibraryScreenUI$lambda$7$0$10$4$0(final LibraryState libraryState, float f10, final ho.l lVar, final ho.a aVar, final ho.a aVar2, final ho.p pVar, final ho.l lVar2, float f11, t1.t tVar) {
        tVar.getClass();
        t1.t.c(tVar, null, null, new c3.j(new io.elevenlabs.readerapp.ui.screens.authenticated.explore.g(f10, 6), true, 167750531), 3);
        t1.t.c(tVar, null, null, new c3.j(new f(lVar, libraryState, 3), true, 1978659052), 3);
        if (libraryState.getReadsSyncStatus() == SyncStatus.SYNCING && libraryState.getReads().isEmpty()) {
            t1.t.c(tVar, null, null, ComposableSingletons$LibraryScreenKt.INSTANCE.getLambda$888661064$app_productionRelease(), 3);
        }
        if (libraryState.getReads().isEmpty()) {
            if (libraryState.getReadsSyncStatus() == SyncStatus.READY) {
                t1.t.c(tVar, null, null, new c3.j(new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.library.m
                    @Override // ho.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        sn.z LibraryScreenUI$lambda$7$0$10$4$0$2;
                        int intValue = ((Integer) obj3).intValue();
                        LibraryScreenUI$lambda$7$0$10$4$0$2 = LibraryScreenKt.LibraryScreenUI$lambda$7$0$10$4$0$2(LibraryState.this, aVar, aVar2, (t1.b) obj, (u2.m) obj2, intValue);
                        return LibraryScreenUI$lambda$7$0$10$4$0$2;
                    }
                }, true, 1861567926), 3);
            } else if (libraryState.getReadsSyncStatus() == SyncStatus.ERROR) {
                t1.t.c(tVar, null, null, ComposableSingletons$LibraryScreenKt.INSTANCE.m1457getLambda$812062483$app_productionRelease(), 3);
            }
        } else {
            final List<ReadMeta> reads = libraryState.getReads();
            final e0 e0Var = new e0(2);
            final LibraryScreenKt$LibraryScreenUI$lambda$7$0$10$4$0$$inlined$items$default$1 libraryScreenKt$LibraryScreenUI$lambda$7$0$10$4$0$$inlined$items$default$1 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryScreenKt$LibraryScreenUI$lambda$7$0$10$4$0$$inlined$items$default$1
                @Override // ho.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((ReadMeta) obj);
                }

                @Override // ho.l
                public final Void invoke(ReadMeta readMeta) {
                    return null;
                }
            };
            ((t1.i) tVar).u(reads.size(), new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryScreenKt$LibraryScreenUI$lambda$7$0$10$4$0$$inlined$items$default$2
                public final Object invoke(int i10) {
                    return ho.l.this.invoke(reads.get(i10));
                }

                @Override // ho.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }
            }, new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryScreenKt$LibraryScreenUI$lambda$7$0$10$4$0$$inlined$items$default$3
                public final Object invoke(int i10) {
                    return ho.l.this.invoke(reads.get(i10));
                }

                @Override // ho.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }
            }, new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryScreenKt$LibraryScreenUI$lambda$7$0$10$4$0$$inlined$items$default$4
                public final void invoke(t1.b bVar, int i10, u2.m mVar, int i11) {
                    int i12;
                    boolean z6;
                    boolean z10;
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
                        ReadMeta readMeta = (ReadMeta) reads.get(i10);
                        qVar.X(-1318459964);
                        boolean f12 = qVar.f(libraryState.getPlayerQueue()) | qVar.f(readMeta);
                        Object L = qVar.L();
                        u2.e eVar = u2.l.f33918a;
                        if (f12 || L == eVar) {
                            List<MediaItemState> playerQueue = libraryState.getPlayerQueue();
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
                        h4.f fVar = h4.g.f11903b;
                        qVar.b0();
                        if (qVar.S) {
                            qVar.k(fVar);
                        } else {
                            qVar.k0();
                        }
                        u2.r.J(h4.g.f11907f, a11, qVar);
                        u2.r.J(h4.g.f11906e, l4, qVar);
                        u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
                        u2.r.F(h4.g.f11909h, qVar);
                        u2.r.J(h4.g.f11905d, c5, qVar);
                        int i15 = LibraryScreenKt.WhenMappings.$EnumSwitchMapping$0[libraryState.getActiveTab().ordinal()];
                        if (i15 != 1) {
                            if (i15 == 2) {
                                qVar.X(1163804692);
                                ho.l lVar3 = lVar;
                                boolean f13 = qVar.f(pVar);
                                Object L2 = qVar.L();
                                if (f13 || L2 == eVar) {
                                    final ho.p pVar2 = pVar;
                                    L2 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryScreenKt$LibraryScreenUI$8$1$1$3$1$5$1$2$1
                                        public final void invoke(String str) {
                                            str.getClass();
                                            ho.p.this.invoke(str, Analytics.Event.PlayerActivationSource.LibrarySaved);
                                        }

                                        @Override // ho.l
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                            invoke((String) obj);
                                            return sn.z.f31622a;
                                        }
                                    };
                                    qVar.h0(L2);
                                }
                                LibraryScreenKt.SavedItem(readMeta, booleanValue, lVar3, (ho.l) L2, lVar2, qVar, 0);
                                qVar = qVar;
                                qVar.p(false);
                            } else {
                                throw com.google.android.gms.internal.play_billing.b.h(-793769330, qVar, false);
                            }
                        } else {
                            qVar.X(1163009976);
                            ho.l lVar4 = lVar;
                            boolean f14 = qVar.f(pVar);
                            Object L3 = qVar.L();
                            if (f14 || L3 == eVar) {
                                final ho.p pVar3 = pVar;
                                L3 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryScreenKt$LibraryScreenUI$8$1$1$3$1$5$1$1$1
                                    public final void invoke(String str) {
                                        str.getClass();
                                        ho.p.this.invoke(str, Analytics.Event.PlayerActivationSource.LibraryArchived);
                                    }

                                    @Override // ho.l
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        invoke((String) obj);
                                        return sn.z.f31622a;
                                    }
                                };
                                qVar.h0(L3);
                            }
                            LibraryScreenKt.ArchiveItem(readMeta, lVar4, (ho.l) L3, qVar, 0);
                            qVar.p(false);
                        }
                        DividerKt.m1827DivideriJQMabo(p2.e(qVar2, 1.0f), ElevenLabsTheme.INSTANCE.getColor(qVar, ElevenLabsTheme.$stable).getDivider().m2058getLightLine0d7_KjU(), qVar, 6, 0);
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
            t1.t.c(tVar, null, null, new c3.j(new io.elevenlabs.readerapp.ui.screens.authenticated.explore.g(f11, 7), true, -2035814200), 3);
        }
        return sn.z.f31622a;
    }

    public static final sn.z LibraryScreenUI$lambda$7$0$10$4$0$0(float f10, t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            r1.d.g(r1.d.I(i3.q.f13017a, t2.u.P, f10, t2.u.P, t2.u.P, 13), qVar);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z LibraryScreenUI$lambda$7$0$10$4$0$1(ho.l lVar, LibraryState libraryState, t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            Tabs(lVar, libraryState, qVar, 0);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z LibraryScreenUI$lambda$7$0$10$4$0$2(LibraryState libraryState, ho.a aVar, ho.a aVar2, t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            if (libraryState.getActiveTab() == LibraryTab.SAVED) {
                qVar.X(1352456809);
                boolean f10 = qVar.f(aVar);
                Object L = qVar.L();
                u2.e eVar = u2.l.f33918a;
                if (f10 || L == eVar) {
                    L = new s(1, aVar);
                    qVar.h0(L);
                }
                ho.a aVar3 = (ho.a) L;
                boolean f11 = qVar.f(aVar2);
                Object L2 = qVar.L();
                if (f11 || L2 == eVar) {
                    L2 = new s(2, aVar2);
                    qVar.h0(L2);
                }
                LibraryEmptyStateView(aVar3, (ho.a) L2, qVar, 0);
                qVar.p(false);
            } else {
                qVar.X(1352993047);
                EmptyScreenKt.EmptyScreen(null, kj.c.R(qVar, io.elevenlabs.readerapp.R.string.library_no_reads), qVar, 0, 1);
                qVar.p(false);
            }
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z LibraryScreenUI$lambda$7$0$10$4$0$2$0$0(ho.a aVar) {
        aVar.invoke();
        return sn.z.f31622a;
    }

    public static final sn.z LibraryScreenUI$lambda$7$0$10$4$0$2$1$0(ho.a aVar) {
        aVar.invoke();
        return sn.z.f31622a;
    }

    public static final Object LibraryScreenUI$lambda$7$0$10$4$0$3(ReadMeta readMeta) {
        readMeta.getClass();
        return readMeta.getReadId();
    }

    public static final sn.z LibraryScreenUI$lambda$7$0$10$4$0$5(float f10, t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            r1.d.g(r1.d.I(i3.q.f13017a, t2.u.P, t2.u.P, t2.u.P, f10, 7), qVar);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z LibraryScreenUI$lambda$7$0$10$7$0(LibraryState libraryState, List list, ho.l lVar, ho.a aVar, List list2, float f10, ho.l lVar2, float f11, t1.t tVar) {
        tVar.getClass();
        t1.t.c(tVar, null, null, new c3.j(new io.elevenlabs.readerapp.ui.screens.authenticated.explore.g(f10, 8), true, 200909242), 3);
        t1.t.c(tVar, null, null, new c3.j(new f(lVar2, libraryState, 4), true, 1022243043), 3);
        if (libraryState.getCollections().isEmpty()) {
            if (libraryState.getCollectionsSyncStatus() == SyncStatus.SYNCING) {
                t1.t.c(tVar, null, null, ComposableSingletons$LibraryScreenKt.INSTANCE.getLambda$83818116$app_productionRelease(), 3);
            } else if (libraryState.getCollectionsSyncStatus() == SyncStatus.ERROR) {
                t1.t.c(tVar, null, null, ComposableSingletons$LibraryScreenKt.INSTANCE.getLambda$1705155003$app_productionRelease(), 3);
            }
        }
        userCollections(tVar, list, lVar, aVar);
        typeCollections(tVar, list2, lVar);
        t1.t.c(tVar, null, null, new c3.j(new io.elevenlabs.readerapp.ui.screens.authenticated.explore.g(f11, 9), true, 1895778690), 3);
        return sn.z.f31622a;
    }

    public static final sn.z LibraryScreenUI$lambda$7$0$10$7$0$0(float f10, t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            r1.d.g(r1.d.I(i3.q.f13017a, t2.u.P, f10, t2.u.P, t2.u.P, 13), qVar);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z LibraryScreenUI$lambda$7$0$10$7$0$1(ho.l lVar, LibraryState libraryState, t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            Tabs(lVar, libraryState, qVar, 0);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z LibraryScreenUI$lambda$7$0$10$7$0$2(float f10, t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            r1.d.g(r1.d.I(i3.q.f13017a, t2.u.P, t2.u.P, t2.u.P, f10, 7), qVar);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z LibraryScreenUI$lambda$7$0$10$8(x0 x0Var, j2 j2Var, i1.o oVar, ho.a aVar, LibraryState libraryState, ho.l lVar, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            String R = kj.c.R(qVar, io.elevenlabs.readerapp.R.string.home_library);
            boolean f10 = qVar.f(x0Var);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new x(x0Var, 0);
                qVar.h0(L);
            }
            i3.q qVar2 = i3.q.f13017a;
            HeaderKt.EchoHeader(R, f4.i0.q(qVar2, (ho.l) L), SearchButtonKt.headerTitleSharedElement(qVar2, j2Var, oVar, qVar, 6), c3.k.d(1894201247, true, new d0(j2Var, oVar, aVar, libraryState, lVar), qVar), EchoHeaderStyle.Large, qVar, 27648, 0);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z LibraryScreenUI$lambda$7$0$10$8$0$0(x0 x0Var, h5.l lVar) {
        LibraryScreenUI$lambda$7$0$5(x0Var, (int) (lVar.f12092a & 4294967295L));
        return sn.z.f31622a;
    }

    public static final sn.z LibraryScreenUI$lambda$7$0$10$8$1(j2 j2Var, i1.o oVar, ho.a aVar, LibraryState libraryState, ho.l lVar, l2 l2Var, u2.m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            int i11 = R.drawable.magnifying_glass;
            String R = kj.c.R(qVar, io.elevenlabs.readerapp.R.string.search_accessibility_search);
            ButtonIconVariant buttonIconVariant = ButtonIconVariant.Menu;
            ButtonIconSize buttonIconSize = ButtonIconSize.Medium;
            i3.q qVar2 = i3.q.f13017a;
            ButtonIconKt.ButtonIcon(i11, R, aVar, SearchButtonKt.searchButtonSharedElement(qVar2, j2Var, oVar, qVar, 6), buttonIconVariant, buttonIconSize, false, false, false, qVar, 221184, 448);
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(qVar2, qVar);
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
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = u2.r.A(Boolean.FALSE);
                qVar.h0(L);
            }
            z0 z0Var = (z0) L;
            int i12 = R.drawable.dot_grid_1x3_horizontal;
            String R2 = kj.c.R(qVar, io.elevenlabs.readerapp.R.string.library_accessibility_options);
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new j(z0Var, 0);
                qVar.h0(L2);
            }
            ButtonIconKt.ButtonIcon(i12, R2, (ho.a) L2, null, buttonIconVariant, buttonIconSize, false, false, false, qVar, 221568, 456);
            String R3 = kj.c.R(qVar, io.elevenlabs.readerapp.R.string.library_sort_by);
            boolean LibraryScreenUI$lambda$7$0$10$8$1$0$1 = LibraryScreenUI$lambda$7$0$10$8$1$0$1(z0Var);
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new j(z0Var, 1);
                qVar.h0(L3);
            }
            ho.a aVar2 = (ho.a) L3;
            List H = ig.f.H(c3.k.d(-757279750, true, new k(R3, 0), qVar));
            qVar.X(394416363);
            zn.a entries = ReadsService.SortBy.getEntries();
            ArrayList arrayList = new ArrayList(tn.p.a0(entries, 10));
            Iterator<E> it = entries.iterator();
            while (it.hasNext()) {
                z0 z0Var2 = z0Var;
                arrayList.add(c3.k.d(-35213301, true, new h2.d(5, lVar, (ReadsService.SortBy) it.next(), libraryState, z0Var2), qVar));
                z0Var = z0Var2;
            }
            qVar.p(false);
            MenuKt.m1842MenuILWXrKs(LibraryScreenUI$lambda$7$0$10$8$1$0$1, aVar2, null, 0L, null, tn.o.O0(arrayList, H), qVar, 48, 28);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    private static final boolean LibraryScreenUI$lambda$7$0$10$8$1$0$1(z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    private static final void LibraryScreenUI$lambda$7$0$10$8$1$0$2(z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    public static final sn.z LibraryScreenUI$lambda$7$0$10$8$1$0$3$0(z0 z0Var) {
        LibraryScreenUI$lambda$7$0$10$8$1$0$2(z0Var, true);
        return sn.z.f31622a;
    }

    public static final sn.z LibraryScreenUI$lambda$7$0$10$8$1$0$4$0(z0 z0Var) {
        LibraryScreenUI$lambda$7$0$10$8$1$0$2(z0Var, false);
        return sn.z.f31622a;
    }

    public static final sn.z LibraryScreenUI$lambda$7$0$10$8$1$0$5(String str, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            MenuKt.MenuTitle(str, qVar, 0);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z LibraryScreenUI$lambda$7$0$10$8$1$0$6$0(final ReadsService.SortBy sortBy, LibraryState libraryState, final ho.l lVar, final z0 z0Var, u2.m mVar, int i10) {
        boolean z6;
        String R;
        Integer num;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            int i11 = WhenMappings.$EnumSwitchMapping$1[sortBy.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        qVar.X(519775388);
                        R = kj.c.R(qVar, io.elevenlabs.readerapp.R.string.library_sort_by_progress);
                        qVar.p(false);
                    } else {
                        throw com.google.android.gms.internal.play_billing.b.h(519760248, qVar, false);
                    }
                } else {
                    qVar.X(519770914);
                    R = kj.c.R(qVar, io.elevenlabs.readerapp.R.string.library_sort_by_recently_added);
                    qVar.p(false);
                }
            } else {
                qVar.X(519762931);
                R = kj.c.R(qVar, io.elevenlabs.readerapp.R.string.library_sort_by_recently_listened);
                qVar.p(false);
            }
            String str = R;
            if (libraryState.getSortBy() == sortBy) {
                num = Integer.valueOf(R.drawable.check);
            } else {
                num = null;
            }
            Integer num2 = num;
            boolean f10 = qVar.f(lVar) | qVar.d(sortBy.ordinal());
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.library.w
                    @Override // ho.a
                    public final Object invoke() {
                        sn.z LibraryScreenUI$lambda$7$0$10$8$1$0$6$0$0$0;
                        LibraryScreenUI$lambda$7$0$10$8$1$0$6$0$0$0 = LibraryScreenKt.LibraryScreenUI$lambda$7$0$10$8$1$0$6$0$0$0(ho.l.this, z0Var, sortBy);
                        return LibraryScreenUI$lambda$7$0$10$8$1$0$6$0$0$0;
                    }
                };
                qVar.h0(L);
            }
            MenuKt.MenuItem((ho.a) L, false, str, num2, false, false, qVar, 0, 50);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z LibraryScreenUI$lambda$7$0$10$8$1$0$6$0$0$0(ho.l lVar, z0 z0Var, ReadsService.SortBy sortBy) {
        LibraryScreenUI$lambda$7$0$10$8$1$0$2(z0Var, false);
        lVar.invoke(new t(sortBy, 0));
        return sn.z.f31622a;
    }

    public static final sn.z LibraryScreenUI$lambda$7$0$10$8$1$0$6$0$0$0$0(ReadsService.SortBy sortBy, LibraryViewModel libraryViewModel) {
        libraryViewModel.getClass();
        libraryViewModel.sortBy(sortBy);
        return sn.z.f31622a;
    }

    public static final sn.z LibraryScreenUI$lambda$7$0$10$9$0$0(x0 x0Var, h5.l lVar) {
        LibraryScreenUI$lambda$7$0$2(x0Var, (int) (lVar.f12092a & 4294967295L));
        return sn.z.f31622a;
    }

    private static final void LibraryScreenUI$lambda$7$0$2(x0 x0Var, int i10) {
        ((u2.f1) x0Var).i(i10);
    }

    public static final x0 LibraryScreenUI$lambda$7$0$3$0() {
        return new u2.f1(250);
    }

    private static final int LibraryScreenUI$lambda$7$0$4(x0 x0Var) {
        return ((u2.f1) x0Var).h();
    }

    private static final void LibraryScreenUI$lambda$7$0$5(x0 x0Var, int i10) {
        ((u2.f1) x0Var).i(i10);
    }

    private static final boolean LibraryScreenUI$lambda$7$0$7(z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    private static final void LibraryScreenUI$lambda$7$0$8(z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    public static final sn.z LibraryScreenUI$lambda$7$0$9$0(z0 z0Var, boolean z6) {
        LibraryScreenUI$lambda$7$0$8(z0Var, z6);
        return sn.z.f31622a;
    }

    public static final sn.z LibraryScreenUI$lambda$8(LibraryState libraryState, ho.l lVar, ho.p pVar, ho.l lVar2, ho.a aVar, ho.a aVar2, ho.l lVar3, ho.a aVar3, ho.a aVar4, ho.p pVar2, ho.p pVar3, j2 j2Var, i1.o oVar, int i10, int i11, int i12, u2.m mVar, int i13) {
        LibraryScreenUI(libraryState, lVar, pVar, lVar2, aVar, aVar2, lVar3, aVar3, aVar4, pVar2, pVar3, j2Var, oVar, mVar, u2.r.M(i10 | 1), u2.r.M(i11), i12);
        return sn.z.f31622a;
    }

    public static final void Preview_LibraryEmptyStateView(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1456752088);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$LibraryScreenKt.INSTANCE.m1453getLambda$248336046$app_productionRelease(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.d(i10, 26);
        }
    }

    public static final sn.z Preview_LibraryEmptyStateView$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_LibraryEmptyStateView(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_LibraryScreen_Collections_error(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(681791046);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            List stubReadMetaList$default = ReadsFactoryKt.stubReadMetaList$default(100, null, 2, null);
            LibraryState libraryState = new LibraryState(false, null, false, 0, SyncStatus.READY, stubReadMetaList$default, null, LibraryTab.COLLECTIONS, tn.t.f33547a, SyncStatus.ERROR, false, 1103, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new e0(13);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            ComposableSingletons$LibraryScreenKt composableSingletons$LibraryScreenKt = ComposableSingletons$LibraryScreenKt.INSTANCE;
            LibraryScreenUI(libraryState, lVar, null, null, null, null, null, null, null, composableSingletons$LibraryScreenKt.getLambda$113232991$app_productionRelease(), composableSingletons$LibraryScreenKt.getLambda$241239853$app_productionRelease(), null, null, qVar, 805306416, 6, 6652);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new a0(i10, 2);
        }
    }

    public static final sn.z Preview_LibraryScreen_Collections_error$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_LibraryScreen_Collections_error$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_LibraryScreen_Collections_error(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_LibraryScreen_Collections_loaded(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(516626555);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            List stubReadMetaList$default = ReadsFactoryKt.stubReadMetaList$default(100, null, 2, null);
            SyncStatus syncStatus = SyncStatus.READY;
            LibraryState libraryState = new LibraryState(false, null, false, 0, syncStatus, stubReadMetaList$default, null, LibraryTab.COLLECTIONS, CollectionFactoryKt.stubCollectionsList(), syncStatus, false, 1103, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new e0(12);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            ComposableSingletons$LibraryScreenKt composableSingletons$LibraryScreenKt = ComposableSingletons$LibraryScreenKt.INSTANCE;
            LibraryScreenUI(libraryState, lVar, null, null, null, null, null, null, null, composableSingletons$LibraryScreenKt.getLambda$71196034$app_productionRelease(), composableSingletons$LibraryScreenKt.m1454getLambda$255558540$app_productionRelease(), null, null, qVar, 805306416, 6, 6652);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new a0(i10, 1);
        }
    }

    public static final sn.z Preview_LibraryScreen_Collections_loaded$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_LibraryScreen_Collections_loaded$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_LibraryScreen_Collections_loaded(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_LibraryScreen_Collections_loading(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-331754542);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            List stubReadMetaList$default = ReadsFactoryKt.stubReadMetaList$default(100, null, 2, null);
            LibraryState libraryState = new LibraryState(false, null, false, 0, SyncStatus.READY, stubReadMetaList$default, null, LibraryTab.COLLECTIONS, tn.t.f33547a, SyncStatus.SYNCING, false, 1103, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new e0(15);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            ComposableSingletons$LibraryScreenKt composableSingletons$LibraryScreenKt = ComposableSingletons$LibraryScreenKt.INSTANCE;
            LibraryScreenUI(libraryState, lVar, null, null, null, null, null, null, null, composableSingletons$LibraryScreenKt.m1450getLambda$1255198805$app_productionRelease(), composableSingletons$LibraryScreenKt.getLambda$1500311289$app_productionRelease(), null, null, qVar, 805306416, 6, 6652);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new a0(i10, 3);
        }
    }

    public static final sn.z Preview_LibraryScreen_Collections_loading$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_LibraryScreen_Collections_loading$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_LibraryScreen_Collections_loading(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_LibraryScreen_Empty(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-221866441);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            LibraryState libraryState = new LibraryState(false, null, false, 0, SyncStatus.READY, tn.t.f33547a, null, null, null, null, false, 1999, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new e0(7);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            ComposableSingletons$LibraryScreenKt composableSingletons$LibraryScreenKt = ComposableSingletons$LibraryScreenKt.INSTANCE;
            LibraryScreenUI(libraryState, lVar, null, null, null, null, null, null, null, composableSingletons$LibraryScreenKt.getLambda$803516880$app_productionRelease(), composableSingletons$LibraryScreenKt.getLambda$2111648158$app_productionRelease(), null, null, qVar, 805306416, 6, 6652);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.d(i10, 27);
        }
    }

    public static final sn.z Preview_LibraryScreen_Empty$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_LibraryScreen_Empty$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_LibraryScreen_Empty(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_LibraryScreen_Error(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(117561820);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            LibraryState libraryState = new LibraryState(false, null, false, 0, SyncStatus.ERROR, null, null, null, null, null, false, 2031, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new e0(11);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            ComposableSingletons$LibraryScreenKt composableSingletons$LibraryScreenKt = ComposableSingletons$LibraryScreenKt.INSTANCE;
            LibraryScreenUI(libraryState, lVar, null, null, null, null, null, null, null, composableSingletons$LibraryScreenKt.getLambda$1142945141$app_productionRelease(), composableSingletons$LibraryScreenKt.m1452getLambda$1843890877$app_productionRelease(), null, null, qVar, 805306416, 6, 6652);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new a0(i10, 0);
        }
    }

    public static final sn.z Preview_LibraryScreen_Error$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_LibraryScreen_Error$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_LibraryScreen_Error(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_LibraryScreen_Idle(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1507050634);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            LibraryState libraryState = new LibraryState(false, null, false, 0, null, null, null, null, null, null, false, 2047, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new e0(8);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            ComposableSingletons$LibraryScreenKt composableSingletons$LibraryScreenKt = ComposableSingletons$LibraryScreenKt.INSTANCE;
            LibraryScreenUI(libraryState, lVar, null, null, null, null, null, null, null, composableSingletons$LibraryScreenKt.getLambda$327141565$app_productionRelease(), composableSingletons$LibraryScreenKt.m1458getLambda$877586641$app_productionRelease(), null, null, qVar, 805306416, 6, 6652);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.d(i10, 28);
        }
    }

    public static final sn.z Preview_LibraryScreen_Idle$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_LibraryScreen_Idle$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_LibraryScreen_Idle(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_LibraryScreen_Playing(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1922644170);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            LibraryState libraryState = new LibraryState(false, null, false, 0, SyncStatus.READY, ReadsFactoryKt.stubReadMetaList$default(100, null, 2, null), null, null, null, null, false, 1999, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new e0(1);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            ComposableSingletons$LibraryScreenKt composableSingletons$LibraryScreenKt = ComposableSingletons$LibraryScreenKt.INSTANCE;
            LibraryScreenUI(libraryState, lVar, null, null, null, null, null, null, null, composableSingletons$LibraryScreenKt.m1456getLambda$76783473$app_productionRelease(), composableSingletons$LibraryScreenKt.m1451getLambda$1388043043$app_productionRelease(), null, null, qVar, 805306416, 6, 6652);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.d(i10, 25);
        }
    }

    public static final sn.z Preview_LibraryScreen_Playing$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_LibraryScreen_Playing$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_LibraryScreen_Playing(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_LibraryScreen_Synced(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-298260272);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            LibraryState libraryState = new LibraryState(false, null, false, 0, SyncStatus.READY, ReadsFactoryKt.stubReadMetaList$default(100, null, 2, null), null, null, null, null, false, 1999, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new e0(10);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            ComposableSingletons$LibraryScreenKt composableSingletons$LibraryScreenKt = ComposableSingletons$LibraryScreenKt.INSTANCE;
            LibraryScreenUI(libraryState, lVar, null, null, null, null, null, null, null, composableSingletons$LibraryScreenKt.getLambda$1423851607$app_productionRelease(), composableSingletons$LibraryScreenKt.m1459getLambda$973751735$app_productionRelease(), null, null, qVar, 805306416, 6, 6652);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.d(i10, 29);
        }
    }

    public static final sn.z Preview_LibraryScreen_Synced$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_LibraryScreen_Synced$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_LibraryScreen_Synced(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void SavedItem(final ReadMeta readMeta, boolean z6, final ho.l lVar, ho.l lVar2, ho.l lVar3, u2.m mVar, int i10) {
        int i11;
        final ho.l lVar4;
        boolean z10;
        ReadMeta readMeta2;
        u2.q qVar;
        boolean z11;
        int i12;
        boolean z12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-1522818119);
        if ((i10 & 6) == 0) {
            if (qVar2.h(readMeta)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i11 = i17 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.g(z6)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i11 |= i16;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.h(lVar)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i11 |= i15;
        }
        if ((i10 & 3072) == 0) {
            if (qVar2.h(lVar2)) {
                i14 = 2048;
            } else {
                i14 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i14;
        }
        if ((i10 & 24576) == 0) {
            lVar4 = lVar3;
            if (qVar2.h(lVar4)) {
                i13 = 16384;
            } else {
                i13 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i11 |= i13;
        } else {
            lVar4 = lVar3;
        }
        if ((i11 & 9363) != 9362) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (qVar2.O(i11 & 1, z10)) {
            final DeleteConfirmationState rememberDeleteConfirmationState = rememberDeleteConfirmationState(qVar2, 0);
            if ((i11 & 896) == 256) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean h10 = z11 | qVar2.h(readMeta);
            Object L = qVar2.L();
            u2.e eVar = u2.l.f33918a;
            if (h10 || L == eVar) {
                L = new e(lVar, readMeta, 5);
                qVar2.h0(L);
            }
            DeleteReadConfirmationDialog(rememberDeleteConfirmationState, (ho.a) L, qVar2, 0);
            final DownloadActionHelper createDownloadActionHelper = createDownloadActionHelper(readMeta.getOfflineReadData(), readMeta.isPaid(), qVar2, 0);
            int i18 = R.drawable.playlist_add;
            if (z6) {
                i12 = io.elevenlabs.readerapp.R.string.menu_item_player_remove_from_queue;
            } else {
                i12 = io.elevenlabs.readerapp.R.string.menu_item_player_add_to_queue;
            }
            String R = kj.c.R(qVar2, i12);
            ReaderColors readerColors = ReaderColors.INSTANCE;
            final ActionConfig actionConfig = new ActionConfig(i18, R, readerColors.m2461getTeal6000d7_KjU(), false, false, 24, null);
            final ActionConfig actionConfig2 = new ActionConfig(R.drawable.plus_small, kj.c.R(qVar2, io.elevenlabs.readerapp.R.string.swipe_action_add_to_collection), readerColors.m2395getGreen6000d7_KjU(), false, false, 24, null);
            final ActionConfig actionConfig3 = new ActionConfig(R.drawable.unread, kj.c.R(qVar2, io.elevenlabs.readerapp.R.string.swipe_action_mark_unread), readerColors.m2439getPurple6000d7_KjU(), false, false, 24, null);
            final ActionConfig actionConfig4 = new ActionConfig(R.drawable.bucket, kj.c.R(qVar2, io.elevenlabs.readerapp.R.string.swipe_action_archive), readerColors.m2419getNeutral8000d7_KjU(), true, false, 16, null);
            final ActionConfig createDeleteActionConfig = createDeleteActionConfig(qVar2, 0);
            int i19 = i11;
            ho.q qVar3 = new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.library.c0
                @Override // ho.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    sn.z SavedItem$lambda$1;
                    int intValue = ((Integer) obj3).intValue();
                    SavedItem$lambda$1 = LibraryScreenKt.SavedItem$lambda$1(createDownloadActionHelper, lVar, readMeta, actionConfig2, lVar4, actionConfig3, actionConfig4, actionConfig, createDeleteActionConfig, rememberDeleteConfirmationState, (ActionSpecBuilder) obj, (u2.m) obj2, intValue);
                    return SavedItem$lambda$1;
                }
            };
            readMeta2 = readMeta;
            ActionSpec actionSpec = SwipeToActionBoxKt.actionSpec(c3.k.d(-1156261955, true, qVar3, qVar2), qVar2, 6);
            String title = readMeta2.getTitle();
            boolean h11 = qVar2.h(readMeta2);
            if ((i19 & 7168) == 2048) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z13 = h11 | z12;
            Object L2 = qVar2.L();
            if (z13 || L2 == eVar) {
                L2 = new e(readMeta2, lVar2, 8);
                qVar2.h0(L2);
            }
            qVar = qVar2;
            SwipeToActionBoxKt.SwipeToActionBox(title, null, (ho.a) L2, actionSpec, null, null, c3.k.d(-2054192474, true, new g(0, readMeta2), qVar2), qVar, 1572864, 50);
        } else {
            readMeta2 = readMeta;
            qVar = qVar2;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new r0(readMeta2, z6, lVar, lVar2, lVar3, i10, 3);
        }
    }

    public static final sn.z SavedItem$lambda$0$0(ho.l lVar, ReadMeta readMeta) {
        lVar.invoke(new i(6, readMeta));
        return sn.z.f31622a;
    }

    public static final sn.z SavedItem$lambda$0$0$0(ReadMeta readMeta, LibraryViewModel libraryViewModel) {
        libraryViewModel.getClass();
        libraryViewModel.removeItem(readMeta);
        return sn.z.f31622a;
    }

    public static final sn.z SavedItem$lambda$1(final DownloadActionHelper downloadActionHelper, final ho.l lVar, final ReadMeta readMeta, final ActionConfig actionConfig, final ho.l lVar2, ActionConfig actionConfig2, final ActionConfig actionConfig3, final ActionConfig actionConfig4, ActionConfig actionConfig5, final DeleteConfirmationState deleteConfirmationState, ActionSpecBuilder actionSpecBuilder, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        Object obj;
        final ActionConfig actionConfig6;
        final ActionConfig actionConfig7;
        boolean h10;
        int i12;
        actionSpecBuilder.getClass();
        if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                h10 = ((u2.q) mVar).f(actionSpecBuilder);
            } else {
                h10 = ((u2.q) mVar).h(actionSpecBuilder);
            }
            if (h10) {
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
            boolean h11 = qVar.h(downloadActionHelper) | qVar.f(lVar) | qVar.h(readMeta) | qVar.h(actionConfig) | qVar.f(lVar2) | qVar.h(actionConfig2) | qVar.h(actionConfig3) | qVar.h(actionConfig4) | qVar.h(actionConfig5) | qVar.f(deleteConfirmationState);
            Object L = qVar.L();
            Object obj2 = u2.l.f33918a;
            if (!h11 && L != obj2) {
                obj = L;
                actionConfig6 = actionConfig5;
                actionConfig7 = actionConfig2;
            } else {
                actionConfig6 = actionConfig5;
                actionConfig7 = actionConfig2;
                obj = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.library.y
                    @Override // ho.l
                    public final Object invoke(Object obj3) {
                        sn.z SavedItem$lambda$1$0$0;
                        SavedItem$lambda$1$0$0 = LibraryScreenKt.SavedItem$lambda$1$0$0(downloadActionHelper, actionConfig, actionConfig7, actionConfig3, actionConfig4, actionConfig6, lVar, readMeta, lVar2, deleteConfirmationState, (ActionSpecBuilder.HandlerScope) obj3);
                        return SavedItem$lambda$1$0$0;
                    }
                };
                qVar.h0(obj);
            }
            actionSpecBuilder.handlers((ho.l) obj);
            boolean h12 = qVar.h(downloadActionHelper) | qVar.h(actionConfig4) | qVar.h(actionConfig) | qVar.h(readMeta) | qVar.h(actionConfig7) | qVar.h(actionConfig3) | qVar.h(actionConfig6);
            Object L2 = qVar.L();
            if (h12 || L2 == obj2) {
                Object mVar2 = new id.m(downloadActionHelper, actionConfig4, actionConfig, readMeta, actionConfig7, actionConfig3, actionConfig6, 1);
                qVar.h0(mVar2);
                L2 = mVar2;
            }
            actionSpecBuilder.placement((ho.l) L2);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z SavedItem$lambda$1$0$0(DownloadActionHelper downloadActionHelper, ActionConfig actionConfig, ActionConfig actionConfig2, ActionConfig actionConfig3, ActionConfig actionConfig4, ActionConfig actionConfig5, ho.l lVar, ReadMeta readMeta, ho.l lVar2, DeleteConfirmationState deleteConfirmationState, ActionSpecBuilder.HandlerScope handlerScope) {
        handlerScope.getClass();
        downloadActionHelper.addHandlers(handlerScope, new h0(lVar, readMeta, 3));
        handlerScope.handledBy(actionConfig, new e(lVar2, readMeta, 0));
        handlerScope.handledBy(actionConfig2, new e(lVar, readMeta, 1));
        handlerScope.handledBy(actionConfig3, new e(lVar, readMeta, 2));
        handlerScope.handledBy(actionConfig4, new e(lVar, readMeta, 3));
        handlerScope.handledByWithConfirm(actionConfig5, new LibraryScreenKt$SavedItem$actions$1$1$1$6(deleteConfirmationState, null));
        return sn.z.f31622a;
    }

    public static final sn.z SavedItem$lambda$1$0$0$0(ho.l lVar, ReadMeta readMeta, DownloadAction downloadAction) {
        downloadAction.getClass();
        int i10 = WhenMappings.$EnumSwitchMapping$2[downloadAction.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    lVar.invoke(new i(3, readMeta));
                } else {
                    c6.p();
                    return null;
                }
            } else {
                lVar.invoke(new i(2, readMeta));
            }
        } else {
            lVar.invoke(new i(1, readMeta));
        }
        return sn.z.f31622a;
    }

    public static final sn.z SavedItem$lambda$1$0$0$0$0(ReadMeta readMeta, LibraryViewModel libraryViewModel) {
        libraryViewModel.getClass();
        libraryViewModel.downloadRead(readMeta);
        return sn.z.f31622a;
    }

    public static final sn.z SavedItem$lambda$1$0$0$0$1(ReadMeta readMeta, LibraryViewModel libraryViewModel) {
        libraryViewModel.getClass();
        libraryViewModel.removeDownload(readMeta, false);
        return sn.z.f31622a;
    }

    public static final sn.z SavedItem$lambda$1$0$0$0$2(ReadMeta readMeta, LibraryViewModel libraryViewModel) {
        libraryViewModel.getClass();
        libraryViewModel.removeDownload(readMeta, true);
        return sn.z.f31622a;
    }

    public static final sn.z SavedItem$lambda$1$0$0$1(ho.l lVar, ReadMeta readMeta) {
        lVar.invoke(readMeta.getReadId());
        return sn.z.f31622a;
    }

    public static final sn.z SavedItem$lambda$1$0$0$2(ho.l lVar, ReadMeta readMeta) {
        lVar.invoke(new i(7, readMeta));
        return sn.z.f31622a;
    }

    public static final sn.z SavedItem$lambda$1$0$0$2$0(ReadMeta readMeta, LibraryViewModel libraryViewModel) {
        libraryViewModel.getClass();
        libraryViewModel.markAsUnread(readMeta);
        return sn.z.f31622a;
    }

    public static final sn.z SavedItem$lambda$1$0$0$3(ho.l lVar, ReadMeta readMeta) {
        lVar.invoke(new i(4, readMeta));
        return sn.z.f31622a;
    }

    public static final sn.z SavedItem$lambda$1$0$0$3$0(ReadMeta readMeta, LibraryViewModel libraryViewModel) {
        libraryViewModel.getClass();
        libraryViewModel.archiveItem(readMeta);
        return sn.z.f31622a;
    }

    public static final sn.z SavedItem$lambda$1$0$0$4(ho.l lVar, ReadMeta readMeta) {
        lVar.invoke(new i(0, readMeta));
        return sn.z.f31622a;
    }

    public static final sn.z SavedItem$lambda$1$0$0$4$0(ReadMeta readMeta, LibraryViewModel libraryViewModel) {
        libraryViewModel.getClass();
        libraryViewModel.onClickAddOrRemoveFromQueue(readMeta);
        return sn.z.f31622a;
    }

    public static final sn.z SavedItem$lambda$1$1$0(DownloadActionHelper downloadActionHelper, ActionConfig actionConfig, ActionConfig actionConfig2, ReadMeta readMeta, ActionConfig actionConfig3, ActionConfig actionConfig4, ActionConfig actionConfig5, ActionSpecBuilder.PlacementScope placementScope) {
        placementScope.getClass();
        placementScope.setStartSide(tn.o.O0(ig.f.H(actionConfig), downloadActionHelper.getDownloadActions()));
        un.b o6 = ig.f.o();
        o6.add(actionConfig2);
        if (!readMeta.getMarkedAsUnread()) {
            o6.add(actionConfig3);
        }
        o6.add(actionConfig4);
        placementScope.setEndSide(ig.f.i(o6));
        un.b o10 = ig.f.o();
        o10.addAll(placementScope.getStartSide());
        o10.addAll(placementScope.getEndSide());
        if (readMeta.getCanDelete()) {
            o10.add(actionConfig5);
        }
        placementScope.setLongPress(ig.f.i(o10));
        return sn.z.f31622a;
    }

    public static final sn.z SavedItem$lambda$2$0(ReadMeta readMeta, ho.l lVar) {
        if (ReadMetaKt.isConverted(readMeta)) {
            lVar.invoke(readMeta.getReadId());
        }
        return sn.z.f31622a;
    }

    public static final sn.z SavedItem$lambda$3(ReadMeta readMeta, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ReadMetaRowKt.ReadMetaRow(readMeta, l1.n.h(i3.q.f13017a, EchoTheme.INSTANCE.getColors(qVar, EchoTheme.$stable).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable), p3.h0.f26395b), qVar, 0, 0);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z SavedItem$lambda$4(ReadMeta readMeta, boolean z6, ho.l lVar, ho.l lVar2, ho.l lVar3, int i10, u2.m mVar, int i11) {
        SavedItem(readMeta, z6, lVar, lVar2, lVar3, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    private static final void Tabs(ho.l lVar, LibraryState libraryState, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        int i13;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(823051332);
        if ((i10 & 6) == 0) {
            if (qVar.h(lVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(libraryState)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        boolean z10 = false;
        if ((i11 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i14 = EchoTheme.$stable;
            d2 f10 = r1.d.f(echoTheme.getSpacings(qVar, i14).getX5(), t2.u.P, echoTheme.getSpacings(qVar, i14).getX5(), echoTheme.getSpacings(qVar, i14).getX2(), 2);
            boolean h10 = qVar.h(libraryState);
            if ((i11 & 14) == 4) {
                z10 = true;
            }
            boolean z11 = h10 | z10;
            Object L = qVar.L();
            if (z11 || L == u2.l.f33918a) {
                L = new h0(libraryState, lVar, 2);
                qVar.h0(L);
            }
            ChipGroupKt.ChipGroup(null, f10, (ho.l) L, qVar, 0, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new q(lVar, libraryState, i10, 2);
        }
    }

    public static final sn.z Tabs$lambda$0$0(LibraryState libraryState, ho.l lVar, t1.t tVar) {
        tVar.getClass();
        t1.t.c(tVar, null, null, new c3.j(new f(libraryState, lVar, 0), true, -1152510283), 3);
        t1.t.c(tVar, null, null, new c3.j(new f(libraryState, lVar, 1), true, -1569588130), 3);
        t1.t.c(tVar, null, null, new c3.j(new f(libraryState, lVar, 2), true, 1742385789), 3);
        return sn.z.f31622a;
    }

    public static final sn.z Tabs$lambda$0$0$0(LibraryState libraryState, ho.l lVar, t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        boolean z10;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            String R = kj.c.R(qVar, io.elevenlabs.readerapp.R.string.library_saved_tab);
            if (libraryState.getActiveTab() == LibraryTab.SAVED) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean f10 = qVar.f(lVar);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new h(lVar, 2);
                qVar.h0(L);
            }
            ChipKt.Chip(R, null, z10, null, null, null, (ho.a) L, null, null, qVar, 0, 442);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z Tabs$lambda$0$0$0$0$0(ho.l lVar) {
        lVar.invoke(new e0(6));
        return sn.z.f31622a;
    }

    public static final sn.z Tabs$lambda$0$0$0$0$0$0(LibraryViewModel libraryViewModel) {
        libraryViewModel.getClass();
        libraryViewModel.selectTab(LibraryTab.SAVED);
        return sn.z.f31622a;
    }

    public static final sn.z Tabs$lambda$0$0$1(LibraryState libraryState, ho.l lVar, t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        boolean z10;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            String R = kj.c.R(qVar, io.elevenlabs.readerapp.R.string.library_tab_collections);
            if (libraryState.getActiveTab() == LibraryTab.COLLECTIONS) {
                z10 = true;
            } else {
                z10 = false;
            }
            ChipIconPosition chipIconPosition = ChipIconPosition.Start;
            Integer valueOf = Integer.valueOf(R.drawable.square_grid_circle);
            boolean f10 = qVar.f(lVar);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new h(lVar, 0);
                qVar.h0(L);
            }
            ChipKt.Chip(R, null, z10, valueOf, null, chipIconPosition, (ho.a) L, null, null, qVar, 196608, 402);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z Tabs$lambda$0$0$1$0$0(ho.l lVar) {
        lVar.invoke(new e0(9));
        return sn.z.f31622a;
    }

    public static final sn.z Tabs$lambda$0$0$1$0$0$0(LibraryViewModel libraryViewModel) {
        libraryViewModel.getClass();
        libraryViewModel.selectTab(LibraryTab.COLLECTIONS);
        return sn.z.f31622a;
    }

    public static final sn.z Tabs$lambda$0$0$2(LibraryState libraryState, ho.l lVar, t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        boolean z10;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            String R = kj.c.R(qVar, io.elevenlabs.readerapp.R.string.library_archive_tab_title);
            if (libraryState.getActiveTab() == LibraryTab.ARCHIVE) {
                z10 = true;
            } else {
                z10 = false;
            }
            ChipIconPosition chipIconPosition = ChipIconPosition.Start;
            Integer valueOf = Integer.valueOf(R.drawable.history);
            boolean f10 = qVar.f(lVar);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new h(lVar, 1);
                qVar.h0(L);
            }
            ChipKt.Chip(R, null, z10, valueOf, null, chipIconPosition, (ho.a) L, null, null, qVar, 196608, 402);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z Tabs$lambda$0$0$2$0$0(ho.l lVar) {
        lVar.invoke(new e0(14));
        return sn.z.f31622a;
    }

    public static final sn.z Tabs$lambda$0$0$2$0$0$0(LibraryViewModel libraryViewModel) {
        libraryViewModel.getClass();
        libraryViewModel.selectTab(LibraryTab.ARCHIVE);
        return sn.z.f31622a;
    }

    public static final sn.z Tabs$lambda$1(ho.l lVar, LibraryState libraryState, int i10, u2.m mVar, int i11) {
        Tabs(lVar, libraryState, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    private static final ActionConfig createDeleteActionConfig(u2.m mVar, int i10) {
        return new ActionConfig(R.drawable.trash_can, kj.c.R(mVar, io.elevenlabs.readerapp.R.string.swipe_action_delete), ElevenLabsTheme.INSTANCE.getColor(mVar, ElevenLabsTheme.$stable).getButtonBackground().m2015getDangerConfirm0d7_KjU(), true, true, null);
    }

    public static final DownloadActionHelper createDownloadActionHelper(OfflineReadData offlineReadData, boolean z6, u2.m mVar, int i10) {
        boolean z10;
        String R = kj.c.R(mVar, io.elevenlabs.readerapp.R.string.swipe_action_download);
        String R2 = kj.c.R(mVar, io.elevenlabs.readerapp.R.string.swipe_action_cancel_download);
        String R3 = kj.c.R(mVar, io.elevenlabs.readerapp.R.string.swipe_action_remove_download);
        u2.q qVar = (u2.q) mVar;
        boolean f10 = qVar.f(offlineReadData);
        if ((((i10 & 112) ^ 48) > 32 && qVar.g(z6)) || (i10 & 48) == 32) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = z10 | f10;
        Object L = qVar.L();
        if (z11 || L == u2.l.f33918a) {
            DownloadActionHelper downloadActionHelper = new DownloadActionHelper(R, R2, R3, offlineReadData, z6);
            qVar.h0(downloadActionHelper);
            L = downloadActionHelper;
        }
        return (DownloadActionHelper) L;
    }

    public static final CollectionMeta downloadsCollection(String str) {
        str.getClass();
        return new CollectionMeta("downloads", str, null, null, null, false, null, null, null, null, true, null);
    }

    private static final DeleteConfirmationState rememberDeleteConfirmationState(u2.m mVar, int i10) {
        u2.q qVar = (u2.q) mVar;
        Object L = qVar.L();
        if (L == u2.l.f33918a) {
            L = new DeleteConfirmationState();
            qVar.h0(L);
        }
        return (DeleteConfirmationState) L;
    }

    private static final void typeCollections(t1.t tVar, final List<CollectionMeta> list, final ho.l lVar) {
        if (!list.isEmpty()) {
            t1.t.c(tVar, null, null, ComposableSingletons$LibraryScreenKt.INSTANCE.m1455getLambda$639561867$app_productionRelease(), 3);
            final e0 e0Var = new e0(16);
            final LibraryScreenKt$typeCollections$$inlined$items$default$1 libraryScreenKt$typeCollections$$inlined$items$default$1 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryScreenKt$typeCollections$$inlined$items$default$1
                @Override // ho.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((CollectionMeta) obj);
                }

                @Override // ho.l
                public final Void invoke(CollectionMeta collectionMeta) {
                    return null;
                }
            };
            ((t1.i) tVar).u(list.size(), new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryScreenKt$typeCollections$$inlined$items$default$2
                public final Object invoke(int i10) {
                    return ho.l.this.invoke(list.get(i10));
                }

                @Override // ho.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }
            }, new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryScreenKt$typeCollections$$inlined$items$default$3
                public final Object invoke(int i10) {
                    return ho.l.this.invoke(list.get(i10));
                }

                @Override // ho.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }
            }, new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryScreenKt$typeCollections$$inlined$items$default$4
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
                        final CollectionMeta collectionMeta = (CollectionMeta) list.get(i10);
                        qVar.X(406815051);
                        String title = collectionMeta.getTitle();
                        boolean f10 = qVar.f(lVar) | qVar.h(collectionMeta);
                        Object L = qVar.L();
                        if (f10 || L == u2.l.f33918a) {
                            final ho.l lVar2 = lVar;
                            L = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryScreenKt$typeCollections$2$1$1
                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m1465invoke() {
                                    ho.l.this.invoke(collectionMeta.getId());
                                }

                                @Override // ho.a
                                public /* bridge */ /* synthetic */ Object invoke() {
                                    m1465invoke();
                                    return sn.z.f31622a;
                                }
                            };
                            qVar.h0(L);
                        }
                        ButtonContainerKt.m1780ButtonContainer83mGB3Q(title, (ho.a) L, null, 0L, false, 0, null, false, null, c3.k.d(964560932, true, new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryScreenKt$typeCollections$2$2
                            public final void invoke(r1.s sVar, u2.m mVar2, int i15) {
                                boolean z10;
                                sVar.getClass();
                                if ((i15 & 17) != 16) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                u2.q qVar2 = (u2.q) mVar2;
                                if (qVar2.O(i15 & 1, z10)) {
                                    CollectionMetaSmallRowKt.CollectionMetaSmallRow(CollectionMeta.this, false, qVar2, 0, 2);
                                } else {
                                    qVar2.R();
                                }
                            }

                            @Override // ho.q
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                invoke((r1.s) obj, (u2.m) obj2, ((Number) obj3).intValue());
                                return sn.z.f31622a;
                            }
                        }, qVar), qVar, 805306368, 508);
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
        }
    }

    public static final Object typeCollections$lambda$0(CollectionMeta collectionMeta) {
        collectionMeta.getClass();
        return collectionMeta.getId();
    }

    private static final void userCollections(t1.t tVar, List<CollectionMeta> list, final ho.l lVar, ho.a aVar) {
        Object obj;
        Iterator<T> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (CollectionMetaKt.isReadLater((CollectionMeta) obj)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        CollectionMeta collectionMeta = (CollectionMeta) obj;
        final ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!CollectionMetaKt.isReadLater((CollectionMeta) obj2)) {
                arrayList.add(obj2);
            }
        }
        t1.t.c(tVar, null, null, ComposableSingletons$LibraryScreenKt.INSTANCE.getLambda$734144205$app_productionRelease(), 3);
        if (collectionMeta != null) {
            t1.t.c(tVar, collectionMeta.getId(), null, new c3.j(new l(lVar, collectionMeta), true, -422173294), 2);
        }
        t1.t.c(tVar, null, null, new c3.j(new o(aVar, 0), true, 953362998), 3);
        final e0 e0Var = new e0(3);
        final LibraryScreenKt$userCollections$$inlined$items$default$1 libraryScreenKt$userCollections$$inlined$items$default$1 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryScreenKt$userCollections$$inlined$items$default$1
            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                return invoke((CollectionMeta) obj3);
            }

            @Override // ho.l
            public final Void invoke(CollectionMeta collectionMeta2) {
                return null;
            }
        };
        ((t1.i) tVar).u(arrayList.size(), new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryScreenKt$userCollections$$inlined$items$default$2
            public final Object invoke(int i10) {
                return ho.l.this.invoke(arrayList.get(i10));
            }

            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                return invoke(((Number) obj3).intValue());
            }
        }, new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryScreenKt$userCollections$$inlined$items$default$3
            public final Object invoke(int i10) {
                return ho.l.this.invoke(arrayList.get(i10));
            }

            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                return invoke(((Number) obj3).intValue());
            }
        }, new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryScreenKt$userCollections$$inlined$items$default$4
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
                    final CollectionMeta collectionMeta2 = (CollectionMeta) arrayList.get(i10);
                    qVar.X(2036005251);
                    String title = collectionMeta2.getTitle();
                    boolean f10 = qVar.f(lVar) | qVar.h(collectionMeta2);
                    Object L = qVar.L();
                    if (f10 || L == u2.l.f33918a) {
                        final ho.l lVar2 = lVar;
                        L = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryScreenKt$userCollections$4$1$1
                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m1466invoke() {
                                ho.l.this.invoke(collectionMeta2.getId());
                            }

                            @Override // ho.a
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m1466invoke();
                                return sn.z.f31622a;
                            }
                        };
                        qVar.h0(L);
                    }
                    ButtonContainerKt.m1780ButtonContainer83mGB3Q(title, (ho.a) L, null, 0L, false, 0, null, false, null, c3.k.d(-1956700292, true, new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.library.LibraryScreenKt$userCollections$4$2
                        public final void invoke(r1.s sVar, u2.m mVar2, int i15) {
                            boolean z10;
                            sVar.getClass();
                            if ((i15 & 17) != 16) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            u2.q qVar2 = (u2.q) mVar2;
                            if (qVar2.O(i15 & 1, z10)) {
                                CollectionMetaSmallRowKt.CollectionMetaSmallRow(CollectionMeta.this, false, qVar2, 0, 2);
                            } else {
                                qVar2.R();
                            }
                        }

                        @Override // ho.q
                        public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                            invoke((r1.s) obj3, (u2.m) obj4, ((Number) obj5).intValue());
                            return sn.z.f31622a;
                        }
                    }, qVar), qVar, 805306368, 508);
                    qVar.p(false);
                    return;
                }
                qVar.R();
            }

            @Override // ho.r
            public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                invoke((t1.b) obj3, ((Number) obj4).intValue(), (u2.m) obj5, ((Number) obj6).intValue());
                return sn.z.f31622a;
            }
        }, true, 802480018));
    }

    public static final sn.z userCollections$lambda$2(ho.l lVar, CollectionMeta collectionMeta, t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            String R = kj.c.R(qVar, io.elevenlabs.readerapp.R.string.read_later_collection_title);
            boolean f10 = qVar.f(lVar) | qVar.h(collectionMeta);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new n(lVar, collectionMeta, 2);
                qVar.h0(L);
            }
            ButtonContainerKt.m1780ButtonContainer83mGB3Q(R, (ho.a) L, null, 0L, false, 0, null, false, null, c3.k.d(337887534, true, new l(collectionMeta, R), qVar), qVar, 805306368, 508);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z userCollections$lambda$2$0$0(ho.l lVar, CollectionMeta collectionMeta) {
        lVar.invoke(collectionMeta.getId());
        return sn.z.f31622a;
    }

    public static final sn.z userCollections$lambda$2$1(CollectionMeta collectionMeta, String str, r1.s sVar, u2.m mVar, int i10) {
        boolean z6;
        sVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            CollectionMetaSmallRowKt.CollectionMetaSmallRow(CollectionMeta.copy$default(collectionMeta, null, str, null, null, null, false, null, null, null, null, false, null, LexerCore.ID_NO_WHITESPACE, null), false, qVar, 0, 2);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z userCollections$lambda$3(ho.a aVar, t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            String R = kj.c.R(qVar, io.elevenlabs.readerapp.R.string.collections_create_action_title);
            boolean f10 = qVar.f(aVar);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new s(0, aVar);
                qVar.h0(L);
            }
            ButtonContainerKt.m1780ButtonContainer83mGB3Q(R, (ho.a) L, null, 0L, false, 0, null, false, null, c3.k.d(-2058083886, true, new o(R, 1), qVar), qVar, 805306368, 508);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z userCollections$lambda$3$0$0(ho.a aVar) {
        aVar.invoke();
        return sn.z.f31622a;
    }

    public static final sn.z userCollections$lambda$3$1(String str, r1.s sVar, u2.m mVar, int i10) {
        boolean z6;
        sVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            CollectionMetaSmallRowKt.CollectionRow(str, R.drawable.plus_large, false, null, null, false, qVar, 196608, 28);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final Object userCollections$lambda$4(CollectionMeta collectionMeta) {
        collectionMeta.getClass();
        return collectionMeta.getId();
    }
}
