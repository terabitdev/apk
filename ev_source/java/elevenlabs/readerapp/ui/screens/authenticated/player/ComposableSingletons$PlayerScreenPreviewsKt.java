package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.domain.model.PlayerConnectionState;
import io.elevenlabs.domain.model.PlayerDisplayMode;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.UserConfig;
import io.elevenlabs.readerapp.ui.previews.ReadsFactoryKt;
import io.elevenlabs.readerapp.ui.previews.UserConfigFactoryKt;
import io.elevenlabs.readerapp.ui.previews.VoicesFactoryKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.PlaybackPosition;
import io.livekit.android.rpc.RpcError;
import java.util.Date;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.PeerConnection;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$PlayerScreenPreviewsKt {
    public static final ComposableSingletons$PlayerScreenPreviewsKt INSTANCE = new ComposableSingletons$PlayerScreenPreviewsKt();
    private static ho.p lambda$476196047 = new c3.j(new e(4), false, 476196047);
    private static ho.p lambda$1456882195 = new c3.j(new e(5), false, 1456882195);

    /* renamed from: lambda$-1199194332 */
    private static ho.p f410lambda$1199194332 = new c3.j(new e(6), false, -1199194332);
    private static ho.p lambda$915803765 = new c3.j(new e(7), false, 915803765);
    private static ho.p lambda$42801345 = new c3.j(new e(8), false, 42801345);

    public static final sn.z lambda_1456882195$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        ReadMeta copy;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            PlayerDisplayMode playerDisplayMode = PlayerDisplayMode.Audio;
            UserConfig.PlayerConfig stubPlayerConfig = UserConfigFactoryKt.stubPlayerConfig();
            PlayerControllerState playerControllerState = new PlayerControllerState(PlayerConnectionState.READY, null, true, Float.valueOf(1.0f), 2, null);
            copy = r62.copy((r84 & 1) != 0 ? r62.articleImageUrl : "file:///android_asset/read_cover_preview.jpg", (r84 & 2) != 0 ? r62.author : "F. Scott Fitzgerald", (r84 & 4) != 0 ? r62.chapters : null, (r84 & 8) != 0 ? r62.charCount : 0L, (r84 & 16) != 0 ? r62.createdAt : null, (r84 & 32) != 0 ? r62.updatedAt : null, (r84 & 64) != 0 ? r62.addedAt : null, (r84 & 128) != 0 ? r62.description : null, (r84 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r62.lastListenedCharOffset : 0L, (r84 & 512) != 0 ? r62.readId : null, (r84 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r62.source : null, (r84 & 2048) != 0 ? r62.title : "The Great Gatsby", (r84 & 4096) != 0 ? r62.subtitle : null, (r84 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r62.url : null, (r84 & 16384) != 0 ? r62.wordCount : 0L, (r84 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r62.originalFileType : null, (r84 & 65536) != 0 ? r62.hasOriginalAudio : false, (r84 & 131072) != 0 ? r62.matureContent : false, (r84 & 262144) != 0 ? r62.origin : null, (r84 & 524288) != 0 ? r62.contentType : null, (r84 & 1048576) != 0 ? r62.genre : null, (r84 & 2097152) != 0 ? r62.isBookType : true, (r84 & 4194304) != 0 ? r62.fromUserImport : false, (r84 & 8388608) != 0 ? r62.rating : null, (r84 & 16777216) != 0 ? r62.userRating : null, (r84 & 33554432) != 0 ? r62.lastUsedVoiceId : null, (r84 & 67108864) != 0 ? r62.creationStatus : null, (r84 & 134217728) != 0 ? r62.creationProgress : null, (r84 & 268435456) != 0 ? r62.isArchived : false, (r84 & 536870912) != 0 ? r62.markedAsUnread : false, (r84 & 1073741824) != 0 ? r62.completedAt : null, (r84 & Integer.MIN_VALUE) != 0 ? r62.publicationDate : null, (r85 & 1) != 0 ? r62.language : null, (r85 & 2) != 0 ? r62.publisherProfileId : null, (r85 & 4) != 0 ? r62.canDelete : false, (r85 & 8) != 0 ? r62.androidProductId : null, (r85 & 16) != 0 ? r62.isPaid : false, (r85 & 32) != 0 ? r62.offlineReadData : null, (r85 & 64) != 0 ? r62.previewAudio : null, (r85 & 128) != 0 ? r62.originalVoice : null, (r85 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r62.voiceSelectionConfig : null, (r85 & 512) != 0 ? r62.sampleConfig : null, (r85 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r62.displayMode : null, (r85 & 2048) != 0 ? r62.inUserLibrary : false, (r85 & 4096) != 0 ? r62.canUseAssistant : false, (r85 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r62.audioType : null, (r85 & 16384) != 0 ? r62.useDrm : false, (r85 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r62.lastListenedAudioFileNumber : null, (r85 & 65536) != 0 ? r62.lastListenedAudioSeconds : null, (r85 & 131072) != 0 ? r62.audioDurationSeconds : null, (r85 & 262144) != 0 ? r62.audioTypes : null, (r85 & 524288) != 0 ? r62.isVoiceChangerOn : false, (r85 & 1048576) != 0 ? r62.lastUsedAudioType : null, (r85 & 2097152) != 0 ? r62.coverImageUrls : null, (r85 & 4194304) != 0 ? r62.coverAspectRatio : null, (r85 & 8388608) != 0 ? ReadsFactoryKt.stubReadMeta$default(null, 1, null).blurPlaceholder : null);
            PlayerScreenKt.PlayerScreenUI(ir.r.c(new PlayerState(null, playerControllerState, false, false, 100, null, null, null, false, false, false, false, new ContentState(copy, new PlaybackPosition.Tts(1000L), "default-voice", false, false, null, 56, null), null, false, null, false, null, false, false, false, null, VoicesFactoryKt.stubVoice(), null, stubPlayerConfig, false, false, false, null, false, false, false, false, false, false, false, null, new Date(1729581652L), false, null, null, null, null, null, playerDisplayMode, false, false, false, null, null, null, null, null, false, false, 0, false, false, null, null, -20975647, 268431327, null)), null, null, null, null, null, null, null, null, null, null, false, qVar, 0, 0, 4094);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda_42801345$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        ReadMeta copy;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            PlayerDisplayMode playerDisplayMode = PlayerDisplayMode.Audio;
            UserConfig.PlayerConfig stubPlayerConfig = UserConfigFactoryKt.stubPlayerConfig();
            PlayerControllerState playerControllerState = new PlayerControllerState(PlayerConnectionState.READY, null, true, Float.valueOf(1.0f), 2, null);
            copy = r62.copy((r84 & 1) != 0 ? r62.articleImageUrl : "file:///android_asset/read_cover_preview.jpg", (r84 & 2) != 0 ? r62.author : "F. Scott Fitzgerald", (r84 & 4) != 0 ? r62.chapters : null, (r84 & 8) != 0 ? r62.charCount : 0L, (r84 & 16) != 0 ? r62.createdAt : null, (r84 & 32) != 0 ? r62.updatedAt : null, (r84 & 64) != 0 ? r62.addedAt : null, (r84 & 128) != 0 ? r62.description : null, (r84 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r62.lastListenedCharOffset : 0L, (r84 & 512) != 0 ? r62.readId : null, (r84 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r62.source : null, (r84 & 2048) != 0 ? r62.title : "The Great Gatsby", (r84 & 4096) != 0 ? r62.subtitle : null, (r84 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r62.url : null, (r84 & 16384) != 0 ? r62.wordCount : 0L, (r84 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r62.originalFileType : null, (r84 & 65536) != 0 ? r62.hasOriginalAudio : false, (r84 & 131072) != 0 ? r62.matureContent : false, (r84 & 262144) != 0 ? r62.origin : null, (r84 & 524288) != 0 ? r62.contentType : null, (r84 & 1048576) != 0 ? r62.genre : null, (r84 & 2097152) != 0 ? r62.isBookType : true, (r84 & 4194304) != 0 ? r62.fromUserImport : false, (r84 & 8388608) != 0 ? r62.rating : null, (r84 & 16777216) != 0 ? r62.userRating : null, (r84 & 33554432) != 0 ? r62.lastUsedVoiceId : null, (r84 & 67108864) != 0 ? r62.creationStatus : null, (r84 & 134217728) != 0 ? r62.creationProgress : null, (r84 & 268435456) != 0 ? r62.isArchived : false, (r84 & 536870912) != 0 ? r62.markedAsUnread : false, (r84 & 1073741824) != 0 ? r62.completedAt : null, (r84 & Integer.MIN_VALUE) != 0 ? r62.publicationDate : null, (r85 & 1) != 0 ? r62.language : null, (r85 & 2) != 0 ? r62.publisherProfileId : null, (r85 & 4) != 0 ? r62.canDelete : false, (r85 & 8) != 0 ? r62.androidProductId : null, (r85 & 16) != 0 ? r62.isPaid : false, (r85 & 32) != 0 ? r62.offlineReadData : null, (r85 & 64) != 0 ? r62.previewAudio : null, (r85 & 128) != 0 ? r62.originalVoice : null, (r85 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r62.voiceSelectionConfig : null, (r85 & 512) != 0 ? r62.sampleConfig : null, (r85 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r62.displayMode : null, (r85 & 2048) != 0 ? r62.inUserLibrary : false, (r85 & 4096) != 0 ? r62.canUseAssistant : false, (r85 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r62.audioType : null, (r85 & 16384) != 0 ? r62.useDrm : false, (r85 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r62.lastListenedAudioFileNumber : null, (r85 & 65536) != 0 ? r62.lastListenedAudioSeconds : null, (r85 & 131072) != 0 ? r62.audioDurationSeconds : null, (r85 & 262144) != 0 ? r62.audioTypes : null, (r85 & 524288) != 0 ? r62.isVoiceChangerOn : false, (r85 & 1048576) != 0 ? r62.lastUsedAudioType : null, (r85 & 2097152) != 0 ? r62.coverImageUrls : null, (r85 & 4194304) != 0 ? r62.coverAspectRatio : null, (r85 & 8388608) != 0 ? ReadsFactoryKt.stubReadMeta$default(null, 1, null).blurPlaceholder : null);
            PlayerScreenKt.PlayerScreenUI(ir.r.c(new PlayerState(null, playerControllerState, false, false, 100, null, null, null, false, false, false, false, new ContentState(copy, new PlaybackPosition.Tts(1000L), "default-voice", false, false, null, 56, null), null, false, null, false, null, false, false, false, null, VoicesFactoryKt.stubVoice(), null, stubPlayerConfig, false, false, false, null, false, false, false, false, false, false, false, null, new Date(1729581652L), false, null, null, null, null, null, playerDisplayMode, false, false, false, null, null, null, null, null, false, false, 0, false, false, null, null, -20975647, 268431327, null)), null, null, null, null, null, null, null, null, null, null, false, qVar, 0, 0, 4094);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda_476196047$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ir.b2 c5 = ir.r.c(new PlayerState(null, null, false, false, 0, null, null, null, false, false, false, false, null, null, false, null, false, null, false, false, false, null, null, null, null, false, false, false, null, false, false, false, false, false, false, false, null, new Date(1729581652L), false, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, false, 0, false, false, null, null, -1, 268435423, null));
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new i1(29);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new i(5);
                qVar.h0(L2);
            }
            PlayerScreenKt.PlayerScreenUI(c5, null, lVar, (ho.a) L2, null, null, null, null, null, null, null, false, qVar, 3456, 0, 4082);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda_476196047$lambda$0$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z lambda_915803765$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        ReadMeta copy;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            PlayerDisplayMode playerDisplayMode = PlayerDisplayMode.Audio;
            UserConfig.PlayerConfig stubPlayerConfig = UserConfigFactoryKt.stubPlayerConfig();
            PlayerControllerState playerControllerState = new PlayerControllerState(PlayerConnectionState.READY, null, true, Float.valueOf(1.0f), 2, null);
            copy = r62.copy((r84 & 1) != 0 ? r62.articleImageUrl : "file:///android_asset/read_cover_preview.jpg", (r84 & 2) != 0 ? r62.author : "F. Scott Fitzgerald", (r84 & 4) != 0 ? r62.chapters : null, (r84 & 8) != 0 ? r62.charCount : 0L, (r84 & 16) != 0 ? r62.createdAt : null, (r84 & 32) != 0 ? r62.updatedAt : null, (r84 & 64) != 0 ? r62.addedAt : null, (r84 & 128) != 0 ? r62.description : null, (r84 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r62.lastListenedCharOffset : 0L, (r84 & 512) != 0 ? r62.readId : null, (r84 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r62.source : null, (r84 & 2048) != 0 ? r62.title : "The Great Gatsby", (r84 & 4096) != 0 ? r62.subtitle : null, (r84 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r62.url : null, (r84 & 16384) != 0 ? r62.wordCount : 0L, (r84 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r62.originalFileType : null, (r84 & 65536) != 0 ? r62.hasOriginalAudio : false, (r84 & 131072) != 0 ? r62.matureContent : false, (r84 & 262144) != 0 ? r62.origin : null, (r84 & 524288) != 0 ? r62.contentType : null, (r84 & 1048576) != 0 ? r62.genre : null, (r84 & 2097152) != 0 ? r62.isBookType : true, (r84 & 4194304) != 0 ? r62.fromUserImport : false, (r84 & 8388608) != 0 ? r62.rating : null, (r84 & 16777216) != 0 ? r62.userRating : null, (r84 & 33554432) != 0 ? r62.lastUsedVoiceId : null, (r84 & 67108864) != 0 ? r62.creationStatus : null, (r84 & 134217728) != 0 ? r62.creationProgress : null, (r84 & 268435456) != 0 ? r62.isArchived : false, (r84 & 536870912) != 0 ? r62.markedAsUnread : false, (r84 & 1073741824) != 0 ? r62.completedAt : null, (r84 & Integer.MIN_VALUE) != 0 ? r62.publicationDate : null, (r85 & 1) != 0 ? r62.language : null, (r85 & 2) != 0 ? r62.publisherProfileId : null, (r85 & 4) != 0 ? r62.canDelete : false, (r85 & 8) != 0 ? r62.androidProductId : null, (r85 & 16) != 0 ? r62.isPaid : false, (r85 & 32) != 0 ? r62.offlineReadData : null, (r85 & 64) != 0 ? r62.previewAudio : null, (r85 & 128) != 0 ? r62.originalVoice : null, (r85 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r62.voiceSelectionConfig : null, (r85 & 512) != 0 ? r62.sampleConfig : null, (r85 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r62.displayMode : null, (r85 & 2048) != 0 ? r62.inUserLibrary : false, (r85 & 4096) != 0 ? r62.canUseAssistant : false, (r85 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r62.audioType : null, (r85 & 16384) != 0 ? r62.useDrm : false, (r85 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r62.lastListenedAudioFileNumber : null, (r85 & 65536) != 0 ? r62.lastListenedAudioSeconds : null, (r85 & 131072) != 0 ? r62.audioDurationSeconds : null, (r85 & 262144) != 0 ? r62.audioTypes : null, (r85 & 524288) != 0 ? r62.isVoiceChangerOn : false, (r85 & 1048576) != 0 ? r62.lastUsedAudioType : null, (r85 & 2097152) != 0 ? r62.coverImageUrls : null, (r85 & 4194304) != 0 ? r62.coverAspectRatio : null, (r85 & 8388608) != 0 ? ReadsFactoryKt.stubReadMeta$default(null, 1, null).blurPlaceholder : null);
            PlayerScreenKt.PlayerScreenUI(ir.r.c(new PlayerState(null, playerControllerState, false, false, 100, null, null, null, false, false, false, false, new ContentState(copy, new PlaybackPosition.Tts(1000L), "default-voice", false, false, null, 56, null), null, false, null, false, null, false, false, false, null, VoicesFactoryKt.stubVoice(), null, stubPlayerConfig, false, false, false, null, false, false, false, false, false, false, false, null, new Date(1729581652L), false, null, null, null, null, null, playerDisplayMode, false, false, true, null, null, null, null, null, false, false, 0, false, false, null, null, -20975647, 268398559, null)), null, null, null, null, null, null, null, null, null, null, false, qVar, 0, 0, 4094);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z lambda__1199194332$lambda$0(u2.m mVar, int i10) {
        boolean z6;
        ReadMeta copy;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            PlayerDisplayMode playerDisplayMode = PlayerDisplayMode.Audio;
            UserConfig.PlayerConfig stubPlayerConfig = UserConfigFactoryKt.stubPlayerConfig();
            PlayerControllerState playerControllerState = new PlayerControllerState(PlayerConnectionState.READY, null, true, Float.valueOf(1.0f), 2, null);
            copy = r62.copy((r84 & 1) != 0 ? r62.articleImageUrl : "file:///android_asset/read_cover_preview.jpg", (r84 & 2) != 0 ? r62.author : "F. Scott Fitzgerald", (r84 & 4) != 0 ? r62.chapters : null, (r84 & 8) != 0 ? r62.charCount : 0L, (r84 & 16) != 0 ? r62.createdAt : null, (r84 & 32) != 0 ? r62.updatedAt : null, (r84 & 64) != 0 ? r62.addedAt : null, (r84 & 128) != 0 ? r62.description : null, (r84 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r62.lastListenedCharOffset : 0L, (r84 & 512) != 0 ? r62.readId : null, (r84 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r62.source : null, (r84 & 2048) != 0 ? r62.title : "The Great Gatsby", (r84 & 4096) != 0 ? r62.subtitle : null, (r84 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r62.url : null, (r84 & 16384) != 0 ? r62.wordCount : 0L, (r84 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r62.originalFileType : null, (r84 & 65536) != 0 ? r62.hasOriginalAudio : false, (r84 & 131072) != 0 ? r62.matureContent : false, (r84 & 262144) != 0 ? r62.origin : null, (r84 & 524288) != 0 ? r62.contentType : null, (r84 & 1048576) != 0 ? r62.genre : null, (r84 & 2097152) != 0 ? r62.isBookType : true, (r84 & 4194304) != 0 ? r62.fromUserImport : false, (r84 & 8388608) != 0 ? r62.rating : null, (r84 & 16777216) != 0 ? r62.userRating : null, (r84 & 33554432) != 0 ? r62.lastUsedVoiceId : null, (r84 & 67108864) != 0 ? r62.creationStatus : null, (r84 & 134217728) != 0 ? r62.creationProgress : null, (r84 & 268435456) != 0 ? r62.isArchived : false, (r84 & 536870912) != 0 ? r62.markedAsUnread : false, (r84 & 1073741824) != 0 ? r62.completedAt : null, (r84 & Integer.MIN_VALUE) != 0 ? r62.publicationDate : null, (r85 & 1) != 0 ? r62.language : null, (r85 & 2) != 0 ? r62.publisherProfileId : null, (r85 & 4) != 0 ? r62.canDelete : false, (r85 & 8) != 0 ? r62.androidProductId : null, (r85 & 16) != 0 ? r62.isPaid : false, (r85 & 32) != 0 ? r62.offlineReadData : null, (r85 & 64) != 0 ? r62.previewAudio : null, (r85 & 128) != 0 ? r62.originalVoice : null, (r85 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r62.voiceSelectionConfig : null, (r85 & 512) != 0 ? r62.sampleConfig : null, (r85 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r62.displayMode : null, (r85 & 2048) != 0 ? r62.inUserLibrary : false, (r85 & 4096) != 0 ? r62.canUseAssistant : false, (r85 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r62.audioType : null, (r85 & 16384) != 0 ? r62.useDrm : false, (r85 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r62.lastListenedAudioFileNumber : null, (r85 & 65536) != 0 ? r62.lastListenedAudioSeconds : null, (r85 & 131072) != 0 ? r62.audioDurationSeconds : null, (r85 & 262144) != 0 ? r62.audioTypes : null, (r85 & 524288) != 0 ? r62.isVoiceChangerOn : false, (r85 & 1048576) != 0 ? r62.lastUsedAudioType : null, (r85 & 2097152) != 0 ? r62.coverImageUrls : null, (r85 & 4194304) != 0 ? r62.coverAspectRatio : null, (r85 & 8388608) != 0 ? ReadsFactoryKt.stubReadMeta$default(null, 1, null).blurPlaceholder : null);
            PlayerScreenKt.PlayerScreenUI(ir.r.c(new PlayerState(null, playerControllerState, false, false, 100, null, null, null, false, false, false, false, new ContentState(copy, new PlaybackPosition.Tts(1000L), "default-voice", false, false, null, 56, null), null, false, null, false, null, false, false, false, null, VoicesFactoryKt.stubVoice(), null, stubPlayerConfig, false, false, false, null, false, false, false, false, false, false, false, null, new Date(1729581652L), false, null, null, null, null, null, playerDisplayMode, false, false, false, null, null, null, null, null, false, false, 0, false, false, null, null, -20975647, 268431327, null)), null, null, null, null, null, null, null, null, null, null, false, qVar, 0, 0, 4094);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    /* renamed from: getLambda$-1199194332$app_productionRelease */
    public final ho.p m1472getLambda$1199194332$app_productionRelease() {
        return f410lambda$1199194332;
    }

    public final ho.p getLambda$1456882195$app_productionRelease() {
        return lambda$1456882195;
    }

    public final ho.p getLambda$42801345$app_productionRelease() {
        return lambda$42801345;
    }

    public final ho.p getLambda$476196047$app_productionRelease() {
        return lambda$476196047;
    }

    public final ho.p getLambda$915803765$app_productionRelease() {
        return lambda$915803765;
    }
}
