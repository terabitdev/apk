package io.elevenlabs.data.services;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.protobuf.c6;
import io.elevenlabs.data.api.FavoriteVoicesApi;
import io.elevenlabs.data.database.entities.voices.VoicesDao;
import io.elevenlabs.data.extensions.ApiResultExtensionKt;
import io.elevenlabs.data.mapping.VoiceMappingKt;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.response.VoiceItemResponseModel;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.Voice;
import io.elevenlabs.domain.services.FavoriteVoicesService;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\n8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lio/elevenlabs/data/services/FavoriteVoicesServiceImpl;", "Lio/elevenlabs/domain/services/FavoriteVoicesService;", "Lio/elevenlabs/data/api/FavoriteVoicesApi;", "api", "Lio/elevenlabs/data/database/entities/voices/VoicesDao;", "dao", "Lio/elevenlabs/domain/Logger;", "logger", "<init>", "(Lio/elevenlabs/data/api/FavoriteVoicesApi;Lio/elevenlabs/data/database/entities/voices/VoicesDao;Lio/elevenlabs/domain/Logger;)V", "", "voiceId", "Lio/elevenlabs/domain/model/AsyncCallResult;", "Lio/elevenlabs/domain/model/Voice;", "addFavorite", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "removeFavorite", "Lio/elevenlabs/data/api/FavoriteVoicesApi;", "Lio/elevenlabs/data/database/entities/voices/VoicesDao;", "Lio/elevenlabs/domain/Logger;", ParameterNames.TAG, "Ljava/lang/String;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class FavoriteVoicesServiceImpl implements FavoriteVoicesService {
    private final FavoriteVoicesApi api;
    private final VoicesDao dao;
    private final Logger logger;
    private final String tag;

    public FavoriteVoicesServiceImpl(FavoriteVoicesApi favoriteVoicesApi, VoicesDao voicesDao, Logger logger) {
        favoriteVoicesApi.getClass();
        voicesDao.getClass();
        logger.getClass();
        this.api = favoriteVoicesApi;
        this.dao = voicesDao;
        this.logger = logger;
        this.tag = "FavoriteVoicesService";
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // io.elevenlabs.domain.services.FavoriteVoicesService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object addFavorite(String str, wn.c<? super AsyncCallResult<Voice>> cVar) {
        FavoriteVoicesServiceImpl$addFavorite$1 favoriteVoicesServiceImpl$addFavorite$1;
        int i10;
        ApiResult apiResult;
        if (cVar instanceof FavoriteVoicesServiceImpl$addFavorite$1) {
            favoriteVoicesServiceImpl$addFavorite$1 = (FavoriteVoicesServiceImpl$addFavorite$1) cVar;
            int i11 = favoriteVoicesServiceImpl$addFavorite$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                favoriteVoicesServiceImpl$addFavorite$1.label = i11 - Integer.MIN_VALUE;
                Object obj = favoriteVoicesServiceImpl$addFavorite$1.result;
                i10 = favoriteVoicesServiceImpl$addFavorite$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    ib.i.r("Adding voice to favorites: ", str, this.logger, this.tag);
                    FavoriteVoicesApi favoriteVoicesApi = this.api;
                    favoriteVoicesServiceImpl$addFavorite$1.L$0 = null;
                    favoriteVoicesServiceImpl$addFavorite$1.label = 1;
                    obj = favoriteVoicesApi.addVoiceToLibraryAndSetAsFavorite(str, favoriteVoicesServiceImpl$addFavorite$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                    this.dao.insert(VoiceMappingKt.toEntity((VoiceItemResponseModel) ((ApiResult.Success) apiResult).getData()));
                }
                return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain(apiResult), FavoriteVoicesServiceImpl$addFavorite$2.INSTANCE);
            }
        }
        favoriteVoicesServiceImpl$addFavorite$1 = new FavoriteVoicesServiceImpl$addFavorite$1(this, cVar);
        Object obj2 = favoriteVoicesServiceImpl$addFavorite$1.result;
        i10 = favoriteVoicesServiceImpl$addFavorite$1.label;
        if (i10 == 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
        return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain(apiResult), FavoriteVoicesServiceImpl$addFavorite$2.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // io.elevenlabs.domain.services.FavoriteVoicesService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object removeFavorite(String str, wn.c<? super AsyncCallResult<Voice>> cVar) {
        FavoriteVoicesServiceImpl$removeFavorite$1 favoriteVoicesServiceImpl$removeFavorite$1;
        int i10;
        ApiResult apiResult;
        if (cVar instanceof FavoriteVoicesServiceImpl$removeFavorite$1) {
            favoriteVoicesServiceImpl$removeFavorite$1 = (FavoriteVoicesServiceImpl$removeFavorite$1) cVar;
            int i11 = favoriteVoicesServiceImpl$removeFavorite$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                favoriteVoicesServiceImpl$removeFavorite$1.label = i11 - Integer.MIN_VALUE;
                Object obj = favoriteVoicesServiceImpl$removeFavorite$1.result;
                i10 = favoriteVoicesServiceImpl$removeFavorite$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    ib.i.r("Removing voice from favorites: ", str, this.logger, this.tag);
                    FavoriteVoicesApi favoriteVoicesApi = this.api;
                    favoriteVoicesServiceImpl$removeFavorite$1.L$0 = null;
                    favoriteVoicesServiceImpl$removeFavorite$1.label = 1;
                    obj = favoriteVoicesApi.removeVoiceFromFavorites(str, favoriteVoicesServiceImpl$removeFavorite$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                    this.dao.insert(VoiceMappingKt.toEntity((VoiceItemResponseModel) ((ApiResult.Success) apiResult).getData()));
                }
                return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain(apiResult), FavoriteVoicesServiceImpl$removeFavorite$2.INSTANCE);
            }
        }
        favoriteVoicesServiceImpl$removeFavorite$1 = new FavoriteVoicesServiceImpl$removeFavorite$1(this, cVar);
        Object obj2 = favoriteVoicesServiceImpl$removeFavorite$1.result;
        i10 = favoriteVoicesServiceImpl$removeFavorite$1.label;
        if (i10 == 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
        return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain(apiResult), FavoriteVoicesServiceImpl$removeFavorite$2.INSTANCE);
    }
}
