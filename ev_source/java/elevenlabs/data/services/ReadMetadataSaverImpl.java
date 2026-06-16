package io.elevenlabs.data.services;

import com.google.protobuf.c6;
import io.elevenlabs.data.database.entities.reads.ReadChapterEntity;
import io.elevenlabs.data.database.entities.reads.ReadMetaEntity;
import io.elevenlabs.data.database.entities.reads.ReadMetaEntityWithChapters;
import io.elevenlabs.data.database.entities.reads.ReadsDao;
import io.elevenlabs.data.database.entities.reads.SampleConfigEntity;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lio/elevenlabs/data/services/ReadMetadataSaverImpl;", "Lio/elevenlabs/data/services/ReadMetadataSaver;", "Lio/elevenlabs/data/database/entities/reads/ReadsDao;", "readsDao", "<init>", "(Lio/elevenlabs/data/database/entities/reads/ReadsDao;)V", "Lio/elevenlabs/data/database/entities/reads/ReadMetaEntityWithChapters;", "result", "Lsn/z;", "saveMetaAndChapters", "(Lio/elevenlabs/data/database/entities/reads/ReadMetaEntityWithChapters;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/data/database/entities/reads/ReadsDao;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ReadMetadataSaverImpl implements ReadMetadataSaver {
    private final ReadsDao readsDao;

    public ReadMetadataSaverImpl(ReadsDao readsDao) {
        readsDao.getClass();
        this.readsDao = readsDao;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x01b6, code lost:
    
        if (r1.insertChapters(r3, r2) == r9) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x019b, code lost:
    
        if (r6.insertRead(r1, r2) != r9) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // io.elevenlabs.data.services.ReadMetadataSaver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object saveMetaAndChapters(ReadMetaEntityWithChapters readMetaEntityWithChapters, wn.c<? super z> cVar) {
        ReadMetadataSaverImpl$saveMetaAndChapters$1 readMetadataSaverImpl$saveMetaAndChapters$1;
        int i10;
        xn.a aVar;
        Long l4;
        ReadMetaEntityWithChapters readMetaEntityWithChapters2;
        Object byId;
        Long l7;
        ReadMetaEntityWithChapters readMetaEntityWithChapters3;
        String last_used_voice_id;
        String last_used_audio_type;
        if (cVar instanceof ReadMetadataSaverImpl$saveMetaAndChapters$1) {
            readMetadataSaverImpl$saveMetaAndChapters$1 = (ReadMetadataSaverImpl$saveMetaAndChapters$1) cVar;
            int i11 = readMetadataSaverImpl$saveMetaAndChapters$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                readMetadataSaverImpl$saveMetaAndChapters$1.label = i11 - Integer.MIN_VALUE;
                Object obj = readMetadataSaverImpl$saveMetaAndChapters$1.result;
                i10 = readMetadataSaverImpl$saveMetaAndChapters$1.label;
                aVar = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 == 4) {
                                    sn.a.g(obj);
                                    return z.f31622a;
                                }
                                c6.x("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            readMetaEntityWithChapters2 = (ReadMetaEntityWithChapters) readMetadataSaverImpl$saveMetaAndChapters$1.L$0;
                            sn.a.g(obj);
                            ReadsDao readsDao = this.readsDao;
                            List<ReadChapterEntity> chapters = readMetaEntityWithChapters2.getChapters();
                            readMetadataSaverImpl$saveMetaAndChapters$1.L$0 = null;
                            readMetadataSaverImpl$saveMetaAndChapters$1.L$1 = null;
                            readMetadataSaverImpl$saveMetaAndChapters$1.L$2 = null;
                            readMetadataSaverImpl$saveMetaAndChapters$1.L$3 = null;
                            readMetadataSaverImpl$saveMetaAndChapters$1.L$4 = null;
                            readMetadataSaverImpl$saveMetaAndChapters$1.L$5 = null;
                            readMetadataSaverImpl$saveMetaAndChapters$1.label = 4;
                        } else {
                            Long l10 = (Long) readMetadataSaverImpl$saveMetaAndChapters$1.L$1;
                            ReadMetaEntityWithChapters readMetaEntityWithChapters4 = (ReadMetaEntityWithChapters) readMetadataSaverImpl$saveMetaAndChapters$1.L$0;
                            sn.a.g(obj);
                            l7 = l10;
                            readMetaEntityWithChapters2 = readMetaEntityWithChapters4;
                            readMetaEntityWithChapters3 = (ReadMetaEntityWithChapters) obj;
                            if (readMetaEntityWithChapters3 == null) {
                                last_used_voice_id = readMetaEntityWithChapters3.getMeta().getLast_used_voice_id();
                                last_used_audio_type = readMetaEntityWithChapters3.getMeta().getLast_used_audio_type();
                            } else {
                                last_used_voice_id = readMetaEntityWithChapters2.getMeta().getLast_used_voice_id();
                                last_used_audio_type = readMetaEntityWithChapters2.getMeta().getLast_used_audio_type();
                            }
                            String str = last_used_audio_type;
                            String str2 = last_used_voice_id;
                            ReadMetaEntity meta = readMetaEntityWithChapters2.getMeta();
                            if (l7 == null) {
                                l7 = readMetaEntityWithChapters2.getMeta().getSample_config_id();
                            }
                            ReadMetaEntity copy$default = ReadMetaEntity.copy$default(meta, null, null, null, null, 0L, 0L, 0L, null, null, 0L, null, null, null, null, 0L, null, false, false, null, null, null, null, false, null, null, null, str2, null, null, false, false, null, null, null, null, false, null, false, null, null, null, null, l7, null, false, false, null, false, null, null, null, false, str, null, null, null, -67108865, 15727615, null);
                            ReadsDao readsDao2 = this.readsDao;
                            readMetadataSaverImpl$saveMetaAndChapters$1.L$0 = readMetaEntityWithChapters2;
                            readMetadataSaverImpl$saveMetaAndChapters$1.L$1 = null;
                            readMetadataSaverImpl$saveMetaAndChapters$1.L$2 = null;
                            readMetadataSaverImpl$saveMetaAndChapters$1.L$3 = null;
                            readMetadataSaverImpl$saveMetaAndChapters$1.L$4 = null;
                            readMetadataSaverImpl$saveMetaAndChapters$1.L$5 = null;
                            readMetadataSaverImpl$saveMetaAndChapters$1.label = 3;
                        }
                    } else {
                        readMetaEntityWithChapters2 = (ReadMetaEntityWithChapters) readMetadataSaverImpl$saveMetaAndChapters$1.L$0;
                        sn.a.g(obj);
                    }
                } else {
                    sn.a.g(obj);
                    SampleConfigEntity sampleConfig = readMetaEntityWithChapters.getSampleConfig();
                    if (sampleConfig != null) {
                        ReadsDao readsDao3 = this.readsDao;
                        readMetadataSaverImpl$saveMetaAndChapters$1.L$0 = readMetaEntityWithChapters;
                        readMetadataSaverImpl$saveMetaAndChapters$1.L$1 = null;
                        readMetadataSaverImpl$saveMetaAndChapters$1.I$0 = 0;
                        readMetadataSaverImpl$saveMetaAndChapters$1.label = 1;
                        obj = readsDao3.insertSampleConfig(sampleConfig, readMetadataSaverImpl$saveMetaAndChapters$1);
                        if (obj != aVar) {
                            readMetaEntityWithChapters2 = readMetaEntityWithChapters;
                        }
                        return aVar;
                    }
                    l4 = null;
                    readMetaEntityWithChapters2 = readMetaEntityWithChapters;
                    ReadsDao readsDao4 = this.readsDao;
                    String read_id = readMetaEntityWithChapters2.getMeta().getRead_id();
                    readMetadataSaverImpl$saveMetaAndChapters$1.L$0 = readMetaEntityWithChapters2;
                    readMetadataSaverImpl$saveMetaAndChapters$1.L$1 = l4;
                    readMetadataSaverImpl$saveMetaAndChapters$1.label = 2;
                    byId = readsDao4.getById(read_id, readMetadataSaverImpl$saveMetaAndChapters$1);
                    if (byId != aVar) {
                        l7 = l4;
                        obj = byId;
                        readMetaEntityWithChapters3 = (ReadMetaEntityWithChapters) obj;
                        if (readMetaEntityWithChapters3 == null) {
                        }
                        String str3 = last_used_audio_type;
                        String str22 = last_used_voice_id;
                        ReadMetaEntity meta2 = readMetaEntityWithChapters2.getMeta();
                        if (l7 == null) {
                        }
                        ReadMetaEntity copy$default2 = ReadMetaEntity.copy$default(meta2, null, null, null, null, 0L, 0L, 0L, null, null, 0L, null, null, null, null, 0L, null, false, false, null, null, null, null, false, null, null, null, str22, null, null, false, false, null, null, null, null, false, null, false, null, null, null, null, l7, null, false, false, null, false, null, null, null, false, str3, null, null, null, -67108865, 15727615, null);
                        ReadsDao readsDao22 = this.readsDao;
                        readMetadataSaverImpl$saveMetaAndChapters$1.L$0 = readMetaEntityWithChapters2;
                        readMetadataSaverImpl$saveMetaAndChapters$1.L$1 = null;
                        readMetadataSaverImpl$saveMetaAndChapters$1.L$2 = null;
                        readMetadataSaverImpl$saveMetaAndChapters$1.L$3 = null;
                        readMetadataSaverImpl$saveMetaAndChapters$1.L$4 = null;
                        readMetadataSaverImpl$saveMetaAndChapters$1.L$5 = null;
                        readMetadataSaverImpl$saveMetaAndChapters$1.label = 3;
                    }
                    return aVar;
                }
                l4 = new Long(((Number) obj).longValue());
                ReadsDao readsDao42 = this.readsDao;
                String read_id2 = readMetaEntityWithChapters2.getMeta().getRead_id();
                readMetadataSaverImpl$saveMetaAndChapters$1.L$0 = readMetaEntityWithChapters2;
                readMetadataSaverImpl$saveMetaAndChapters$1.L$1 = l4;
                readMetadataSaverImpl$saveMetaAndChapters$1.label = 2;
                byId = readsDao42.getById(read_id2, readMetadataSaverImpl$saveMetaAndChapters$1);
                if (byId != aVar) {
                }
                return aVar;
            }
        }
        readMetadataSaverImpl$saveMetaAndChapters$1 = new ReadMetadataSaverImpl$saveMetaAndChapters$1(this, cVar);
        Object obj2 = readMetadataSaverImpl$saveMetaAndChapters$1.result;
        i10 = readMetadataSaverImpl$saveMetaAndChapters$1.label;
        aVar = xn.a.f37986a;
        if (i10 == 0) {
        }
        l4 = new Long(((Number) obj2).longValue());
        ReadsDao readsDao422 = this.readsDao;
        String read_id22 = readMetaEntityWithChapters2.getMeta().getRead_id();
        readMetadataSaverImpl$saveMetaAndChapters$1.L$0 = readMetaEntityWithChapters2;
        readMetadataSaverImpl$saveMetaAndChapters$1.L$1 = l4;
        readMetadataSaverImpl$saveMetaAndChapters$1.label = 2;
        byId = readsDao422.getById(read_id22, readMetadataSaverImpl$saveMetaAndChapters$1);
        if (byId != aVar) {
        }
        return aVar;
    }
}
