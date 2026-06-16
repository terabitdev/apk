package io.elevenlabs.data.mapping;

import a2.p;
import android.gov.nist.core.Separators;
import com.google.protobuf.c6;
import ig.f;
import io.elevenlabs.data.database.entities.voices.RecentVoiceEntity;
import io.elevenlabs.data.database.entities.voices.VoiceEntity;
import io.elevenlabs.data.model.response.VoiceItemResponseModel;
import io.elevenlabs.domain.model.RecentVoice;
import io.elevenlabs.domain.model.Voice;
import io.elevenlabs.domain.model.VoiceCategory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import tn.o;
import wq.n;
import wq.u;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0004\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0001H\u0002\u001a\n\u0010\u0007\u001a\u00020\u0004*\u00020\b\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\b\u001a\n\u0010\u0002\u001a\u00020\t*\u00020\n\u001a\u000e\u0010\u000b\u001a\u0004\u0018\u00010\u0001*\u00020\bH\u0002\u001a\u000e\u0010\f\u001a\u0004\u0018\u00010\u0001*\u00020\bH\u0002\u001a\u0010\u0010\r\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0001H\u0002\u001a\f\u0010\u000e\u001a\u00020\u0001*\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"SUBTITLE_DELIMITER", "", "toDomain", "Lio/elevenlabs/domain/model/Voice;", "Lio/elevenlabs/data/database/entities/voices/VoiceEntity;", "toVoiceCategory", "Lio/elevenlabs/domain/model/VoiceCategory;", "toEntity", "Lio/elevenlabs/data/model/response/VoiceItemResponseModel;", "Lio/elevenlabs/domain/model/RecentVoice;", "Lio/elevenlabs/data/database/entities/voices/RecentVoiceEntity;", "generateSubtitle", "extractSubtitleText", "presentableOrNull", "capitalizeWords", "data_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class VoiceMappingKt {
    private static final String SUBTITLE_DELIMITER = " - ";

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VoiceCategory.values().length];
            try {
                iArr[VoiceCategory.Premade.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VoiceCategory.Famous.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VoiceCategory.User.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VoiceCategory.Community.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VoiceCategory.Generated.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ CharSequence a(String str) {
        return capitalizeWords$lambda$0(str);
    }

    private static final String capitalizeWords(String str) {
        return o.E0(n.z0(str, new String[]{Separators.SP}, 6), Separators.SP, null, null, new p(18), 30);
    }

    public static final CharSequence capitalizeWords$lambda$0(String str) {
        str.getClass();
        if (str.length() > 0) {
            StringBuilder sb = new StringBuilder();
            String valueOf = String.valueOf(str.charAt(0));
            valueOf.getClass();
            String upperCase = valueOf.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            sb.append((Object) upperCase);
            sb.append(str.substring(1));
            return sb.toString();
        }
        return str;
    }

    private static final String extractSubtitleText(VoiceItemResponseModel voiceItemResponseModel) {
        if (n.a0(voiceItemResponseModel.getName(), SUBTITLE_DELIMITER, false)) {
            String name = voiceItemResponseModel.getName();
            return presentableOrNull(n.D0(name, SUBTITLE_DELIMITER, name));
        }
        String presentableOrNull = presentableOrNull(voiceItemResponseModel.getDescriptive());
        if (presentableOrNull != null) {
            return presentableOrNull;
        }
        List I = f.I(voiceItemResponseModel.getAge(), voiceItemResponseModel.getAccent(), voiceItemResponseModel.getGender());
        ArrayList arrayList = new ArrayList();
        Iterator it = I.iterator();
        while (it.hasNext()) {
            String presentableOrNull2 = presentableOrNull((String) it.next());
            if (presentableOrNull2 != null) {
                arrayList.add(presentableOrNull2);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return o.E0(arrayList, Separators.SP, null, null, null, 62);
    }

    private static final String generateSubtitle(VoiceItemResponseModel voiceItemResponseModel) {
        ArrayList arrayList;
        List I = f.I(extractSubtitleText(voiceItemResponseModel), voiceItemResponseModel.getUseCase());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = I.iterator();
        while (true) {
            String str = null;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            if (str2 != null && !n.m0(str2)) {
                str = str2;
            }
            if (str != null) {
                arrayList2.add(str);
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        return o.E0(arrayList, " • ", null, null, null, 62);
    }

    private static final String presentableOrNull(String str) {
        String obj;
        if (str != null && (obj = n.L0(u.T(str, "_", Separators.SP)).toString()) != null) {
            if (n.m0(obj)) {
                obj = null;
            }
            if (obj != null) {
                return capitalizeWords(obj);
            }
        }
        return null;
    }

    public static final Voice toDomain(VoiceEntity voiceEntity) {
        voiceEntity.getClass();
        String ownerId = voiceEntity.getOwnerId();
        String voiceId = voiceEntity.getVoiceId();
        String name = voiceEntity.getName();
        String previewUrl = voiceEntity.getPreviewUrl();
        String description = voiceEntity.getDescription();
        String subtitle = voiceEntity.getSubtitle();
        String accent = voiceEntity.getAccent();
        String gender = voiceEntity.getGender();
        String age = voiceEntity.getAge();
        String descriptive = voiceEntity.getDescriptive();
        String useCase = voiceEntity.getUseCase();
        if (n.m0(useCase)) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[toVoiceCategory(voiceEntity.getCategory()).ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 == 5) {
                                useCase = "Voice Design";
                            } else {
                                c6.p();
                                return null;
                            }
                        } else {
                            useCase = "Community";
                        }
                    } else {
                        useCase = "User";
                    }
                } else {
                    useCase = "Iconic Voice";
                }
            } else {
                useCase = "Official";
            }
        }
        return new Voice(ownerId, voiceId, name, description, subtitle, age, accent, gender, descriptive, capitalizeWords(useCase), voiceEntity.getFromVoiceLibrary(), previewUrl, voiceEntity.getImageUrl(), toVoiceCategory(voiceEntity.getCategory()), voiceEntity.getFavoritedAtUnix(), voiceEntity.getCreatedAtUnix());
    }

    public static final VoiceEntity toEntity(VoiceItemResponseModel voiceItemResponseModel) {
        voiceItemResponseModel.getClass();
        String voiceId = voiceItemResponseModel.getVoiceId();
        String ownerId = voiceItemResponseModel.getOwnerId();
        String name = voiceItemResponseModel.getName();
        if (n.a0(name, SUBTITLE_DELIMITER, false)) {
            name = n.H0(name, SUBTITLE_DELIMITER);
        }
        return new VoiceEntity(voiceId, ownerId, name, voiceItemResponseModel.getAccent(), voiceItemResponseModel.getGender(), voiceItemResponseModel.getAge(), voiceItemResponseModel.getDescriptive(), voiceItemResponseModel.getUseCase(), voiceItemResponseModel.getCategory(), voiceItemResponseModel.getFromVoiceLibrary(), generateSubtitle(voiceItemResponseModel), voiceItemResponseModel.getDescription(), voiceItemResponseModel.getPreviewUrl(), voiceItemResponseModel.getImageUrl(), voiceItemResponseModel.getFavoritedAtUnix(), voiceItemResponseModel.getCreatedAtUnix());
    }

    private static final VoiceCategory toVoiceCategory(String str) {
        switch (str.hashCode()) {
            case -1480249367:
                if (str.equals("community")) {
                    return VoiceCategory.Community;
                }
                break;
            case -1281854725:
                if (str.equals("famous")) {
                    return VoiceCategory.Famous;
                }
                break;
            case -318460360:
                if (str.equals("premade")) {
                    return VoiceCategory.Premade;
                }
                break;
            case 3599307:
                if (str.equals("user")) {
                    return VoiceCategory.User;
                }
                break;
            case 286955919:
                if (str.equals("generated")) {
                    return VoiceCategory.Generated;
                }
                break;
        }
        return VoiceCategory.User;
    }

    public static final Voice toDomain(VoiceItemResponseModel voiceItemResponseModel) {
        voiceItemResponseModel.getClass();
        return toDomain(toEntity(voiceItemResponseModel));
    }

    public static final RecentVoice toDomain(RecentVoiceEntity recentVoiceEntity) {
        recentVoiceEntity.getClass();
        return new RecentVoice(recentVoiceEntity.getVoiceId(), recentVoiceEntity.getLastUsedAtUnixMillis());
    }
}
