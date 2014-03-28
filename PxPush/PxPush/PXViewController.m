//
//  PXViewController.m
//  PxPush
//
//  Created by Jonas Bandi on 27/03/14.
//  Copyright (c) 2014 IvoryCode GmbH. All rights reserved.
//

#import "PXViewController.h"

@interface PXViewController ()

@end

@implementation PXViewController

- (void)viewDidLoad
{
    [super viewDidLoad];
	// Do any additional setup after loading the view, typically from a nib.
}

- (IBAction)okPressed:(id)sender {
      [[UIApplication sharedApplication] setApplicationIconBadgeNumber:0];
}


@end
