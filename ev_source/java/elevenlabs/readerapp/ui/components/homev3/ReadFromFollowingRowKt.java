package io.elevenlabs.readerapp.ui.components.homev3;

import c3.k;
import c3.o;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import fm.e;
import h4.f;
import h4.g;
import i3.a;
import i3.d;
import i3.t;
import ib.i;
import io.elevenlabs.domain.model.FollowedEntityType;
import io.elevenlabs.domain.model.ReadFromFollowingSection;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.components.ReadMetaRowKt;
import io.elevenlabs.readerapp.ui.components.ReadRowKt;
import io.elevenlabs.readerapp.ui.formatter.TimeAgoFormatterKt;
import io.elevenlabs.readerapp.ui.formatter.WordCountToLengthFormatterKt;
import io.elevenlabs.readerapp.ui.previews.ReadsFactoryKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.livekit.android.room.SignalClient;
import io.livekit.android.rpc.RpcError;
import java.util.Date;
import kj.c;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.PeerConnection;
import r1.h;
import r1.j;
import r1.p2;
import r1.u0;
import r1.w;
import r1.x;
import r1.y;
import sn.z;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u000f\u0010\u000e\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/elevenlabs/domain/model/ReadFromFollowingSection;", "section", "Li3/t;", "modifier", "Ljava/util/Date;", "now", "Lsn/z;", "ReadFromFollowingRowV3", "(Lio/elevenlabs/domain/model/ReadFromFollowingSection;Li3/t;Ljava/util/Date;Lu2/m;II)V", "", "timestampUnix", "", "releasedDateText", "(JLjava/util/Date;Lu2/m;I)Ljava/lang/String;", "Preview_ReadFromFollowingRowV3", "(Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ReadFromFollowingRowKt {
    public static final void Preview_ReadFromFollowingRowV3(m mVar, int i10) {
        boolean z6;
        ReadMeta copy;
        ReadMeta copy2;
        q qVar = (q) mVar;
        qVar.Z(-716873501);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            u0 u0Var = j.f29228a;
            h m10 = i.m(EchoTheme.INSTANCE, qVar, EchoTheme.$stable);
            t y10 = n.y(i3.q.f13017a, n.x(qVar), true, true);
            x a10 = w.a(m10, d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = a.c(y10, qVar);
            h4.h.f11920i.getClass();
            f fVar = g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(g.f11907f, a10, qVar);
            r.J(g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), g.f11908g);
            r.F(g.f11909h, qVar);
            r.J(g.f11905d, c5, qVar);
            copy = r8.copy((r84 & 1) != 0 ? r8.articleImageUrl : null, (r84 & 2) != 0 ? r8.author : "F. Scott Fitzgerald", (r84 & 4) != 0 ? r8.chapters : null, (r84 & 8) != 0 ? r8.charCount : 0L, (r84 & 16) != 0 ? r8.createdAt : null, (r84 & 32) != 0 ? r8.updatedAt : null, (r84 & 64) != 0 ? r8.addedAt : null, (r84 & 128) != 0 ? r8.description : null, (r84 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r8.lastListenedCharOffset : 0L, (r84 & 512) != 0 ? r8.readId : null, (r84 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r8.source : null, (r84 & 2048) != 0 ? r8.title : "The Great Gatsby", (r84 & 4096) != 0 ? r8.subtitle : null, (r84 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r8.url : null, (r84 & 16384) != 0 ? r8.wordCount : 0L, (r84 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r8.originalFileType : null, (r84 & 65536) != 0 ? r8.hasOriginalAudio : false, (r84 & 131072) != 0 ? r8.matureContent : false, (r84 & 262144) != 0 ? r8.origin : null, (r84 & 524288) != 0 ? r8.contentType : null, (r84 & 1048576) != 0 ? r8.genre : null, (r84 & 2097152) != 0 ? r8.isBookType : false, (r84 & 4194304) != 0 ? r8.fromUserImport : false, (r84 & 8388608) != 0 ? r8.rating : null, (r84 & 16777216) != 0 ? r8.userRating : null, (r84 & 33554432) != 0 ? r8.lastUsedVoiceId : null, (r84 & 67108864) != 0 ? r8.creationStatus : null, (r84 & 134217728) != 0 ? r8.creationProgress : null, (r84 & 268435456) != 0 ? r8.isArchived : false, (r84 & 536870912) != 0 ? r8.markedAsUnread : false, (r84 & 1073741824) != 0 ? r8.completedAt : null, (r84 & Integer.MIN_VALUE) != 0 ? r8.publicationDate : null, (r85 & 1) != 0 ? r8.language : null, (r85 & 2) != 0 ? r8.publisherProfileId : null, (r85 & 4) != 0 ? r8.canDelete : false, (r85 & 8) != 0 ? r8.androidProductId : null, (r85 & 16) != 0 ? r8.isPaid : false, (r85 & 32) != 0 ? r8.offlineReadData : null, (r85 & 64) != 0 ? r8.previewAudio : null, (r85 & 128) != 0 ? r8.originalVoice : null, (r85 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r8.voiceSelectionConfig : null, (r85 & 512) != 0 ? r8.sampleConfig : null, (r85 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r8.displayMode : null, (r85 & 2048) != 0 ? r8.inUserLibrary : false, (r85 & 4096) != 0 ? r8.canUseAssistant : false, (r85 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r8.audioType : null, (r85 & 16384) != 0 ? r8.useDrm : false, (r85 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r8.lastListenedAudioFileNumber : null, (r85 & 65536) != 0 ? r8.lastListenedAudioSeconds : null, (r85 & 131072) != 0 ? r8.audioDurationSeconds : null, (r85 & 262144) != 0 ? r8.audioTypes : null, (r85 & 524288) != 0 ? r8.isVoiceChangerOn : false, (r85 & 1048576) != 0 ? r8.lastUsedAudioType : null, (r85 & 2097152) != 0 ? r8.coverImageUrls : null, (r85 & 4194304) != 0 ? r8.coverAspectRatio : null, (r85 & 8388608) != 0 ? ReadsFactoryKt.stubReadMeta$default(null, 1, null).blurPlaceholder : null);
            ReadFromFollowingRowV3(new ReadFromFollowingSection(copy, FollowedEntityType.AUTHOR, "F. Scott Fitzgerald", 1633046400L), null, new Date(1640995200000L), qVar, 0, 2);
            copy2 = r8.copy((r84 & 1) != 0 ? r8.articleImageUrl : null, (r84 & 2) != 0 ? r8.author : "Harper Lee", (r84 & 4) != 0 ? r8.chapters : null, (r84 & 8) != 0 ? r8.charCount : 0L, (r84 & 16) != 0 ? r8.createdAt : null, (r84 & 32) != 0 ? r8.updatedAt : null, (r84 & 64) != 0 ? r8.addedAt : null, (r84 & 128) != 0 ? r8.description : null, (r84 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r8.lastListenedCharOffset : 0L, (r84 & 512) != 0 ? r8.readId : null, (r84 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r8.source : null, (r84 & 2048) != 0 ? r8.title : "To Kill a Mockingbird", (r84 & 4096) != 0 ? r8.subtitle : null, (r84 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r8.url : null, (r84 & 16384) != 0 ? r8.wordCount : 0L, (r84 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r8.originalFileType : null, (r84 & 65536) != 0 ? r8.hasOriginalAudio : false, (r84 & 131072) != 0 ? r8.matureContent : false, (r84 & 262144) != 0 ? r8.origin : null, (r84 & 524288) != 0 ? r8.contentType : null, (r84 & 1048576) != 0 ? r8.genre : null, (r84 & 2097152) != 0 ? r8.isBookType : false, (r84 & 4194304) != 0 ? r8.fromUserImport : false, (r84 & 8388608) != 0 ? r8.rating : null, (r84 & 16777216) != 0 ? r8.userRating : null, (r84 & 33554432) != 0 ? r8.lastUsedVoiceId : null, (r84 & 67108864) != 0 ? r8.creationStatus : null, (r84 & 134217728) != 0 ? r8.creationProgress : null, (r84 & 268435456) != 0 ? r8.isArchived : false, (r84 & 536870912) != 0 ? r8.markedAsUnread : false, (r84 & 1073741824) != 0 ? r8.completedAt : null, (r84 & Integer.MIN_VALUE) != 0 ? r8.publicationDate : null, (r85 & 1) != 0 ? r8.language : null, (r85 & 2) != 0 ? r8.publisherProfileId : null, (r85 & 4) != 0 ? r8.canDelete : false, (r85 & 8) != 0 ? r8.androidProductId : null, (r85 & 16) != 0 ? r8.isPaid : false, (r85 & 32) != 0 ? r8.offlineReadData : null, (r85 & 64) != 0 ? r8.previewAudio : null, (r85 & 128) != 0 ? r8.originalVoice : null, (r85 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r8.voiceSelectionConfig : null, (r85 & 512) != 0 ? r8.sampleConfig : null, (r85 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r8.displayMode : null, (r85 & 2048) != 0 ? r8.inUserLibrary : false, (r85 & 4096) != 0 ? r8.canUseAssistant : false, (r85 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r8.audioType : null, (r85 & 16384) != 0 ? r8.useDrm : false, (r85 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r8.lastListenedAudioFileNumber : null, (r85 & 65536) != 0 ? r8.lastListenedAudioSeconds : null, (r85 & 131072) != 0 ? r8.audioDurationSeconds : null, (r85 & 262144) != 0 ? r8.audioTypes : null, (r85 & 524288) != 0 ? r8.isVoiceChangerOn : false, (r85 & 1048576) != 0 ? r8.lastUsedAudioType : null, (r85 & 2097152) != 0 ? r8.coverImageUrls : null, (r85 & 4194304) != 0 ? r8.coverAspectRatio : null, (r85 & 8388608) != 0 ? ReadsFactoryKt.stubReadMeta$default(null, 1, null).blurPlaceholder : null);
            ReadFromFollowingRowV3(new ReadFromFollowingSection(copy2, FollowedEntityType.COLLECTION, "Best of Classic Literature", 1633046400L), null, new Date(1640995200000L), qVar, 0, 2);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new e(i10, 4);
        }
    }

    public static final z Preview_ReadFromFollowingRowV3$lambda$1(int i10, m mVar, int i11) {
        Preview_ReadFromFollowingRowV3(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006f, code lost:
    
        if ((r17 & 4) != 0) goto L98;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ReadFromFollowingRowV3(ReadFromFollowingSection readFromFollowingSection, t tVar, Date date, m mVar, int i10, int i11) {
        int i12;
        int i13;
        boolean z6;
        t tVar2;
        int i14;
        int i15;
        readFromFollowingSection.getClass();
        q qVar = (q) mVar;
        qVar.Z(916962209);
        if ((i10 & 6) == 0) {
            if (qVar.h(readFromFollowingSection)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 2;
        if (i16 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (qVar.f(tVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i10 & 384) == 0) {
            if ((i11 & 4) == 0 && qVar.h(date)) {
                i14 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        if ((i12 & 147) != 146) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i12 & 1, z6)) {
            qVar.T();
            if ((i10 & 1) != 0 && !qVar.y()) {
                qVar.R();
            } else {
                if (i16 != 0) {
                    tVar = i3.q.f13017a;
                }
                if ((i11 & 4) != 0) {
                    date = new Date();
                    i12 &= -897;
                }
                qVar.q();
                ReadMeta read = readFromFollowingSection.getRead();
                String charCountToTextDuration = WordCountToLengthFormatterKt.charCountToTextDuration(readFromFollowingSection.getRead().getCharCount(), qVar, 0);
                qVar.X(732395356);
                StringBuilder q = defpackage.f.q(charCountToTextDuration, "  ·  ");
                int i17 = i12 >> 3;
                q.append(releasedDateText(readFromFollowingSection.getReleasedOnUnix(), date, qVar, i17 & 112));
                String sb = q.toString();
                qVar.p(false);
                t tVar3 = tVar;
                ReadRowKt.ReadRowContainer(tVar3, k.d(28564278, true, new fm.n(0, read), qVar), k.d(482728709, true, new fm.o(read, readFromFollowingSection, sb, 0), qVar), null, qVar, (i17 & 14) | 432, 8);
                tVar2 = tVar3;
            }
        } else {
            qVar.R();
            tVar2 = tVar;
        }
        Date date2 = date;
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new fm.f(readFromFollowingSection, tVar2, date2, i10, i11, 3, false);
        }
    }

    public static final z ReadFromFollowingRowV3$lambda$1(ReadMeta readMeta, m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ReadMetaRowKt.ReadMetaImageBox(readMeta, qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z ReadFromFollowingRowV3$lambda$2(ReadMeta readMeta, ReadFromFollowingSection readFromFollowingSection, String str, y yVar, m mVar, int i10) {
        boolean z6;
        yVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ReadRowKt.ReadRowPrimaryText(readMeta.getTitle(), qVar, 0);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i11 = EchoTheme.$stable;
            float x12 = echoTheme.getSpacings(qVar, i11).getX1();
            i3.q qVar2 = i3.q.f13017a;
            r1.d.g(p2.f(qVar2, x12), qVar);
            String author = readMeta.getAuthor();
            if (author == null) {
                qVar.X(45827697);
                author = c.R(qVar, R.string.home_unknown_author);
            } else {
                qVar.X(45827232);
            }
            qVar.p(false);
            ReadRowKt.m1090ReadRowSecondaryTextFNF3uiM(author, 0, 0L, qVar, 0, 6);
            if (readFromFollowingSection.getFollowedEntityType() == FollowedEntityType.COLLECTION) {
                qVar.X(1420798171);
                r1.d.g(p2.f(qVar2, echoTheme.getSpacings(qVar, i11).getX1()), qVar);
                ReadRowKt.m1090ReadRowSecondaryTextFNF3uiM(readFromFollowingSection.getFollowedEntityName(), 0, 0L, qVar, 0, 6);
                qVar.p(false);
            } else {
                qVar.X(1420953853);
                qVar.p(false);
            }
            r1.d.g(p2.f(qVar2, echoTheme.getSpacings(qVar, i11).getX1()), qVar);
            ReadRowKt.m1090ReadRowSecondaryTextFNF3uiM(str, 0, 0L, qVar, 0, 6);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z ReadFromFollowingRowV3$lambda$3(ReadFromFollowingSection readFromFollowingSection, t tVar, Date date, int i10, int i11, m mVar, int i12) {
        ReadFromFollowingRowV3(readFromFollowingSection, tVar, date, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    private static final String releasedDateText(long j4, Date date, m mVar, int i10) {
        return TimeAgoFormatterKt.formatTimeAgoSince(new Date(j4 * SignalClient.CLOSE_REASON_NORMAL_CLOSURE), date, mVar, i10 & 112);
    }
}
