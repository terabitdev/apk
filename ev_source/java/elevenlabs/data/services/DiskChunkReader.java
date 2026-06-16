package io.elevenlabs.data.services;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.elevenlabs.data.model.response.EnrichedAudioChunk;
import io.elevenlabs.domain.Logger;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import tn.o;
import tn.t;
import wq.n;
import wq.u;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u0014\u0010 \u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lio/elevenlabs/data/services/DiskChunkReader;", "", "Landroid/content/Context;", "appContext", "Lvr/c;", "json", "Lio/elevenlabs/domain/Logger;", "logger", "", "readId", "voiceId", "", "audioDataVersion", "<init>", "(Landroid/content/Context;Lvr/c;Lio/elevenlabs/domain/Logger;Ljava/lang/String;Ljava/lang/String;I)V", "", "", "indexChunks", "()Ljava/util/List;", FirebaseAnalytics.Param.INDEX, "Lio/elevenlabs/data/model/response/EnrichedAudioChunk;", "readChunkAtIndex", "(I)Lio/elevenlabs/data/model/response/EnrichedAudioChunk;", "alignmentPos", "Lio/elevenlabs/data/services/ChunkWithAlignmentPosition;", "getChunkByAlignmentPosition", "(J)Lio/elevenlabs/data/services/ChunkWithAlignmentPosition;", "chunkIndex", "getChunkByIndex", "(I)Lio/elevenlabs/data/services/ChunkWithAlignmentPosition;", "Lvr/c;", "Lio/elevenlabs/domain/Logger;", ParameterNames.TAG, "Ljava/lang/String;", "chunkAlignmentPositions", "Ljava/util/List;", "Ljava/io/File;", "baseDir", "Ljava/io/File;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class DiskChunkReader {
    private final File baseDir;
    private final List<Long> chunkAlignmentPositions;
    private final vr.c json;
    private final Logger logger;
    private final String tag;

    public DiskChunkReader(Context context, vr.c cVar, Logger logger, String str, String str2, int i10) {
        context.getClass();
        cVar.getClass();
        logger.getClass();
        str.getClass();
        str2.getClass();
        this.json = cVar;
        this.logger = logger;
        this.tag = "DiskChunkReader";
        File file = new File(context.getFilesDir(), "audiodata-v" + i10 + Separators.SLASH + str + Separators.SLASH + str2);
        this.baseDir = file;
        ib.i.r("Base directory: ", file.getAbsolutePath(), logger, "DiskChunkReader");
        List<Long> indexChunks = indexChunks();
        this.chunkAlignmentPositions = indexChunks;
        ib.i.q("Indexed ", indexChunks.size(), " chunks", logger, "DiskChunkReader");
    }

    private final List<Long> indexChunks() {
        boolean exists = this.baseDir.exists();
        t tVar = t.f33547a;
        if (exists && this.baseDir.isDirectory()) {
            File[] listFiles = this.baseDir.listFiles();
            if (listFiles != null) {
                ArrayList arrayList = new ArrayList();
                for (File file : listFiles) {
                    String name = file.getName();
                    name.getClass();
                    if (u.N(name, "_chunk.json", false)) {
                        arrayList.add(file);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String name2 = ((File) it.next()).getName();
                    name2.getClass();
                    Long Z = u.Z(n.H0(name2, "_chunk.json"));
                    if (Z != null) {
                        arrayList2.add(Z);
                    }
                }
                return o.Z0(arrayList2);
            }
            return tVar;
        }
        ib.i.r("Base directory doesn't exist: ", this.baseDir.getAbsolutePath(), this.logger, this.tag);
        return tVar;
    }

    private final EnrichedAudioChunk readChunkAtIndex(int r92) {
        if (r92 >= 0 && r92 < this.chunkAlignmentPositions.size()) {
            long longValue = this.chunkAlignmentPositions.get(r92).longValue();
            File file = new File(this.baseDir, longValue + "_chunk.json");
            if (!file.exists()) {
                ib.i.r("Chunk file doesn't exist: ", file.getAbsolutePath(), this.logger, this.tag);
                return null;
            }
            try {
                String k02 = eo.k.k0(file);
                vr.c cVar = this.json;
                cVar.getClass();
                EnrichedAudioChunk enrichedAudioChunk = (EnrichedAudioChunk) cVar.b(k02, EnrichedAudioChunk.INSTANCE.serializer());
                this.logger.verbose(this.tag, new k(longValue, 1));
                return enrichedAudioChunk;
            } catch (Exception e10) {
                this.logger.logError(this.tag, "Error reading chunk file: " + file.getAbsolutePath(), e10);
            }
        }
        return null;
    }

    public final ChunkWithAlignmentPosition getChunkByAlignmentPosition(long alignmentPos) {
        if (this.chunkAlignmentPositions.isEmpty()) {
            this.logger.log(this.tag, "No chunks available");
            return null;
        }
        int h10 = ig.f.h(this.chunkAlignmentPositions, Long.valueOf(alignmentPos));
        if (h10 < 0) {
            h10 = (-(h10 + 1)) - 1;
        }
        if (h10 < 0) {
            h10 = 0;
        }
        long longValue = this.chunkAlignmentPositions.get(h10).longValue();
        EnrichedAudioChunk readChunkAtIndex = readChunkAtIndex(h10);
        if (readChunkAtIndex == null) {
            return null;
        }
        return new ChunkWithAlignmentPosition(readChunkAtIndex, longValue, h10);
    }

    public final ChunkWithAlignmentPosition getChunkByIndex(int chunkIndex) {
        if (chunkIndex >= this.chunkAlignmentPositions.size()) {
            return null;
        }
        long longValue = this.chunkAlignmentPositions.get(chunkIndex).longValue();
        EnrichedAudioChunk readChunkAtIndex = readChunkAtIndex(chunkIndex);
        if (readChunkAtIndex == null) {
            return null;
        }
        return new ChunkWithAlignmentPosition(readChunkAtIndex, longValue, chunkIndex);
    }
}
