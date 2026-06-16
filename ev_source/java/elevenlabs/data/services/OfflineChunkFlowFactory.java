package io.elevenlabs.data.services;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.net.Uri;
import io.elevenlabs.data.model.response.Alignment;
import io.elevenlabs.data.model.response.EnrichedAudioChunk;
import io.elevenlabs.domain.Logger;
import ir.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import tn.o;
import tn.p;
import wq.n;
import wq.u;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001 B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u00182\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00108\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lio/elevenlabs/data/services/OfflineChunkFlowFactory;", "Lio/elevenlabs/data/services/ChunkFlowFactory;", "Landroid/content/Context;", "appContext", "Lvr/c;", "json", "Lio/elevenlabs/domain/Logger;", "logger", "<init>", "(Landroid/content/Context;Lvr/c;Lio/elevenlabs/domain/Logger;)V", "Lio/elevenlabs/data/model/response/EnrichedAudioChunk;", "chunk", "", "characterCountToDiscard", "sliceChunk", "(Lio/elevenlabs/data/model/response/EnrichedAudioChunk;I)Lio/elevenlabs/data/model/response/EnrichedAudioChunk;", "", "uri", "Lio/elevenlabs/data/services/OfflineChunkFlowFactory$OfflineUriParts;", "parseOfflineReadUri", "(Ljava/lang/String;)Lio/elevenlabs/data/services/OfflineChunkFlowFactory$OfflineUriParts;", "readId", "", "startingPosition", "Lir/i;", "createChunkFlow", "(Ljava/lang/String;JLjava/lang/String;)Lir/i;", "Landroid/content/Context;", "Lvr/c;", "Lio/elevenlabs/domain/Logger;", ParameterNames.TAG, "Ljava/lang/String;", "OfflineUriParts", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class OfflineChunkFlowFactory implements ChunkFlowFactory {
    private final Context appContext;
    private final vr.c json;
    private final Logger logger;
    private final String tag;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lio/elevenlabs/data/services/OfflineChunkFlowFactory$OfflineUriParts;", "", "audioDataVersion", "", "uriReadId", "", "voiceId", "offset", "<init>", "(ILjava/lang/String;Ljava/lang/String;I)V", "getAudioDataVersion", "()I", "getUriReadId", "()Ljava/lang/String;", "getVoiceId", "getOffset", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class OfflineUriParts {
        private final int audioDataVersion;
        private final int offset;
        private final String uriReadId;
        private final String voiceId;

        public OfflineUriParts(int i10, String str, String str2, int i11) {
            str.getClass();
            str2.getClass();
            this.audioDataVersion = i10;
            this.uriReadId = str;
            this.voiceId = str2;
            this.offset = i11;
        }

        public static /* synthetic */ OfflineUriParts copy$default(OfflineUriParts offlineUriParts, int i10, String str, String str2, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = offlineUriParts.audioDataVersion;
            }
            if ((i12 & 2) != 0) {
                str = offlineUriParts.uriReadId;
            }
            if ((i12 & 4) != 0) {
                str2 = offlineUriParts.voiceId;
            }
            if ((i12 & 8) != 0) {
                i11 = offlineUriParts.offset;
            }
            return offlineUriParts.copy(i10, str, str2, i11);
        }

        /* renamed from: component1, reason: from getter */
        public final int getAudioDataVersion() {
            return this.audioDataVersion;
        }

        /* renamed from: component2, reason: from getter */
        public final String getUriReadId() {
            return this.uriReadId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getVoiceId() {
            return this.voiceId;
        }

        /* renamed from: component4, reason: from getter */
        public final int getOffset() {
            return this.offset;
        }

        public final OfflineUriParts copy(int audioDataVersion, String uriReadId, String voiceId, int offset) {
            uriReadId.getClass();
            voiceId.getClass();
            return new OfflineUriParts(audioDataVersion, uriReadId, voiceId, offset);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OfflineUriParts)) {
                return false;
            }
            OfflineUriParts offlineUriParts = (OfflineUriParts) other;
            if (this.audioDataVersion == offlineUriParts.audioDataVersion && m.c(this.uriReadId, offlineUriParts.uriReadId) && m.c(this.voiceId, offlineUriParts.voiceId) && this.offset == offlineUriParts.offset) {
                return true;
            }
            return false;
        }

        public final int getAudioDataVersion() {
            return this.audioDataVersion;
        }

        public final int getOffset() {
            return this.offset;
        }

        public final String getUriReadId() {
            return this.uriReadId;
        }

        public final String getVoiceId() {
            return this.voiceId;
        }

        public int hashCode() {
            return Integer.hashCode(this.offset) + j0.c.c(j0.c.c(Integer.hashCode(this.audioDataVersion) * 31, 31, this.uriReadId), 31, this.voiceId);
        }

        public String toString() {
            return "OfflineUriParts(audioDataVersion=" + this.audioDataVersion + ", uriReadId=" + this.uriReadId + ", voiceId=" + this.voiceId + ", offset=" + this.offset + Separators.RPAREN;
        }
    }

    public OfflineChunkFlowFactory(Context context, vr.c cVar, Logger logger) {
        context.getClass();
        cVar.getClass();
        logger.getClass();
        this.appContext = context;
        this.json = cVar;
        this.logger = logger;
        this.tag = "OfflineChunkFlowFactory";
    }

    public static final /* synthetic */ Context access$getAppContext$p(OfflineChunkFlowFactory offlineChunkFlowFactory) {
        return offlineChunkFlowFactory.appContext;
    }

    public static final /* synthetic */ vr.c access$getJson$p(OfflineChunkFlowFactory offlineChunkFlowFactory) {
        return offlineChunkFlowFactory.json;
    }

    public static final /* synthetic */ Logger access$getLogger$p(OfflineChunkFlowFactory offlineChunkFlowFactory) {
        return offlineChunkFlowFactory.logger;
    }

    public static final /* synthetic */ String access$getTag$p(OfflineChunkFlowFactory offlineChunkFlowFactory) {
        return offlineChunkFlowFactory.tag;
    }

    public static final /* synthetic */ OfflineUriParts access$parseOfflineReadUri(OfflineChunkFlowFactory offlineChunkFlowFactory, String str) {
        return offlineChunkFlowFactory.parseOfflineReadUri(str);
    }

    public static final /* synthetic */ EnrichedAudioChunk access$sliceChunk(OfflineChunkFlowFactory offlineChunkFlowFactory, EnrichedAudioChunk enrichedAudioChunk, int i10) {
        return offlineChunkFlowFactory.sliceChunk(enrichedAudioChunk, i10);
    }

    public final OfflineUriParts parseOfflineReadUri(String uri) {
        Integer num;
        String queryParameter;
        Integer Y;
        try {
            Uri parse = Uri.parse(uri);
            if (!m.c(parse.getScheme(), "offlineRead")) {
                this.logger.log(this.tag, "Invalid scheme: " + parse.getScheme());
                return null;
            }
            String host = parse.getHost();
            int i10 = 0;
            if (host != null && u.W(host, "audiodata-v", false)) {
                num = u.Y(n.D0(host, "audiodata-v", host));
            } else {
                this.logger.log(this.tag, "Invalid version: " + host);
                num = null;
            }
            if (num == null) {
                this.logger.log(this.tag, "Could not parse audioDataVersion from host: " + parse.getHost());
                return null;
            }
            String queryParameter2 = parse.getQueryParameter("read_id");
            if (queryParameter2 != null && (queryParameter = parse.getQueryParameter("voice_id")) != null) {
                String queryParameter3 = parse.getQueryParameter("offset");
                if (queryParameter3 != null && (Y = u.Y(queryParameter3)) != null) {
                    i10 = Y.intValue();
                }
                return new OfflineUriParts(num.intValue(), queryParameter2, queryParameter, i10);
            }
            return null;
        } catch (Exception e10) {
            this.logger.logError(this.tag, "Failed to parse offline read URI: " + uri, e10);
            return null;
        }
    }

    public final EnrichedAudioChunk sliceChunk(EnrichedAudioChunk chunk, int characterCountToDiscard) {
        Alignment alignment = chunk.getAlignment();
        if (alignment == null) {
            return chunk;
        }
        String str = null;
        if (characterCountToDiscard >= alignment.getChars().size()) {
            return new EnrichedAudioChunk(null, null, chunk.isFinal());
        }
        int intValue = alignment.getCharStartTimesMs().get(characterCountToDiscard).intValue();
        List q02 = o.q0(alignment.getCharStartTimesMs(), characterCountToDiscard);
        ArrayList arrayList = new ArrayList(p.a0(q02, 10));
        Iterator it = q02.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((Number) it.next()).intValue() - intValue));
        }
        List q03 = o.q0(alignment.getCharDurationsMs(), characterCountToDiscard);
        List q04 = o.q0(alignment.getChars(), characterCountToDiscard);
        Iterator it2 = o.b1(alignment.getCharDurationsMs(), characterCountToDiscard).iterator();
        int i10 = 0;
        while (it2.hasNext()) {
            i10 += ((Number) it2.next()).intValue();
        }
        int i11 = ((int) (i10 / 26.122448979591837d)) * 417;
        String audio = chunk.getAudio();
        if (audio != null) {
            fs.k kVar = fs.k.f9979d;
            fs.k q = fj.a.q(audio);
            if (q != null && i11 < q.f9980a.length) {
                str = fs.k.p(q, i11, 0, 2).a();
            }
        }
        return new EnrichedAudioChunk(new Alignment(q03, arrayList, q04), str, chunk.isFinal());
    }

    @Override // io.elevenlabs.data.services.ChunkFlowFactory
    public ir.i createChunkFlow(String readId, long startingPosition, String uri) {
        readId.getClass();
        uri.getClass();
        return r.j(new OfflineChunkFlowFactory$createChunkFlow$1(this, readId, startingPosition, uri, null));
    }
}
