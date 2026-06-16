package io.elevenlabs.data.services;

import android.content.Context;
import androidx.room.m0;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.data.api.VoicesAPI;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.services.AnonCaptchaTokenService;
import io.elevenlabs.domain.services.AppCheckTokenService;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import kotlin.Metadata;
import okhttp3.ResponseBody;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.services.VoicesServiceImpl$getContextualPreviewUrl$2", f = "VoicesServiceImpl.kt", l = {227, 235, 238}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfr/d0;", "Lio/elevenlabs/domain/model/AsyncCallResult;", "", "<anonymous>", "(Lfr/d0;)Lio/elevenlabs/domain/model/AsyncCallResult;"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class VoicesServiceImpl$getContextualPreviewUrl$2 extends yn.i implements p {
    final /* synthetic */ long $charOffset;
    final /* synthetic */ String $readId;
    final /* synthetic */ String $voiceId;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ VoicesServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoicesServiceImpl$getContextualPreviewUrl$2(String str, String str2, long j4, VoicesServiceImpl voicesServiceImpl, wn.c<? super VoicesServiceImpl$getContextualPreviewUrl$2> cVar) {
        super(2, cVar);
        this.$voiceId = str;
        this.$readId = str2;
        this.$charOffset = j4;
        this.this$0 = voicesServiceImpl;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new VoicesServiceImpl$getContextualPreviewUrl$2(this.$voiceId, this.$readId, this.$charOffset, this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super AsyncCallResult<String>> cVar) {
        return ((VoicesServiceImpl$getContextualPreviewUrl$2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x015e A[Catch: all -> 0x017e, Exception -> 0x0181, TRY_LEAVE, TryCatch #7 {Exception -> 0x0181, blocks: (B:13:0x0144, B:20:0x0155, B:22:0x015e, B:26:0x0183, B:44:0x01b8, B:45:0x01bb), top: B:12:0x0144, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0183 A[Catch: all -> 0x017e, Exception -> 0x0181, TRY_ENTER, TRY_LEAVE, TryCatch #7 {Exception -> 0x0181, blocks: (B:13:0x0144, B:20:0x0155, B:22:0x015e, B:26:0x0183, B:44:0x01b8, B:45:0x01bb), top: B:12:0x0144, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0126  */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Logger logger;
        String str;
        Context context;
        AppCheckTokenService appCheckTokenService;
        Object appCheckToken;
        String str2;
        File file;
        Logger logger2;
        String str3;
        Logger logger3;
        String str4;
        String str5;
        AnonCaptchaTokenService anonCaptchaTokenService;
        Object token;
        File file2;
        String str6;
        String str7;
        VoicesAPI voicesAPI;
        Object contextualPreview;
        String str8;
        ResponseBody responseBody;
        File file3;
        Context context2;
        Logger logger4;
        String str9;
        Logger logger5;
        String str10;
        Logger logger6;
        String str11;
        int i10 = this.label;
        xn.a aVar = xn.a.f37986a;
        try {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            File file4 = (File) this.L$1;
                            str8 = (String) this.L$0;
                            sn.a.g(obj);
                            file2 = file4;
                            contextualPreview = obj;
                            responseBody = (ResponseBody) contextualPreview;
                            context2 = this.this$0.context;
                            file3 = new File(context2.getCacheDir(), defpackage.f.B(str8, ".tmp"));
                            file3.deleteOnExit();
                            VoicesServiceImpl voicesServiceImpl = this.this$0;
                            try {
                                try {
                                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                                    try {
                                        InputStream a10 = responseBody.a();
                                        try {
                                            android.support.v4.media.session.b.j(a10, fileOutputStream, UserMetadata.MAX_INTERNAL_KEY_SIZE);
                                            a10.close();
                                            fileOutputStream.close();
                                            if (file3.renameTo(file2)) {
                                                logger6 = voicesServiceImpl.logger;
                                                str11 = voicesServiceImpl.tag;
                                                Logger.logWarning$default(logger6, str11, "Failed to rename temp file to cache file", null, 4, null);
                                                file3.delete();
                                                AsyncCallResult.Error error = new AsyncCallResult.Error(AsyncCallResult.AsyncCallError.NetworkError.INSTANCE);
                                                responseBody.close();
                                                return error;
                                            }
                                            logger5 = voicesServiceImpl.logger;
                                            str10 = voicesServiceImpl.tag;
                                            logger5.log(str10, "Downloaded and cached contextual preview: " + str8);
                                            AsyncCallResult.Success success = new AsyncCallResult.Success(file2.toURI().toString());
                                            responseBody.close();
                                            return success;
                                        } finally {
                                        }
                                    } finally {
                                    }
                                } catch (Exception e10) {
                                    logger4 = voicesServiceImpl.logger;
                                    str9 = voicesServiceImpl.tag;
                                    logger4.logWarning(str9, "Failed to write contextual preview to cache", e10);
                                    file3.delete();
                                    AsyncCallResult.Error error2 = new AsyncCallResult.Error(AsyncCallResult.AsyncCallError.NetworkError.INSTANCE);
                                    m0.o(responseBody, null);
                                    return error2;
                                }
                            } finally {
                            }
                        } else {
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        String str12 = (String) this.L$2;
                        File file5 = (File) this.L$1;
                        String str13 = (String) this.L$0;
                        sn.a.g(obj);
                        str6 = str12;
                        file2 = file5;
                        str7 = str13;
                        token = obj;
                        String str14 = (String) token;
                        voicesAPI = this.this$0.voicesAPI;
                        String str15 = this.$voiceId;
                        String str16 = this.$readId;
                        long j4 = this.$charOffset;
                        this.L$0 = str7;
                        this.L$1 = file2;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 3;
                        contextualPreview = voicesAPI.getContextualPreview(str15, str16, j4, str6, str14, this);
                        if (contextualPreview != aVar) {
                            str8 = str7;
                            responseBody = (ResponseBody) contextualPreview;
                            context2 = this.this$0.context;
                            file3 = new File(context2.getCacheDir(), defpackage.f.B(str8, ".tmp"));
                            file3.deleteOnExit();
                            VoicesServiceImpl voicesServiceImpl2 = this.this$0;
                            FileOutputStream fileOutputStream2 = new FileOutputStream(file3);
                            InputStream a102 = responseBody.a();
                            android.support.v4.media.session.b.j(a102, fileOutputStream2, UserMetadata.MAX_INTERNAL_KEY_SIZE);
                            a102.close();
                            fileOutputStream2.close();
                            if (file3.renameTo(file2)) {
                            }
                        }
                        return aVar;
                    }
                } else {
                    file = (File) this.L$1;
                    String str17 = (String) this.L$0;
                    sn.a.g(obj);
                    str2 = str17;
                    appCheckToken = obj;
                }
            } else {
                sn.a.g(obj);
                String h10 = defpackage.f.h(this.$charOffset, ".mp3", defpackage.f.s("contextual_preview_", this.$voiceId, "_", this.$readId, "_"));
                context = this.this$0.context;
                File file6 = new File(context.getCacheDir(), h10);
                file6.deleteOnExit();
                boolean exists = file6.exists();
                VoicesServiceImpl voicesServiceImpl3 = this.this$0;
                if (exists) {
                    logger2 = voicesServiceImpl3.logger;
                    str3 = this.this$0.tag;
                    logger2.log(str3, "Using cached contextual preview: ".concat(h10));
                    return new AsyncCallResult.Success(file6.toURI().toString());
                }
                appCheckTokenService = voicesServiceImpl3.appCheckTokenService;
                this.L$0 = h10;
                this.L$1 = file6;
                this.label = 1;
                appCheckToken = appCheckTokenService.getAppCheckToken(this);
                if (appCheckToken != aVar) {
                    str2 = h10;
                    file = file6;
                }
                return aVar;
            }
            AppCheckTokenService.Result result = (AppCheckTokenService.Result) appCheckToken;
            if (result instanceof AppCheckTokenService.Result.Success) {
                str5 = ((AppCheckTokenService.Result.Success) result).getToken();
            } else if (result instanceof AppCheckTokenService.Result.Error) {
                logger3 = this.this$0.logger;
                str4 = this.this$0.tag;
                Logger.logWarning$default(logger3, str4, "Failed to get app check token for contextual preview", null, 4, null);
                str5 = null;
            } else {
                c6.p();
                return null;
            }
            anonCaptchaTokenService = this.this$0.anonCaptchaTokenService;
            this.L$0 = str2;
            this.L$1 = file;
            this.L$2 = str5;
            this.label = 2;
            token = anonCaptchaTokenService.getToken(this);
            if (token != aVar) {
                file2 = file;
                str6 = str5;
                str7 = str2;
                String str142 = (String) token;
                voicesAPI = this.this$0.voicesAPI;
                String str152 = this.$voiceId;
                String str162 = this.$readId;
                long j42 = this.$charOffset;
                this.L$0 = str7;
                this.L$1 = file2;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 3;
                contextualPreview = voicesAPI.getContextualPreview(str152, str162, j42, str6, str142, this);
                if (contextualPreview != aVar) {
                }
            }
            return aVar;
        } catch (Exception e11) {
            logger = this.this$0.logger;
            str = this.this$0.tag;
            logger.logWarning(str, "Failed to fetch contextual preview", e11);
            return new AsyncCallResult.Error(AsyncCallResult.AsyncCallError.NetworkError.INSTANCE);
        }
    }
}
