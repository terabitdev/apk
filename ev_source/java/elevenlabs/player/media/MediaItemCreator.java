package io.elevenlabs.player.media;

import android.gov.nist.javax.sip.header.a;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import defpackage.f;
import gg.b;
import gh.l0;
import gh.w1;
import io.elevenlabs.domain.Configuration;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AudioType;
import io.elevenlabs.domain.model.Chapter;
import io.elevenlabs.domain.model.ChapterOfflineDownloadStatus;
import io.elevenlabs.domain.model.ChapterUtilsKt;
import io.elevenlabs.domain.model.EffectivePlaybackMode;
import io.elevenlabs.domain.model.EffectivePlaybackModeKt;
import io.elevenlabs.domain.model.OfflineReadData;
import io.elevenlabs.domain.model.OfflineReadStatus;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.ReadMetaKt;
import io.elevenlabs.player.ExchangeKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import sn.k;
import tn.o;
import tn.p;
import tn.t;
import tn.u;
import w7.f0;
import w7.g0;
import w7.h0;
import w7.j0;
import w7.k0;
import w7.m0;
import w7.n0;
import w7.r0;
import w7.t0;
import w7.u0;
import z.h;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\u0018\u0000 ;2\u00020\u0001:\u0001;B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010JI\u0010\u0018\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0019JE\u0010\u001c\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ9\u0010\u001e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010 \u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b \u0010!J'\u0010\"\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\"\u0010#J!\u0010&\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b$\u0010%J+\u0010)\u001a\u0004\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b'\u0010(J;\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00170*2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\b0*2\b\u0010\u0014\u001a\u0004\u0018\u00010\r2\u0006\u0010-\u001a\u00020,2\u0006\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b.\u0010/JI\u00107\u001a\u00020\u00172\u0006\u00100\u001a\u00020\u00172\u0006\u00102\u001a\u0002012\u0014\b\u0002\u00104\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r032\u0014\b\u0002\u00106\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020503¢\u0006\u0004\b7\u00108R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00109R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010:¨\u0006<"}, d2 = {"Lio/elevenlabs/player/media/MediaItemCreator;", "", "Lio/elevenlabs/domain/Configuration;", "configuration", "Lio/elevenlabs/domain/Logger;", "logger", "<init>", "(Lio/elevenlabs/domain/Configuration;Lio/elevenlabs/domain/Logger;)V", "Lio/elevenlabs/domain/model/ReadMeta;", "readMeta", "", "offset", "Lsn/k;", "", "", "getAudioPosition", "(Lio/elevenlabs/domain/model/ReadMeta;J)Lsn/k;", "", "useAudioPath", "initialOffset", "voiceId", "audioFileNumber", "audioSeconds", "Lw7/r0;", "createMediaItemInternal", "(Lio/elevenlabs/domain/model/ReadMeta;ZJLjava/lang/String;Ljava/lang/String;Ljava/lang/Double;)Lw7/r0;", "Lio/elevenlabs/domain/model/OfflineReadData;", "offlineReadData", "buildMediaUri", "(Lio/elevenlabs/domain/model/ReadMeta;ZJLjava/lang/String;Ljava/lang/String;Lio/elevenlabs/domain/model/OfflineReadData;)Ljava/lang/String;", "fallbackReason", "(Lio/elevenlabs/domain/model/ReadMeta;ZJLjava/lang/String;Lio/elevenlabs/domain/model/OfflineReadData;)Ljava/lang/String;", "isOffsetInDownloadedChapter", "(Lio/elevenlabs/domain/model/ReadMeta;JLio/elevenlabs/domain/model/OfflineReadData;)Z", "createMediaItem", "(Lio/elevenlabs/domain/model/ReadMeta;Ljava/lang/String;J)Lw7/r0;", "shouldUseAudioPath$player_release", "(Lio/elevenlabs/domain/model/ReadMeta;Ljava/lang/String;)Z", "shouldUseAudioPath", "resolveEffectiveVoiceId$player_release", "(Lio/elevenlabs/domain/model/ReadMeta;Ljava/lang/String;Z)Ljava/lang/String;", "resolveEffectiveVoiceId", "", "readMetas", "", "initialIndex", "createMediaItems", "(Ljava/util/List;Ljava/lang/String;IJ)Ljava/util/List;", "parentMediaItem", "Lio/elevenlabs/domain/model/Chapter;", "chapter", "", "cachedManifestUrls", "", "drmKeySetIds", "createChapterMediaItem", "(Lw7/r0;Lio/elevenlabs/domain/model/Chapter;Ljava/util/Map;Ljava/util/Map;)Lw7/r0;", "Lio/elevenlabs/domain/Configuration;", "Lio/elevenlabs/domain/Logger;", "Companion", "player_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class MediaItemCreator {
    public static final String EXTRA_CACHED_MANIFEST_KEYS = "cached_manifest_keys";
    public static final String EXTRA_CACHED_MANIFEST_VALUES = "cached_manifest_values";
    public static final String EXTRA_CHAPTER_DURATIONS = "chapter_durations";
    public static final String EXTRA_CHAPTER_FILE_NUMBERS = "chapter_file_numbers";
    public static final String EXTRA_CHAPTER_NAMES = "chapter_names";
    public static final String EXTRA_DRM_KEY_SET_KEYS = "drm_key_set_keys";
    public static final String EXTRA_DRM_KEY_SET_VALUES = "drm_key_set_values";
    public static final String EXTRA_DRM_OFFLINE_KEY_SET_ID = "drm_offline_key_set_id";
    public static final String EXTRA_PARENT_READ_ID = "parent_read_id";
    private static final String TAG = "MediaItemCreator";
    private final Configuration configuration;
    private final Logger logger;

    public MediaItemCreator(Configuration configuration, Logger logger) {
        configuration.getClass();
        logger.getClass();
        this.configuration = configuration;
        this.logger = logger;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f0, code lost:
    
        if (r2 != null) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String buildMediaUri(ReadMeta readMeta, boolean useAudioPath, long initialOffset, String voiceId, String audioFileNumber, OfflineReadData offlineReadData) {
        long j4;
        boolean z6;
        boolean z10;
        OfflineReadStatus offlineReadStatus;
        OfflineReadStatus offlineReadStatus2;
        String j10;
        String str;
        OfflineReadStatus offlineReadStatus3;
        OfflineReadStatus offlineReadStatus4;
        String str2;
        String str3 = "001";
        OfflineReadData offlineReadData2 = null;
        if (useAudioPath) {
            if (offlineReadData != null) {
                offlineReadStatus4 = offlineReadData.getStatus();
            } else {
                offlineReadStatus4 = null;
            }
            if (offlineReadStatus4 == OfflineReadStatus.READY && offlineReadData.getType() == AudioType.MEDIA) {
                Map<String, String> cachedManifestUrls = offlineReadData.getCachedManifestUrls();
                if (audioFileNumber == null) {
                    str2 = "001";
                } else {
                    str2 = audioFileNumber;
                }
                String str4 = cachedManifestUrls.get(str2);
                if (str4 != null) {
                    return str4;
                }
            }
        }
        if (!useAudioPath) {
            if (offlineReadData != null) {
                offlineReadStatus3 = offlineReadData.getStatus();
            } else {
                offlineReadStatus3 = null;
            }
            if (offlineReadStatus3 == OfflineReadStatus.READY) {
                j4 = initialOffset;
                if (isOffsetInDownloadedChapter(readMeta, j4, offlineReadData)) {
                    z6 = true;
                    z10 = z6;
                    if (offlineReadData != null) {
                        offlineReadStatus = offlineReadData.getStatus();
                    } else {
                        offlineReadStatus = null;
                    }
                    offlineReadStatus2 = OfflineReadStatus.READY;
                    if (offlineReadStatus == offlineReadStatus2) {
                        String readId = readMeta.getReadId();
                        Logger logger = this.logger;
                        if (z10) {
                            logger.log(TAG, "picked OFFLINE for " + readId + ": tts chapterRows=" + offlineReadData.getChapterStatuses().size());
                        } else {
                            logger.log(TAG, fallbackReason(readMeta, useAudioPath, j4, audioFileNumber, offlineReadData));
                        }
                    }
                    if (z10) {
                        j10 = "offlineRead://audiodata-v1/";
                    } else {
                        Configuration configuration = this.configuration;
                        if (useAudioPath) {
                            j10 = a.n(configuration.getApiUrl(), "/v1/reader/reads/", readMeta.getReadId(), "/manifest-url");
                        } else {
                            j10 = f.j(configuration.getApiWs(), "/v1/reader/reads/stream/v2/", readMeta.getReadId());
                        }
                    }
                    Uri.Builder appendQueryParameter = Uri.parse(j10).buildUpon().appendQueryParameter("read_id", readMeta.getReadId());
                    if (useAudioPath) {
                        if (audioFileNumber != null) {
                            str3 = audioFileNumber;
                        }
                        appendQueryParameter.appendQueryParameter("file_number", str3);
                    } else {
                        appendQueryParameter.appendQueryParameter("offset", String.valueOf(initialOffset));
                        if (offlineReadData != null) {
                            if (offlineReadData.getStatus() == offlineReadStatus2) {
                                offlineReadData2 = offlineReadData;
                            }
                            if (offlineReadData2 != null) {
                                str = offlineReadData2.getVoiceId();
                            }
                        }
                        str = voiceId;
                        if (str != null) {
                            appendQueryParameter.appendQueryParameter("voice_id", str);
                        }
                    }
                    String uri = appendQueryParameter.build().toString();
                    uri.getClass();
                    return uri;
                }
                z6 = false;
                z10 = z6;
                if (offlineReadData != null) {
                }
                offlineReadStatus2 = OfflineReadStatus.READY;
                if (offlineReadStatus == offlineReadStatus2) {
                }
                if (z10) {
                }
                Uri.Builder appendQueryParameter2 = Uri.parse(j10).buildUpon().appendQueryParameter("read_id", readMeta.getReadId());
                if (useAudioPath) {
                }
                String uri2 = appendQueryParameter2.build().toString();
                uri2.getClass();
                return uri2;
            }
        }
        j4 = initialOffset;
        z6 = false;
        z10 = z6;
        if (offlineReadData != null) {
        }
        offlineReadStatus2 = OfflineReadStatus.READY;
        if (offlineReadStatus == offlineReadStatus2) {
        }
        if (z10) {
        }
        Uri.Builder appendQueryParameter22 = Uri.parse(j10).buildUpon().appendQueryParameter("read_id", readMeta.getReadId());
        if (useAudioPath) {
        }
        String uri22 = appendQueryParameter22.build().toString();
        uri22.getClass();
        return uri22;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ r0 createChapterMediaItem$default(MediaItemCreator mediaItemCreator, r0 r0Var, Chapter chapter, Map map, Map map2, int i10, Object obj) {
        int i11 = i10 & 4;
        u uVar = u.f33548a;
        if (i11 != 0) {
            map = uVar;
        }
        if ((i10 & 8) != 0) {
            map2 = uVar;
        }
        return mediaItemCreator.createChapterMediaItem(r0Var, chapter, map, map2);
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [w7.h0, w7.i0] */
    private final r0 createMediaItemInternal(ReadMeta readMeta, boolean useAudioPath, long initialOffset, String voiceId, String audioFileNumber, Double audioSeconds) {
        Uri uri;
        boolean z6;
        m0 m0Var;
        Map<String, String> map;
        Map<String, byte[]> map2;
        String str;
        double d10;
        OfflineReadData offlineReadData = readMeta.getOfflineReadData();
        String articleImageUrl = readMeta.getArticleImageUrl();
        Uri uri2 = null;
        if (articleImageUrl != null) {
            uri = Uri.parse(articleImageUrl);
        } else {
            uri = null;
        }
        t0 t0Var = new t0();
        t0Var.f36597a = readMeta.getTitle();
        String author = readMeta.getAuthor();
        if (author == null) {
            author = "ElevenLabs";
        }
        t0Var.f36598b = author;
        t0Var.f36613r = Boolean.FALSE;
        t0Var.f36614s = Boolean.TRUE;
        t0Var.f36610n = uri;
        Bundle bundle = new Bundle();
        ExchangeKt.setInitialOffset(bundle, Long.valueOf(initialOffset));
        ExchangeKt.setVoiceId(bundle, voiceId);
        ExchangeKt.setReadSource(bundle, readMeta.getSource());
        ExchangeKt.setOriginalFileType(bundle, readMeta.getOriginalFileType());
        if (audioFileNumber != null) {
            ExchangeKt.setAudioFileNumber(bundle, audioFileNumber);
        }
        if (useAudioPath && audioSeconds != null && audioSeconds.doubleValue() > 0.0d) {
            ExchangeKt.setAudioSeekPosition(bundle, audioSeconds);
        }
        if (useAudioPath && !readMeta.getChapters().isEmpty()) {
            List<Chapter> chapters = readMeta.getChapters();
            ArrayList arrayList = new ArrayList(p.a0(chapters, 10));
            Iterator<T> it = chapters.iterator();
            while (it.hasNext()) {
                String audioFileNumber2 = ((Chapter) it.next()).getAudioFileNumber();
                if (audioFileNumber2 == null) {
                    audioFileNumber2 = "NULL";
                }
                arrayList.add(audioFileNumber2);
            }
            List<Chapter> chapters2 = readMeta.getChapters();
            ArrayList arrayList2 = new ArrayList(p.a0(chapters2, 10));
            Iterator<T> it2 = chapters2.iterator();
            while (it2.hasNext()) {
                Double durationSeconds = ((Chapter) it2.next()).getDurationSeconds();
                if (durationSeconds != null) {
                    d10 = durationSeconds.doubleValue();
                } else {
                    d10 = 0.0d;
                }
                arrayList2.add(String.valueOf(d10));
            }
            List<Chapter> chapters3 = readMeta.getChapters();
            ArrayList arrayList3 = new ArrayList(p.a0(chapters3, 10));
            Iterator<T> it3 = chapters3.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((Chapter) it3.next()).getChapterName());
            }
            bundle.putStringArrayList(EXTRA_CHAPTER_FILE_NUMBERS, new ArrayList<>(arrayList));
            bundle.putStringArrayList(EXTRA_CHAPTER_DURATIONS, new ArrayList<>(arrayList2));
            bundle.putStringArrayList(EXTRA_CHAPTER_NAMES, new ArrayList<>(arrayList3));
            bundle.putString(EXTRA_PARENT_READ_ID, readMeta.getReadId());
            if (offlineReadData != null) {
                map = offlineReadData.getCachedManifestUrls();
            } else {
                map = null;
            }
            Map<String, byte[]> map3 = u.f33548a;
            if (map == null) {
                map = map3;
            }
            if (!map.isEmpty()) {
                bundle.putStringArrayList(EXTRA_CACHED_MANIFEST_KEYS, new ArrayList<>(o.g1(map.keySet())));
                bundle.putStringArrayList(EXTRA_CACHED_MANIFEST_VALUES, new ArrayList<>(o.g1(map.values())));
            }
            if (offlineReadData != null) {
                map2 = offlineReadData.getDrmKeySetIds();
            } else {
                map2 = null;
            }
            if (map2 != null) {
                map3 = map2;
            }
            if (!map3.isEmpty()) {
                bundle.putStringArrayList(EXTRA_DRM_KEY_SET_KEYS, new ArrayList<>(o.g1(map3.keySet())));
                Collection<byte[]> values = map3.values();
                ArrayList arrayList4 = new ArrayList(p.a0(values, 10));
                Iterator<T> it4 = values.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(Base64.encodeToString((byte[]) it4.next(), 2));
                }
                bundle.putStringArrayList(EXTRA_DRM_KEY_SET_VALUES, new ArrayList<>(arrayList4));
                if (audioFileNumber == null) {
                    str = "001";
                } else {
                    str = audioFileNumber;
                }
                byte[] bArr = map3.get(str);
                if (bArr != null) {
                    bundle.putString(EXTRA_DRM_OFFLINE_KEY_SET_ID, Base64.encodeToString(bArr, 2));
                }
            }
        }
        t0Var.I = bundle;
        t0Var.H = 16;
        u0 u0Var = new u0(t0Var);
        String buildMediaUri = buildMediaUri(readMeta, useAudioPath, initialOffset, voiceId, audioFileNumber, offlineReadData);
        f0 f0Var = new f0();
        String readId = readMeta.getReadId();
        readId.getClass();
        f0Var.f36322a = readId;
        f0Var.f36327f = l0.l(new ArrayList());
        f0Var.f36329h = u0Var;
        k0 k0Var = new k0();
        k0Var.f36424d = 1.0f;
        k0Var.f36425e = 1.0f;
        f0Var.f36330i = new w7.l0(k0Var).a();
        if (buildMediaUri != null) {
            uri2 = Uri.parse(buildMediaUri);
        }
        f0Var.f36323b = uri2;
        f0 configureDrm = MediaItemDrmExtensionsKt.configureDrm(f0Var, readMeta, useAudioPath);
        lb.a aVar = configureDrm.f36325d;
        if (((Uri) aVar.f21640e) != null && ((UUID) aVar.f21639d) == null) {
            z6 = false;
        } else {
            z6 = true;
        }
        b.y(z6);
        Uri uri3 = configureDrm.f36323b;
        j0 j0Var = null;
        if (uri3 != null) {
            lb.a aVar2 = configureDrm.f36325d;
            if (((UUID) aVar2.f21639d) != null) {
                j0Var = new j0(aVar2);
            }
            m0Var = new m0(uri3, null, j0Var, null, configureDrm.f36326e, null, configureDrm.f36327f, configureDrm.f36328g);
        } else {
            m0Var = null;
        }
        String str2 = configureDrm.f36322a;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        g0 g0Var = configureDrm.f36324c;
        g0Var.getClass();
        ?? h0Var = new h0(g0Var);
        k0 k0Var2 = configureDrm.f36330i;
        k0Var2.getClass();
        w7.l0 l0Var = new w7.l0(k0Var2);
        u0 u0Var2 = configureDrm.f36329h;
        if (u0Var2 == null) {
            u0Var2 = u0.L;
        }
        return new r0(str3, h0Var, m0Var, l0Var, u0Var2, configureDrm.f36331j);
    }

    public static /* synthetic */ r0 createMediaItemInternal$default(MediaItemCreator mediaItemCreator, ReadMeta readMeta, boolean z6, long j4, String str, String str2, Double d10, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            str2 = null;
        }
        if ((i10 & 32) != 0) {
            d10 = null;
        }
        return mediaItemCreator.createMediaItemInternal(readMeta, z6, j4, str, str2, d10);
    }

    private final String fallbackReason(ReadMeta readMeta, boolean useAudioPath, long initialOffset, String audioFileNumber, OfflineReadData offlineReadData) {
        int findTtsChapterIndex;
        String readId = readMeta.getReadId();
        if (useAudioPath) {
            if (audioFileNumber == null) {
                audioFileNumber = "001";
            }
            return h.c("picked ONLINE for ", readId, ": media file_number=", audioFileNumber, " has no cached manifest URL");
        }
        if (readMeta.getChapters().isEmpty()) {
            findTtsChapterIndex = 0;
        } else {
            findTtsChapterIndex = ChapterUtilsKt.findTtsChapterIndex(readMeta.getChapters(), initialOffset);
        }
        int i10 = findTtsChapterIndex;
        ChapterOfflineDownloadStatus chapterDownloadIndicator$default = OfflineReadData.chapterDownloadIndicator$default(offlineReadData, i10, 0L, 2, null);
        StringBuilder o6 = a.o(i10, "picked ONLINE for ", readId, ": tts chapter=", " status=");
        o6.append(chapterDownloadIndicator$default);
        return o6.toString();
    }

    private final k getAudioPosition(ReadMeta readMeta, long offset) {
        String str;
        Chapter chapter = (Chapter) o.y0(readMeta.getChapters());
        if (chapter != null) {
            str = chapter.getAudioFileNumber();
        } else {
            str = null;
        }
        double d10 = 0.0d;
        if (offset == -1) {
            String lastListenedAudioFileNumber = readMeta.getLastListenedAudioFileNumber();
            if (lastListenedAudioFileNumber != null) {
                str = lastListenedAudioFileNumber;
            }
            Double lastListenedAudioSeconds = readMeta.getLastListenedAudioSeconds();
            if (lastListenedAudioSeconds != null) {
                d10 = lastListenedAudioSeconds.doubleValue();
            }
            return new k(str, Double.valueOf(d10));
        }
        return new k(str, Double.valueOf(0.0d));
    }

    private final boolean isOffsetInDownloadedChapter(ReadMeta readMeta, long offset, OfflineReadData offlineReadData) {
        if (readMeta.getChapters().isEmpty()) {
            return OfflineReadData.chapterDownloadIndicator$default(offlineReadData, 0, 0L, 2, null) instanceof ChapterOfflineDownloadStatus.Downloaded;
        }
        return OfflineReadData.chapterDownloadIndicator$default(offlineReadData, ChapterUtilsKt.findTtsChapterIndex(readMeta.getChapters(), offset), 0L, 2, null) instanceof ChapterOfflineDownloadStatus.Downloaded;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [w7.m0] */
    /* JADX WARN: Type inference failed for: r4v9, types: [w7.h0, w7.i0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [w7.m0] */
    public final r0 createChapterMediaItem(r0 parentMediaItem, Chapter chapter, Map<String, String> cachedManifestUrls, Map<String, byte[]> drmKeySetIds) {
        j0 j0Var;
        lb.a aVar;
        boolean z6;
        parentMediaItem.getClass();
        u0 u0Var = parentMediaItem.f36581d;
        chapter.getClass();
        cachedManifestUrls.getClass();
        drmKeySetIds.getClass();
        String str = parentMediaItem.f36578a;
        str.getClass();
        String audioFileNumber = chapter.getAudioFileNumber();
        if (audioFileNumber == null) {
            audioFileNumber = "001";
        }
        String str2 = cachedManifestUrls.get(audioFileNumber);
        if (str2 == null) {
            str2 = Uri.parse(this.configuration.getApiUrl() + "/v1/reader/reads/" + str + "/manifest-url").buildUpon().appendQueryParameter("read_id", str).appendQueryParameter("file_number", audioFileNumber).build().toString();
            str2.getClass();
        }
        g0 g0Var = new g0();
        new lb.a();
        List list = Collections.EMPTY_LIST;
        w1 w1Var = w1.f11531e;
        k0 k0Var = new k0();
        n0 n0Var = n0.f36483d;
        Uri parse = Uri.parse(str2);
        t0 a10 = u0Var.a();
        Bundle bundle = new Bundle();
        Bundle bundle2 = u0Var.J;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        ExchangeKt.setAudioFileNumber(bundle, chapter.getAudioFileNumber());
        byte[] bArr = drmKeySetIds.get(audioFileNumber);
        if (bArr != null) {
            bundle.putString(EXTRA_DRM_OFFLINE_KEY_SET_ID, Base64.encodeToString(bArr, 2));
        }
        a10.I = bundle;
        u0 u0Var2 = new u0(a10);
        m0 m0Var = parentMediaItem.f36579b;
        j0 j0Var2 = null;
        if (m0Var != null) {
            j0Var = m0Var.f36471c;
        } else {
            j0Var = null;
        }
        if (j0Var != null) {
            aVar = j0Var.a();
        } else {
            aVar = new lb.a();
        }
        UUID uuid = (UUID) aVar.f21639d;
        if (((Uri) aVar.f21640e) != null && uuid == null) {
            z6 = false;
        } else {
            z6 = true;
        }
        b.y(z6);
        if (parse != null) {
            if (uuid != null) {
                j0Var2 = new j0(aVar);
            }
            j0Var2 = new m0(parse, null, j0Var2, null, list, null, w1Var, -9223372036854775807L);
        }
        return new r0(str, new h0(g0Var), j0Var2, new w7.l0(k0Var), u0Var2, n0Var);
    }

    public final r0 createMediaItem(ReadMeta readMeta, String voiceId, long initialOffset) {
        k kVar;
        long j4;
        readMeta.getClass();
        boolean shouldUseAudioPath$player_release = shouldUseAudioPath$player_release(readMeta, voiceId);
        String resolveEffectiveVoiceId$player_release = resolveEffectiveVoiceId$player_release(readMeta, voiceId, shouldUseAudioPath$player_release);
        if (shouldUseAudioPath$player_release) {
            kVar = getAudioPosition(readMeta, initialOffset);
        } else {
            kVar = new k(null, null);
        }
        String str = (String) kVar.f31600a;
        Double d10 = (Double) kVar.f31601b;
        if (shouldUseAudioPath$player_release) {
            j4 = 0;
        } else {
            if (initialOffset < 0) {
                initialOffset = 0;
            }
            j4 = initialOffset;
        }
        return createMediaItemInternal(readMeta, shouldUseAudioPath$player_release, j4, resolveEffectiveVoiceId$player_release, str, d10);
    }

    public final List<r0> createMediaItems(List<ReadMeta> readMetas, String voiceId, int initialIndex, long initialOffset) {
        long j4;
        long j10;
        k kVar;
        readMetas.getClass();
        ReadMeta readMeta = (ReadMeta) o.z0(initialIndex, readMetas);
        if (readMeta == null) {
            return t.f33547a;
        }
        ArrayList arrayList = new ArrayList(p.a0(readMetas, 10));
        for (ReadMeta readMeta2 : readMetas) {
            if (m.c(readMeta2.getReadId(), readMeta.getReadId())) {
                j4 = initialOffset;
                j10 = 0;
            } else {
                j4 = 0;
                j10 = 0;
            }
            boolean shouldUseAudioPath$player_release = shouldUseAudioPath$player_release(readMeta2, voiceId);
            if (shouldUseAudioPath$player_release) {
                kVar = getAudioPosition(readMeta2, j4);
            } else {
                kVar = new k(null, null);
            }
            String str = (String) kVar.f31600a;
            Double d10 = (Double) kVar.f31601b;
            if (!shouldUseAudioPath$player_release) {
                if (j4 < j10) {
                    j4 = j10;
                }
                j10 = j4;
            }
            arrayList.add(createMediaItemInternal(readMeta2, shouldUseAudioPath$player_release, j10, resolveEffectiveVoiceId$player_release(readMeta2, voiceId, shouldUseAudioPath$player_release), str, d10));
        }
        return arrayList;
    }

    public final String resolveEffectiveVoiceId$player_release(ReadMeta readMeta, String voiceId, boolean useAudioPath) {
        readMeta.getClass();
        if (useAudioPath) {
            return EffectivePlaybackModeKt.ORIGINAL_AUDIO;
        }
        if (readMeta.getHasOriginalAudio() && voiceId == null) {
            return EffectivePlaybackModeKt.ORIGINAL_AUDIO;
        }
        if (voiceId == null) {
            return null;
        }
        return voiceId;
    }

    public final boolean shouldUseAudioPath$player_release(ReadMeta readMeta, String voiceId) {
        readMeta.getClass();
        if (ReadMetaKt.isMediaType(readMeta) && EffectivePlaybackModeKt.effectivePlaybackMode(readMeta, voiceId) == EffectivePlaybackMode.Audio) {
            return true;
        }
        return false;
    }
}
