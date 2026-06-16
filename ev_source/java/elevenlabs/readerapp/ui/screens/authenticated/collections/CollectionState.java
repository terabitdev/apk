package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import android.gov.nist.core.Separators;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.messaging.Constants;
import io.elevenlabs.domain.model.CollectionMeta;
import io.elevenlabs.domain.model.MediaItemState;
import io.elevenlabs.domain.model.OfflineReadData;
import io.elevenlabs.domain.model.ReadMeta;
import io.livekit.android.rpc.RpcError;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.PeerConnection;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b-\b\u0087\b\u0018\u00002\u00020\u0001B¹\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001fJ\t\u00104\u001a\u00020\u0005HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003J\u000f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0005HÆ\u0003J\t\u0010=\u001a\u00020\u0005HÆ\u0003J\u000f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00180\u0010HÆ\u0003JÀ\u0001\u0010?\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00052\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0010HÆ\u0001¢\u0006\u0002\u0010@J\u0014\u0010A\u001a\u00020\u00052\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010C\u001a\u00020\bHÖ\u0081\u0004J\n\u0010D\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u001dR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010¢\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR\u0011\u0010\u0015\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0010¢\u0006\b\n\u0000\u001a\u0004\b-\u0010(R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010¢\u0006\b\n\u0000\u001a\u0004\b/\u0010(¨\u0006E"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/collections/CollectionState;", "", "collectionId", "", "isLoading", "", "isLoadingMore", "page", "", "hasMore", "nextCursor", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "loadingMoreError", "meta", "Lio/elevenlabs/domain/model/CollectionMeta;", "offlineReads", "", "Lio/elevenlabs/domain/model/OfflineReadData;", "networkReads", "Lio/elevenlabs/domain/model/ReadMeta;", "navigateToReadId", "showAddingSuccessToast", "navigateBack", "playerQueue", "Lio/elevenlabs/domain/model/MediaItemState;", "<init>", "(Ljava/lang/String;ZZLjava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/domain/model/CollectionMeta;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZZLjava/util/List;)V", "getCollectionId", "()Ljava/lang/String;", "()Z", "getPage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHasMore", "getNextCursor", "getError", "getLoadingMoreError", "getMeta", "()Lio/elevenlabs/domain/model/CollectionMeta;", "getOfflineReads", "()Ljava/util/List;", "getNetworkReads", "getNavigateToReadId", "getShowAddingSuccessToast", "getNavigateBack", "getPlayerQueue", "reads", "getReads", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Ljava/lang/String;ZZLjava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/elevenlabs/domain/model/CollectionMeta;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZZLjava/util/List;)Lio/elevenlabs/readerapp/ui/screens/authenticated/collections/CollectionState;", "equals", "other", "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class CollectionState {
    public static final int $stable = 8;
    private final String collectionId;
    private final String error;
    private final boolean hasMore;
    private final boolean isLoading;
    private final boolean isLoadingMore;
    private final String loadingMoreError;
    private final CollectionMeta meta;
    private final boolean navigateBack;
    private final String navigateToReadId;
    private final List<ReadMeta> networkReads;
    private final String nextCursor;
    private final List<OfflineReadData> offlineReads;
    private final Integer page;
    private final List<MediaItemState> playerQueue;
    private final List<ReadMeta> reads;
    private final boolean showAddingSuccessToast;

    public CollectionState(String str, boolean z6, boolean z10, Integer num, boolean z11, String str2, String str3, String str4, CollectionMeta collectionMeta, List<OfflineReadData> list, List<ReadMeta> list2, String str5, boolean z12, boolean z13, List<MediaItemState> list3) {
        ReadMeta copy;
        str3.getClass();
        str4.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.collectionId = str;
        this.isLoading = z6;
        this.isLoadingMore = z10;
        this.page = num;
        this.hasMore = z11;
        this.nextCursor = str2;
        this.error = str3;
        this.loadingMoreError = str4;
        this.meta = collectionMeta;
        this.offlineReads = list;
        this.networkReads = list2;
        this.navigateToReadId = str5;
        this.showAddingSuccessToast = z12;
        this.navigateBack = z13;
        this.playerQueue = list3;
        int H = tn.a0.H(tn.p.a0(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(H < 16 ? 16 : H);
        for (Object obj : list) {
            linkedHashMap.put(((OfflineReadData) obj).getReadId(), obj);
        }
        List<ReadMeta> list4 = this.networkReads;
        ArrayList arrayList = new ArrayList(tn.p.a0(list4, 10));
        for (ReadMeta readMeta : list4) {
            copy = readMeta.copy((r84 & 1) != 0 ? readMeta.articleImageUrl : null, (r84 & 2) != 0 ? readMeta.author : null, (r84 & 4) != 0 ? readMeta.chapters : null, (r84 & 8) != 0 ? readMeta.charCount : 0L, (r84 & 16) != 0 ? readMeta.createdAt : null, (r84 & 32) != 0 ? readMeta.updatedAt : null, (r84 & 64) != 0 ? readMeta.addedAt : null, (r84 & 128) != 0 ? readMeta.description : null, (r84 & RpcError.MAX_MESSAGE_BYTES) != 0 ? readMeta.lastListenedCharOffset : 0L, (r84 & 512) != 0 ? readMeta.readId : null, (r84 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? readMeta.source : null, (r84 & 2048) != 0 ? readMeta.title : null, (r84 & 4096) != 0 ? readMeta.subtitle : null, (r84 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? readMeta.url : null, (r84 & 16384) != 0 ? readMeta.wordCount : 0L, (r84 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? readMeta.originalFileType : null, (r84 & 65536) != 0 ? readMeta.hasOriginalAudio : false, (r84 & 131072) != 0 ? readMeta.matureContent : false, (r84 & 262144) != 0 ? readMeta.origin : null, (r84 & 524288) != 0 ? readMeta.contentType : null, (r84 & 1048576) != 0 ? readMeta.genre : null, (r84 & 2097152) != 0 ? readMeta.isBookType : false, (r84 & 4194304) != 0 ? readMeta.fromUserImport : false, (r84 & 8388608) != 0 ? readMeta.rating : null, (r84 & 16777216) != 0 ? readMeta.userRating : null, (r84 & 33554432) != 0 ? readMeta.lastUsedVoiceId : null, (r84 & 67108864) != 0 ? readMeta.creationStatus : null, (r84 & 134217728) != 0 ? readMeta.creationProgress : null, (r84 & 268435456) != 0 ? readMeta.isArchived : false, (r84 & 536870912) != 0 ? readMeta.markedAsUnread : false, (r84 & 1073741824) != 0 ? readMeta.completedAt : null, (r84 & Integer.MIN_VALUE) != 0 ? readMeta.publicationDate : null, (r85 & 1) != 0 ? readMeta.language : null, (r85 & 2) != 0 ? readMeta.publisherProfileId : null, (r85 & 4) != 0 ? readMeta.canDelete : false, (r85 & 8) != 0 ? readMeta.androidProductId : null, (r85 & 16) != 0 ? readMeta.isPaid : false, (r85 & 32) != 0 ? readMeta.offlineReadData : (OfflineReadData) linkedHashMap.get(readMeta.getReadId()), (r85 & 64) != 0 ? readMeta.previewAudio : null, (r85 & 128) != 0 ? readMeta.originalVoice : null, (r85 & RpcError.MAX_MESSAGE_BYTES) != 0 ? readMeta.voiceSelectionConfig : null, (r85 & 512) != 0 ? readMeta.sampleConfig : null, (r85 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? readMeta.displayMode : null, (r85 & 2048) != 0 ? readMeta.inUserLibrary : false, (r85 & 4096) != 0 ? readMeta.canUseAssistant : false, (r85 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? readMeta.audioType : null, (r85 & 16384) != 0 ? readMeta.useDrm : false, (r85 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? readMeta.lastListenedAudioFileNumber : null, (r85 & 65536) != 0 ? readMeta.lastListenedAudioSeconds : null, (r85 & 131072) != 0 ? readMeta.audioDurationSeconds : null, (r85 & 262144) != 0 ? readMeta.audioTypes : null, (r85 & 524288) != 0 ? readMeta.isVoiceChangerOn : false, (r85 & 1048576) != 0 ? readMeta.lastUsedAudioType : null, (r85 & 2097152) != 0 ? readMeta.coverImageUrls : null, (r85 & 4194304) != 0 ? readMeta.coverAspectRatio : null, (r85 & 8388608) != 0 ? readMeta.blurPlaceholder : null);
            arrayList.add(copy);
        }
        this.reads = arrayList;
    }

    public static /* synthetic */ CollectionState copy$default(CollectionState collectionState, String str, boolean z6, boolean z10, Integer num, boolean z11, String str2, String str3, String str4, CollectionMeta collectionMeta, List list, List list2, String str5, boolean z12, boolean z13, List list3, int i10, Object obj) {
        String str6;
        boolean z14;
        boolean z15;
        Integer num2;
        boolean z16;
        String str7;
        String str8;
        String str9;
        CollectionMeta collectionMeta2;
        List list4;
        List list5;
        String str10;
        boolean z17;
        boolean z18;
        List list6;
        if ((i10 & 1) != 0) {
            str6 = collectionState.collectionId;
        } else {
            str6 = str;
        }
        if ((i10 & 2) != 0) {
            z14 = collectionState.isLoading;
        } else {
            z14 = z6;
        }
        if ((i10 & 4) != 0) {
            z15 = collectionState.isLoadingMore;
        } else {
            z15 = z10;
        }
        if ((i10 & 8) != 0) {
            num2 = collectionState.page;
        } else {
            num2 = num;
        }
        if ((i10 & 16) != 0) {
            z16 = collectionState.hasMore;
        } else {
            z16 = z11;
        }
        if ((i10 & 32) != 0) {
            str7 = collectionState.nextCursor;
        } else {
            str7 = str2;
        }
        if ((i10 & 64) != 0) {
            str8 = collectionState.error;
        } else {
            str8 = str3;
        }
        if ((i10 & 128) != 0) {
            str9 = collectionState.loadingMoreError;
        } else {
            str9 = str4;
        }
        if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            collectionMeta2 = collectionState.meta;
        } else {
            collectionMeta2 = collectionMeta;
        }
        if ((i10 & 512) != 0) {
            list4 = collectionState.offlineReads;
        } else {
            list4 = list;
        }
        if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            list5 = collectionState.networkReads;
        } else {
            list5 = list2;
        }
        if ((i10 & 2048) != 0) {
            str10 = collectionState.navigateToReadId;
        } else {
            str10 = str5;
        }
        if ((i10 & 4096) != 0) {
            z17 = collectionState.showAddingSuccessToast;
        } else {
            z17 = z12;
        }
        if ((i10 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
            z18 = collectionState.navigateBack;
        } else {
            z18 = z13;
        }
        if ((i10 & 16384) != 0) {
            list6 = collectionState.playerQueue;
        } else {
            list6 = list3;
        }
        return collectionState.copy(str6, z14, z15, num2, z16, str7, str8, str9, collectionMeta2, list4, list5, str10, z17, z18, list6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCollectionId() {
        return this.collectionId;
    }

    public final List<OfflineReadData> component10() {
        return this.offlineReads;
    }

    public final List<ReadMeta> component11() {
        return this.networkReads;
    }

    /* renamed from: component12, reason: from getter */
    public final String getNavigateToReadId() {
        return this.navigateToReadId;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getShowAddingSuccessToast() {
        return this.showAddingSuccessToast;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getNavigateBack() {
        return this.navigateBack;
    }

    public final List<MediaItemState> component15() {
        return this.playerQueue;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsLoadingMore() {
        return this.isLoadingMore;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getPage() {
        return this.page;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getHasMore() {
        return this.hasMore;
    }

    /* renamed from: component6, reason: from getter */
    public final String getNextCursor() {
        return this.nextCursor;
    }

    /* renamed from: component7, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component8, reason: from getter */
    public final String getLoadingMoreError() {
        return this.loadingMoreError;
    }

    /* renamed from: component9, reason: from getter */
    public final CollectionMeta getMeta() {
        return this.meta;
    }

    public final CollectionState copy(String collectionId, boolean isLoading, boolean isLoadingMore, Integer page, boolean hasMore, String nextCursor, String r23, String loadingMoreError, CollectionMeta meta, List<OfflineReadData> offlineReads, List<ReadMeta> networkReads, String navigateToReadId, boolean showAddingSuccessToast, boolean navigateBack, List<MediaItemState> playerQueue) {
        r23.getClass();
        loadingMoreError.getClass();
        offlineReads.getClass();
        networkReads.getClass();
        playerQueue.getClass();
        return new CollectionState(collectionId, isLoading, isLoadingMore, page, hasMore, nextCursor, r23, loadingMoreError, meta, offlineReads, networkReads, navigateToReadId, showAddingSuccessToast, navigateBack, playerQueue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CollectionState)) {
            return false;
        }
        CollectionState collectionState = (CollectionState) other;
        if (kotlin.jvm.internal.m.c(this.collectionId, collectionState.collectionId) && this.isLoading == collectionState.isLoading && this.isLoadingMore == collectionState.isLoadingMore && kotlin.jvm.internal.m.c(this.page, collectionState.page) && this.hasMore == collectionState.hasMore && kotlin.jvm.internal.m.c(this.nextCursor, collectionState.nextCursor) && kotlin.jvm.internal.m.c(this.error, collectionState.error) && kotlin.jvm.internal.m.c(this.loadingMoreError, collectionState.loadingMoreError) && kotlin.jvm.internal.m.c(this.meta, collectionState.meta) && kotlin.jvm.internal.m.c(this.offlineReads, collectionState.offlineReads) && kotlin.jvm.internal.m.c(this.networkReads, collectionState.networkReads) && kotlin.jvm.internal.m.c(this.navigateToReadId, collectionState.navigateToReadId) && this.showAddingSuccessToast == collectionState.showAddingSuccessToast && this.navigateBack == collectionState.navigateBack && kotlin.jvm.internal.m.c(this.playerQueue, collectionState.playerQueue)) {
            return true;
        }
        return false;
    }

    public final String getCollectionId() {
        return this.collectionId;
    }

    public final String getError() {
        return this.error;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final String getLoadingMoreError() {
        return this.loadingMoreError;
    }

    public final CollectionMeta getMeta() {
        return this.meta;
    }

    public final boolean getNavigateBack() {
        return this.navigateBack;
    }

    public final String getNavigateToReadId() {
        return this.navigateToReadId;
    }

    public final List<ReadMeta> getNetworkReads() {
        return this.networkReads;
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }

    public final List<OfflineReadData> getOfflineReads() {
        return this.offlineReads;
    }

    public final Integer getPage() {
        return this.page;
    }

    public final List<MediaItemState> getPlayerQueue() {
        return this.playerQueue;
    }

    public final List<ReadMeta> getReads() {
        return this.reads;
    }

    public final boolean getShowAddingSuccessToast() {
        return this.showAddingSuccessToast;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.collectionId;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int f10 = com.google.android.gms.internal.play_billing.b.f(com.google.android.gms.internal.play_billing.b.f(hashCode * 31, 31, this.isLoading), 31, this.isLoadingMore);
        Integer num = this.page;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int f11 = com.google.android.gms.internal.play_billing.b.f((f10 + hashCode2) * 31, 31, this.hasMore);
        String str2 = this.nextCursor;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int c5 = j0.c.c(j0.c.c((f11 + hashCode3) * 31, 31, this.error), 31, this.loadingMoreError);
        CollectionMeta collectionMeta = this.meta;
        if (collectionMeta == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = collectionMeta.hashCode();
        }
        int d10 = p.n.d(p.n.d((c5 + hashCode4) * 31, 31, this.offlineReads), 31, this.networkReads);
        String str3 = this.navigateToReadId;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return this.playerQueue.hashCode() + com.google.android.gms.internal.play_billing.b.f(com.google.android.gms.internal.play_billing.b.f((d10 + i10) * 31, 31, this.showAddingSuccessToast), 31, this.navigateBack);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isLoadingMore() {
        return this.isLoadingMore;
    }

    public String toString() {
        String str = this.collectionId;
        boolean z6 = this.isLoading;
        boolean z10 = this.isLoadingMore;
        Integer num = this.page;
        boolean z11 = this.hasMore;
        String str2 = this.nextCursor;
        String str3 = this.error;
        String str4 = this.loadingMoreError;
        CollectionMeta collectionMeta = this.meta;
        List<OfflineReadData> list = this.offlineReads;
        List<ReadMeta> list2 = this.networkReads;
        String str5 = this.navigateToReadId;
        boolean z12 = this.showAddingSuccessToast;
        boolean z13 = this.navigateBack;
        List<MediaItemState> list3 = this.playerQueue;
        StringBuilder sb = new StringBuilder("CollectionState(collectionId=");
        sb.append(str);
        sb.append(", isLoading=");
        sb.append(z6);
        sb.append(", isLoadingMore=");
        sb.append(z10);
        sb.append(", page=");
        sb.append(num);
        sb.append(", hasMore=");
        defpackage.f.z(sb, z11, ", nextCursor=", str2, ", error=");
        defpackage.f.x(sb, str3, ", loadingMoreError=", str4, ", meta=");
        sb.append(collectionMeta);
        sb.append(", offlineReads=");
        sb.append(list);
        sb.append(", networkReads=");
        sb.append(list2);
        sb.append(", navigateToReadId=");
        sb.append(str5);
        sb.append(", showAddingSuccessToast=");
        ib.i.t(sb, z12, ", navigateBack=", z13, ", playerQueue=");
        return z.h.e(sb, list3, Separators.RPAREN);
    }

    public CollectionState() {
        this(null, false, false, null, false, null, null, null, null, null, null, null, false, false, null, 32767, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ CollectionState(String str, boolean z6, boolean z10, Integer num, boolean z11, String str2, String str3, String str4, CollectionMeta collectionMeta, List list, List list2, String str5, boolean z12, boolean z13, List list3, int i10, kotlin.jvm.internal.f fVar) {
        this(r1, r3, r5, r6, r7, r8, r9, r10, r11, r12 != 0 ? r13 : list, (i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r13 : list2, (i10 & 2048) == 0 ? str5 : null, (i10 & 4096) != 0 ? false : z12, (i10 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? false : z13, (i10 & 16384) != 0 ? r13 : list3);
        String str6 = (i10 & 1) != 0 ? null : str;
        boolean z14 = (i10 & 2) != 0 ? false : z6;
        boolean z15 = (i10 & 4) != 0 ? false : z10;
        Integer num2 = (i10 & 8) != 0 ? 0 : num;
        boolean z16 = (i10 & 16) != 0 ? true : z11;
        String str7 = (i10 & 32) != 0 ? null : str2;
        String str8 = (i10 & 64) != 0 ? "" : str3;
        String str9 = (i10 & 128) == 0 ? str4 : "";
        CollectionMeta collectionMeta2 = (i10 & RpcError.MAX_MESSAGE_BYTES) != 0 ? null : collectionMeta;
        int i11 = i10 & 512;
        tn.t tVar = tn.t.f33547a;
    }
}
