package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.ReadMetaKt;
import io.elevenlabs.readerapp.ui.components.ActionRowKt;
import io.elevenlabs.readerapp.ui.previews.ReadsFactoryKt;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.DividerKt;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import io.elevenlabs.ui.components.scaffolds.BottomSheetScaffoldKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.PeerConnection;
import r1.p2;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aA\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001aM\u0010\r\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0011\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/ReadShareOptionsState;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lkotlin/Function0;", "Lsn/z;", "onClose", "onShareLinkClick", "onShareCurrentClipClick", "ReadShareOptionsSheetUI", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/ReadShareOptionsState;Lho/a;Lho/a;Lho/a;Lu2/m;I)V", "", "readId", "Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/ReadShareOptionsViewModel;", "vm", "ReadShareOptionsSheet", "(Ljava/lang/String;Lho/a;Lho/a;Lho/a;Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/ReadShareOptionsViewModel;Lu2/m;II)V", "Preview_ReadShareOptionsSheet_Book", "(Lu2/m;I)V", "Preview_ReadShareOptionsSheet_Article", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ReadShareOptionsSheetKt {
    public static final void Preview_ReadShareOptionsSheet_Article(u2.m mVar, int i10) {
        boolean z6;
        ReadMeta copy;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1931844618);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            copy = r6.copy((r84 & 1) != 0 ? r6.articleImageUrl : null, (r84 & 2) != 0 ? r6.author : "Tech Magazine", (r84 & 4) != 0 ? r6.chapters : null, (r84 & 8) != 0 ? r6.charCount : 0L, (r84 & 16) != 0 ? r6.createdAt : null, (r84 & 32) != 0 ? r6.updatedAt : null, (r84 & 64) != 0 ? r6.addedAt : null, (r84 & 128) != 0 ? r6.description : null, (r84 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r6.lastListenedCharOffset : 0L, (r84 & 512) != 0 ? r6.readId : null, (r84 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r6.source : null, (r84 & 2048) != 0 ? r6.title : "The Future of AI", (r84 & 4096) != 0 ? r6.subtitle : null, (r84 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r6.url : null, (r84 & 16384) != 0 ? r6.wordCount : 0L, (r84 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r6.originalFileType : null, (r84 & 65536) != 0 ? r6.hasOriginalAudio : false, (r84 & 131072) != 0 ? r6.matureContent : false, (r84 & 262144) != 0 ? r6.origin : null, (r84 & 524288) != 0 ? r6.contentType : null, (r84 & 1048576) != 0 ? r6.genre : null, (r84 & 2097152) != 0 ? r6.isBookType : false, (r84 & 4194304) != 0 ? r6.fromUserImport : false, (r84 & 8388608) != 0 ? r6.rating : null, (r84 & 16777216) != 0 ? r6.userRating : null, (r84 & 33554432) != 0 ? r6.lastUsedVoiceId : null, (r84 & 67108864) != 0 ? r6.creationStatus : null, (r84 & 134217728) != 0 ? r6.creationProgress : null, (r84 & 268435456) != 0 ? r6.isArchived : false, (r84 & 536870912) != 0 ? r6.markedAsUnread : false, (r84 & 1073741824) != 0 ? r6.completedAt : null, (r84 & Integer.MIN_VALUE) != 0 ? r6.publicationDate : null, (r85 & 1) != 0 ? r6.language : null, (r85 & 2) != 0 ? r6.publisherProfileId : null, (r85 & 4) != 0 ? r6.canDelete : false, (r85 & 8) != 0 ? r6.androidProductId : null, (r85 & 16) != 0 ? r6.isPaid : false, (r85 & 32) != 0 ? r6.offlineReadData : null, (r85 & 64) != 0 ? r6.previewAudio : null, (r85 & 128) != 0 ? r6.originalVoice : null, (r85 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r6.voiceSelectionConfig : null, (r85 & 512) != 0 ? r6.sampleConfig : null, (r85 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r6.displayMode : null, (r85 & 2048) != 0 ? r6.inUserLibrary : false, (r85 & 4096) != 0 ? r6.canUseAssistant : false, (r85 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r6.audioType : null, (r85 & 16384) != 0 ? r6.useDrm : false, (r85 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r6.lastListenedAudioFileNumber : null, (r85 & 65536) != 0 ? r6.lastListenedAudioSeconds : null, (r85 & 131072) != 0 ? r6.audioDurationSeconds : null, (r85 & 262144) != 0 ? r6.audioTypes : null, (r85 & 524288) != 0 ? r6.isVoiceChangerOn : false, (r85 & 1048576) != 0 ? r6.lastUsedAudioType : null, (r85 & 2097152) != 0 ? r6.coverImageUrls : null, (r85 & 4194304) != 0 ? r6.coverAspectRatio : null, (r85 & 8388608) != 0 ? ReadsFactoryKt.stubReadMeta$default(null, 1, null).blurPlaceholder : null);
            ReadShareOptionsState readShareOptionsState = new ReadShareOptionsState(copy);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new k0(15);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new k0(11);
                qVar.h0(L2);
            }
            ho.a aVar2 = (ho.a) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new k0(12);
                qVar.h0(L3);
            }
            ReadShareOptionsSheetUI(readShareOptionsState, aVar, aVar2, (ho.a) L3, qVar, 3504);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new m0(i10, 10);
        }
    }

    public static final sn.z Preview_ReadShareOptionsSheet_Article$lambda$3(int i10, u2.m mVar, int i11) {
        Preview_ReadShareOptionsSheet_Article(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ReadShareOptionsSheet_Book(u2.m mVar, int i10) {
        boolean z6;
        ReadMeta copy;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-949177341);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            copy = r6.copy((r84 & 1) != 0 ? r6.articleImageUrl : null, (r84 & 2) != 0 ? r6.author : "F. Scott Fitzgerald", (r84 & 4) != 0 ? r6.chapters : null, (r84 & 8) != 0 ? r6.charCount : 0L, (r84 & 16) != 0 ? r6.createdAt : null, (r84 & 32) != 0 ? r6.updatedAt : null, (r84 & 64) != 0 ? r6.addedAt : null, (r84 & 128) != 0 ? r6.description : null, (r84 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r6.lastListenedCharOffset : 0L, (r84 & 512) != 0 ? r6.readId : null, (r84 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r6.source : null, (r84 & 2048) != 0 ? r6.title : "The Great Gatsby", (r84 & 4096) != 0 ? r6.subtitle : null, (r84 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r6.url : null, (r84 & 16384) != 0 ? r6.wordCount : 0L, (r84 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r6.originalFileType : null, (r84 & 65536) != 0 ? r6.hasOriginalAudio : false, (r84 & 131072) != 0 ? r6.matureContent : false, (r84 & 262144) != 0 ? r6.origin : null, (r84 & 524288) != 0 ? r6.contentType : null, (r84 & 1048576) != 0 ? r6.genre : null, (r84 & 2097152) != 0 ? r6.isBookType : true, (r84 & 4194304) != 0 ? r6.fromUserImport : false, (r84 & 8388608) != 0 ? r6.rating : null, (r84 & 16777216) != 0 ? r6.userRating : null, (r84 & 33554432) != 0 ? r6.lastUsedVoiceId : null, (r84 & 67108864) != 0 ? r6.creationStatus : null, (r84 & 134217728) != 0 ? r6.creationProgress : null, (r84 & 268435456) != 0 ? r6.isArchived : false, (r84 & 536870912) != 0 ? r6.markedAsUnread : false, (r84 & 1073741824) != 0 ? r6.completedAt : null, (r84 & Integer.MIN_VALUE) != 0 ? r6.publicationDate : null, (r85 & 1) != 0 ? r6.language : null, (r85 & 2) != 0 ? r6.publisherProfileId : null, (r85 & 4) != 0 ? r6.canDelete : false, (r85 & 8) != 0 ? r6.androidProductId : null, (r85 & 16) != 0 ? r6.isPaid : false, (r85 & 32) != 0 ? r6.offlineReadData : null, (r85 & 64) != 0 ? r6.previewAudio : null, (r85 & 128) != 0 ? r6.originalVoice : null, (r85 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r6.voiceSelectionConfig : null, (r85 & 512) != 0 ? r6.sampleConfig : null, (r85 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r6.displayMode : null, (r85 & 2048) != 0 ? r6.inUserLibrary : false, (r85 & 4096) != 0 ? r6.canUseAssistant : false, (r85 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r6.audioType : null, (r85 & 16384) != 0 ? r6.useDrm : false, (r85 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r6.lastListenedAudioFileNumber : null, (r85 & 65536) != 0 ? r6.lastListenedAudioSeconds : null, (r85 & 131072) != 0 ? r6.audioDurationSeconds : null, (r85 & 262144) != 0 ? r6.audioTypes : null, (r85 & 524288) != 0 ? r6.isVoiceChangerOn : false, (r85 & 1048576) != 0 ? r6.lastUsedAudioType : null, (r85 & 2097152) != 0 ? r6.coverImageUrls : null, (r85 & 4194304) != 0 ? r6.coverAspectRatio : null, (r85 & 8388608) != 0 ? ReadsFactoryKt.stubReadMeta$default(null, 1, null).blurPlaceholder : null);
            ReadShareOptionsState readShareOptionsState = new ReadShareOptionsState(copy);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new k0(10);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new k0(13);
                qVar.h0(L2);
            }
            ho.a aVar2 = (ho.a) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new k0(14);
                qVar.h0(L3);
            }
            ReadShareOptionsSheetUI(readShareOptionsState, aVar, aVar2, (ho.a) L3, qVar, 3504);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new m0(i10, 11);
        }
    }

    public static final sn.z Preview_ReadShareOptionsSheet_Book$lambda$3(int i10, u2.m mVar, int i11) {
        Preview_ReadShareOptionsSheet_Book(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ReadShareOptionsSheet(String str, final ho.a aVar, final ho.a aVar2, final ho.a aVar3, ReadShareOptionsViewModel readShareOptionsViewModel, u2.m mVar, int i10, int i11) {
        int i12;
        ReadShareOptionsViewModel readShareOptionsViewModel2;
        boolean z6;
        ReadShareOptionsViewModel readShareOptionsViewModel3;
        q7.c cVar;
        ReadShareOptionsViewModel readShareOptionsViewModel4;
        boolean z10;
        Object L;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(210554594);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i12 = i17 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(aVar)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i12 |= i16;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(aVar2)) {
                i15 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i10 & 3072) == 0) {
            if (qVar.h(aVar3)) {
                i14 = 2048;
            } else {
                i14 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i14;
        }
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                readShareOptionsViewModel2 = readShareOptionsViewModel;
                if (qVar.h(readShareOptionsViewModel2)) {
                    i13 = 16384;
                    i12 |= i13;
                }
            } else {
                readShareOptionsViewModel2 = readShareOptionsViewModel;
            }
            i13 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            i12 |= i13;
        } else {
            readShareOptionsViewModel2 = readShareOptionsViewModel;
        }
        int i18 = i12;
        boolean z11 = false;
        if ((i18 & 9363) != 9362) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i18 & 1, z6)) {
            qVar.T();
            if ((i10 & 1) != 0 && !qVar.y()) {
                qVar.R();
                if ((i11 & 16) != 0) {
                    i18 &= -57345;
                }
            } else if ((i11 & 16) != 0) {
                androidx.lifecycle.r1 a10 = r7.a.a(qVar);
                if (a10 != null) {
                    pl.f o6 = tb.a.o(a10, qVar);
                    if (a10 instanceof androidx.lifecycle.o) {
                        cVar = ((androidx.lifecycle.o) a10).getDefaultViewModelCreationExtras();
                    } else {
                        cVar = q7.a.f28123b;
                    }
                    i18 &= -57345;
                    readShareOptionsViewModel4 = (ReadShareOptionsViewModel) gg.b.j0(kotlin.jvm.internal.e0.f20562a.b(ReadShareOptionsViewModel.class), a10, null, o6, cVar, qVar);
                    qVar.q();
                    final ReadShareOptionsState readShareOptionsState = (ReadShareOptionsState) u2.r.o(readShareOptionsViewModel4.getStateFlow(), qVar, 0).getValue();
                    boolean h10 = qVar.h(readShareOptionsViewModel4);
                    if ((i18 & 14) == 4) {
                        z11 = true;
                    }
                    z10 = h10 | z11;
                    L = qVar.L();
                    if (!z10 || L == u2.l.f33918a) {
                        L = new ReadShareOptionsSheetKt$ReadShareOptionsSheet$1$1(readShareOptionsViewModel4, str, null);
                        qVar.h0(L);
                    }
                    u2.r.f((ho.p) L, str, qVar);
                    BottomSheetScaffoldKt.m1899BottomSheetScaffoldjb40ds(false, false, 0L, t2.u.P, aVar, false, (ho.r) c3.k.d(437231856, true, new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.reads.t0
                        @Override // ho.r
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            sn.z ReadShareOptionsSheet$lambda$1;
                            int intValue = ((Integer) obj4).intValue();
                            ReadShareOptionsSheet$lambda$1 = ReadShareOptionsSheetKt.ReadShareOptionsSheet$lambda$1(ReadShareOptionsState.this, aVar, aVar2, aVar3, (r1.y) obj, (BottomSheetControl) obj2, (u2.m) obj3, intValue);
                            return ReadShareOptionsSheet$lambda$1;
                        }
                    }, qVar), (u2.m) qVar, ((i18 << 9) & 57344) | 1572864, 47);
                    qVar = qVar;
                    readShareOptionsViewModel3 = readShareOptionsViewModel4;
                } else {
                    c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
            }
            readShareOptionsViewModel4 = readShareOptionsViewModel2;
            qVar.q();
            final ReadShareOptionsState readShareOptionsState2 = (ReadShareOptionsState) u2.r.o(readShareOptionsViewModel4.getStateFlow(), qVar, 0).getValue();
            boolean h102 = qVar.h(readShareOptionsViewModel4);
            if ((i18 & 14) == 4) {
            }
            z10 = h102 | z11;
            L = qVar.L();
            if (!z10) {
            }
            L = new ReadShareOptionsSheetKt$ReadShareOptionsSheet$1$1(readShareOptionsViewModel4, str, null);
            qVar.h0(L);
            u2.r.f((ho.p) L, str, qVar);
            BottomSheetScaffoldKt.m1899BottomSheetScaffoldjb40ds(false, false, 0L, t2.u.P, aVar, false, (ho.r) c3.k.d(437231856, true, new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.reads.t0
                @Override // ho.r
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    sn.z ReadShareOptionsSheet$lambda$1;
                    int intValue = ((Integer) obj4).intValue();
                    ReadShareOptionsSheet$lambda$1 = ReadShareOptionsSheetKt.ReadShareOptionsSheet$lambda$1(ReadShareOptionsState.this, aVar, aVar2, aVar3, (r1.y) obj, (BottomSheetControl) obj2, (u2.m) obj3, intValue);
                    return ReadShareOptionsSheet$lambda$1;
                }
            }, qVar), (u2.m) qVar, ((i18 << 9) & 57344) | 1572864, 47);
            qVar = qVar;
            readShareOptionsViewModel3 = readShareOptionsViewModel4;
        } else {
            qVar.R();
            readShareOptionsViewModel3 = readShareOptionsViewModel2;
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.components.explore.p(str, aVar, aVar2, aVar3, readShareOptionsViewModel3, i10, i11);
        }
    }

    public static final sn.z ReadShareOptionsSheet$lambda$1(ReadShareOptionsState readShareOptionsState, final ho.a aVar, final ho.a aVar2, final ho.a aVar3, r1.y yVar, BottomSheetControl bottomSheetControl, u2.m mVar, int i10) {
        yVar.getClass();
        bottomSheetControl.getClass();
        u2.q qVar = (u2.q) mVar;
        boolean f10 = qVar.f(aVar2) | qVar.f(aVar);
        Object L = qVar.L();
        u2.e eVar = u2.l.f33918a;
        if (f10 || L == eVar) {
            final int i11 = 0;
            L = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.reads.s0
                @Override // ho.a
                public final Object invoke() {
                    sn.z ReadShareOptionsSheet$lambda$1$0$0;
                    sn.z ReadShareOptionsSheet$lambda$1$1$0;
                    switch (i11) {
                        case 0:
                            ReadShareOptionsSheet$lambda$1$0$0 = ReadShareOptionsSheetKt.ReadShareOptionsSheet$lambda$1$0$0(aVar2, aVar);
                            return ReadShareOptionsSheet$lambda$1$0$0;
                        default:
                            ReadShareOptionsSheet$lambda$1$1$0 = ReadShareOptionsSheetKt.ReadShareOptionsSheet$lambda$1$1$0(aVar2, aVar);
                            return ReadShareOptionsSheet$lambda$1$1$0;
                    }
                }
            };
            qVar.h0(L);
        }
        ho.a aVar4 = (ho.a) L;
        boolean f11 = qVar.f(aVar3) | qVar.f(aVar);
        Object L2 = qVar.L();
        if (f11 || L2 == eVar) {
            final int i12 = 1;
            L2 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.reads.s0
                @Override // ho.a
                public final Object invoke() {
                    sn.z ReadShareOptionsSheet$lambda$1$0$0;
                    sn.z ReadShareOptionsSheet$lambda$1$1$0;
                    switch (i12) {
                        case 0:
                            ReadShareOptionsSheet$lambda$1$0$0 = ReadShareOptionsSheetKt.ReadShareOptionsSheet$lambda$1$0$0(aVar3, aVar);
                            return ReadShareOptionsSheet$lambda$1$0$0;
                        default:
                            ReadShareOptionsSheet$lambda$1$1$0 = ReadShareOptionsSheetKt.ReadShareOptionsSheet$lambda$1$1$0(aVar3, aVar);
                            return ReadShareOptionsSheet$lambda$1$1$0;
                    }
                }
            };
            qVar.h0(L2);
        }
        ReadShareOptionsSheetUI(readShareOptionsState, aVar, aVar4, (ho.a) L2, qVar, 0);
        return sn.z.f31622a;
    }

    public static final sn.z ReadShareOptionsSheet$lambda$1$0$0(ho.a aVar, ho.a aVar2) {
        aVar.invoke();
        aVar2.invoke();
        return sn.z.f31622a;
    }

    public static final sn.z ReadShareOptionsSheet$lambda$1$1$0(ho.a aVar, ho.a aVar2) {
        aVar.invoke();
        aVar2.invoke();
        return sn.z.f31622a;
    }

    public static final sn.z ReadShareOptionsSheet$lambda$2(String str, ho.a aVar, ho.a aVar2, ho.a aVar3, ReadShareOptionsViewModel readShareOptionsViewModel, int i10, int i11, u2.m mVar, int i12) {
        ReadShareOptionsSheet(str, aVar, aVar2, aVar3, readShareOptionsViewModel, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void ReadShareOptionsSheetUI(ReadShareOptionsState readShareOptionsState, ho.a aVar, ho.a aVar2, ho.a aVar3, u2.m mVar, int i10) {
        ReadShareOptionsState readShareOptionsState2;
        int i11;
        boolean z6;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        int i14;
        int i15;
        readShareOptionsState.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1735322534);
        if ((i10 & 6) == 0) {
            readShareOptionsState2 = readShareOptionsState;
            if (qVar.h(readShareOptionsState2)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i11 = i15 | i10;
        } else {
            readShareOptionsState2 = readShareOptionsState;
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(aVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i11 |= i14;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(aVar2)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i11 |= i13;
        }
        if ((i10 & 3072) == 0) {
            if (qVar.h(aVar3)) {
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
            i3.q qVar2 = i3.q.f13017a;
            i3.t G = r1.d.G(p2.e(qVar2, 1.0f), t2.u.P, 32, 1);
            float f10 = 16;
            r1.h g10 = r1.j.g(f10);
            i3.j jVar = i3.d.B0;
            r1.x a10 = r1.w.a(g10, jVar, qVar, 6);
            int i16 = i11;
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
            ReadMeta read = readShareOptionsState2.getRead();
            if (read == null) {
                qVar.X(-526486020);
                qVar.p(false);
                z11 = true;
            } else {
                qVar.X(-526486019);
                int i17 = i16 << 3;
                defpackage.g.a(read, read.getAuthor(), aVar, 45, 67, qVar, (i17 & 896) | 27648);
                qVar = qVar;
                i3.t G2 = r1.d.G(qVar2, f10, t2.u.P, 2);
                ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                int i18 = ElevenLabsTheme.$stable;
                DividerKt.m1827DivideriJQMabo(G2, elevenLabsTheme.getColor(qVar, i18).getDivider().m2059getLine0d7_KjU(), qVar, 6, 0);
                r1.x a11 = r1.w.a(r1.j.f29230c, jVar, qVar, 0);
                int hashCode2 = Long.hashCode(qVar.T);
                c3.o l7 = qVar.l();
                i3.t c10 = i3.a.c(qVar2, qVar);
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
                if (ReadMetaKt.getCanShare(read)) {
                    qVar.X(-1481207979);
                    z10 = false;
                    z11 = true;
                    ActionRowKt.m1021ActionRowT042LqI(R.drawable.chain_link_4, kj.c.R(qVar, io.elevenlabs.readerapp.R.string.read_share_options_link), defpackage.f.b(elevenLabsTheme, qVar, i18), aVar2, null, qVar, i17 & 7168, 16);
                    qVar.p(false);
                } else {
                    z10 = false;
                    z11 = true;
                    qVar.X(-1480874512);
                    qVar.p(false);
                }
                if (ReadMetaKt.getCanShareAudio(read)) {
                    qVar.X(-1480821657);
                    ActionRowKt.m1021ActionRowT042LqI(R.drawable.musical_note, kj.c.R(qVar, io.elevenlabs.readerapp.R.string.read_share_options_current_clip), defpackage.f.b(elevenLabsTheme, qVar, i18), aVar3, null, qVar, i16 & 7168, 16);
                    qVar.p(z10);
                } else {
                    qVar.X(-1480474736);
                    qVar.p(z10);
                }
                qVar.p(z11);
                qVar.p(z10);
            }
            qVar.p(z11);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new c3.d(readShareOptionsState, aVar, aVar2, aVar3, i10, 10);
        }
    }

    public static final sn.z ReadShareOptionsSheetUI$lambda$1(ReadShareOptionsState readShareOptionsState, ho.a aVar, ho.a aVar2, ho.a aVar3, int i10, u2.m mVar, int i11) {
        ReadShareOptionsSheetUI(readShareOptionsState, aVar, aVar2, aVar3, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
