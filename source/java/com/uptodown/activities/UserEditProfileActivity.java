package com.uptodown.activities;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.content.ContextCompat;
import c7.n;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.PasswordEditActivity;
import com.uptodown.activities.UserAvatarActivity;
import com.uptodown.activities.UserEditProfileActivity;
import com.uptodown.activities.UsernameEditActivity;
import g5.e1;
import o4.b0;
import o4.ec;
import s4.c;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class UserEditProfileActivity extends b0 {
    public static final /* synthetic */ int R = 0;
    public final n O = new n(new ec(this, 0));
    public final ActivityResultLauncher P;
    public final ActivityResultLauncher Q;

    public UserEditProfileActivity() {
        final int i = 0;
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: o4.fc

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserEditProfileActivity f8678b;

            {
                this.f8678b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                int i3 = i;
                UserEditProfileActivity userEditProfileActivity = this.f8678b;
                ActivityResult activityResult = (ActivityResult) obj;
                switch (i3) {
                    case 0:
                        int i8 = UserEditProfileActivity.R;
                        if (activityResult.getResultCode() == 2) {
                            k5.t2.b(userEditProfileActivity);
                            userEditProfileActivity.setResult(2);
                            userEditProfileActivity.finish();
                            return;
                        }
                        return;
                    default:
                        int i10 = UserEditProfileActivity.R;
                        if (activityResult.getResultCode() == 10) {
                            userEditProfileActivity.setResult(10);
                            userEditProfileActivity.finish();
                            return;
                        }
                        return;
                }
            }
        });
        registerForActivityResult.getClass();
        this.P = registerForActivityResult;
        final int i3 = 1;
        ActivityResultLauncher registerForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: o4.fc

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserEditProfileActivity f8678b;

            {
                this.f8678b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                int i32 = i3;
                UserEditProfileActivity userEditProfileActivity = this.f8678b;
                ActivityResult activityResult = (ActivityResult) obj;
                switch (i32) {
                    case 0:
                        int i8 = UserEditProfileActivity.R;
                        if (activityResult.getResultCode() == 2) {
                            k5.t2.b(userEditProfileActivity);
                            userEditProfileActivity.setResult(2);
                            userEditProfileActivity.finish();
                            return;
                        }
                        return;
                    default:
                        int i10 = UserEditProfileActivity.R;
                        if (activityResult.getResultCode() == 10) {
                            userEditProfileActivity.setResult(10);
                            userEditProfileActivity.finish();
                            return;
                        }
                        return;
                }
            }
        });
        registerForActivityResult2.getClass();
        this.Q = registerForActivityResult2;
    }

    @Override // o4.b0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout relativeLayout = w0().f5446a;
        relativeLayout.getClass();
        setContentView(relativeLayout);
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.core_vector_back);
        if (drawable != null) {
            w0().o.setNavigationIcon(drawable);
            w0().o.setNavigationContentDescription(getString(R.string.back));
        }
        final int i = 0;
        w0().o.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: o4.gc

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserEditProfileActivity f8711b;

            {
                this.f8711b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                UserEditProfileActivity userEditProfileActivity = this.f8711b;
                switch (i3) {
                    case 0:
                        int i8 = UserEditProfileActivity.R;
                        userEditProfileActivity.finish();
                        return;
                    case 1:
                        int i10 = UserEditProfileActivity.R;
                        if (userEditProfileActivity.S()) {
                            k5.v2 h = k5.t2.h(userEditProfileActivity);
                            if (h != null) {
                                Intent intent = new Intent(userEditProfileActivity, (Class<?>) UsernameEditActivity.class);
                                intent.putExtra("user", h);
                                ActivityResultLauncher activityResultLauncher = userEditProfileActivity.Q;
                                float f7 = UptodownApp.G;
                                activityResultLauncher.launch(intent, n4.e.b(userEditProfileActivity));
                                return;
                            }
                            userEditProfileActivity.finish();
                            return;
                        }
                        return;
                    case 2:
                        int i11 = UserEditProfileActivity.R;
                        if (userEditProfileActivity.S()) {
                            if (k5.t2.h(userEditProfileActivity) != null) {
                                Intent intent2 = new Intent(userEditProfileActivity, (Class<?>) PasswordEditActivity.class);
                                ActivityResultLauncher activityResultLauncher2 = userEditProfileActivity.P;
                                float f10 = UptodownApp.G;
                                activityResultLauncher2.launch(intent2, n4.e.b(userEditProfileActivity));
                                return;
                            }
                            userEditProfileActivity.finish();
                            return;
                        }
                        return;
                    case 3:
                        int i12 = UserEditProfileActivity.R;
                        if (userEditProfileActivity.S()) {
                            k5.v2 h10 = k5.t2.h(userEditProfileActivity);
                            if (h10 != null) {
                                Intent intent3 = new Intent(userEditProfileActivity, (Class<?>) UserAvatarActivity.class);
                                intent3.putExtra("user", h10);
                                ActivityResultLauncher activityResultLauncher3 = userEditProfileActivity.Q;
                                float f11 = UptodownApp.G;
                                activityResultLauncher3.launch(intent3, n4.e.b(userEditProfileActivity));
                                return;
                            }
                            userEditProfileActivity.finish();
                            return;
                        }
                        return;
                    default:
                        int i13 = UserEditProfileActivity.R;
                        k5.t2.b(userEditProfileActivity);
                        userEditProfileActivity.finish();
                        return;
                }
            }
        });
        w0().s.setTypeface(c.u);
        w0().t.setTypeface(c.u);
        w0().r.setTypeface(c.u);
        w0().p.setTypeface(c.u);
        w0().q.setTypeface(c.u);
        final int i3 = 1;
        w0().f5448n.setOnClickListener(new View.OnClickListener(this) { // from class: o4.gc

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserEditProfileActivity f8711b;

            {
                this.f8711b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i3;
                UserEditProfileActivity userEditProfileActivity = this.f8711b;
                switch (i32) {
                    case 0:
                        int i8 = UserEditProfileActivity.R;
                        userEditProfileActivity.finish();
                        return;
                    case 1:
                        int i10 = UserEditProfileActivity.R;
                        if (userEditProfileActivity.S()) {
                            k5.v2 h = k5.t2.h(userEditProfileActivity);
                            if (h != null) {
                                Intent intent = new Intent(userEditProfileActivity, (Class<?>) UsernameEditActivity.class);
                                intent.putExtra("user", h);
                                ActivityResultLauncher activityResultLauncher = userEditProfileActivity.Q;
                                float f7 = UptodownApp.G;
                                activityResultLauncher.launch(intent, n4.e.b(userEditProfileActivity));
                                return;
                            }
                            userEditProfileActivity.finish();
                            return;
                        }
                        return;
                    case 2:
                        int i11 = UserEditProfileActivity.R;
                        if (userEditProfileActivity.S()) {
                            if (k5.t2.h(userEditProfileActivity) != null) {
                                Intent intent2 = new Intent(userEditProfileActivity, (Class<?>) PasswordEditActivity.class);
                                ActivityResultLauncher activityResultLauncher2 = userEditProfileActivity.P;
                                float f10 = UptodownApp.G;
                                activityResultLauncher2.launch(intent2, n4.e.b(userEditProfileActivity));
                                return;
                            }
                            userEditProfileActivity.finish();
                            return;
                        }
                        return;
                    case 3:
                        int i12 = UserEditProfileActivity.R;
                        if (userEditProfileActivity.S()) {
                            k5.v2 h10 = k5.t2.h(userEditProfileActivity);
                            if (h10 != null) {
                                Intent intent3 = new Intent(userEditProfileActivity, (Class<?>) UserAvatarActivity.class);
                                intent3.putExtra("user", h10);
                                ActivityResultLauncher activityResultLauncher3 = userEditProfileActivity.Q;
                                float f11 = UptodownApp.G;
                                activityResultLauncher3.launch(intent3, n4.e.b(userEditProfileActivity));
                                return;
                            }
                            userEditProfileActivity.finish();
                            return;
                        }
                        return;
                    default:
                        int i13 = UserEditProfileActivity.R;
                        k5.t2.b(userEditProfileActivity);
                        userEditProfileActivity.finish();
                        return;
                }
            }
        });
        final int i8 = 2;
        w0().m.setOnClickListener(new View.OnClickListener(this) { // from class: o4.gc

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserEditProfileActivity f8711b;

            {
                this.f8711b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i8;
                UserEditProfileActivity userEditProfileActivity = this.f8711b;
                switch (i32) {
                    case 0:
                        int i82 = UserEditProfileActivity.R;
                        userEditProfileActivity.finish();
                        return;
                    case 1:
                        int i10 = UserEditProfileActivity.R;
                        if (userEditProfileActivity.S()) {
                            k5.v2 h = k5.t2.h(userEditProfileActivity);
                            if (h != null) {
                                Intent intent = new Intent(userEditProfileActivity, (Class<?>) UsernameEditActivity.class);
                                intent.putExtra("user", h);
                                ActivityResultLauncher activityResultLauncher = userEditProfileActivity.Q;
                                float f7 = UptodownApp.G;
                                activityResultLauncher.launch(intent, n4.e.b(userEditProfileActivity));
                                return;
                            }
                            userEditProfileActivity.finish();
                            return;
                        }
                        return;
                    case 2:
                        int i11 = UserEditProfileActivity.R;
                        if (userEditProfileActivity.S()) {
                            if (k5.t2.h(userEditProfileActivity) != null) {
                                Intent intent2 = new Intent(userEditProfileActivity, (Class<?>) PasswordEditActivity.class);
                                ActivityResultLauncher activityResultLauncher2 = userEditProfileActivity.P;
                                float f10 = UptodownApp.G;
                                activityResultLauncher2.launch(intent2, n4.e.b(userEditProfileActivity));
                                return;
                            }
                            userEditProfileActivity.finish();
                            return;
                        }
                        return;
                    case 3:
                        int i12 = UserEditProfileActivity.R;
                        if (userEditProfileActivity.S()) {
                            k5.v2 h10 = k5.t2.h(userEditProfileActivity);
                            if (h10 != null) {
                                Intent intent3 = new Intent(userEditProfileActivity, (Class<?>) UserAvatarActivity.class);
                                intent3.putExtra("user", h10);
                                ActivityResultLauncher activityResultLauncher3 = userEditProfileActivity.Q;
                                float f11 = UptodownApp.G;
                                activityResultLauncher3.launch(intent3, n4.e.b(userEditProfileActivity));
                                return;
                            }
                            userEditProfileActivity.finish();
                            return;
                        }
                        return;
                    default:
                        int i13 = UserEditProfileActivity.R;
                        k5.t2.b(userEditProfileActivity);
                        userEditProfileActivity.finish();
                        return;
                }
            }
        });
        final int i10 = 3;
        w0().f5447b.setOnClickListener(new View.OnClickListener(this) { // from class: o4.gc

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserEditProfileActivity f8711b;

            {
                this.f8711b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i10;
                UserEditProfileActivity userEditProfileActivity = this.f8711b;
                switch (i32) {
                    case 0:
                        int i82 = UserEditProfileActivity.R;
                        userEditProfileActivity.finish();
                        return;
                    case 1:
                        int i102 = UserEditProfileActivity.R;
                        if (userEditProfileActivity.S()) {
                            k5.v2 h = k5.t2.h(userEditProfileActivity);
                            if (h != null) {
                                Intent intent = new Intent(userEditProfileActivity, (Class<?>) UsernameEditActivity.class);
                                intent.putExtra("user", h);
                                ActivityResultLauncher activityResultLauncher = userEditProfileActivity.Q;
                                float f7 = UptodownApp.G;
                                activityResultLauncher.launch(intent, n4.e.b(userEditProfileActivity));
                                return;
                            }
                            userEditProfileActivity.finish();
                            return;
                        }
                        return;
                    case 2:
                        int i11 = UserEditProfileActivity.R;
                        if (userEditProfileActivity.S()) {
                            if (k5.t2.h(userEditProfileActivity) != null) {
                                Intent intent2 = new Intent(userEditProfileActivity, (Class<?>) PasswordEditActivity.class);
                                ActivityResultLauncher activityResultLauncher2 = userEditProfileActivity.P;
                                float f10 = UptodownApp.G;
                                activityResultLauncher2.launch(intent2, n4.e.b(userEditProfileActivity));
                                return;
                            }
                            userEditProfileActivity.finish();
                            return;
                        }
                        return;
                    case 3:
                        int i12 = UserEditProfileActivity.R;
                        if (userEditProfileActivity.S()) {
                            k5.v2 h10 = k5.t2.h(userEditProfileActivity);
                            if (h10 != null) {
                                Intent intent3 = new Intent(userEditProfileActivity, (Class<?>) UserAvatarActivity.class);
                                intent3.putExtra("user", h10);
                                ActivityResultLauncher activityResultLauncher3 = userEditProfileActivity.Q;
                                float f11 = UptodownApp.G;
                                activityResultLauncher3.launch(intent3, n4.e.b(userEditProfileActivity));
                                return;
                            }
                            userEditProfileActivity.finish();
                            return;
                        }
                        return;
                    default:
                        int i13 = UserEditProfileActivity.R;
                        k5.t2.b(userEditProfileActivity);
                        userEditProfileActivity.finish();
                        return;
                }
            }
        });
        final int i11 = 4;
        w0().l.setOnClickListener(new View.OnClickListener(this) { // from class: o4.gc

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserEditProfileActivity f8711b;

            {
                this.f8711b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i11;
                UserEditProfileActivity userEditProfileActivity = this.f8711b;
                switch (i32) {
                    case 0:
                        int i82 = UserEditProfileActivity.R;
                        userEditProfileActivity.finish();
                        return;
                    case 1:
                        int i102 = UserEditProfileActivity.R;
                        if (userEditProfileActivity.S()) {
                            k5.v2 h = k5.t2.h(userEditProfileActivity);
                            if (h != null) {
                                Intent intent = new Intent(userEditProfileActivity, (Class<?>) UsernameEditActivity.class);
                                intent.putExtra("user", h);
                                ActivityResultLauncher activityResultLauncher = userEditProfileActivity.Q;
                                float f7 = UptodownApp.G;
                                activityResultLauncher.launch(intent, n4.e.b(userEditProfileActivity));
                                return;
                            }
                            userEditProfileActivity.finish();
                            return;
                        }
                        return;
                    case 2:
                        int i112 = UserEditProfileActivity.R;
                        if (userEditProfileActivity.S()) {
                            if (k5.t2.h(userEditProfileActivity) != null) {
                                Intent intent2 = new Intent(userEditProfileActivity, (Class<?>) PasswordEditActivity.class);
                                ActivityResultLauncher activityResultLauncher2 = userEditProfileActivity.P;
                                float f10 = UptodownApp.G;
                                activityResultLauncher2.launch(intent2, n4.e.b(userEditProfileActivity));
                                return;
                            }
                            userEditProfileActivity.finish();
                            return;
                        }
                        return;
                    case 3:
                        int i12 = UserEditProfileActivity.R;
                        if (userEditProfileActivity.S()) {
                            k5.v2 h10 = k5.t2.h(userEditProfileActivity);
                            if (h10 != null) {
                                Intent intent3 = new Intent(userEditProfileActivity, (Class<?>) UserAvatarActivity.class);
                                intent3.putExtra("user", h10);
                                ActivityResultLauncher activityResultLauncher3 = userEditProfileActivity.Q;
                                float f11 = UptodownApp.G;
                                activityResultLauncher3.launch(intent3, n4.e.b(userEditProfileActivity));
                                return;
                            }
                            userEditProfileActivity.finish();
                            return;
                        }
                        return;
                    default:
                        int i13 = UserEditProfileActivity.R;
                        k5.t2.b(userEditProfileActivity);
                        userEditProfileActivity.finish();
                        return;
                }
            }
        });
    }

    public final e1 w0() {
        return (e1) this.O.getValue();
    }
}
