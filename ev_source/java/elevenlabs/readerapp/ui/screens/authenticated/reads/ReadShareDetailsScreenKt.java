package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import f4.f1;
import io.elevenlabs.domain.model.CoverImageSize;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.ReadMetaKt;
import io.elevenlabs.readerapp.ui.components.ReadMetaCoverKt;
import io.elevenlabs.readerapp.ui.previews.ReadsFactoryKt;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.ButtonIconKt;
import io.elevenlabs.ui.components.ButtonIconSize;
import io.elevenlabs.ui.components.ButtonIconVariant;
import io.elevenlabs.ui.components.ReadItemCoverKt;
import io.elevenlabs.ui.extensions.BoxShadow;
import io.elevenlabs.ui.extensions.BoxShadowKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import java.util.WeakHashMap;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.PeerConnection;
import q2.j7;
import r1.c3;
import r1.i2;
import r1.k2;
import r1.m1;
import r1.p2;
import u2.r1;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000>\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a/\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\u000f\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001aY\u0010\u0019\u001a\u00020\u00032\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a-\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u001f\u0010 \u001a\u000f\u0010!\u001a\u00020\u0003H\u0003¢\u0006\u0004\b!\u0010\"\u001a\u000f\u0010#\u001a\u00020\u0003H\u0007¢\u0006\u0004\b#\u0010\"\u001a\u000f\u0010$\u001a\u00020\u0003H\u0007¢\u0006\u0004\b$\u0010\"¨\u0006'²\u0006\u0010\u0010&\u001a\u0004\u0018\u00010%8\n@\nX\u008a\u008e\u0002"}, d2 = {"", "readId", "Lkotlin/Function0;", "Lsn/z;", "onClose", "Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/ReadShareDetailsViewModel;", "vm", "ReadShareDetailsScreen", "(Ljava/lang/String;Lho/a;Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/ReadShareDetailsViewModel;Lu2/m;II)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/ReadShareDetailsState;", RemoteConfigConstants.ResponseFieldKey.STATE, "Li3/t;", "modifier", "ReadShareDetailsScreenUI", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/ReadShareDetailsState;Lho/a;Li3/t;Lu2/m;II)V", "ShareDetailsHeader", "(Lho/a;Li3/t;Lu2/m;II)V", "Lio/elevenlabs/domain/model/ReadMeta;", "read", "ReadShareDetailsContent", "(Lio/elevenlabs/domain/model/ReadMeta;Lu2/m;I)V", "onWhatsAppClick", "onInstagramClick", "onTwitterClick", "onMoreClick", "ShareActions", "(Lho/a;Lho/a;Lho/a;Lho/a;Li3/t;Lu2/m;II)V", "title", "", ParameterNames.ICON, "onClick", "ShareActionButton", "(Ljava/lang/String;ILho/a;Lu2/m;I)V", "ElevenReaderBrandRow", "(Lu2/m;I)V", "Preview_ReadShareDetailsScreen_WithBookRead", "Preview_ReadShareDetailsScreen_WithShareSheet", "Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/ReadLinkShareOption;", "showShareSheet", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ReadShareDetailsScreenKt {
    private static final void ElevenReaderBrandRow(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1786854562);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            k2 a10 = i2.a(r1.j.g(4), i3.d.f13005z0, qVar, 54);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.q qVar2 = i3.q.f13017a;
            i3.t c5 = i3.a.c(qVar2, qVar);
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
            l1.n.c(kd.a.M(R.drawable.elevenlabs_brand, qVar, 0), null, p2.o(qVar2, 16), null, null, t2.u.P, null, qVar, u3.c.$stable | 432, 120);
            String R = kj.c.R(qVar, io.elevenlabs.readerapp.R.string.read_share_details_brand);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i11 = ElevenLabsTheme.$stable;
            j7.d(R, null, elevenLabsTheme.getColors(qVar, i11).getShareDetailsSecondaryText(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i11).getButtonSmallEleven700(), qVar, 0, 0, 131066);
            qVar = qVar;
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new m0(i10, 8);
        }
    }

    public static final sn.z ElevenReaderBrandRow$lambda$1(int i10, u2.m mVar, int i11) {
        ElevenReaderBrandRow(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ReadShareDetailsScreen_WithBookRead(u2.m mVar, int i10) {
        boolean z6;
        ReadMeta copy;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(745711891);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            copy = r5.copy((r84 & 1) != 0 ? r5.articleImageUrl : null, (r84 & 2) != 0 ? r5.author : "F. Scott Fitzgerald", (r84 & 4) != 0 ? r5.chapters : null, (r84 & 8) != 0 ? r5.charCount : 0L, (r84 & 16) != 0 ? r5.createdAt : null, (r84 & 32) != 0 ? r5.updatedAt : null, (r84 & 64) != 0 ? r5.addedAt : null, (r84 & 128) != 0 ? r5.description : null, (r84 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r5.lastListenedCharOffset : 0L, (r84 & 512) != 0 ? r5.readId : null, (r84 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r5.source : null, (r84 & 2048) != 0 ? r5.title : "The Great Gatsby", (r84 & 4096) != 0 ? r5.subtitle : null, (r84 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r5.url : null, (r84 & 16384) != 0 ? r5.wordCount : 0L, (r84 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r5.originalFileType : null, (r84 & 65536) != 0 ? r5.hasOriginalAudio : false, (r84 & 131072) != 0 ? r5.matureContent : false, (r84 & 262144) != 0 ? r5.origin : null, (r84 & 524288) != 0 ? r5.contentType : null, (r84 & 1048576) != 0 ? r5.genre : null, (r84 & 2097152) != 0 ? r5.isBookType : true, (r84 & 4194304) != 0 ? r5.fromUserImport : false, (r84 & 8388608) != 0 ? r5.rating : null, (r84 & 16777216) != 0 ? r5.userRating : null, (r84 & 33554432) != 0 ? r5.lastUsedVoiceId : null, (r84 & 67108864) != 0 ? r5.creationStatus : null, (r84 & 134217728) != 0 ? r5.creationProgress : null, (r84 & 268435456) != 0 ? r5.isArchived : false, (r84 & 536870912) != 0 ? r5.markedAsUnread : false, (r84 & 1073741824) != 0 ? r5.completedAt : null, (r84 & Integer.MIN_VALUE) != 0 ? r5.publicationDate : null, (r85 & 1) != 0 ? r5.language : null, (r85 & 2) != 0 ? r5.publisherProfileId : null, (r85 & 4) != 0 ? r5.canDelete : false, (r85 & 8) != 0 ? r5.androidProductId : null, (r85 & 16) != 0 ? r5.isPaid : false, (r85 & 32) != 0 ? r5.offlineReadData : null, (r85 & 64) != 0 ? r5.previewAudio : null, (r85 & 128) != 0 ? r5.originalVoice : null, (r85 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r5.voiceSelectionConfig : null, (r85 & 512) != 0 ? r5.sampleConfig : null, (r85 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r5.displayMode : null, (r85 & 2048) != 0 ? r5.inUserLibrary : false, (r85 & 4096) != 0 ? r5.canUseAssistant : false, (r85 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r5.audioType : null, (r85 & 16384) != 0 ? r5.useDrm : false, (r85 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r5.lastListenedAudioFileNumber : null, (r85 & 65536) != 0 ? r5.lastListenedAudioSeconds : null, (r85 & 131072) != 0 ? r5.audioDurationSeconds : null, (r85 & 262144) != 0 ? r5.audioTypes : null, (r85 & 524288) != 0 ? r5.isVoiceChangerOn : false, (r85 & 1048576) != 0 ? r5.lastUsedAudioType : null, (r85 & 2097152) != 0 ? r5.coverImageUrls : null, (r85 & 4194304) != 0 ? r5.coverAspectRatio : null, (r85 & 8388608) != 0 ? ReadsFactoryKt.stubReadMeta$default(null, 1, null).blurPlaceholder : null);
            ReadShareDetailsState readShareDetailsState = new ReadShareDetailsState(copy, null, 2, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new k0(8);
                qVar.h0(L);
            }
            ReadShareDetailsScreenUI(readShareDetailsState, (ho.a) L, null, qVar, 48, 4);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new m0(i10, 7);
        }
    }

    public static final sn.z Preview_ReadShareDetailsScreen_WithBookRead$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_ReadShareDetailsScreen_WithBookRead(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ReadShareDetailsScreen_WithShareSheet(u2.m mVar, int i10) {
        boolean z6;
        ReadMeta copy;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1388484876);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            copy = r5.copy((r84 & 1) != 0 ? r5.articleImageUrl : null, (r84 & 2) != 0 ? r5.author : "F. Scott Fitzgerald", (r84 & 4) != 0 ? r5.chapters : null, (r84 & 8) != 0 ? r5.charCount : 0L, (r84 & 16) != 0 ? r5.createdAt : null, (r84 & 32) != 0 ? r5.updatedAt : null, (r84 & 64) != 0 ? r5.addedAt : null, (r84 & 128) != 0 ? r5.description : null, (r84 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r5.lastListenedCharOffset : 0L, (r84 & 512) != 0 ? r5.readId : null, (r84 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r5.source : null, (r84 & 2048) != 0 ? r5.title : "The Great Gatsby", (r84 & 4096) != 0 ? r5.subtitle : null, (r84 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r5.url : null, (r84 & 16384) != 0 ? r5.wordCount : 0L, (r84 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r5.originalFileType : null, (r84 & 65536) != 0 ? r5.hasOriginalAudio : false, (r84 & 131072) != 0 ? r5.matureContent : false, (r84 & 262144) != 0 ? r5.origin : null, (r84 & 524288) != 0 ? r5.contentType : null, (r84 & 1048576) != 0 ? r5.genre : null, (r84 & 2097152) != 0 ? r5.isBookType : false, (r84 & 4194304) != 0 ? r5.fromUserImport : false, (r84 & 8388608) != 0 ? r5.rating : null, (r84 & 16777216) != 0 ? r5.userRating : null, (r84 & 33554432) != 0 ? r5.lastUsedVoiceId : null, (r84 & 67108864) != 0 ? r5.creationStatus : null, (r84 & 134217728) != 0 ? r5.creationProgress : null, (r84 & 268435456) != 0 ? r5.isArchived : false, (r84 & 536870912) != 0 ? r5.markedAsUnread : false, (r84 & 1073741824) != 0 ? r5.completedAt : null, (r84 & Integer.MIN_VALUE) != 0 ? r5.publicationDate : null, (r85 & 1) != 0 ? r5.language : null, (r85 & 2) != 0 ? r5.publisherProfileId : null, (r85 & 4) != 0 ? r5.canDelete : false, (r85 & 8) != 0 ? r5.androidProductId : null, (r85 & 16) != 0 ? r5.isPaid : false, (r85 & 32) != 0 ? r5.offlineReadData : null, (r85 & 64) != 0 ? r5.previewAudio : null, (r85 & 128) != 0 ? r5.originalVoice : null, (r85 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r5.voiceSelectionConfig : null, (r85 & 512) != 0 ? r5.sampleConfig : null, (r85 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r5.displayMode : null, (r85 & 2048) != 0 ? r5.inUserLibrary : false, (r85 & 4096) != 0 ? r5.canUseAssistant : false, (r85 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r5.audioType : null, (r85 & 16384) != 0 ? r5.useDrm : false, (r85 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r5.lastListenedAudioFileNumber : null, (r85 & 65536) != 0 ? r5.lastListenedAudioSeconds : null, (r85 & 131072) != 0 ? r5.audioDurationSeconds : null, (r85 & 262144) != 0 ? r5.audioTypes : null, (r85 & 524288) != 0 ? r5.isVoiceChangerOn : false, (r85 & 1048576) != 0 ? r5.lastUsedAudioType : null, (r85 & 2097152) != 0 ? r5.coverImageUrls : null, (r85 & 4194304) != 0 ? r5.coverAspectRatio : null, (r85 & 8388608) != 0 ? ReadsFactoryKt.stubReadMeta$default(null, 1, null).blurPlaceholder : null);
            ReadShareDetailsState readShareDetailsState = new ReadShareDetailsState(copy, ReadLinkShareOption.Whatsapp);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new k0(9);
                qVar.h0(L);
            }
            ReadShareDetailsScreenUI(readShareDetailsState, (ho.a) L, null, qVar, 48, 4);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new m0(i10, 9);
        }
    }

    public static final sn.z Preview_ReadShareDetailsScreen_WithShareSheet$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_ReadShareDetailsScreen_WithShareSheet(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    private static final void ReadShareDetailsContent(ReadMeta readMeta, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        CoverImageSize coverImageSize;
        h4.e eVar;
        ElevenLabsTheme elevenLabsTheme;
        int i13;
        h4.e eVar2;
        h4.d dVar;
        i3.l lVar;
        boolean z10;
        h4.e eVar3;
        float f10;
        ElevenLabsTheme elevenLabsTheme2;
        h4.e eVar4;
        u2.q qVar;
        h4.e eVar5;
        i3.q qVar2;
        h4.e eVar6;
        h4.e eVar7;
        h4.f fVar;
        int i14;
        int i15;
        ReadMeta readMeta2 = readMeta;
        u2.q qVar3 = (u2.q) mVar;
        qVar3.Z(-1028995120);
        if ((i10 & 6) == 0) {
            if (qVar3.h(readMeta2)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i11 = i10 | i15;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar3.O(i11 & 1, z6)) {
            i3.q qVar4 = i3.q.f13017a;
            i3.t d10 = p2.d(qVar4, 1.0f);
            ElevenLabsTheme elevenLabsTheme3 = ElevenLabsTheme.INSTANCE;
            int i16 = ElevenLabsTheme.$stable;
            i3.t c5 = m3.h.c(r1.d.G(d10, elevenLabsTheme3.getSpacings(qVar3, i16).m2353getX2D9Ej5fM(), t2.u.P, 2), elevenLabsTheme3.getShapes(qVar3, i16).getXl());
            i3.l lVar2 = i3.d.f12997a;
            f1 d11 = r1.p.d(lVar2, false);
            int hashCode = Long.hashCode(qVar3.T);
            c3.o l4 = qVar3.l();
            i3.t c10 = i3.a.c(c5, qVar3);
            h4.h.f11920i.getClass();
            int i17 = i11;
            h4.f fVar2 = h4.g.f11903b;
            qVar3.b0();
            if (qVar3.S) {
                qVar3.k(fVar2);
            } else {
                qVar3.k0();
            }
            h4.e eVar8 = h4.g.f11907f;
            u2.r.J(eVar8, d11, qVar3);
            h4.e eVar9 = h4.g.f11906e;
            u2.r.J(eVar9, l4, qVar3);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar10 = h4.g.f11908g;
            u2.r.y(qVar3, valueOf, eVar10);
            h4.d dVar2 = h4.g.f11909h;
            u2.r.F(dVar2, qVar3);
            h4.e eVar11 = h4.g.f11905d;
            u2.r.J(eVar11, c10, qVar3);
            i3.t d12 = p2.d(qVar4, 1.0f);
            f1 d13 = r1.p.d(lVar2, false);
            int hashCode2 = Long.hashCode(qVar3.T);
            c3.o l7 = qVar3.l();
            i3.t c11 = i3.a.c(d12, qVar3);
            qVar3.b0();
            if (qVar3.S) {
                qVar3.k(fVar2);
            } else {
                qVar3.k0();
            }
            u2.r.J(eVar8, d13, qVar3);
            u2.r.J(eVar9, l7, qVar3);
            defpackage.f.u(hashCode2, qVar3, eVar10, qVar3, dVar2);
            u2.r.J(eVar11, c11, qVar3);
            CoverImageSize coverImageSize2 = CoverImageSize.Large;
            String coverImageUrl = ReadMetaKt.coverImageUrl(readMeta2, coverImageSize2);
            p3.w0 w0Var = p3.h0.f26395b;
            if (coverImageUrl != null) {
                qVar3.X(688718035);
                eVar = eVar11;
                i13 = i16;
                lVar = lVar2;
                dVar = dVar2;
                elevenLabsTheme = elevenLabsTheme3;
                z10 = false;
                coverImageSize = coverImageSize2;
                eVar3 = eVar10;
                eVar2 = eVar9;
                qc.m.b(coverImageUrl, null, m3.h.b(p2.d(qVar4, 1.0f), 100, w0Var), null, f4.q.Y, null, qVar3, 14156208, 3896);
                qVar3.p(false);
                f10 = 1.0f;
            } else {
                coverImageSize = coverImageSize2;
                eVar = eVar11;
                elevenLabsTheme = elevenLabsTheme3;
                i13 = i16;
                eVar2 = eVar9;
                dVar = dVar2;
                lVar = lVar2;
                z10 = false;
                eVar3 = eVar10;
                qVar3.X(689090066);
                f10 = 1.0f;
                r1.p.a(m3.h.a(m3.h.b(p2.d(l1.n.h(qVar4, elevenLabsTheme.getColors(qVar3, i13).getShareDetailsContentPlaceholder(), w0Var), 1.0f), 100, w0Var), 0.9f), qVar3, 0);
                qVar3.p(false);
            }
            qVar3.p(true);
            i3.t d14 = p2.d(qVar4, f10);
            f1 d15 = r1.p.d(i3.d.f13001e, z10);
            int hashCode3 = Long.hashCode(qVar3.T);
            c3.o l10 = qVar3.l();
            i3.t c12 = i3.a.c(d14, qVar3);
            qVar3.b0();
            if (qVar3.S) {
                qVar3.k(fVar2);
            } else {
                qVar3.k0();
            }
            u2.r.J(eVar8, d15, qVar3);
            u2.r.J(eVar2, l10, qVar3);
            h4.e eVar12 = eVar3;
            h4.d dVar3 = dVar;
            defpackage.f.u(hashCode3, qVar3, eVar12, qVar3, dVar3);
            h4.e eVar13 = eVar;
            u2.r.J(eVar13, c12, qVar3);
            i3.t E = r1.d.E(qVar4, elevenLabsTheme.getSpacings(qVar3, i13).m2356getX4D9Ej5fM());
            i3.j jVar = i3.d.C0;
            r1.u0 u0Var = r1.j.f29228a;
            r1.x a10 = r1.w.a(r1.j.g(elevenLabsTheme.getSpacings(qVar3, i13).m2356getX4D9Ej5fM()), jVar, qVar3, 48);
            ElevenLabsTheme elevenLabsTheme4 = elevenLabsTheme;
            int hashCode4 = Long.hashCode(qVar3.T);
            c3.o l11 = qVar3.l();
            i3.t c13 = i3.a.c(E, qVar3);
            qVar3.b0();
            if (qVar3.S) {
                qVar3.k(fVar2);
            } else {
                qVar3.k0();
            }
            u2.r.J(eVar8, a10, qVar3);
            u2.r.J(eVar2, l11, qVar3);
            defpackage.f.u(hashCode4, qVar3, eVar12, qVar3, dVar3);
            u2.r.J(eVar13, c13, qVar3);
            if (readMeta.isBookType()) {
                qVar3.X(-838229274);
                float f11 = 0;
                elevenLabsTheme2 = elevenLabsTheme4;
                ReadItemCoverKt.ReadItemCover(readMeta.getTitle(), ReadMetaKt.coverImageUrl(readMeta, coverImageSize), m3.h.c(BoxShadowKt.boxShadow$default(p2.f(p2.s(qVar4, 200), 302), new BoxShadow[]{new BoxShadow(p3.x.b(0.4f, p3.x.f26427b), 36, t2.u.P, (Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(18) & 4294967295L), false, 20, null), new BoxShadow(p3.x.b(0.04f, p3.x.f26431f), 5, t2.u.P, (Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L), false, 20, null)}, null, false, 6, null), elevenLabsTheme2.getShapes(qVar3, i13).getSm()), qVar3, 0);
                qVar3.p(false);
                eVar4 = eVar2;
                qVar = qVar3;
                eVar5 = eVar13;
                i14 = i13;
                fVar = fVar2;
                qVar2 = qVar4;
                eVar6 = eVar12;
                readMeta2 = readMeta;
                eVar7 = eVar8;
            } else {
                elevenLabsTheme2 = elevenLabsTheme4;
                qVar3.X(-837232159);
                i3.t c14 = m3.h.c(BoxShadowKt.boxShadow$default(p2.o(qVar4, 200), new BoxShadow[]{new BoxShadow(p3.x.b(0.4f, p3.x.f26427b), 8, t2.u.P, (Float.floatToRawIntBits(0) << 32) | (Float.floatToRawIntBits(4) & 4294967295L), false, 20, null)}, null, false, 6, null), elevenLabsTheme2.getShapes(qVar3, i13).getMd());
                f1 d16 = r1.p.d(lVar, false);
                int hashCode5 = Long.hashCode(qVar3.T);
                c3.o l12 = qVar3.l();
                i3.t c15 = i3.a.c(c14, qVar3);
                qVar3.b0();
                if (qVar3.S) {
                    qVar3.k(fVar2);
                } else {
                    qVar3.k0();
                }
                u2.r.J(eVar8, d16, qVar3);
                u2.r.J(eVar2, l12, qVar3);
                defpackage.f.u(hashCode5, qVar3, eVar12, qVar3, dVar3);
                u2.r.J(eVar13, c15, qVar3);
                eVar4 = eVar2;
                qVar = qVar3;
                eVar5 = eVar13;
                qVar2 = qVar4;
                eVar6 = eVar12;
                eVar7 = eVar8;
                fVar = fVar2;
                i14 = i13;
                readMeta2 = readMeta;
                ReadMetaCoverKt.ReadMetaCover(readMeta2, null, null, qVar, i17 & 14, 6);
                qVar.p(true);
                qVar.p(false);
            }
            i3.q qVar5 = qVar2;
            i3.t s10 = p2.s(qVar5, 200);
            r1.x a11 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 48);
            int hashCode6 = Long.hashCode(qVar.T);
            c3.o l13 = qVar.l();
            i3.t c16 = i3.a.c(s10, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar7, a11, qVar);
            u2.r.J(eVar4, l13, qVar);
            defpackage.f.u(hashCode6, qVar, eVar6, qVar, dVar3);
            u2.r.J(eVar5, c16, qVar);
            i12 = 1;
            ElevenLabsTheme elevenLabsTheme5 = elevenLabsTheme2;
            u2.q qVar6 = qVar;
            j7.d(readMeta2.getTitle(), r1.d.I(qVar5, t2.u.P, t2.u.P, t2.u.P, 8, 7), elevenLabsTheme2.getColors(qVar, i14).getShareDetailsPrimaryText(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme2.getTypo(qVar, i14).getButtonLargeEleven700(), qVar6, 48, 0, 131064);
            qVar3 = qVar6;
            String author = readMeta2.getAuthor();
            if (author == null) {
                qVar3.X(-1929083219);
                qVar3.p(false);
            } else {
                qVar3.X(-1929083218);
                j7.d(author, r1.d.I(qVar5, t2.u.P, t2.u.P, t2.u.P, 16, 7), elevenLabsTheme5.getColors(qVar3, i14).getShareDetailsSecondaryText(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme5.getTypo(qVar3, i14).getButtonSmallEleven700(), qVar3, 48, 0, 131064);
                qVar3 = qVar3;
                qVar3.p(false);
            }
            ElevenReaderBrandRow(qVar3, 0);
            qVar3.p(true);
            qVar3.p(true);
            qVar3.p(true);
            qVar3.p(true);
        } else {
            i12 = 1;
            qVar3.R();
        }
        r1 r10 = qVar3.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.components.f0(readMeta2, i10, i12);
        }
    }

    public static final sn.z ReadShareDetailsContent$lambda$1(ReadMeta readMeta, int i10, u2.m mVar, int i11) {
        ReadShareDetailsContent(readMeta, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ReadShareDetailsScreen(String str, ho.a aVar, ReadShareDetailsViewModel readShareDetailsViewModel, u2.m mVar, int i10, int i11) {
        int i12;
        boolean z6;
        ReadShareDetailsViewModel readShareDetailsViewModel2;
        q7.c cVar;
        ReadShareDetailsViewModel readShareDetailsViewModel3;
        boolean z10;
        Object L;
        int i13;
        int i14;
        int i15;
        str.getClass();
        aVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1250335920);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(aVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i10 & 384) == 0) {
            if ((i11 & 4) == 0 && qVar.h(readShareDetailsViewModel)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        boolean z11 = false;
        if ((i12 & 147) != 146) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i12 & 1, z6)) {
            qVar.T();
            if ((i10 & 1) != 0 && !qVar.y()) {
                qVar.R();
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                }
            } else if ((i11 & 4) != 0) {
                androidx.lifecycle.r1 a10 = r7.a.a(qVar);
                if (a10 != null) {
                    pl.f o6 = tb.a.o(a10, qVar);
                    if (a10 instanceof androidx.lifecycle.o) {
                        cVar = ((androidx.lifecycle.o) a10).getDefaultViewModelCreationExtras();
                    } else {
                        cVar = q7.a.f28123b;
                    }
                    readShareDetailsViewModel3 = (ReadShareDetailsViewModel) gg.b.j0(kotlin.jvm.internal.e0.f20562a.b(ReadShareDetailsViewModel.class), a10, null, o6, cVar, qVar);
                    i12 &= -897;
                    qVar.q();
                    ReadShareDetailsState readShareDetailsState = (ReadShareDetailsState) u2.r.o(readShareDetailsViewModel3.getStateFlow(), qVar, 0).getValue();
                    boolean h10 = qVar.h(readShareDetailsViewModel3);
                    if ((i12 & 14) == 4) {
                        z11 = true;
                    }
                    z10 = h10 | z11;
                    L = qVar.L();
                    if (!z10 || L == u2.l.f33918a) {
                        L = new ReadShareDetailsScreenKt$ReadShareDetailsScreen$1$1(readShareDetailsViewModel3, str, null);
                        qVar.h0(L);
                    }
                    u2.r.f((ho.p) L, str, qVar);
                    ReadShareDetailsScreenUI(readShareDetailsState, aVar, null, qVar, i12 & 112, 4);
                    qVar = qVar;
                    readShareDetailsViewModel2 = readShareDetailsViewModel3;
                } else {
                    c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
            }
            readShareDetailsViewModel3 = readShareDetailsViewModel;
            qVar.q();
            ReadShareDetailsState readShareDetailsState2 = (ReadShareDetailsState) u2.r.o(readShareDetailsViewModel3.getStateFlow(), qVar, 0).getValue();
            boolean h102 = qVar.h(readShareDetailsViewModel3);
            if ((i12 & 14) == 4) {
            }
            z10 = h102 | z11;
            L = qVar.L();
            if (!z10) {
            }
            L = new ReadShareDetailsScreenKt$ReadShareDetailsScreen$1$1(readShareDetailsViewModel3, str, null);
            qVar.h0(L);
            u2.r.f((ho.p) L, str, qVar);
            ReadShareDetailsScreenUI(readShareDetailsState2, aVar, null, qVar, i12 & 112, 4);
            qVar = qVar;
            readShareDetailsViewModel2 = readShareDetailsViewModel3;
        } else {
            qVar.R();
            readShareDetailsViewModel2 = readShareDetailsViewModel;
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.c(str, aVar, readShareDetailsViewModel2, i10, i11, 24);
        }
    }

    public static final sn.z ReadShareDetailsScreen$lambda$1(String str, ho.a aVar, ReadShareDetailsViewModel readShareDetailsViewModel, int i10, int i11, u2.m mVar, int i12) {
        ReadShareDetailsScreen(str, aVar, readShareDetailsViewModel, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void ReadShareDetailsScreenUI(ReadShareDetailsState readShareDetailsState, ho.a aVar, i3.t tVar, u2.m mVar, int i10, int i11) {
        ReadShareDetailsState readShareDetailsState2;
        int i12;
        i3.t tVar2;
        int i13;
        boolean z6;
        i3.t tVar3;
        r1 r10;
        i3.t tVar4;
        i3.t tVar5;
        boolean z10;
        int i14;
        int i15;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1013311455);
        if ((i10 & 6) == 0) {
            readShareDetailsState2 = readShareDetailsState;
            if (qVar.h(readShareDetailsState2)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            readShareDetailsState2 = readShareDetailsState;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(aVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        int i16 = i11 & 4;
        if (i16 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            if ((i12 & 147) == 146) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar.O(i12 & 1, z6)) {
                i3.q qVar2 = i3.q.f13017a;
                if (i16 != 0) {
                    tVar4 = qVar2;
                } else {
                    tVar4 = tVar2;
                }
                Object L = qVar.L();
                u2.e eVar = u2.l.f33918a;
                if (L == eVar) {
                    L = u2.r.A(null);
                    qVar.h0(L);
                }
                z0 z0Var = (z0) L;
                ReadMeta read = readShareDetailsState2.getRead();
                if (read == null) {
                    qVar.X(1763830715);
                    qVar.p(false);
                    tVar5 = tVar4;
                } else {
                    qVar.X(1763830716);
                    i3.t d10 = p2.d(tVar4, 1.0f);
                    ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                    int i17 = ElevenLabsTheme.$stable;
                    i3.t h10 = l1.n.h(d10, elevenLabsTheme.getColors(qVar, i17).getShareDetailsBackground(), p3.h0.f26395b);
                    WeakHashMap weakHashMap = c3.f29142x;
                    i3.t P = r1.d.P(h10, r1.u0.e(qVar).f29149g);
                    r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
                    int hashCode = Long.hashCode(qVar.T);
                    c3.o l4 = qVar.l();
                    i3.t c5 = i3.a.c(P, qVar);
                    h4.h.f11920i.getClass();
                    h4.f fVar = h4.g.f11903b;
                    qVar.b0();
                    if (qVar.S) {
                        qVar.k(fVar);
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
                    int i18 = i12;
                    h4.e eVar5 = h4.g.f11905d;
                    u2.r.J(eVar5, c5, qVar);
                    int i19 = i18 >> 3;
                    tVar5 = tVar4;
                    ShareDetailsHeader(aVar, r1.d.I(qVar2, t2.u.P, elevenLabsTheme.getSpacings(qVar, i17).m2356getX4D9Ej5fM(), t2.u.P, t2.u.P, 13), qVar, i19 & 14, 0);
                    if (1.0f <= 0.0d) {
                        s1.a.a("invalid weight; must be greater than zero");
                    }
                    i3.t G = r1.d.G(new m1(1.0f, true), elevenLabsTheme.getSpacings(qVar, i17).m2353getX2D9Ej5fM(), t2.u.P, 2);
                    f1 d11 = r1.p.d(i3.d.f12997a, false);
                    int hashCode2 = Long.hashCode(qVar.T);
                    c3.o l7 = qVar.l();
                    i3.t c10 = i3.a.c(G, qVar);
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
                    ReadShareDetailsContent(read, qVar, 0);
                    qVar.p(true);
                    Object L2 = qVar.L();
                    if (L2 == eVar) {
                        L2 = new n(z0Var, 5);
                        qVar.h0(L2);
                    }
                    ho.a aVar2 = (ho.a) L2;
                    Object L3 = qVar.L();
                    if (L3 == eVar) {
                        L3 = new n(z0Var, 6);
                        qVar.h0(L3);
                    }
                    ho.a aVar3 = (ho.a) L3;
                    Object L4 = qVar.L();
                    if (L4 == eVar) {
                        L4 = new n(z0Var, 7);
                        qVar.h0(L4);
                    }
                    ShareActions(aVar2, null, aVar3, (ho.a) L4, r1.d.I(qVar2, t2.u.P, t2.u.P, t2.u.P, elevenLabsTheme.getSpacings(qVar, i17).m2358getX6D9Ej5fM(), 7), qVar, 3462, 2);
                    qVar.p(true);
                    ReadLinkShareOption ReadShareDetailsScreenUI$lambda$1 = ReadShareDetailsScreenUI$lambda$1(z0Var);
                    if (ReadShareDetailsScreenUI$lambda$1 == null) {
                        qVar.X(-24972158);
                        z10 = false;
                        qVar.p(false);
                    } else {
                        qVar.X(-24972157);
                        Object L5 = qVar.L();
                        if (L5 == eVar) {
                            L5 = new n(z0Var, 4);
                            qVar.h0(L5);
                        }
                        ReadLinkShareSheetKt.ReadLinkShareSheet(read, ReadShareDetailsScreenUI$lambda$1, (ho.a) L5, null, qVar, 384, 8);
                        qVar = qVar;
                        z10 = false;
                        qVar.p(false);
                    }
                    qVar.p(z10);
                }
                tVar3 = tVar5;
            } else {
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.c(readShareDetailsState, aVar, tVar3, i10, i11, 23);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i12 & 147) == 146) {
        }
        if (!qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    private static final ReadLinkShareOption ReadShareDetailsScreenUI$lambda$1(z0 z0Var) {
        return (ReadLinkShareOption) z0Var.getValue();
    }

    public static final sn.z ReadShareDetailsScreenUI$lambda$3$0$1$0(z0 z0Var) {
        z0Var.setValue(ReadLinkShareOption.Whatsapp);
        return sn.z.f31622a;
    }

    public static final sn.z ReadShareDetailsScreenUI$lambda$3$0$2$0(z0 z0Var) {
        z0Var.setValue(ReadLinkShareOption.Twitter);
        return sn.z.f31622a;
    }

    public static final sn.z ReadShareDetailsScreenUI$lambda$3$0$3$0(z0 z0Var) {
        z0Var.setValue(ReadLinkShareOption.More);
        return sn.z.f31622a;
    }

    public static final sn.z ReadShareDetailsScreenUI$lambda$3$1$0$0(z0 z0Var) {
        z0Var.setValue(null);
        return sn.z.f31622a;
    }

    public static final sn.z ReadShareDetailsScreenUI$lambda$4(ReadShareDetailsState readShareDetailsState, ho.a aVar, i3.t tVar, int i10, int i11, u2.m mVar, int i12) {
        ReadShareDetailsScreenUI(readShareDetailsState, aVar, tVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    private static final void ShareActionButton(String str, int i10, ho.a aVar, u2.m mVar, int i11) {
        int i12;
        ho.a aVar2;
        boolean z6;
        int i13;
        int i14;
        int i15;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(508266514);
        if ((i11 & 6) == 0) {
            if (qVar.f(str)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            if (qVar.d(i10)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 384) == 0) {
            aVar2 = aVar;
            if (qVar.h(aVar2)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        } else {
            aVar2 = aVar;
        }
        if ((i12 & 147) != 146) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i12 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            i3.t p10 = l1.n.p(p2.s(qVar2, 77), false, null, null, null, aVar2, 15);
            r1.x a10 = r1.w.a(r1.j.g(6), i3.d.C0, qVar, 54);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(p10, qVar);
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
            i3.t o6 = p2.o(qVar2, 50);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i16 = ElevenLabsTheme.$stable;
            int i17 = i12;
            i3.t h10 = l1.n.h(o6, elevenLabsTheme.getColors(qVar, i16).getShareDetailsActionBackground(), z1.h.f39128a);
            f1 d10 = r1.p.d(i3.d.f13001e, false);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c10 = i3.a.c(h10, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar, d10, qVar);
            u2.r.J(eVar2, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c10, qVar);
            l1.n.c(kd.a.M(i10, qVar, (i17 >> 3) & 14), str, p2.o(qVar2, 24), null, null, t2.u.P, new p3.n(elevenLabsTheme.getColors(qVar, i16).getShareDetailsPrimaryText(), 5), qVar, u3.c.$stable | 384 | ((i17 << 3) & 112), 56);
            qVar.p(true);
            j7.d(str, null, elevenLabsTheme.getColors(qVar, i16).getShareDetailsPrimaryText(), 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i16).getBodyXSmall500(), qVar, i17 & 14, 0, 130042);
            qVar = qVar;
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new h0(str, i10, aVar, i11, 1);
        }
    }

    public static final sn.z ShareActionButton$lambda$1(String str, int i10, ho.a aVar, int i11, u2.m mVar, int i12) {
        ShareActionButton(str, i10, aVar, mVar, u2.r.M(i11 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ShareActions(ho.a aVar, ho.a aVar2, ho.a aVar3, ho.a aVar4, i3.t tVar, u2.m mVar, int i10, int i11) {
        ho.a aVar5;
        int i12;
        int i13;
        ho.a aVar6;
        int i14;
        int i15;
        i3.t tVar2;
        int i16;
        boolean z6;
        r1 r10;
        int i17;
        int i18;
        aVar3.getClass();
        aVar4.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(2042963070);
        int i19 = i11 & 1;
        if (i19 != 0) {
            i12 = i10 | 6;
            aVar5 = aVar;
        } else if ((i10 & 6) == 0) {
            aVar5 = aVar;
            if (qVar.h(aVar5)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            aVar5 = aVar;
            i12 = i10;
        }
        int i20 = i11 & 2;
        if (i20 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            aVar6 = aVar2;
            if (qVar.h(aVar6)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
            if ((i10 & 384) == 0) {
                if (qVar.h(aVar3)) {
                    i18 = RpcError.MAX_MESSAGE_BYTES;
                } else {
                    i18 = 128;
                }
                i12 |= i18;
            }
            if ((i10 & 3072) == 0) {
                if (qVar.h(aVar4)) {
                    i17 = 2048;
                } else {
                    i17 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i12 |= i17;
            }
            i15 = i11 & 16;
            if (i15 == 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                tVar2 = tVar;
                if (qVar.f(tVar2)) {
                    i16 = 16384;
                } else {
                    i16 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i12 |= i16;
                if ((i12 & 9363) != 9362) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (qVar.O(i12 & 1, z6)) {
                    if (i19 != 0) {
                        aVar5 = null;
                    }
                    if (i20 != 0) {
                        aVar6 = null;
                    }
                    if (i15 != 0) {
                        tVar2 = i3.q.f13017a;
                    }
                    i3.t E = r1.d.E(p2.e(tVar2, 1.0f), 16);
                    r1.u0 u0Var = r1.j.f29228a;
                    k2 a10 = i2.a(r1.j.h(8, i3.d.C0), i3.d.f13004y0, qVar, 6);
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
                    if (aVar5 != null) {
                        qVar.X(-320138664);
                        ShareActionButton(kj.c.R(qVar, io.elevenlabs.readerapp.R.string.share_details_options_whatsapp), R.drawable.whatsapp, aVar5, qVar, (i12 << 6) & 896);
                        qVar.p(false);
                    } else {
                        qVar.X(-319908024);
                        qVar.p(false);
                    }
                    if (aVar6 != null) {
                        qVar.X(-319860811);
                        ShareActionButton(kj.c.R(qVar, io.elevenlabs.readerapp.R.string.share_details_options_instagram), R.drawable.instagram, aVar6, qVar, (i12 << 3) & 896);
                        qVar.p(false);
                    } else {
                        qVar.X(-319627288);
                        qVar.p(false);
                    }
                    ShareActionButton(kj.c.R(qVar, io.elevenlabs.readerapp.R.string.share_details_options_x), R.drawable.twitter, aVar3, qVar, i12 & 896);
                    ShareActionButton(kj.c.R(qVar, io.elevenlabs.readerapp.R.string.share_details_options_more), R.drawable.more_dots, aVar4, qVar, (i12 >> 3) & 896);
                    qVar.p(true);
                } else {
                    qVar.R();
                }
                ho.a aVar7 = aVar5;
                ho.a aVar8 = aVar6;
                i3.t tVar3 = tVar2;
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new io.elevenlabs.readerapp.ui.components.explore.p(aVar7, aVar8, aVar3, aVar4, tVar3, i10, i11);
                    return;
                }
                return;
            }
            tVar2 = tVar;
            if ((i12 & 9363) != 9362) {
            }
            if (qVar.O(i12 & 1, z6)) {
            }
            ho.a aVar72 = aVar5;
            ho.a aVar82 = aVar6;
            i3.t tVar32 = tVar2;
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        aVar6 = aVar2;
        if ((i10 & 384) == 0) {
        }
        if ((i10 & 3072) == 0) {
        }
        i15 = i11 & 16;
        if (i15 == 0) {
        }
        tVar2 = tVar;
        if ((i12 & 9363) != 9362) {
        }
        if (qVar.O(i12 & 1, z6)) {
        }
        ho.a aVar722 = aVar5;
        ho.a aVar822 = aVar6;
        i3.t tVar322 = tVar2;
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final sn.z ShareActions$lambda$1(ho.a aVar, ho.a aVar2, ho.a aVar3, ho.a aVar4, i3.t tVar, int i10, int i11, u2.m mVar, int i12) {
        ShareActions(aVar, aVar2, aVar3, aVar4, tVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void ShareDetailsHeader(ho.a aVar, i3.t tVar, u2.m mVar, int i10, int i11) {
        int i12;
        int i13;
        boolean z6;
        i3.t tVar2;
        i3.t tVar3;
        int i14;
        aVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1842873460);
        if ((i10 & 6) == 0) {
            if (qVar.h(aVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i10 | i14;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (qVar.f(tVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i12 & 1, z6)) {
            if (i15 != 0) {
                tVar3 = i3.q.f13017a;
            } else {
                tVar3 = tVar;
            }
            i3.t E = r1.d.E(p2.e(tVar3, 1.0f), 16);
            k2 a10 = i2.a(r1.j.f29229b, i3.d.f13004y0, qVar, 6);
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
            ButtonIconKt.ButtonIcon(R.drawable.close, kj.c.R(qVar, io.elevenlabs.readerapp.R.string.bottom_sheet_dialog_close), aVar, null, ButtonIconVariant.ShareDetails, ButtonIconSize.Large, false, false, false, qVar, ((i12 << 6) & 896) | 221184, 456);
            qVar.p(true);
            tVar2 = tVar3;
        } else {
            qVar.R();
            tVar2 = tVar;
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new im.b(aVar, tVar2, i10, i11, 5);
        }
    }

    public static final sn.z ShareDetailsHeader$lambda$1(ho.a aVar, i3.t tVar, int i10, int i11, u2.m mVar, int i12) {
        ShareDetailsHeader(aVar, tVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }
}
