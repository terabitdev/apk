package io.elevenlabs.data.mapping;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.c6;
import ig.f;
import io.elevenlabs.data.database.entities.offline.OfflineReadEntity;
import io.elevenlabs.data.database.entities.reads.ReadChapterEntity;
import io.elevenlabs.data.database.entities.reads.ReadMetaEntity;
import io.elevenlabs.data.database.entities.reads.ReadMetaEntityWithChapters;
import io.elevenlabs.data.database.entities.reads.SampleConfigEntity;
import io.elevenlabs.data.database.entities.reads.SyncState;
import io.elevenlabs.data.model.BigDecimalJson;
import io.elevenlabs.data.model.ReadMetadataChapterDBModel;
import io.elevenlabs.data.model.ReadRatingMap;
import io.elevenlabs.data.model.request.ConsumptionSpanRequest;
import io.elevenlabs.data.model.response.OriginalAudioDocumentResponseModel;
import io.elevenlabs.data.model.response.OriginalAudioVoiceResponseModel;
import io.elevenlabs.data.model.response.ReadMetadataResponseModel;
import io.elevenlabs.data.model.response.ReadPurchaseConfigResponseModel;
import io.elevenlabs.data.model.response.SampleConfigResponseModel;
import io.elevenlabs.data.serializer.JsonKt;
import io.elevenlabs.domain.model.AudioType;
import io.elevenlabs.domain.model.Chapter;
import io.elevenlabs.domain.model.DisplayMode;
import io.elevenlabs.domain.model.OfflineReadData;
import io.elevenlabs.domain.model.OriginalVoice;
import io.elevenlabs.domain.model.Rating;
import io.elevenlabs.domain.model.ReadCreationStatus;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.ReadSource;
import io.elevenlabs.domain.model.SampleConfig;
import io.elevenlabs.domain.model.SampleParentType;
import io.elevenlabs.domain.model.VoiceSelectionConfig;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import sn.l;
import tn.o;
import tn.p;
import tn.t;
import ur.g1;
import ur.h0;
import vr.c;
import wq.n;
import xq.a;
import xq.b;
import xq.d;
import xq.g;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000^\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0004\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0002\u001a\f\u0010\u0000\u001a\u00020\b*\u00020\tH\u0002\u001a\u000e\u0010\n\u001a\u0004\u0018\u00010\u000b*\u0004\u0018\u00010\f\u001a\n\u0010\u0000\u001a\u00020\u0006*\u00020\r\u001a\u0012\u0010\u0000\u001a\u00020\b*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010\u001a\n\u0010\u0000\u001a\u00020\u0011*\u00020\u0012\u001a\n\u0010\u0000\u001a\u00020\u0013*\u00020\u0014\u001a\n\u0010\u0015\u001a\u00020\u0016*\u00020\u0013\u001a\u000e\u0010\u0017\u001a\u0004\u0018\u00010\u0018*\u0004\u0018\u00010\f\u001a\u000e\u0010\u0019\u001a\u0004\u0018\u00010\u001a*\u0004\u0018\u00010\f¨\u0006\u001b"}, d2 = {"toDomain", "Lio/elevenlabs/domain/model/ReadMeta;", "Lio/elevenlabs/data/model/response/ReadMetadataResponseModel;", "toEntity", "Lio/elevenlabs/data/database/entities/reads/ReadMetaEntityWithChapters;", "toSampleConfigDomain", "Lio/elevenlabs/domain/model/SampleConfig;", "Lio/elevenlabs/data/database/entities/reads/SampleConfigEntity;", "Lio/elevenlabs/domain/model/Chapter;", "Lio/elevenlabs/data/database/entities/reads/ReadChapterEntity;", "toDomainDisplayMode", "Lio/elevenlabs/domain/model/DisplayMode;", "", "Lio/elevenlabs/data/model/response/SampleConfigResponseModel;", "Lio/elevenlabs/data/model/ReadMetadataChapterDBModel;", FirebaseAnalytics.Param.INDEX, "", "Lio/elevenlabs/domain/model/ReadCreationStatus;", "Lio/elevenlabs/data/model/response/ReadMetadataResponseModel$CreationStatus;", "Lio/elevenlabs/domain/model/AudioType;", "Lio/elevenlabs/data/model/response/ReadMetadataResponseModel$AudioType;", "toRequestType", "Lio/elevenlabs/data/model/request/ConsumptionSpanRequest$Type;", "toVoiceSelectionConfig", "Lio/elevenlabs/domain/model/VoiceSelectionConfig;", "toDomainSource", "Lio/elevenlabs/domain/model/ReadSource;", "data_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ReadMappingKt {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[ReadMetadataResponseModel.CreationStatus.values().length];
            try {
                iArr[ReadMetadataResponseModel.CreationStatus.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadMetadataResponseModel.CreationStatus.CREATING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReadMetadataResponseModel.CreationStatus.FINISHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ReadMetadataResponseModel.CreationStatus.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ReadMetadataResponseModel.AudioType.values().length];
            try {
                iArr2[ReadMetadataResponseModel.AudioType.TTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ReadMetadataResponseModel.AudioType.MEDIA.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[AudioType.values().length];
            try {
                iArr3[AudioType.TTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[AudioType.MEDIA.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01e8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ReadMeta toDomain(ReadMetaEntityWithChapters readMetaEntityWithChapters) {
        Date date;
        String str;
        String str2;
        String str3;
        String str4;
        Rating rating;
        boolean z6;
        Iterator it;
        Long l4;
        Object obj;
        ReadMetadataResponseModel.CreationStatus creationStatus;
        boolean z10;
        String str5;
        String str6;
        String str7;
        ReadCreationStatus readCreationStatus;
        Long completed_at_unix;
        String str8;
        Date date2;
        String publicationDate;
        OfflineReadEntity offlineRead;
        OfflineReadData offlineReadData;
        String original_audio_voice_name;
        String str9;
        Date date3;
        OriginalVoice originalVoice;
        SampleConfigEntity sampleConfig;
        String str10;
        Date date4;
        String str11;
        Long l7;
        Date date5;
        SampleConfig sampleConfig2;
        String display_mode;
        DisplayMode displayMode;
        String audio_type;
        String str12;
        String str13;
        VoiceSelectionConfig voiceSelectionConfig;
        AudioType audioType;
        String last_used_audio_type;
        String str14;
        AudioType audioType2;
        String cover_image_urls;
        String str15;
        Object lVar;
        Object obj2;
        Map map;
        AudioType audioType3;
        AudioType audioType4;
        AudioType audioType5;
        Iterator it2;
        readMetaEntityWithChapters.getClass();
        String read_id = readMetaEntityWithChapters.getMeta().getRead_id();
        String article_image_url = readMetaEntityWithChapters.getMeta().getArticle_image_url();
        String author = readMetaEntityWithChapters.getMeta().getAuthor();
        List<ReadChapterEntity> chapters = readMetaEntityWithChapters.getChapters();
        ArrayList arrayList = new ArrayList(p.a0(chapters, 10));
        Iterator<T> it3 = chapters.iterator();
        while (it3.hasNext()) {
            arrayList.add(toDomain((ReadChapterEntity) it3.next()));
        }
        long char_count = readMetaEntityWithChapters.getMeta().getChar_count();
        Date date6 = new Date(readMetaEntityWithChapters.getMeta().getCreated_at_unix());
        a aVar = b.f38124b;
        long updated_at_unix = readMetaEntityWithChapters.getMeta().getUpdated_at_unix();
        d dVar = d.SECONDS;
        Date date7 = new Date(b.d(g.o(updated_at_unix, dVar)));
        Long added_at_unix = readMetaEntityWithChapters.getMeta().getAdded_at_unix();
        if (added_at_unix != null) {
            date = new Date(b.d(g.o(added_at_unix.longValue(), dVar)));
        } else {
            date = new Date(readMetaEntityWithChapters.getMeta().getCreated_at_unix());
        }
        String description = readMetaEntityWithChapters.getMeta().getDescription();
        long last_listened_char_offset = readMetaEntityWithChapters.getMeta().getLast_listened_char_offset();
        ReadSource domainSource = toDomainSource(readMetaEntityWithChapters.getMeta().getSource());
        String title = readMetaEntityWithChapters.getMeta().getTitle();
        String str16 = "";
        if (title == null) {
            str = "";
        } else {
            str = title;
        }
        String subtitle = readMetaEntityWithChapters.getMeta().getSubtitle();
        if (subtitle != null) {
            str16 = subtitle;
        }
        String url = readMetaEntityWithChapters.getMeta().getUrl();
        long word_count = readMetaEntityWithChapters.getMeta().getWord_count();
        String original_file_type = readMetaEntityWithChapters.getMeta().getOriginal_file_type();
        boolean has_original_audio = readMetaEntityWithChapters.getMeta().getHas_original_audio();
        boolean mature_content = readMetaEntityWithChapters.getMeta().getMature_content();
        String origin = readMetaEntityWithChapters.getMeta().getOrigin();
        String content_type = readMetaEntityWithChapters.getMeta().getContent_type();
        List<String> genre = readMetaEntityWithChapters.getMeta().getGenre();
        boolean from_user_import = readMetaEntityWithChapters.getMeta().getFrom_user_import();
        if (readMetaEntityWithChapters.getMeta().getRating_average() != null && readMetaEntityWithChapters.getMeta().getRating_count() != null) {
            str2 = description;
            str3 = article_image_url;
            str4 = author;
            rating = new Rating(readMetaEntityWithChapters.getMeta().getRating_average().floatValue(), readMetaEntityWithChapters.getMeta().getRating_count().longValue());
        } else {
            str2 = description;
            str3 = article_image_url;
            str4 = author;
            rating = null;
        }
        Long user_rating = readMetaEntityWithChapters.getMeta().getUser_rating();
        if (!m.c(readMetaEntityWithChapters.getMeta().getSource(), "book") && (readMetaEntityWithChapters.getMeta().getOriginal_file_type() != null || !m.c(readMetaEntityWithChapters.getMeta().getSource(), "file"))) {
            String original_file_type2 = readMetaEntityWithChapters.getMeta().getOriginal_file_type();
            if (!m.c(original_file_type2, "application/epub+zip") && !m.c(original_file_type2, "application/pdf")) {
                z6 = false;
                boolean z11 = z6;
                String last_used_voice_id = readMetaEntityWithChapters.getMeta().getLast_used_voice_id();
                it = ReadMetadataResponseModel.CreationStatus.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = it.next();
                        it2 = it;
                        l4 = user_rating;
                        if (m.c(((ReadMetadataResponseModel.CreationStatus) obj).getValue(), readMetaEntityWithChapters.getMeta().getCreation_status())) {
                            break;
                        }
                        it = it2;
                        user_rating = l4;
                    } else {
                        l4 = user_rating;
                        obj = null;
                        break;
                    }
                }
                creationStatus = (ReadMetadataResponseModel.CreationStatus) obj;
                if (creationStatus == null) {
                    z10 = z11;
                    str5 = str3;
                    str6 = last_used_voice_id;
                    str7 = str4;
                    readCreationStatus = toDomain(creationStatus);
                } else {
                    z10 = z11;
                    str5 = str3;
                    str6 = last_used_voice_id;
                    str7 = str4;
                    readCreationStatus = null;
                }
                Float creation_progress = readMetaEntityWithChapters.getMeta().getCreation_progress();
                boolean is_archived = readMetaEntityWithChapters.getMeta().is_archived();
                boolean marked_as_unread = readMetaEntityWithChapters.getMeta().getMarked_as_unread();
                completed_at_unix = readMetaEntityWithChapters.getMeta().getCompleted_at_unix();
                if (completed_at_unix == null) {
                    a aVar2 = b.f38124b;
                    str8 = str5;
                    date2 = new Date(b.d(g.o(completed_at_unix.longValue(), dVar)));
                } else {
                    str8 = str5;
                    date2 = null;
                }
                publicationDate = readMetaEntityWithChapters.getMeta().getPublicationDate();
                String language = readMetaEntityWithChapters.getMeta().getLanguage();
                String publisherProfileId = readMetaEntityWithChapters.getMeta().getPublisherProfileId();
                boolean can_delete = readMetaEntityWithChapters.getMeta().getCan_delete();
                String android_product_id = readMetaEntityWithChapters.getMeta().getAndroid_product_id();
                boolean is_paid = readMetaEntityWithChapters.getMeta().is_paid();
                offlineRead = readMetaEntityWithChapters.getOfflineRead();
                if (offlineRead == null) {
                    offlineReadData = OfflineReadMappingKt.toDomain$default(offlineRead, readMetaEntityWithChapters.getOfflineChapters(), 0L, 2, null);
                } else {
                    offlineReadData = null;
                }
                String previewAudio = readMetaEntityWithChapters.getMeta().getPreviewAudio();
                original_audio_voice_name = readMetaEntityWithChapters.getMeta().getOriginal_audio_voice_name();
                if (original_audio_voice_name != null || n.m0(original_audio_voice_name)) {
                    str9 = publicationDate;
                    date3 = date2;
                    originalVoice = null;
                } else {
                    str9 = publicationDate;
                    date3 = date2;
                    originalVoice = new OriginalVoice(readMetaEntityWithChapters.getMeta().getOriginal_audio_voice_name(), readMetaEntityWithChapters.getMeta().getOriginal_audio_voice_image());
                }
                VoiceSelectionConfig voiceSelectionConfig2 = toVoiceSelectionConfig(readMetaEntityWithChapters.getMeta().getVoice_selection_config());
                sampleConfig = readMetaEntityWithChapters.getSampleConfig();
                if (sampleConfig == null) {
                    str10 = language;
                    date4 = date;
                    str11 = str2;
                    l7 = l4;
                    date5 = date3;
                    sampleConfig2 = toSampleConfigDomain(sampleConfig);
                } else {
                    str10 = language;
                    date4 = date;
                    str11 = str2;
                    l7 = l4;
                    date5 = date3;
                    sampleConfig2 = null;
                }
                display_mode = readMetaEntityWithChapters.getMeta().getDisplay_mode();
                if (display_mode == null) {
                    displayMode = toDomainDisplayMode(display_mode);
                } else {
                    displayMode = null;
                }
                boolean can_use_assistant = readMetaEntityWithChapters.getMeta().getCan_use_assistant();
                audio_type = readMetaEntityWithChapters.getMeta().getAudio_type();
                if (audio_type == null) {
                    if (audio_type.equals("tts")) {
                        audioType5 = AudioType.TTS;
                    } else if (audio_type.equals("media")) {
                        audioType5 = AudioType.MEDIA;
                    } else {
                        audioType5 = null;
                    }
                    str12 = str8;
                    str13 = str9;
                    voiceSelectionConfig = voiceSelectionConfig2;
                    audioType = audioType5;
                } else {
                    str12 = str8;
                    str13 = str9;
                    voiceSelectionConfig = voiceSelectionConfig2;
                    audioType = null;
                }
                boolean use_drm = readMetaEntityWithChapters.getMeta().getUse_drm();
                String last_listened_audio_file_number = readMetaEntityWithChapters.getMeta().getLast_listened_audio_file_number();
                Double last_listened_audio_seconds = readMetaEntityWithChapters.getMeta().getLast_listened_audio_seconds();
                List<String> audio_types = readMetaEntityWithChapters.getMeta().getAudio_types();
                ArrayList arrayList2 = new ArrayList();
                for (String str17 : audio_types) {
                    String str18 = str7;
                    if (m.c(str17, "tts")) {
                        audioType4 = AudioType.TTS;
                    } else if (m.c(str17, "media")) {
                        audioType4 = AudioType.MEDIA;
                    } else {
                        audioType4 = null;
                    }
                    if (audioType4 != null) {
                        arrayList2.add(audioType4);
                    }
                    str7 = str18;
                }
                String str19 = str7;
                Set l12 = o.l1(arrayList2);
                boolean is_voice_changer_on = readMetaEntityWithChapters.getMeta().is_voice_changer_on();
                last_used_audio_type = readMetaEntityWithChapters.getMeta().getLast_used_audio_type();
                if (last_used_audio_type == null) {
                    if (last_used_audio_type.equals("tts")) {
                        audioType3 = AudioType.TTS;
                    } else if (last_used_audio_type.equals("media")) {
                        audioType3 = AudioType.MEDIA;
                    } else {
                        audioType3 = null;
                    }
                    str14 = str19;
                    audioType2 = audioType3;
                } else {
                    str14 = str19;
                    audioType2 = null;
                }
                cover_image_urls = readMetaEntityWithChapters.getMeta().getCover_image_urls();
                if (cover_image_urls == null) {
                    try {
                        c json = JsonKt.getJson();
                        json.getClass();
                        str15 = str14;
                        try {
                            g1 g1Var = g1.f34588a;
                            lVar = (Map) json.b(cover_image_urls, new h0(g1Var, g1Var));
                        } catch (Throwable th) {
                            th = th;
                            lVar = new l(th);
                            if (!(lVar instanceof l)) {
                            }
                            map = (Map) obj2;
                            return new ReadMeta(str12, str15, arrayList, char_count, date6, date7, date4, str11, last_listened_char_offset, read_id, domainSource, str, str16, url, word_count, original_file_type, has_original_audio, mature_content, origin, content_type, genre, z10, from_user_import, rating, l7, str6, readCreationStatus, creation_progress, is_archived, marked_as_unread, date5, str13, str10, publisherProfileId, can_delete, android_product_id, is_paid, offlineReadData, previewAudio, originalVoice, voiceSelectionConfig, sampleConfig2, displayMode, false, can_use_assistant, audioType, use_drm, last_listened_audio_file_number, last_listened_audio_seconds, null, l12, is_voice_changer_on, audioType2, map, readMetaEntityWithChapters.getMeta().getCover_aspect_ratio(), readMetaEntityWithChapters.getMeta().getBlur_placeholder(), 0, 133120, null);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        str15 = str14;
                    }
                    if (!(lVar instanceof l)) {
                        obj2 = null;
                    } else {
                        obj2 = lVar;
                    }
                    map = (Map) obj2;
                } else {
                    str15 = str14;
                    map = null;
                }
                return new ReadMeta(str12, str15, arrayList, char_count, date6, date7, date4, str11, last_listened_char_offset, read_id, domainSource, str, str16, url, word_count, original_file_type, has_original_audio, mature_content, origin, content_type, genre, z10, from_user_import, rating, l7, str6, readCreationStatus, creation_progress, is_archived, marked_as_unread, date5, str13, str10, publisherProfileId, can_delete, android_product_id, is_paid, offlineReadData, previewAudio, originalVoice, voiceSelectionConfig, sampleConfig2, displayMode, false, can_use_assistant, audioType, use_drm, last_listened_audio_file_number, last_listened_audio_seconds, null, l12, is_voice_changer_on, audioType2, map, readMetaEntityWithChapters.getMeta().getCover_aspect_ratio(), readMetaEntityWithChapters.getMeta().getBlur_placeholder(), 0, 133120, null);
            }
        }
        z6 = true;
        boolean z112 = z6;
        String last_used_voice_id2 = readMetaEntityWithChapters.getMeta().getLast_used_voice_id();
        it = ReadMetadataResponseModel.CreationStatus.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
            }
            it = it2;
            user_rating = l4;
        }
        creationStatus = (ReadMetadataResponseModel.CreationStatus) obj;
        if (creationStatus == null) {
        }
        Float creation_progress2 = readMetaEntityWithChapters.getMeta().getCreation_progress();
        boolean is_archived2 = readMetaEntityWithChapters.getMeta().is_archived();
        boolean marked_as_unread2 = readMetaEntityWithChapters.getMeta().getMarked_as_unread();
        completed_at_unix = readMetaEntityWithChapters.getMeta().getCompleted_at_unix();
        if (completed_at_unix == null) {
        }
        publicationDate = readMetaEntityWithChapters.getMeta().getPublicationDate();
        String language2 = readMetaEntityWithChapters.getMeta().getLanguage();
        String publisherProfileId2 = readMetaEntityWithChapters.getMeta().getPublisherProfileId();
        boolean can_delete2 = readMetaEntityWithChapters.getMeta().getCan_delete();
        String android_product_id2 = readMetaEntityWithChapters.getMeta().getAndroid_product_id();
        boolean is_paid2 = readMetaEntityWithChapters.getMeta().is_paid();
        offlineRead = readMetaEntityWithChapters.getOfflineRead();
        if (offlineRead == null) {
        }
        String previewAudio2 = readMetaEntityWithChapters.getMeta().getPreviewAudio();
        original_audio_voice_name = readMetaEntityWithChapters.getMeta().getOriginal_audio_voice_name();
        if (original_audio_voice_name != null) {
        }
        str9 = publicationDate;
        date3 = date2;
        originalVoice = null;
        VoiceSelectionConfig voiceSelectionConfig22 = toVoiceSelectionConfig(readMetaEntityWithChapters.getMeta().getVoice_selection_config());
        sampleConfig = readMetaEntityWithChapters.getSampleConfig();
        if (sampleConfig == null) {
        }
        display_mode = readMetaEntityWithChapters.getMeta().getDisplay_mode();
        if (display_mode == null) {
        }
        boolean can_use_assistant2 = readMetaEntityWithChapters.getMeta().getCan_use_assistant();
        audio_type = readMetaEntityWithChapters.getMeta().getAudio_type();
        if (audio_type == null) {
        }
        boolean use_drm2 = readMetaEntityWithChapters.getMeta().getUse_drm();
        String last_listened_audio_file_number2 = readMetaEntityWithChapters.getMeta().getLast_listened_audio_file_number();
        Double last_listened_audio_seconds2 = readMetaEntityWithChapters.getMeta().getLast_listened_audio_seconds();
        List<String> audio_types2 = readMetaEntityWithChapters.getMeta().getAudio_types();
        ArrayList arrayList22 = new ArrayList();
        while (r55.hasNext()) {
        }
        String str192 = str7;
        Set l122 = o.l1(arrayList22);
        boolean is_voice_changer_on2 = readMetaEntityWithChapters.getMeta().is_voice_changer_on();
        last_used_audio_type = readMetaEntityWithChapters.getMeta().getLast_used_audio_type();
        if (last_used_audio_type == null) {
        }
        cover_image_urls = readMetaEntityWithChapters.getMeta().getCover_image_urls();
        if (cover_image_urls == null) {
        }
        return new ReadMeta(str12, str15, arrayList, char_count, date6, date7, date4, str11, last_listened_char_offset, read_id, domainSource, str, str16, url, word_count, original_file_type, has_original_audio, mature_content, origin, content_type, genre, z10, from_user_import, rating, l7, str6, readCreationStatus, creation_progress2, is_archived2, marked_as_unread2, date5, str13, str10, publisherProfileId2, can_delete2, android_product_id2, is_paid2, offlineReadData, previewAudio2, originalVoice, voiceSelectionConfig, sampleConfig2, displayMode, false, can_use_assistant2, audioType, use_drm2, last_listened_audio_file_number2, last_listened_audio_seconds2, null, l122, is_voice_changer_on2, audioType2, map, readMetaEntityWithChapters.getMeta().getCover_aspect_ratio(), readMetaEntityWithChapters.getMeta().getBlur_placeholder(), 0, 133120, null);
    }

    public static final DisplayMode toDomainDisplayMode(String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1977135953) {
                if (hashCode != 3556653) {
                    if (hashCode == 1503042371 && str.equals("audio-only")) {
                        return DisplayMode.AudioOnly;
                    }
                    return null;
                }
                if (str.equals(ParameterNames.TEXT)) {
                    return DisplayMode.Text;
                }
                return null;
            }
            if (str.equals("text-with-audio")) {
                return DisplayMode.TextAndAudio;
            }
            return null;
        }
        return null;
    }

    public static final ReadSource toDomainSource(String str) {
        Object obj;
        Iterator<E> it = ReadSource.getEntries().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (m.c(((ReadSource) obj).getValue(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (ReadSource) obj;
    }

    public static final ReadMetaEntityWithChapters toEntity(ReadMetadataResponseModel readMetadataResponseModel) {
        OriginalAudioVoiceResponseModel originalAudioVoiceResponseModel;
        SampleConfigEntity sampleConfigEntity;
        List<String> list;
        Float f10;
        Long l4;
        String str;
        Float f11;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        BigDecimal value;
        BigDecimalJson averageRating;
        BigDecimal value2;
        boolean z6;
        String str8;
        List<OriginalAudioVoiceResponseModel> voices;
        readMetadataResponseModel.getClass();
        OriginalAudioDocumentResponseModel originalAudioDocument = readMetadataResponseModel.getOriginalAudioDocument();
        if (originalAudioDocument != null && (voices = originalAudioDocument.getVoices()) != null) {
            originalAudioVoiceResponseModel = (OriginalAudioVoiceResponseModel) o.y0(voices);
        } else {
            originalAudioVoiceResponseModel = null;
        }
        SampleConfigResponseModel sampleConfig = readMetadataResponseModel.getSampleConfig();
        int i10 = 0;
        if (sampleConfig != null) {
            Boolean isSample = sampleConfig.isSample();
            if (isSample != null) {
                z6 = isSample.booleanValue();
            } else {
                z6 = false;
            }
            String parentId = sampleConfig.getParentId();
            String parentType = sampleConfig.getParentType();
            List<String> chapterIds = sampleConfig.getChapterIds();
            if (chapterIds != null) {
                str8 = o.E0(chapterIds, Separators.COMMA, null, null, null, 62);
            } else {
                str8 = null;
            }
            sampleConfigEntity = new SampleConfigEntity(0L, z6, parentId, parentType, str8, 1, null);
        } else {
            sampleConfigEntity = null;
        }
        String readId = readMetadataResponseModel.getReadId();
        String articleImageUrl = readMetadataResponseModel.getArticleImageUrl();
        String author = readMetadataResponseModel.getAuthor();
        long charCount = readMetadataResponseModel.getCharCount();
        long createdAtUnix = readMetadataResponseModel.getCreatedAtUnix();
        long updatedAtUnix = readMetadataResponseModel.getUpdatedAtUnix();
        long addedAtUnix = readMetadataResponseModel.getAddedAtUnix();
        String description = readMetadataResponseModel.getDescription();
        long lastListenedCharOffset = readMetadataResponseModel.getLastListenedCharOffset();
        String sourceField = readMetadataResponseModel.getSourceField();
        if (sourceField == null) {
            sourceField = readMetadataResponseModel.getSource();
        }
        String str9 = sourceField;
        String title = readMetadataResponseModel.getTitle();
        String subtitle = readMetadataResponseModel.getSubtitle();
        String url = readMetadataResponseModel.getUrl();
        long wordCount = readMetadataResponseModel.getWordCount();
        SyncState syncState = SyncState.UPDATED;
        String originalFileType = readMetadataResponseModel.getOriginalFileType();
        Boolean hasOriginalAudio = readMetadataResponseModel.getHasOriginalAudio();
        Boolean bool = Boolean.TRUE;
        boolean c5 = m.c(hasOriginalAudio, bool);
        boolean c10 = m.c(readMetadataResponseModel.getMatureContent(), bool);
        String origin = readMetadataResponseModel.getOrigin();
        String contentType = readMetadataResponseModel.getContentType();
        List<String> genre = readMetadataResponseModel.getGenre();
        t tVar = t.f33547a;
        if (genre == null) {
            list = tVar;
        } else {
            list = genre;
        }
        String htmlChecksum = readMetadataResponseModel.getHtmlChecksum();
        boolean c11 = m.c(readMetadataResponseModel.getCanDelete(), bool);
        boolean c12 = m.c(readMetadataResponseModel.getFromUserImport(), bool);
        ReadRatingMap ratingMap = readMetadataResponseModel.getRatingMap();
        if (ratingMap != null && (averageRating = ratingMap.getAverageRating()) != null && (value2 = averageRating.getValue()) != null) {
            f10 = Float.valueOf(value2.floatValue());
        } else {
            f10 = null;
        }
        ReadRatingMap ratingMap2 = readMetadataResponseModel.getRatingMap();
        if (ratingMap2 != null) {
            l4 = Long.valueOf(ratingMap2.getTotalRatingCount());
        } else {
            l4 = null;
        }
        Long rating = readMetadataResponseModel.getRating();
        String lastUsedVoiceId = readMetadataResponseModel.getLastUsedVoiceId();
        ReadMetadataResponseModel.CreationStatus creationStatus = readMetadataResponseModel.getCreationStatus();
        if (creationStatus != null) {
            str = creationStatus.getValue();
        } else {
            str = null;
        }
        BigDecimalJson creationProgress = readMetadataResponseModel.getCreationProgress();
        if (creationProgress != null && (value = creationProgress.getValue()) != null) {
            f11 = Float.valueOf(value.floatValue());
        } else {
            f11 = null;
        }
        boolean c13 = m.c(readMetadataResponseModel.isArchived(), bool);
        boolean c14 = m.c(readMetadataResponseModel.getMarkedAsUnread(), bool);
        Long completedAtUnix = readMetadataResponseModel.getCompletedAtUnix();
        String publicationDate = readMetadataResponseModel.getPublicationDate();
        String language = readMetadataResponseModel.getLanguage();
        String publisherProfileId = readMetadataResponseModel.getPublisherProfileId();
        ReadPurchaseConfigResponseModel purchaseConfig = readMetadataResponseModel.getPurchaseConfig();
        if (purchaseConfig != null) {
            str2 = purchaseConfig.getAndroidProductId();
        } else {
            str2 = null;
        }
        boolean c15 = m.c(readMetadataResponseModel.isPayable(), bool);
        String previewAudio = readMetadataResponseModel.getPreviewAudio();
        if (originalAudioVoiceResponseModel != null) {
            str3 = originalAudioVoiceResponseModel.getVoiceName();
        } else {
            str3 = null;
        }
        if (originalAudioVoiceResponseModel != null) {
            str4 = originalAudioVoiceResponseModel.getImageUrl();
        } else {
            str4 = null;
        }
        String voiceSelectionConfig = readMetadataResponseModel.getVoiceSelectionConfig();
        String displayMode = readMetadataResponseModel.getDisplayMode();
        boolean c16 = m.c(readMetadataResponseModel.getInUserLibrary(), bool);
        boolean c17 = m.c(readMetadataResponseModel.getCanUseAssistant(), bool);
        ReadMetadataResponseModel.AudioType audioType = readMetadataResponseModel.getAudioType();
        if (audioType != null) {
            str5 = audioType.getValue();
        } else {
            str5 = null;
        }
        boolean c18 = m.c(readMetadataResponseModel.getUseDrm(), bool);
        String lastListenedAudioFileNumber = readMetadataResponseModel.getLastListenedAudioFileNumber();
        Double lastListenedAudioSeconds = readMetadataResponseModel.getLastListenedAudioSeconds();
        List<ReadMetadataResponseModel.AudioType> audioTypes = readMetadataResponseModel.getAudioTypes();
        if (audioTypes == null) {
            audioTypes = tVar;
        }
        ArrayList arrayList = new ArrayList(p.a0(audioTypes, 10));
        Iterator<T> it = audioTypes.iterator();
        while (it.hasNext()) {
            arrayList.add(((ReadMetadataResponseModel.AudioType) it.next()).getValue());
        }
        boolean c19 = m.c(readMetadataResponseModel.isVoiceChangerOn(), Boolean.TRUE);
        ReadMetadataResponseModel.AudioType lastUsedAudioType = readMetadataResponseModel.getLastUsedAudioType();
        if (lastUsedAudioType != null) {
            str6 = lastUsedAudioType.getValue();
        } else {
            str6 = null;
        }
        Map<String, String> coverImageUrls = readMetadataResponseModel.getCoverImageUrls();
        if (coverImageUrls != null) {
            c json = JsonKt.getJson();
            json.getClass();
            g1 g1Var = g1.f34588a;
            str7 = json.d(new h0(g1Var, g1Var), coverImageUrls);
        } else {
            str7 = null;
        }
        ReadMetaEntity readMetaEntity = new ReadMetaEntity(readId, syncState, articleImageUrl, author, charCount, createdAtUnix, updatedAtUnix, Long.valueOf(addedAtUnix), description, lastListenedCharOffset, str9, title, subtitle, url, wordCount, originalFileType, c5, c10, origin, contentType, list, htmlChecksum, c12, f10, l4, rating, lastUsedVoiceId, str, f11, c13, c14, completedAtUnix, publicationDate, language, publisherProfileId, c11, str2, c15, previewAudio, str3, str4, voiceSelectionConfig, null, displayMode, c16, c17, str5, c18, lastListenedAudioFileNumber, lastListenedAudioSeconds, arrayList, c19, str6, str7, readMetadataResponseModel.getCoverAspectRatio(), readMetadataResponseModel.getBlurPlaceholder());
        List<ReadMetadataChapterDBModel> chapters = readMetadataResponseModel.getChapters();
        ArrayList arrayList2 = new ArrayList(p.a0(chapters, 10));
        Iterator<T> it2 = chapters.iterator();
        while (true) {
            int i11 = i10;
            if (it2.hasNext()) {
                Object next = it2.next();
                i10 = i11 + 1;
                if (i11 >= 0) {
                    ReadMetadataChapterDBModel readMetadataChapterDBModel = (ReadMetadataChapterDBModel) next;
                    arrayList2.add(new ReadChapterEntity(readMetadataResponseModel.getReadId(), i11, readMetadataChapterDBModel.getChapterName(), readMetadataChapterDBModel.getCharCount(), m.c(readMetadataChapterDBModel.getHasSummary(), Boolean.TRUE), readMetadataChapterDBModel.getWordCount(), readMetadataChapterDBModel.getStartingCharOffset(), readMetadataChapterDBModel.getDurationSeconds(), readMetadataChapterDBModel.getFileNumber()));
                } else {
                    f.U();
                    throw null;
                }
            } else {
                return new ReadMetaEntityWithChapters(readMetaEntity, arrayList2, null, tVar, sampleConfigEntity);
            }
        }
    }

    public static final ConsumptionSpanRequest.Type toRequestType(AudioType audioType) {
        audioType.getClass();
        int i10 = WhenMappings.$EnumSwitchMapping$2[audioType.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return ConsumptionSpanRequest.Type.MEDIA;
            }
            c6.p();
            return null;
        }
        return ConsumptionSpanRequest.Type.TTS;
    }

    private static final SampleConfig toSampleConfigDomain(SampleConfigEntity sampleConfigEntity) {
        SampleParentType sampleParentType;
        boolean isSample = sampleConfigEntity.isSample();
        String parentId = sampleConfigEntity.getParentId();
        String parentType = sampleConfigEntity.getParentType();
        ArrayList arrayList = null;
        if (m.c(parentType, "read")) {
            sampleParentType = SampleParentType.READ;
        } else if (m.c(parentType, "collection")) {
            sampleParentType = SampleParentType.COLLECTION;
        } else {
            sampleParentType = null;
        }
        String chapterIds = sampleConfigEntity.getChapterIds();
        if (chapterIds != null) {
            List z02 = n.z0(chapterIds, new String[]{Separators.COMMA}, 6);
            arrayList = new ArrayList(p.a0(z02, 10));
            Iterator it = z02.iterator();
            while (it.hasNext()) {
                arrayList.add(n.L0((String) it.next()).toString());
            }
        }
        return new SampleConfig(isSample, parentId, sampleParentType, arrayList);
    }

    public static final VoiceSelectionConfig toVoiceSelectionConfig(String str) {
        if (m.c(str, "pre-selected-only")) {
            return VoiceSelectionConfig.PreSelectedOnly;
        }
        if (m.c(str, "allow-all")) {
            return VoiceSelectionConfig.AllowAll;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x013c, code lost:
    
        if (kotlin.jvm.internal.m.c(r1, "application/pdf") == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0148, code lost:
    
        if (kotlin.jvm.internal.m.c(r67.getSourceField(), "podcast") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x014b, code lost:
    
        r1 = r29;
        r29 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02ad A[LOOP:1: B:80:0x02a7->B:82:0x02ad, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ReadMeta toDomain(ReadMetadataResponseModel readMetadataResponseModel) {
        OriginalVoice originalVoice;
        String sourceField;
        String title;
        String subtitle;
        List<String> genre;
        t tVar;
        boolean z6;
        String str;
        String str2;
        Rating rating;
        Long completedAtUnix;
        t tVar2;
        Date date;
        List<ReadMetadataResponseModel.AudioType> audioTypes;
        Iterator<T> it;
        BigDecimal value;
        List<OriginalAudioVoiceResponseModel> voices;
        OriginalAudioVoiceResponseModel originalAudioVoiceResponseModel;
        readMetadataResponseModel.getClass();
        OriginalAudioDocumentResponseModel originalAudioDocument = readMetadataResponseModel.getOriginalAudioDocument();
        if (originalAudioDocument != null && (voices = originalAudioDocument.getVoices()) != null && (originalAudioVoiceResponseModel = (OriginalAudioVoiceResponseModel) o.y0(voices)) != null) {
            if (n.m0(originalAudioVoiceResponseModel.getVoiceName())) {
                originalAudioVoiceResponseModel = null;
            }
            if (originalAudioVoiceResponseModel != null) {
                originalVoice = new OriginalVoice(originalAudioVoiceResponseModel.getVoiceName(), originalAudioVoiceResponseModel.getImageUrl());
                String articleImageUrl = readMetadataResponseModel.getArticleImageUrl();
                String author = readMetadataResponseModel.getAuthor();
                List<ReadMetadataChapterDBModel> chapters = readMetadataResponseModel.getChapters();
                ArrayList arrayList = new ArrayList(p.a0(chapters, 10));
                int i10 = 0;
                for (Object obj : chapters) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        f.U();
                        throw null;
                    }
                    arrayList.add(toDomain((ReadMetadataChapterDBModel) obj, i10));
                    i10 = i11;
                }
                long charCount = readMetadataResponseModel.getCharCount();
                a aVar = b.f38124b;
                long createdAtUnix = readMetadataResponseModel.getCreatedAtUnix();
                d dVar = d.SECONDS;
                Date date2 = new Date(b.d(g.o(createdAtUnix, dVar)));
                Date date3 = new Date(b.d(g.o(readMetadataResponseModel.getUpdatedAtUnix(), dVar)));
                Date date4 = new Date(b.d(g.o(readMetadataResponseModel.getAddedAtUnix(), dVar)));
                String description = readMetadataResponseModel.getDescription();
                long lastListenedCharOffset = readMetadataResponseModel.getLastListenedCharOffset();
                String readId = readMetadataResponseModel.getReadId();
                sourceField = readMetadataResponseModel.getSourceField();
                if (sourceField == null) {
                    sourceField = readMetadataResponseModel.getSource();
                }
                ReadSource domainSource = toDomainSource(sourceField);
                title = readMetadataResponseModel.getTitle();
                if (title == null) {
                    title = "";
                }
                subtitle = readMetadataResponseModel.getSubtitle();
                if (subtitle == null) {
                    subtitle = "";
                }
                String url = readMetadataResponseModel.getUrl();
                long wordCount = readMetadataResponseModel.getWordCount();
                String originalFileType = readMetadataResponseModel.getOriginalFileType();
                Boolean hasOriginalAudio = readMetadataResponseModel.getHasOriginalAudio();
                Boolean bool = Boolean.TRUE;
                boolean c5 = m.c(hasOriginalAudio, bool);
                boolean c10 = m.c(readMetadataResponseModel.getMatureContent(), bool);
                String origin = readMetadataResponseModel.getOrigin();
                String contentType = readMetadataResponseModel.getContentType();
                genre = readMetadataResponseModel.getGenre();
                t tVar3 = t.f33547a;
                if (genre == null) {
                    genre = tVar3;
                }
                if (!m.c(readMetadataResponseModel.getSourceField(), "book")) {
                    if (readMetadataResponseModel.getOriginalFileType() != null || !m.c(readMetadataResponseModel.getSourceField(), "file")) {
                        String originalFileType2 = readMetadataResponseModel.getOriginalFileType();
                        if (!m.c(originalFileType2, "application/epub+zip")) {
                        }
                    }
                }
                t tVar4 = tVar3;
                boolean z10 = true;
                boolean c11 = m.c(readMetadataResponseModel.getFromUserImport(), bool);
                if (readMetadataResponseModel.getRatingMap() == null) {
                    tVar = tVar4;
                    z6 = c11;
                    str = title;
                    str2 = articleImageUrl;
                    rating = new Rating(readMetadataResponseModel.getRatingMap().getAverageRating().getValue().floatValue(), readMetadataResponseModel.getRatingMap().getTotalRatingCount());
                } else {
                    tVar = tVar4;
                    z6 = c11;
                    str = title;
                    str2 = articleImageUrl;
                    rating = null;
                }
                Long rating2 = readMetadataResponseModel.getRating();
                t tVar5 = tVar;
                String lastUsedVoiceId = readMetadataResponseModel.getLastUsedVoiceId();
                ReadMetadataResponseModel.CreationStatus creationStatus = readMetadataResponseModel.getCreationStatus();
                ReadCreationStatus domain = creationStatus == null ? toDomain(creationStatus) : null;
                BigDecimalJson creationProgress = readMetadataResponseModel.getCreationProgress();
                Float valueOf = (creationProgress != null || (value = creationProgress.getValue()) == null) ? null : Float.valueOf(value.floatValue());
                boolean c12 = m.c(readMetadataResponseModel.isArchived(), bool);
                Rating rating3 = rating;
                boolean c13 = m.c(readMetadataResponseModel.getMarkedAsUnread(), bool);
                completedAtUnix = readMetadataResponseModel.getCompletedAtUnix();
                if (completedAtUnix == null) {
                    long longValue = completedAtUnix.longValue();
                    tVar2 = tVar5;
                    date = new Date(b.d(g.o(longValue, dVar)));
                } else {
                    tVar2 = tVar5;
                    date = null;
                }
                String publicationDate = readMetadataResponseModel.getPublicationDate();
                t tVar6 = tVar2;
                String language = readMetadataResponseModel.getLanguage();
                boolean z11 = z6;
                Float f10 = valueOf;
                String str3 = str2;
                String publisherProfileId = readMetadataResponseModel.getPublisherProfileId();
                boolean c14 = m.c(readMetadataResponseModel.getCanDelete(), bool);
                ReadPurchaseConfigResponseModel purchaseConfig = readMetadataResponseModel.getPurchaseConfig();
                String androidProductId = purchaseConfig == null ? purchaseConfig.getAndroidProductId() : null;
                boolean z12 = readMetadataResponseModel.getPurchaseConfig() != null;
                String previewAudio = readMetadataResponseModel.getPreviewAudio();
                VoiceSelectionConfig voiceSelectionConfig = toVoiceSelectionConfig(readMetadataResponseModel.getVoiceSelectionConfig());
                SampleConfigResponseModel sampleConfig = readMetadataResponseModel.getSampleConfig();
                SampleConfig domain2 = sampleConfig == null ? toDomain(sampleConfig) : null;
                String displayMode = readMetadataResponseModel.getDisplayMode();
                DisplayMode domainDisplayMode = displayMode == null ? toDomainDisplayMode(displayMode) : null;
                boolean c15 = m.c(readMetadataResponseModel.getInUserLibrary(), bool);
                boolean c16 = m.c(readMetadataResponseModel.getCanUseAssistant(), bool);
                ReadMetadataResponseModel.AudioType audioType = readMetadataResponseModel.getAudioType();
                AudioType domain3 = audioType == null ? toDomain(audioType) : null;
                boolean c17 = m.c(readMetadataResponseModel.getUseDrm(), bool);
                String lastListenedAudioFileNumber = readMetadataResponseModel.getLastListenedAudioFileNumber();
                Double lastListenedAudioSeconds = readMetadataResponseModel.getLastListenedAudioSeconds();
                Double audioDurationSeconds = readMetadataResponseModel.getAudioDurationSeconds();
                audioTypes = readMetadataResponseModel.getAudioTypes();
                if (audioTypes == null) {
                    audioTypes = tVar6;
                }
                ArrayList arrayList2 = new ArrayList(p.a0(audioTypes, 10));
                it = audioTypes.iterator();
                while (it.hasNext()) {
                    arrayList2.add(toDomain((ReadMetadataResponseModel.AudioType) it.next()));
                }
                Set l12 = o.l1(arrayList2);
                boolean c18 = m.c(readMetadataResponseModel.isVoiceChangerOn(), Boolean.TRUE);
                ReadMetadataResponseModel.AudioType lastUsedAudioType = readMetadataResponseModel.getLastUsedAudioType();
                return new ReadMeta(str3, author, arrayList, charCount, date2, date3, date4, description, lastListenedCharOffset, readId, domainSource, str, subtitle, url, wordCount, originalFileType, c5, c10, origin, contentType, genre, z10, z11, rating3, rating2, lastUsedVoiceId, domain, f10, c12, c13, date, publicationDate, language, publisherProfileId, c14, androidProductId, z12, null, previewAudio, originalVoice, voiceSelectionConfig, domain2, domainDisplayMode, c15, c16, domain3, c17, lastListenedAudioFileNumber, lastListenedAudioSeconds, audioDurationSeconds, l12, c18, lastUsedAudioType == null ? toDomain(lastUsedAudioType) : null, readMetadataResponseModel.getCoverImageUrls(), readMetadataResponseModel.getCoverAspectRatio(), readMetadataResponseModel.getBlurPlaceholder(), 0, 32, null);
            }
        }
        originalVoice = null;
        String articleImageUrl2 = readMetadataResponseModel.getArticleImageUrl();
        String author2 = readMetadataResponseModel.getAuthor();
        List<ReadMetadataChapterDBModel> chapters2 = readMetadataResponseModel.getChapters();
        ArrayList arrayList3 = new ArrayList(p.a0(chapters2, 10));
        int i102 = 0;
        while (r0.hasNext()) {
        }
        long charCount2 = readMetadataResponseModel.getCharCount();
        a aVar2 = b.f38124b;
        long createdAtUnix2 = readMetadataResponseModel.getCreatedAtUnix();
        d dVar2 = d.SECONDS;
        Date date22 = new Date(b.d(g.o(createdAtUnix2, dVar2)));
        Date date32 = new Date(b.d(g.o(readMetadataResponseModel.getUpdatedAtUnix(), dVar2)));
        Date date42 = new Date(b.d(g.o(readMetadataResponseModel.getAddedAtUnix(), dVar2)));
        String description2 = readMetadataResponseModel.getDescription();
        long lastListenedCharOffset2 = readMetadataResponseModel.getLastListenedCharOffset();
        String readId2 = readMetadataResponseModel.getReadId();
        sourceField = readMetadataResponseModel.getSourceField();
        if (sourceField == null) {
        }
        ReadSource domainSource2 = toDomainSource(sourceField);
        title = readMetadataResponseModel.getTitle();
        if (title == null) {
        }
        subtitle = readMetadataResponseModel.getSubtitle();
        if (subtitle == null) {
        }
        String url2 = readMetadataResponseModel.getUrl();
        long wordCount2 = readMetadataResponseModel.getWordCount();
        String originalFileType3 = readMetadataResponseModel.getOriginalFileType();
        Boolean hasOriginalAudio2 = readMetadataResponseModel.getHasOriginalAudio();
        Boolean bool2 = Boolean.TRUE;
        boolean c52 = m.c(hasOriginalAudio2, bool2);
        boolean c102 = m.c(readMetadataResponseModel.getMatureContent(), bool2);
        String origin2 = readMetadataResponseModel.getOrigin();
        String contentType2 = readMetadataResponseModel.getContentType();
        genre = readMetadataResponseModel.getGenre();
        t tVar32 = t.f33547a;
        if (genre == null) {
        }
        if (!m.c(readMetadataResponseModel.getSourceField(), "book")) {
        }
        t tVar42 = tVar32;
        boolean z102 = true;
        boolean c112 = m.c(readMetadataResponseModel.getFromUserImport(), bool2);
        if (readMetadataResponseModel.getRatingMap() == null) {
        }
        Long rating22 = readMetadataResponseModel.getRating();
        t tVar52 = tVar;
        String lastUsedVoiceId2 = readMetadataResponseModel.getLastUsedVoiceId();
        ReadMetadataResponseModel.CreationStatus creationStatus2 = readMetadataResponseModel.getCreationStatus();
        if (creationStatus2 == null) {
        }
        BigDecimalJson creationProgress2 = readMetadataResponseModel.getCreationProgress();
        if (creationProgress2 != null) {
        }
        boolean c122 = m.c(readMetadataResponseModel.isArchived(), bool2);
        Rating rating32 = rating;
        boolean c132 = m.c(readMetadataResponseModel.getMarkedAsUnread(), bool2);
        completedAtUnix = readMetadataResponseModel.getCompletedAtUnix();
        if (completedAtUnix == null) {
        }
        String publicationDate2 = readMetadataResponseModel.getPublicationDate();
        t tVar62 = tVar2;
        String language2 = readMetadataResponseModel.getLanguage();
        boolean z112 = z6;
        Float f102 = valueOf;
        String str32 = str2;
        String publisherProfileId2 = readMetadataResponseModel.getPublisherProfileId();
        boolean c142 = m.c(readMetadataResponseModel.getCanDelete(), bool2);
        ReadPurchaseConfigResponseModel purchaseConfig2 = readMetadataResponseModel.getPurchaseConfig();
        if (purchaseConfig2 == null) {
        }
        if (readMetadataResponseModel.getPurchaseConfig() != null) {
        }
        String previewAudio2 = readMetadataResponseModel.getPreviewAudio();
        VoiceSelectionConfig voiceSelectionConfig2 = toVoiceSelectionConfig(readMetadataResponseModel.getVoiceSelectionConfig());
        SampleConfigResponseModel sampleConfig2 = readMetadataResponseModel.getSampleConfig();
        if (sampleConfig2 == null) {
        }
        String displayMode2 = readMetadataResponseModel.getDisplayMode();
        if (displayMode2 == null) {
        }
        boolean c152 = m.c(readMetadataResponseModel.getInUserLibrary(), bool2);
        boolean c162 = m.c(readMetadataResponseModel.getCanUseAssistant(), bool2);
        ReadMetadataResponseModel.AudioType audioType2 = readMetadataResponseModel.getAudioType();
        if (audioType2 == null) {
        }
        boolean c172 = m.c(readMetadataResponseModel.getUseDrm(), bool2);
        String lastListenedAudioFileNumber2 = readMetadataResponseModel.getLastListenedAudioFileNumber();
        Double lastListenedAudioSeconds2 = readMetadataResponseModel.getLastListenedAudioSeconds();
        Double audioDurationSeconds2 = readMetadataResponseModel.getAudioDurationSeconds();
        audioTypes = readMetadataResponseModel.getAudioTypes();
        if (audioTypes == null) {
        }
        ArrayList arrayList22 = new ArrayList(p.a0(audioTypes, 10));
        it = audioTypes.iterator();
        while (it.hasNext()) {
        }
        Set l122 = o.l1(arrayList22);
        boolean c182 = m.c(readMetadataResponseModel.isVoiceChangerOn(), Boolean.TRUE);
        ReadMetadataResponseModel.AudioType lastUsedAudioType2 = readMetadataResponseModel.getLastUsedAudioType();
        return new ReadMeta(str32, author2, arrayList3, charCount2, date22, date32, date42, description2, lastListenedCharOffset2, readId2, domainSource2, str, subtitle, url2, wordCount2, originalFileType3, c52, c102, origin2, contentType2, genre, z102, z112, rating32, rating22, lastUsedVoiceId2, domain, f102, c122, c132, date, publicationDate2, language2, publisherProfileId2, c142, androidProductId, z12, null, previewAudio2, originalVoice, voiceSelectionConfig2, domain2, domainDisplayMode, c152, c162, domain3, c172, lastListenedAudioFileNumber2, lastListenedAudioSeconds2, audioDurationSeconds2, l122, c182, lastUsedAudioType2 == null ? toDomain(lastUsedAudioType2) : null, readMetadataResponseModel.getCoverImageUrls(), readMetadataResponseModel.getCoverAspectRatio(), readMetadataResponseModel.getBlurPlaceholder(), 0, 32, null);
    }

    private static final Chapter toDomain(ReadChapterEntity readChapterEntity) {
        return new Chapter(readChapterEntity.getChapter_index(), readChapterEntity.getStarting_char_offset(), readChapterEntity.getChapter_name(), readChapterEntity.getChar_count(), readChapterEntity.getHas_summary(), readChapterEntity.getWord_count(), readChapterEntity.getDuration_seconds(), readChapterEntity.getAudio_file_number());
    }

    public static final SampleConfig toDomain(SampleConfigResponseModel sampleConfigResponseModel) {
        SampleParentType sampleParentType;
        sampleConfigResponseModel.getClass();
        Boolean isSample = sampleConfigResponseModel.isSample();
        boolean booleanValue = isSample != null ? isSample.booleanValue() : false;
        String parentId = sampleConfigResponseModel.getParentId();
        String parentType = sampleConfigResponseModel.getParentType();
        if (m.c(parentType, "read")) {
            sampleParentType = SampleParentType.READ;
        } else {
            sampleParentType = m.c(parentType, "collection") ? SampleParentType.COLLECTION : SampleParentType.READ;
        }
        return new SampleConfig(booleanValue, parentId, sampleParentType, sampleConfigResponseModel.getChapterIds());
    }

    public static final Chapter toDomain(ReadMetadataChapterDBModel readMetadataChapterDBModel, int i10) {
        readMetadataChapterDBModel.getClass();
        return new Chapter(i10, readMetadataChapterDBModel.getStartingCharOffset(), readMetadataChapterDBModel.getChapterName(), readMetadataChapterDBModel.getCharCount(), m.c(readMetadataChapterDBModel.getHasSummary(), Boolean.TRUE), readMetadataChapterDBModel.getWordCount(), readMetadataChapterDBModel.getDurationSeconds(), readMetadataChapterDBModel.getFileNumber());
    }

    public static final ReadCreationStatus toDomain(ReadMetadataResponseModel.CreationStatus creationStatus) {
        creationStatus.getClass();
        int i10 = WhenMappings.$EnumSwitchMapping$0[creationStatus.ordinal()];
        if (i10 == 1) {
            return ReadCreationStatus.Pending;
        }
        if (i10 == 2) {
            return ReadCreationStatus.Creating;
        }
        if (i10 == 3) {
            return ReadCreationStatus.Finished;
        }
        if (i10 == 4) {
            return ReadCreationStatus.Failed;
        }
        c6.p();
        return null;
    }

    public static final AudioType toDomain(ReadMetadataResponseModel.AudioType audioType) {
        audioType.getClass();
        int i10 = WhenMappings.$EnumSwitchMapping$1[audioType.ordinal()];
        if (i10 == 1) {
            return AudioType.TTS;
        }
        if (i10 == 2) {
            return AudioType.MEDIA;
        }
        c6.p();
        return null;
    }
}
